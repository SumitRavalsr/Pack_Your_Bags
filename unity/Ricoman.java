package unity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import rajasthan.*;
import application.*;


class Payment{
	static int l=0,k;
	public static String s,s1,s2,s3;
	public static ResultSet result1,result2,result3;
}

public class Ricoman {

	 @FXML
	 ImageView myImageView;
	 
	 Button myButton;

		private Stage stage;
		private Scene scene;
		private Parent root;
		 public int k=1;
		  @FXML
		  public void displayImage() {
			  
		 if(k==1) { Image myImage = new Image(getClass().getResourceAsStream("b1.jpg")); myImageView.setImage(myImage); k++;}
		 else if(k==2) {Image myImage = new Image(getClass().getResourceAsStream("b2.jpg")); myImageView.setImage(myImage); k++;}
		 else if(k==3) {Image myImage = new Image(getClass().getResourceAsStream("b3.jpg")); myImageView.setImage(myImage); k++;}
		 else if(k==4) {Image myImage = new Image(getClass().getResourceAsStream("b4.jpg")); myImageView.setImage(myImage);k++; }
		 else if(k==5) {Image myImage = new Image(getClass().getResourceAsStream("b5.jpg")); myImageView.setImage(myImage); }
		 
		 }
		  @FXML
		 public void displayImage1() {

			 if(k==5) { Image myImage = new Image(getClass().getResourceAsStream("b4.jpg")); myImageView.setImage(myImage); k--;}
			  
			 else if(k==4) { Image myImage = new Image(getClass().getResourceAsStream("b3.jpg")); myImageView.setImage(myImage); k--;}
		 else if(k==3) {Image myImage = new Image(getClass().getResourceAsStream("b2.jpg")); myImageView.setImage(myImage); k--;}
		 else if(k==2) {Image myImage = new Image(getClass().getResourceAsStream("b1.jpg")); myImageView.setImage(myImage); k--;}
		 else if(k==1) {Image myImage = new Image(getClass().getResourceAsStream("b5.jpg")); myImageView.setImage(myImage); }
		 
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
	    
	    public TitledPane t1;
	    public TextField t11,t12,t21,t22,t31,t33;
	    public DatePicker t23;
	    @FXML
	    public static Label labelname;
	 
		private Connection connect;
	    private PreparedStatement prepare;
	    private ResultSet result;
	    private Statement statement;
	    
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
	    
	    public int l;


	    @FXML
public void bronze(ActionEvent event) throws IOException {
	Payment.l=49999;
	switchs1(event);
}
	    @FXML
public void silver(ActionEvent event) throws IOException {
	    	Payment.l=99999;
	switchs1(event);
}
	    @FXML
public void gold(ActionEvent event) throws IOException {
	    	Payment.l=149999;
	switchs1(event);
}
	    @FXML
public void platinum(ActionEvent event) throws IOException {
	    	Payment.l=249999;
	switchs1(event);

}

	    @FXML
	    public void pay1(ActionEvent event) {
	        alertMessage alert = new alertMessage();

	    	if(t11.getText().isEmpty() || t12.getText().isEmpty()) {
	    	    alert.errorMessage("All fields are necessary to be filled");
	    	
        } else {
            String selectData = "SELECT * FROM upi WHERE "
                    + "upiid = ? and password = ?"; // user IS OUR TABLE NAME
            connect = connectDB();
           
            try {
                prepare = connect.prepareStatement(selectData);
                prepare.setString(1, t11.getText());
                prepare.setString(2, t12.getText());
                Payment.result3 = prepare.executeQuery();

                if (Payment.result3.next()) {
                	message();
                	Payment.k=1;
                	Payment.s3= t11.getText();
                	switchotp(event);
              	
                	            
                } else {
                    alert.errorMessage("Incorrect UPI id/Password");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	   }
	    

	    @FXML
	    public void pay2(ActionEvent event) {
	        alertMessage alert = new alertMessage();
		    	if(t21.getText().isEmpty() || t22.getText().isEmpty()) {
		    	    alert.errorMessage("All fields are necessary to be filled");
		    	
	        } else {
	            String selectData = "SELECT * FROM deca WHERE "
	                    + "account = ? and cvv = ?"; 
	            connect = connectDB();
	           
	            try {
	                prepare = connect.prepareStatement(selectData);
	                prepare.setInt(1, Integer.parseInt(t21.getText()));
  	                prepare.setInt(2, Integer.parseInt(t22.getText()));
  	              Payment.result2= prepare.executeQuery();
  	                
	                if (Payment.result2.next()) {
	                	String s1=""+Payment.result2.getDate(3);
	                  	String s2=""+t23.getValue();
	        
	                  	if(s1.compareTo(s2)!=0) {
	                    	alert.errorMessage("Date Of Expiry Is Mismatch!!");
	                	}
	                  	else {
	                  		message();
		                	Payment.k=2;
		                	Payment.s2= t21.getText();
		                	switchotp(event);
	                  	}
	                }
	            	else {
	                    alert.errorMessage("Incorrect UPI id/Password");
	                }
	            }
	            
	             catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        
	   }

	    @FXML
	    public void pay3(ActionEvent event) {
	    	 alertMessage alert = new alertMessage();
		    	if(t31.getText().isEmpty() || t33.getText().isEmpty()) {
		    	    alert.errorMessage("All fields are necessary to be filled");
		    	
	        } else {
	            String selectData = "SELECT * FROM wallet WHERE "
	                    + "mobilen = ? and password = ?"; // user IS OUR TABLE NAME
	            connect = connectDB();
	           
	            try {
	                prepare = connect.prepareStatement(selectData);
	                prepare.setInt(1, Integer.parseInt(t31.getText()));
	                prepare.setString(2, t33.getText());
	                Payment.result1 = prepare.executeQuery();

	                if (Payment.result1.next()) {
	                	message();
	                	Payment.k=3;
	                	Payment.s1= t31.getText();
	                	switchotp(event);
	                   }
	             	else {
	                    alert.errorMessage("Incorrect Mobile Number/Password");
	                }
	            }
	            catch (Exception e) {
	                e.printStackTrace();
	            }
      }
	    }
	    
	    public void switchs1(ActionEvent event) throws IOException {

	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Registration.fxml"));	
	    	root = loader.load();	
	    	stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	    	Scene scene = new Scene(root,1540,815);
	    	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	    	stage.setScene(scene);
	    	stage.show();

	    }
	    
public void switchs2(ActionEvent event) throws IOException {

	FXMLLoader loader = new FXMLLoader(getClass().getResource("Tr.fxml"));	
	root = loader.load();	
	stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	Scene scene = new Scene(root,1540,815);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	stage.setScene(scene);
	stage.show();

}
public void switchotp(ActionEvent event) throws IOException {

	FXMLLoader loader = new FXMLLoader(getClass().getResource("OTP.fxml"));	
	root = loader.load();	
	stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	Scene scene = new Scene(root,1540,815);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	stage.setScene(scene);
	stage.show();

}

public void message() {
	alertMessage alert=new alertMessage();
	Payment.s="";
	int i=1;
	int max=9,min=0;
	while(i!=2) {
		Payment.s=Payment.s+(int)(Math.random()*(max-min+1))+min;
		i++;
	}
	alert.successMessage("Your OTP for transicion amount "+Payment.l+" is "+Payment.s);

}

@FXML
TextField f1;




public void on(ActionEvent event) {
	String s=f1.getText();

	alertMessage alert=new alertMessage();
  	if(s.compareTo(Payment.s)!=0) {
    	alert.errorMessage("OTP Is Mismatch!!");
    	message();
	}
  	else {
  		
  		 connect = connectDB();
        
  		try {
  			
  			if(Payment.k==3) {
        	int amount=Payment.result1.getInt(3);
        	if(amount<Payment.l) {alert.errorMessage("Insufficient Balance!!"); switchs2(event);}
        	else {
        	amount=amount-Payment.l;
        	String updateData = "UPDATE wallet SET amount = ? "
                    + "WHERE  mobilen= '" + Payment.s1 + "'";
        	prepare= connect.prepareStatement(updateData);
            prepare.setInt(1,amount);
          prepare.executeUpdate();
            
            alert.successMessage("Payment of "+Payment.l+" Successfull!");
            
            Parent root = FXMLLoader.load(getClass().getResource("Showinformation.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		    stage.getIcons().add(new Image("/images/2.png"));
            Scene scene = new Scene(root,1540,815);
            stage.setScene(scene);
            stage.show();
        	}
        
        }

  		  	else if(Payment.k==2) {
  		  	 
            	int amount=Payment.result2.getInt(4);
            	if(amount<Payment.l) {alert.errorMessage("Insufficient Balance!!"); switchs2(event);}
            	else {
            	amount=amount-Payment.l;
            	String updateData = "UPDATE deca SET amount = ? "
                        + "WHERE account = '" + Payment.s2 + "'";
            	prepare= connect.prepareStatement(updateData);
                prepare.setInt(1,amount);
                prepare.executeUpdate();
                
                alert.successMessage("Payment of "+Payment.l+" Successfull!");
                
                Parent root = FXMLLoader.load(getClass().getResource("Showinformation.fxml"));
                stage=(Stage)((Node)event.getSource()).getScene().getWindow();
    		    stage.getIcons().add(new Image("/images/2.png"));
                Scene scene = new Scene(root,1540,815);
                stage.setScene(scene);
                stage.show();
            	}
            }
  			
  		  	else if(Payment.k==1) {
  		  	int amount=Payment.result3.getInt(3);
        	if(amount<Payment.l) {alert.errorMessage("Insufficient Balance!!"); switchs2(event);}
        	else {
        	amount=amount-Payment.l;
        	String updateData = "UPDATE upi SET amount = ? "
                    + "WHERE upiid = '" + Payment.s3 + "'";
        	prepare= connect.prepareStatement(updateData);
            prepare.setInt(1,amount);
          prepare.executeUpdate();
            
            alert.successMessage("Payment of "+Payment.l+" Successfull!");
            
            Parent root = FXMLLoader.load(getClass().getResource("Showinformation.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		    stage.getIcons().add(new Image("/images/2.png"));
            Scene scene = new Scene(root,1540,815);
            stage.setScene(scene);
            stage.show();

  		  	}
  		  	}
             
        	
        } catch (Exception e) {
            e.printStackTrace();
        }

  		  	}
  		  	
  			
  	
  	}


@FXML
private TextField full;

@FXML
private TextField mn,nu;

@FXML
private TextArea address;

@FXML
private TextField aadhar;

@FXML
private DatePicker dod;



public void onac(ActionEvent event) {
	
    alertMessage alert = new alertMessage();
   
	// CHECK IF WE HAVE EMPTY FIELDS
    if (mn.getText().isEmpty() || nu.getText().isEmpty()
            || address.getText().isEmpty() || full.getText().isEmpty()
            || aadhar.getText().isEmpty() 
            ) {
        alert.errorMessage("All fields are necessary to be filled");
    } else {
        // CHECK IF THE USERNAME IS ALREADY TAKEN
    	
        String checkUsername = "SELECT * FROM users WHERE username = '"
                + aadhar.getText() + "'";
        connect = connectDB();
        try {
            statement = connect.createStatement();
            result = statement.executeQuery(checkUsername);

            if (result.next()) {
                alert.errorMessage(full.getText() + " is already submited Information!!");
                
            } 
            
            else if(Integer.parseInt(nu.getText())>8){
        		alert.errorMessage("Number of Passenger Is Very High!!");
        	}
        	
            else {
            	
            	
                String insertData = "INSERT INTO passinfo "
                        + "(full, mobile, Number, address, aadhar, dadepa,np) "
                        + "VALUES(?,?,?,?,?,?,?)"; // Seven (?)
           
                prepare = connect.prepareStatement(insertData);
                prepare.setString(1, full.getText());
                prepare.setString(2, mn.getText());
                prepare.setString(3, nu.getText());
                Payment.l=Payment.l*(Integer.parseInt(nu.getText()));
                prepare.setString(4, address.getText());
                prepare.setString(5, aadhar.getText());
                prepare.setString(6, String.valueOf(dod.getValue()));
                prepare.setInt(7, Payment.l*(Integer.parseInt(nu.getText())));
                
                prepare.executeUpdate();
                alert.successMessage("Information Submited Successfully!");                
                alert.successMessage("Your Total Amount to be Paid Is "+Payment.l);
                Parent root = FXMLLoader.load(getClass().getResource("Tr.fxml"));
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


public void switchscene(ActionEvent event) throws IOException {

	Parent root=FXMLLoader.load(getClass().getResource("/application/Dashboard.fxml"));
	
	Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();

	Scene scene = new Scene(root,1540,815);

	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

	stage.setScene(scene);
	stage.show();
}

public void pdfgenerate() {
	String filename="C:\\Users\\Priya Suthar\\Downloads\\New folder (2)\\passinfo\\passinfo.pdf";
	Document doc=new Document();
	
	try {
		PdfWriter.getInstance(doc, new FileOutputStream(filename) );
		doc.open();
		
		connect=connectDB();
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		String query="SELECT * FROM passinfo ";
		ps=connect.prepareStatement(query);
		rs=ps.executeQuery();
		int i=1;
		while(rs.next()) {
			String fullName= rs.getString("full");
			String Mobilenum= rs.getString("mobile");
			String Address= rs.getString("address");
			String Aadhar= rs.getString("aadhar");
			String Amount= rs.getString("np");
			String datep= rs.getString("dadepa");
			String Num= rs.getString("Number");
			Paragraph para = new Paragraph("Passanger Info No."+i+"\n\nFull Name: " + fullName + "\n\nMobile Number: " + Mobilenum
                    + "\n\nAddress: " + Address + "\n\nAadhar: " + Aadhar + "\n\nPaid Amount : " + Amount
                    + "\n\nNumber of Travelers: " + Num + "\n\nDate of Departure: " + datep+"\n\n"+"----".repeat(20) );
			i++;
		doc.add(para);
		doc.add(new Paragraph(" "));
		}
		doc.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
 }
  	
  	



	
  	



