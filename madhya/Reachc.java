package madhya;

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

public class Reachc  extends Coman implements Initializable{

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
		homePage = "www.google.com/maps/dir/Vadodara,+Gujarat/Sanchi,+Madhya+Pradesh/@22.8921616,74.1296976,8z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x395fc8ab91a3ddab:0xac39d3bfe1473fb8!2m2!1d73.1812187!2d22.3071588!1m5!1m1!1s0x397c0feedf9fa67d:0xfc8b5872bb70993b!2m2!1d77.7418238!2d23.4873393?entry=ttu";
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

		Parent root=FXMLLoader.load(getClass().getResource("Ri1.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}
	@FXML
	public void switchscene2(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Rd1.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}	
	@FXML
	public void switchscene3(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Rajasthan1.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}	
	@FXML
	public void switchscene4(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Uhtr1.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}
	
	@FXML
	public void switchscene5(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Rinfo1.fxml"));
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

		Parent root=FXMLLoader.load(getClass().getResource("Lo1.fxml"));
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
