package application;


import java.sql.Date;

/**
 *
 * @author hocin
 */
public class User {
   
    String name ;
    Date birth ;
    String adress ,email ;

    public User(String name, Date birth, String adress, String email) {
    
        this.name = name;
        this.birth = birth;
        this.adress = adress;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
