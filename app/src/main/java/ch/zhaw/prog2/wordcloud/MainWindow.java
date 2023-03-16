package ch.zhaw.prog2.wordcloud;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class MainWindow extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        openMainWindow(primaryStage);
    }

    private void openMainWindow(Stage stage){
        try {
            //reads from the same package level as the current class
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
            //load root-node pane from FXML-SceneGraph
            Pane rootNode = loader.load();

            //Setup scene and prepare the stage
            Scene scene = new Scene(rootNode);
            stage.setScene(scene);
            stage.setMinHeight(200);
            stage.setMinWidth(300);
            stage.show();

        } catch (IOException e) {
            System.err.println("Error while loading FXML file: " + e.getMessage());
        }
    }
}
