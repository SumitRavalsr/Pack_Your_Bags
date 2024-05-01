package kashmir;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Flagbo;
import application.alertMessage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class reachc  extends Coman implements Initializable{

	@FXML
	private WebView webView;
	@FXML
	private TextField textField;

	private Stage stage;
	
	private WebEngine engine;
	private String homePage;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		engine = webView.getEngine();
		homePage = "www.google.com/maps/dir/Vadodara,+Gujarat/Jammu+and+Kashmir/@27.6913522,69.3425744,6z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x395fc8ab91a3ddab:0xac39d3bfe1473fb8!2m2!1d73.1812187!2d22.3071588!1m5!1m1!1s0x38e1092499ffa89d:0x6567a6d4697e7f1!2m2!1d75.3412179!2d33.277839?entry=ttu";
		textField.setText(homePage);
		loadPage();
	}
	
	public void loadPage() {
		
		//engine.load("http://www.google.com");
		engine.load("http://"+textField.getText());
		textField.setText(" Welcome.....   Map BetWeen Vadodara to Udaipur(City Palace)!!!!");
	}


	@FXML
	public void switchscene1(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Ri.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}
	@FXML
	public void switchscene2(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Rd.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}	
	@FXML
	public void switchscene3(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Rajasthan.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}	
	@FXML
	public void switchscene4(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Uhtr.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}
	
	@FXML
	public void switchscene5(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Rinfo.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}
	@FXML
	public void switchscene6(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("/application/Dashboard.fxml"));
		
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
			
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}
	@FXML
	public void switchscene7(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Lo.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}
	
	@FXML
	public void switchscene8(ActionEvent event) throws IOException {
		
		if(Flagbo.flag1) {
		Parent root=FXMLLoader.load(getClass().getResource("Book.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		}
		
		else {
			alertMessage alert=new alertMessage();
			alert.errorMessage("Please Login First");
			Parent root=FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
			stage=(Stage)((Node)event.getSource()).getScene().getWindow();
			
			Scene scene = new Scene(root,1540,815);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			stage.setScene(scene);
			stage.show();
		}
		
	}


    @FXML
    void onMousePressedClose(MouseEvent event) {
        System.exit(0);
    }
    
}
