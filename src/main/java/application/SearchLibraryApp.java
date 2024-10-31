package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import controllers.RootController;

public class SearchLibraryApp extends Application {

    private final RootController rootController = new RootController();

    public void start(Stage stage) throws Exception {

        Scene openLibraryScene = new Scene(rootController.getRoot());
        Stage openLibraryStage = new Stage();

        openLibraryStage.setTitle("OpenLibrary");
        openLibraryStage.setScene(openLibraryScene);
        openLibraryStage.show();
    }
}
