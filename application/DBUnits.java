package application;

import javafx.scene.Node;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.input.ScrollEvent;
import javafx.stage.Stage;
import javafx.util.Duration;
import rajasthan.*;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;
class Flag{
	public boolean flag=true;
	public static String s21="";
}
public class DBUnits {
 

    @FXML
    private TextField login_username;

    @FXML
    private PasswordField login_password;

    @FXML
    private TextField login_showPassword;
    
    @FXML
    private Hyperlink login_forgotPassword;

    @FXML
    private AnchorPane signup_form,login_form;

    @FXML
    private TextField signup_email;

    @FXML
    private TextField signup_username;

    @FXML
    private PasswordField signup_password;

    @FXML
    private PasswordField signup_cPassword;

    @FXML
    private Button signup_btn,log_out;

    @FXML
    private RadioButton r1;
    
    @FXML
    private RadioButton r2;
    
    @FXML
    private RadioButton r3;
    
    @FXML
    private Button signup_loginAccount;

    @FXML
    private ToggleGroup colorToggleGroup;
   
    @FXML
    private TextField d1; 
    
    @FXML
    private Button changePass_proceedBtn;

    @FXML
    private Button changePass_backBtn;

    @FXML
    private PasswordField changePass_password;

    @FXML
    private PasswordField changePass_cPassword;
 
    @FXML
    private DatePicker date2,d5;
    
    @FXML
    private TextField hi;
    
    private String gender;
    
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
	 public Label l22=new Label("hello");
	@FXML
	private Button label1;
	@FXML
	private HBox hbox;
	@FXML
	private Button label2;
	
	
	 public void initialize() {
	   
		 
         if(Flagbo.flag1==true) {
        	 v1.setDisable(true);
        	 l22.setText("Hello "+Flag.s21);
           	 
        	 v1.setOpacity(0);
        	 v2.setOpacity(0);
        	 v2.setDisable(true);
        	 log_out.setDisable(false);
        	 log_out.setOpacity(1);
         }

		}

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
    	
        Parent root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.getIcons().add(new Image("/images/2.png"));
        Scene scene = new Scene(root,1540,815);
        
