package controllers;

import dad.openlibrary.api.OpenLibrary;
import dad.openlibrary.api.SearchResult;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.layout.BorderPane;
import model.Book;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class RootController implements Initializable {

        // api
        private final OpenLibrary openLibrary = new OpenLibrary();

        // model
        private final StringProperty searchQuery = new SimpleStringProperty();
        private final ListProperty<Book> books = new SimpleListProperty<>(FXCollections.observableArrayList());


        //view
        @FXML
        private TableColumn<Book, String> authorColumn;

        @FXML
        private TableView<Book> booksTable;

        @FXML
        private TableColumn<Book, String> isenColumn;

        @FXML
        private TableColumn<Book, Number> pagesColumn;

        @FXML
        private TableColumn<Book, String> publisherColumn;

        @FXML
        private BorderPane root;

        @FXML
        private Button searchButton;

        @FXML
        private TextField searchField;

        @FXML
        private TableColumn<Book, String> titleColumn;

        @FXML
        private TableColumn<Book, Boolean> hasPagesColumn;

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
        titleColumn.setCellValueFactory(cellData -> cellData.getValue().titleProperty());
        authorColumn.setCellValueFactory(cellData -> cellData.getValue().authorProperty());
        isenColumn.setCellValueFactory(cellData -> cellData.getValue().isbnProperty());
        publisherColumn.setCellValueFactory(cellData -> cellData.getValue().publisherProperty());
        pagesColumn.setCellValueFactory(cellData -> cellData.getValue().pagesProperty());
        hasPagesColumn.setCellValueFactory(cellData -> cellData.getValue().hasPagesProperty());

        // cell factories
        hasPagesColumn.setCellFactory(CheckBoxTableCell.forTableColumn(hasPagesColumn));
        
        //bindings
        booksTable.itemsProperty().bind(books);
        searchQuery.bind(searchField.textProperty());
    }

    @FXML
    void onSearchAction(ActionEvent event) {
        try {
            SearchResult result = openLibrary.getBooks(searchQuery.get());

            List<Book> bookList = result.getDocs()
                    .stream()
                    .map(Book::new)
                    .toList();

            this.books.setAll(bookList);

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
