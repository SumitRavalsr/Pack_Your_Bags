package authorise;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import application.alertMessage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
class Flag{
	public boolean flag=true;
}
public class Hcontrol {

   

    @FXML
    private Button label1;

    @FXML
    private TextArea signup_add;

    @FXML
    private TextField signup_authoname;

    @FXML
    private PasswordField signup_cPassword1;

    @FXML
    private TextField signup_email1;

    @FXML
    private AnchorPane signup_form;

    @FXML
    private PasswordField signup_password1;
    @FXML
    private TextField signup_username1;
    @FXML
    private TextField d1; 

    @FXML
    private TextField login_username;

    @FXML
    private PasswordField login_password;

    @FXML
    private TextField login_showPassword;
    
    @FXML
    private Hyperlink login_forgotPassword;

    @FXML
    private AnchorPane login_form;
    
    @FXML
    private Button changePass_proceedBtn;

    @FXML
    private Button changePass_backBtn;

    @FXML
    private PasswordField changePass_password;

    @FXML
    private PasswordField changePass_cPassword;
    
    public Stage stage;
	public Scene scene;
	public Parent root;
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    private Statement statement;
    Flag f=new Flag();
    @FXML 
	private Button Label;
	@FXML
	private Button sp;
	@FXML
	private Label label;

	@FXML
	private HBox hbox;
	@FXML
	private Button label2;
	

	@FXML
	public void handMouseEnter() {

		Label.setScaleX(1.5);
		Label.setScaleY(1.5);
		
	}

	@FXML
	public void handleMouseExit() {
		Label.setScaleX(1.0);
		Label.setScaleY(1.0);
	}
	@FXML
	public void handMouseEnter1() {

		label1.setScaleX(1.5);
		label1.setScaleY(1.5);
		
	}

	@FXML
	public void handleMouseExit1() {
		label1.setScaleX(1.0);
		label1.setScaleY(1.0);
	}
	@FXML
	public void handMouseEnter2() {

		label2.setScaleX(1.5);
		label2.setScaleY(1.5);
		
	}

	@FXML
	public void handleMouseExit2() {
		label2.setScaleX(1.0);
		label2.setScaleY(1.0);
	}
	
	@FXML
	public void handMouseEnter4() {

		changePass_proceedBtn.setScaleX(1.5);
		changePass_proceedBtn.setScaleY(1.5);
		
	}

	@FXML
	public void handleMouseExit4() {
		changePass_proceedBtn.setScaleX(1.0);
		changePass_proceedBtn.setScaleY(1.0);
	}
	@FXML
	public void handMouseEnter5() {

		changePass_backBtn.setScaleX(1.5);
		changePass_backBtn.setScaleY(1.5);
		
	}

	@FXML
	public void handleMouseExit5() {
		changePass_backBtn.setScaleX(1.0);
		changePass_backBtn.setScaleY(1.0);
	}
	
