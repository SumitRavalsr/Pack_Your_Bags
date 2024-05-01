
package application;

import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;



public class Main extends Application {
    @Override
	public void start(Stage primaryStage) {
		try {
	
			Parent root=FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
			setUserAgentStylesheet(STYLESHEET_CASPIAN);
	        primaryStage.initStyle(StageStyle.TRANSPARENT); 
			Scene scene = new Scene(root,1540,815);
		    scene.setFill(javafx.scene.paint.Color.WHITE);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.getIcons().add(new Image("/images/2.png"));
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		launch(args);
	}
}
