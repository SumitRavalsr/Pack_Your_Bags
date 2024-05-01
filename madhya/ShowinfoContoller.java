package madhya;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowinfoContoller {

public void switchscene(ActionEvent event) throws IOException {

	Parent root=FXMLLoader.load(getClass().getResource("/application/Dashboard.fxml"));
	
	Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();

	Scene scene = new Scene(root,1540,815);

	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

	stage.setScene(scene);
	stage.show();
}

}
