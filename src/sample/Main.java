package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window_ui win = new window_ui();

        Scene load = new Scene(root,800,800);

        load.getStylesheets().add("style.css");
        stage.setTitle("RetroSocial");
        stage.setScene(load);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