        stage.setScene(scene);
        stage.show();
        
    }
    public void login(ActionEvent event) {

        alertMessage alert = new alertMessage();
        
        if(!f.flag){
            login_password.setText(login_showPassword.getText());
          
        }
        else {login_password.setText(login_password.getText()); }
       
        if (login_username.getText().isEmpty() || login_password.getText().isEmpty()) {
            alert.errorMessage("Please Fill Username/Password");
        } else {
            String selectData = "SELECT * FROM users WHERE "
                    + "username = ? and password = ?"; 
            connect = connectDB();
           
            try {
                prepare = connect.prepareStatement(selectData);
                prepare.setString(1, login_username.getText());
                prepare.setString(2, login_password.getText());
                
                result = prepare.executeQuery();

                if (result.next()) {
                	Flag.s21=""+login_username.getText();
                    Flagbo.flag1=true;

                    alert.successMessage("Successfully Login!");
               	    Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
                    stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        		    stage.getIcons().add(new Image("/images/2.png"));
                    Scene scene = new Scene(root,1540,815);
                    
                    stage.setScene(scene);
                    // TO SHOW OUR MAIN FORM
                    stage.show();
             
                } else {
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
        if (signup_email.getText().isEmpty() || signup_username.getText().isEmpty()
                || signup_password.getText().isEmpty() || signup_cPassword.getText().isEmpty()
                || !(r1.isSelected() || r2.isSelected() || r3.isSelected() ) 
                ) {
            alert.errorMessage("All fields are necessary to be filled");
        } else if (signup_password.getText() == signup_cPassword.getText()) {
        alert.errorMessage("Password does not match");
        } else if (!signup_password.getText().contains("@") || signup_password.getText().length()<5) {
            alert.errorMessage("Invalid Password, at lease 5 Character and '@' is needed");
        } else {
        
        	if(r1.isSelected()) gender="male";
        	else if(r2.isSelected()) gender="female";
        	else if(r3.isSelected()) gender="other";
            String checkUsername = "SELECT * FROM users WHERE username = '"
                    + signup_username.getText() + "'";
            connect = connectDB();
            try {
                statement = connect.createStatement();
                result = statement.executeQuery(checkUsername);

                if (result.next()) {
                    alert.errorMessage(signup_username.getText() + " is already taken");
                } else {

                    String insertData = "INSERT INTO users "
                            + "(email, username, password, gender, date) "
                            + "VALUES(?,?,?,?,?)"; // FIVE (?)

                    prepare = connect.prepareStatement(insertData);
                    prepare.setString(1, signup_email.getText());
                    prepare.setString(2, signup_username.getText());
                    prepare.setString(3, signup_password.getText());

                    prepare.setString(4,gender);
                    
                    prepare.setString(5, String.valueOf(d5.getValue()));

                    prepare.executeUpdate();
                    alert.successMessage("Registered Successfully!");

                    registerClearFields();

                    signup_form.setVisible(false);
                    

                    Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
                    stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            	    stage.getIcons().add(new Image("/images/2.png"));
                    Scene scene = new Scene(root);
                    
                    stage.setScene(scene);
                    stage.show();
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
    public void registerClearFields() {
        signup_email.setText("");
        signup_username.setText("");
        signup_password.setText("");
        signup_cPassword.setText("");
    }
    @FXML
    public void changePassword(ActionEvent event){
        
        alertMessage alert = new alertMessage();
        if(changePass_password.getText().isEmpty() || changePass_cPassword.getText().isEmpty()
        		|| d1.getText().isEmpty() 
        		){
            alert.errorMessage("Please fill all blank fields");
        }else if(!changePass_password.getText().equals(changePass_cPassword.getText())){
            alert.errorMessage("Password does not match");
        } else if (!changePass_password.getText().contains("@") || changePass_password.getText().length()<5) {
            alert.errorMessage("Invalid Password, at lease 5 Character and '@' is needed");
        }
        else{
            
            try{
            	
                String checkemail = "SELECT * FROM users WHERE email = '"
                        + d1.getText() + "'";
                connect = connectDB();
               
            	statement = connect.createStatement();
                result = statement.executeQuery(checkemail);

                if (result.next()==false) {
                    alert.errorMessage(d1.getText() + " is not regitered yet!!");
  
                }
                else {
                	String s1=""+result.getDate(5);
                	String s2=""+date2.getValue();
                	if(s1.compareTo(s2)!=0) alert.errorMessage("Date Of Birth Is Mismatch!!");
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
        Parent root = FXMLLoader.load(getClass().getResource("Forgotpa.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.getIcons().add(new Image("/images/2.png"));
        Scene scene = new Scene(root,1540,815);
        
        stage.setScene(scene);
        // TO SHOW OUR MAIN FORM
        stage.show();
     
    }

    @FXML
    void onMousePressedClose(MouseEvent event) {
        System.exit(0);
    }
    
	@FXML
	public AnchorPane a1;
	@FXML
	public AnchorPane a2;
	@FXML
	public AnchorPane a3;
	@FXML
	public AnchorPane a4;
	@FXML
	public AnchorPane s1,s2,s3,s4,s5,s6;
	@FXML
	public Button v1,v2,r11;
	@FXML
	public ScrollPane k1;
	
	@FXML
	public void scroll1(ActionEvent event){
	
	}
	@FXML
	public void handMouseEnter6() {

		a1.setScaleX(1.1);
		a1.setScaleY(1.1);
		
	}

	@FXML
	public void handleMouseExit6() {
		a1.setScaleX(1.0);
		a1.setScaleY(1.0);
	}
	
	@FXML
	public void handMouseEnter7() {

		a2.setScaleX(1.1);
		a2.setScaleY(1.1);
		
	}

	@FXML
	public void handleMouseExit7() {
		a2.setScaleX(1.0);
		a2.setScaleY(1.0);
	}	@FXML
	public void handMouseEnter8() {

		a3.setScaleX(1.1);
		a3.setScaleY(1.1);
		
	}

	@FXML
	public void handleMouseExit8() {
		a3.setScaleX(1.0);
		a3.setScaleY(1.0);
	}	@FXML
	public void handMouseEnter9() {

		a4.setScaleX(1.1);
		a4.setScaleY(1.1);
		
	}

	@FXML
	public void handleMouseExit9() {
		a4.setScaleX(1.0);
		a4.setScaleY(1.0);
	}
	@FXML
	public void handMouseEnter10() {

		s1.setScaleX(1.1);
		s1.setScaleY(1.1);
		
	}

	@FXML
	public void handleMouseExit10() {
		s1.setScaleX(1.0);
		s1.setScaleY(1.0);
	}
	@FXML
	public void handMouseEnter11() {

		v1.setScaleX(1.5);
		v1.setScaleY(1.5);
	}

	@FXML
	public void handleMouseExit11() {
		v1.setScaleX(1.0);
		v1.setScaleY(1.0);
	}
	@FXML
	public void handMouseEnter12() {

		v2.setScaleX(1.5);
		v2.setScaleY(1.5);
	}

	@FXML
	public void handleMouseExit12() {
		v2.setScaleX(1.0);
		v2.setScaleY(1.0);
	}

	@FXML
	public void handMouseEnter13() {

		s2.setScaleX(1.1);
		s2.setScaleY(1.1);
	}

	@FXML
	public void handleMouseExit13() {
		s2.setScaleX(1.0);
		s2.setScaleY(1.0);
	}
				
	@FXML
	public void handMouseEnter14() {

		s3.setScaleX(1.1);
		s3.setScaleY(1.1);
	}

	@FXML
	public void handleMouseExit14() {
		s3.setScaleX(1.0);
		s3.setScaleY(1.0);
	}
				
	@FXML
	public void handMouseEnter15() {

		s4.setScaleX(1.1);
		s4.setScaleY(1.1);
	}

	@FXML
	public void handleMouseExit15() {
		s4.setScaleX(1.0);
		s4.setScaleY(1.0);
	}
				
	@FXML
	public void handMouseEnter16() {

		s5.setScaleX(1.1);
		s5.setScaleY(1.1);
	}

	@FXML
	public void handleMouseExit16() {
		s5.setScaleX(1.0);
		s5.setScaleY(1.0);
	}
				
	@FXML
	public void handMouseEnter17() {

		s6.setScaleX(1.1);
		s6.setScaleY(1.1);
	}

	@FXML
	public void handleMouseExit17() {
		s6.setScaleX(1.0);
		s6.setScaleY(1.0);
	}
				
	@FXML
	public void action1(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.getIcons().add(new Image("/images/2.png"));
        Scene scene = new Scene(root,1540,815);
        
        stage.setScene(scene);
        // TO SHOW OUR MAIN FORM
        stage.show();
        
	}
	@FXML
	public void action2(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Rajasthan/Rajasthan.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.getIcons().add(new Image("/images/2.png"));
        Scene scene = new Scene(root,1540,815);
        
        stage.setScene(scene);
        // TO SHOW OUR MAIN FORM
        stage.show();
        
	}
	
	@FXML
	public void action3(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/authorise/Login.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.getIcons().add(new Image("/images/2.png"));
        Scene scene = new Scene(root,1540,815);
        
        stage.setScene(scene);
        // TO SHOW OUR MAIN FORM
        stage.show();
        
	}
	
	@FXML
	public void action4(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/unity/Rajasthan.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.getIcons().add(new Image("/images/2.png"));
        Scene scene = new Scene(root,1540,815);
        
        stage.setScene(scene);
        // TO SHOW OUR MAIN FORM
        stage.show();
        
	}
	
	@FXML
	public void action5(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/madhya/Rajasthan1.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.getIcons().add(new Image("/images/2.png"));
        Scene scene = new Scene(root,1540,815);
        
        stage.setScene(scene);
        // TO SHOW OUR MAIN FORM
        stage.show();
        
	}
	
	@FXML
	public void action6(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/kashmir/Rajasthan.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.getIcons().add(new Image("/images/2.png"));
        Scene scene = new Scene(root,1540,815);
        
        stage.setScene(scene);
        // TO SHOW OUR MAIN FORM
        stage.show();
        
	}
	
	
	@FXML
	public void action7(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/dakor/Rajasthan.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.getIcons().add(new Image("/images/2.png"));
        Scene scene = new Scene(root,1540,815);
        
        stage.setScene(scene);
        // TO SHOW OUR MAIN FORM
        stage.show();
        
	}

	
	@FXML
	public void logout(ActionEvent event) throws IOException {
		alertMessage alert = new alertMessage();
    	alert.successMessage("Log out successfully!!!!");
   	 
	 Flagbo.flag1=false;
        Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.getIcons().add(new Image("/images/2.png"));
        Scene scene = new Scene(root,1540,815);
        
        stage.setScene(scene);
        // TO SHOW OUR MAIN FORM
        stage.show();
        
	}
	
	public TextField fname,femail,fmessage;
	@FXML
    public void feedback(ActionEvent event) throws Exception {
    	alertMessage alert = new alertMessage();
    	if(fname.getText().isEmpty()||femail.getText().isEmpty()||fmessage.getText().isEmpty()) {
    		alert.errorMessage("Please fill all blank fiels");
    	}
    	else {
    		  connect = connectDB();
    		  String insertData = "INSERT INTO question "
                      + "(name,email,message) "
                      + "VALUES(?,?,?)"; // three (?)

              prepare = connect.prepareStatement(insertData);
              prepare.setString(1, fname.getText());
              prepare.setString(2, femail.getText());
              prepare.setString(3, fmessage.getText());
              prepare.executeUpdate();
              alert.successMessage("Submitted Successfully!");
              feedbackClearFields();
                  
    		
    	}
    }
	
    public void feedbackClearFields() {
       fname.setText("");
       fmessage.setText("");
       femail.setText("");
       
    }
    

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;

    @FXML
    private Label l4;

    @FXML
    private Label l5;
    @FXML
    private AnchorPane sa1;

    @FXML
    private AnchorPane sa2;

    @FXML
    private AnchorPane sa3;

    @FXML
    private AnchorPane sa4;

    @FXML
    private AnchorPane sa5;


    @FXML
    private TextField t1; 

    @FXML
    public void  actionb(ActionEvent event) throws IOException{
    	
    	boolean flag=false;
    	String str=null;
    	if(l1.getText().equalsIgnoreCase("Udaipur")) {str="/Rajasthan/Rajasthan.fxml"; flag=true;}
    	if(l1.getText().equalsIgnoreCase("kashmir")) {str="/kashmir/Rajasthan.fxml"; flag=true;}
    	if(l1.getText().equalsIgnoreCase("Sanchi")) {str="/madhya/Rajasthan1.fxml"; flag=true;}
    	if(l1.getText().equalsIgnoreCase("Statue of unity")) { str="/unity/Rajasthan.fxml"; flag=true;}
    	if(l1.getText().equalsIgnoreCase("Dakor")) { str="/dakor/Rajasthan.fxml"; flag=true;}
    	
    	
    	if(flag) {
    	   Parent root = FXMLLoader.load(getClass().getResource(str));
           stage=(Stage)((Node)event.getSource()).getScene().getWindow();
   	    stage.getIcons().add(new Image("/images/2.png"));
           Scene scene = new Scene(root,1540,815);
           
           stage.setScene(scene);
           // TO SHOW OUR MAIN FORM
           stage.show();
    	}
    	
    }
    

    @FXML
    public void actionS(ActionEvent event) throws IOException  {
    	String[] Place = {"kashmir","Udaipur","Sanchi","Surat","Statue of unity","Dakor","salt","same","saga","sake"};
    	boolean flag=false;
    	sa1.setVisible(false);l1.setText("Label");
    	sa2.setVisible(false);l2.setText("Label");
    	sa3.setVisible(false);l3.setText("Label");
    	sa4.setVisible(false);l4.setText("Label");
    	sa5.setVisible(false);l5.setText("Label");
    	
    	for(int i=0;i<Place.length;i++) 
		{
			  if(Place[i].toLowerCase().contains(t1.getText().toLowerCase())) 
			  {
				  if(l1.getText().equals("Label")) { sa1.setVisible(true); l1.setText(Place[i]); flag=true;}
				  else if(l2.getText().equals("Label")) {sa2.setVisible(true);l2.setText(Place[i]);flag=true;}
				  else if(l3.getText().equals("Label")) {sa3.setVisible(true);l3.setText(Place[i]);flag=true;}
				  else if(l4.getText().equals("Label")) {sa4.setVisible(true);l4.setText(Place[i]);flag=true;}
				  else if(l5.getText().equals("Label")) {sa5.setVisible(true);l5.setText(Place[i]);flag=true;}
			  }
			  
		} 	

		  if (!flag) { sa1.setVisible(true); l1.setText("Not Found!!");
	    	 }
		  

    }

    
}
