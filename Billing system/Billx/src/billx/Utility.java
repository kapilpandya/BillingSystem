/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billx;

import java.util.regex.*;
import java.util.regex.Pattern;



/**
 *
 * @author Hp
 */
public class Utility {
    
    
    public static boolean emailcheck(String email)
    {
    
       String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}"; 
       
       Pattern pattern = Pattern.compile(regex);
       
       Matcher matcher = pattern.matcher(email);
       
       if(matcher.matches())
       {
           return false;
       }
       
       return true;
    }
    
    
    public static boolean usernamecheck(String username){
    
    Pattern pattern = Pattern.compile("^[A-Za-z][A-Za-z0-9_]{7,29}$");
    
    Matcher matcher = pattern.matcher(username);
        
       if(matcher.matches())
       {
           return false;
       }
       
       return true;
        
    }
    
    public static boolean namecheck(String name){
    
    Pattern pattern = Pattern.compile("^[a-zA-Z\\s]+$");
    
    Matcher matcher = pattern.matcher(name);
        
       if(matcher.matches())
       {
           return false;
       }
       
       return true;
        
    }
    
    
    
    
    public static boolean passwordcheck(String password)
    {
         String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
  
    Pattern pattern=Pattern.compile(regex);
    
    Matcher matcher = pattern.matcher(password);
         
        if(matcher.matches())
       {
           return false;
       }
       
       return true;
    
    }
    
    
    
    public static boolean phonenocheck(String phoneno)
    {
    
        Pattern pattern=Pattern.compile("(0/91)?[6-9][0-9]{9}");
        
    Matcher match=pattern.matcher(phoneno);
        
    
        if((match.find() && match.group().equals(phoneno)))
       {
           return false;
       }
       
       return true;
    
    
   
    }
    
    
    
    
}
