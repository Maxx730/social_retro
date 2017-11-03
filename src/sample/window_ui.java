package sample;

import com.sun.javafx.font.freetype.HBGlyphLayout;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.awt.*;


public class window_ui {
    public void __construct(){

    }

    //BUILDS OUT OUR MAIN SCREEN SCENE.
    public Scene main_screen(){
        BorderPane border = new BorderPane();
        Rectangle r = new Rectangle();
        Rectangle s = new Rectangle();

        Pane spacer = new Pane();

        spacer.setStyle("-fx-fill:#F00;");

        HBox.setHgrow(spacer,Priority.ALWAYS);

        s.setWidth(80);
        s.setHeight(80);
        s.setId("settings-btn-toggle");

        r.setWidth(720);
        r.setHeight(80);
        r.setId("top-bar-ui");

        border.getChildren().addAll(r,spacer,s);

        Scene main_scene = new Scene(border,800,800);
        main_scene.getStylesheets().add("style.css");

        return main_scene;
    }
}
