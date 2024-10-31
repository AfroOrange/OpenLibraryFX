package ui;

import dad.openlibrary.api.Doc;
import dad.openlibrary.api.OpenLibrary;
import dad.openlibrary.api.SearchResult;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {

        // api
        private OpenLibrary openLibrary = new OpenLibrary();

        // model
        private StringProperty searchQuery = new SimpleStringProperty();
        private ListProperty<Doc> books = new SimpleListProperty<>(FXCollections.observableArrayList());


        //view
        @FXML
        private TableColumn<Doc, String> authorColumn;

        @FXML
        private TableView<Doc> booksTable;

        @FXML
        private TableColumn<Doc, String> isenColumn;

        @FXML
        private TableColumn<Doc, Number> pagesColumn;

        @FXML
        private TableColumn<Doc, String> publisherColumn;

        @FXML
        private BorderPane root;

        @FXML
        private Button searchButton;

        @FXML
        private TextField searchField;

        @FXML
        private TableColumn<Doc, String> titleColumn;

    public RootController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RootView.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // cell value factories
        titleColumn.setCellValueFactory(cellData -> {
            Doc book = cellData.getValue();
            return new SimpleStringProperty(
                    book.getTitle() != null ? book.getTitle() : "");
                });

        authorColumn.setCellValueFactory(cellData -> {
            Doc book = cellData.getValue();
            return new SimpleStringProperty(
                    book.getAuthorName() != null ? book.getAuthorName().getFirst() : "");
        });

        isenColumn.setCellValueFactory(cellData -> {
            Doc book = cellData.getValue();
            return new SimpleStringProperty(
                    book.getIsbn() != null ? book.getIsbn().getFirst() : "");
        });

        publisherColumn.setCellValueFactory(cellData -> {
            Doc book = cellData.getValue();
            return new SimpleStringProperty(
                    book.getPublisher() != null ? book.getPublisher().getFirst() : "");
        });

        pagesColumn.setCellValueFactory(cellData -> {
            Doc book = cellData.getValue();
            return new SimpleIntegerProperty(
                    book.getNumberOfPagesMedian() != null ? book.getNumberOfPagesMedian() : 0);
        });


        booksTable.itemsProperty().bind(books);
        searchQuery.bind(searchField.textProperty());
    }

    @FXML
    void onSearchAction(ActionEvent event) {
        try {
            SearchResult result = openLibrary.getBooks(searchQuery.get());
            books.setAll(result.getDocs());
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error while searching books");
        }
    }

    public BorderPane getRoot() {
        return root;
    }
}
