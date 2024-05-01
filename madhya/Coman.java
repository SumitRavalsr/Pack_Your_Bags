package madhya;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Flagbo;
import application.alertMessage;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Coman  implements Initializable{

 //ImageView is a Node used for painting images loaded with Images

 // Image = picture 
 // ImageView = picture frame

	private Stage stage;
	private Scene scene;
	private Parent root;
 @FXML
 ImageView myImageView;
 
 Button myButton;
 @FXML
 
 TextArea itemDeatailTextArea;
 
	public void initialize() {
	itemDeatailTextArea.setText("NO  I'm A Don");
	
	}
 public int k=1,l=1;
  
	@FXML
	public void switchscene1(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Ri1.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		 mediaPlayer.pause();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}
	@FXML
	public void switchscene2(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Rd1.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		 mediaPlayer.pause();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}	
	@FXML
	public void switchscene3(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Rajasthan1.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		 mediaPlayer.pause();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}	
	@FXML
	public void switchscene4(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Uhtr1.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		 mediaPlayer.pause();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}
	
	@FXML
	public void switchscene5(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Rinfo1.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		 mediaPlayer.pause();
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}
	@FXML
	public void switchscene6(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("/application/Dashboard.fxml"));
		
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		 mediaPlayer.pause();
			
		Scene scene = new Scene(root,1540,815);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
		
	}
	@FXML
	public void switchscene7(ActionEvent event) throws IOException {

		Parent root=FXMLLoader.load(getClass().getResource("Lo1.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		 mediaPlayer.pause();
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
		 mediaPlayer.pause();
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
			 mediaPlayer.pause();
			Scene scene = new Scene(root,1540,815);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			stage.setScene(scene);
			stage.show();
		}
		
	}

	@FXML
	private MediaView mediaView;
	
	@FXML
	private Button pauseButton;
	
	private File file;
	private Media media;
	public MediaPlayer mediaPlayer,mediaPlayer1;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		file = new File("Sanchi.mp4");
		media = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
		mediaPlayer.play();
		
			
	}
	public int k1=1,k2=1;
	@FXML
	public void playpause() {
	
		if(k1==1)
		 { 
		 mediaPlayer.pause(); k1=0;
		 }
	
		else if(k1==0) { 
			
		  mediaPlayer.play();

			 if(mediaPlayer.getStatus() != MediaPlayer.Status.READY) {
					mediaPlayer.seek(Duration.seconds(0.0));
					System.out.println("Hi");
					mediaPlayer.play();
				}
			 k1=1; }
		}
	@FXML
	public void playpause1() {
	
		if(k1==1)
		 { 
		 mediaPlayer.pause(); k1=0;
		 }
	
		else if(k1==0) { 
			
		  mediaPlayer.play();

			 if(mediaPlayer.getStatus() != MediaPlayer.Status.READY) {
					mediaPlayer.seek(Duration.seconds(0.0));
					
					mediaPlayer.play();
				}
			 k1=1; }
		}	

    @FXML
    void onMousePressedClose(MouseEvent event) {
        System.exit(0);
    }
    
	}