    public Connection connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect
            = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
            	return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void changeSignup(ActionEvent event) throws IOException {
    	
        Parent root = FXMLLoader.load(getClass().getResource("Hotel.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.getIcons().add(new Image("/images/2.png"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        // TO SHOW OUR MAIN FORM
        stage.show();
        
    }
    public void login(ActionEvent event) {

        alertMessage alert = new alertMessage();
        
        if(!f.flag){
            login_password.setText(login_showPassword.getText());
          
        }
        else {login_password.setText(login_password.getText()); }
       
        // CHECK IF ALL OR SOME OF THE FIELDS ARE EMPTY
        if (login_username.getText().isEmpty() || login_password.getText().isEmpty()) {
            alert.errorMessage("Please Fill Username/Password");
        } else {
            String selectData = "SELECT * FROM authousers WHERE "
                    + "username = ? and password = ?"; 
            connect = connectDB();
           
            try {
                prepare = connect.prepareStatement(selectData);
                prepare.setString(1, login_username.getText());
                prepare.setString(2, login_password.getText());
                
                result = prepare.executeQuery();

                if (result.next()) {
                    // ONCE ALL DATA THAT USERS INSERT ARE CORRECT, THEN WE WILL PROCEED TO OUR MAIN FORM

                    alert.successMessage("Successfully Login!");
                    // TO LINK THE MAIN FORM
               
                    Parent root = FXMLLoader.load(getClass().getResource("Travel.fxml"));
                    stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        		    stage.getIcons().add(new Image("/images/2.png"));
                    Scene scene = new Scene(root);
                    
                    stage.setScene(scene);
                    // TO SHOW OUR MAIN FORM
                    stage.show();
                    
             
                } else {
                    // ELSE, THEN ERROR MESSAGE WILL APPEAR
                    alert.errorMessage("Incorrect Username/Password");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
   	
    public void showPassword() {
 
        if (f.flag) {
            login_showPassword.setText(login_password.getText());
            login_showPassword.setVisible(true);
            login_password.setVisible(false);
            f.flag=false;
        } else {
            login_password.setText(login_showPassword.getText());
            login_showPassword.setVisible(false);
            login_password.setVisible(true);
            f.flag=true;
        }

    }
    
    public void clear() {
    	login_username.setText("");
    	login_password.setText("");
    }

    public void register(ActionEvent event) {
    	
        alertMessage alert = new alertMessage();
       
		// CHECK IF WE HAVE EMPTY FIELDS
        if (signup_email1.getText().isEmpty() || signup_username1.getText().isEmpty()
                || signup_password1.getText().isEmpty() || signup_cPassword1.getText().isEmpty()
                || signup_authoname.getText().isEmpty() 
                ) {
            alert.errorMessage("All fields are necessary to be filled");
        } else if (signup_password1.getText() == signup_cPassword1.getText()) {
            // CHECK IF THE VALUE OF PASSWORD FIELDS IS EQUAL TO CONFIRM PASSWORD
            alert.errorMessage("Password does not match");
        } else if (!signup_password1.getText().contains("@") || signup_password1.getText().length()<5) {
            // CHECK IF THE LENGTH OF PASSWORD VALUE IS LESS THAN TO 5
            //, WE WILL CHECK THE CHARACTERS OF PASSWORD 
            alert.errorMessage("Invalid Password, at lease 5 Character and '@' is needed");
        } else {
            // CHECK IF THE USERNAME IS ALREADY TAKEN
        	
            String checkUsername = "SELECT * FROM users WHERE username = '"
                    + signup_username1.getText() + "'";
            connect = connectDB();
            try {
                statement = connect.createStatement();
                result = statement.executeQuery(checkUsername);

                if (result.next()) {
                    alert.errorMessage(signup_username1.getText() + " is already taken");
                } else {

                    String insertData = "INSERT INTO authousers "
                            + "(email, username, password, address, authorisation) "
                            + "VALUES(?,?,?,?,?)"; // FIVE (?)

                    prepare = connect.prepareStatement(insertData);
                    prepare.setString(1, signup_email1.getText());
                    prepare.setString(2, signup_username1.getText());
                    prepare.setString(3, signup_password1.getText());

                    prepare.setString(4, signup_add.getText());
                    
                    prepare.setString(5, signup_authoname.getText());

                    prepare.executeUpdate();
                    alert.successMessage("Registered Successfully!");

                    registerClearFields();

                    signup_form.setVisible(false);
                    

                    Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
                    stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            	    stage.getIcons().add(new Image("/images/2.png"));
                    Scene scene = new Scene(root);
                    
                    stage.setScene(scene);
                    // TO SHOW OUR MAIN FORM
                    stage.show();
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
 // TO CLEAR ALL FIELDS OF REGISTRATION FORM
    public void registerClearFields() {
        signup_email1.setText("");
        signup_username1.setText("");
        signup_password1.setText("");
        signup_cPassword1.setText("");
    }
    @FXML
    public void changePassword(ActionEvent event){
        
        alertMessage alert = new alertMessage();
        // CHECK ALL FIELDS IF EMPTY OR NOT
        if(changePass_password.getText().isEmpty() || changePass_cPassword.getText().isEmpty()
        		|| d1.getText().isEmpty() 
        		){
            alert.errorMessage("Please fill all blank fields");
        }else if(!changePass_password.getText().equals(changePass_cPassword.getText())){
            // CHECK IF THE PASSWORD AND CONFIRMATION ARE NOT MATCH
            alert.errorMessage("Password does not match");
        } else if (!changePass_password.getText().contains("@") || changePass_password.getText().length()<5) {
            // CHECK IF THE LENGTH OF PASSWORD VALUE IS LESS THAN TO 5
            //, WE WILL CHECK THE CHARACTERS OF PASSWORD 
            alert.errorMessage("Invalid Password, at least 5 Character and '@' is needed");
        }
        else{
            // USERNAME IS OUR REFERENCE TO UPDATE THE DATA OF THE USE
            
            try{
            	
                String checkemail = "SELECT * FROM authousers WHERE email = '"
                        + d1.getText() + "'";
                connect = connectDB();
               
            	statement = connect.createStatement();
                result = statement.executeQuery(checkemail);

                if (result.next()==false) {
                    alert.errorMessage(d1.getText() + " is not regitered yet!!");
  
                }
                else {
                	String checkauthorisation = "SELECT * FROM users WHERE authorisation = '"
                            + d1.getText() + "'";
                    connect = connectDB();
                   
                	statement = connect.createStatement();
                    result = statement.executeQuery(checkauthorisation);
                	if(result.next()) alert.errorMessage("Authorization name mismatch");
                	else {
                	String updateData = "UPDATE users SET password = ?"
                            + "WHERE email = '" + d1.getText() + "'";
                                       
                prepare = connect.prepareStatement(updateData);
                prepare.setString(1, changePass_password.getText());
                              
                prepare.executeUpdate();
                alert.successMessage("Succesfully changed Password");
                back(event);
                }
                }
            }
                catch(Exception e){e.printStackTrace();}
            
        }
        
    }
    
    public void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.getIcons().add(new Image("/images/2.png"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        // TO SHOW OUR MAIN FORM
        stage.show();
     
    }
    public void gofo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("forgotauthor.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.getIcons().add(new Image("/images/2.png"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        // TO SHOW OUR MAIN FORM
        stage.show();
     
    }
    @FXML
    void onMousePressedClose(MouseEvent event) {
        System.exit(0);
    }
    

}
