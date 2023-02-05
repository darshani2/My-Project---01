
package Project;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;



public class ConnectionProvider {
    public static Connection connect(){
        
        try{
        
        Class.forName("com.mysql.jdbc.Driver");
         Connection con =   (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/omqa","root","");
        return con;
        
        }catch(Exception e){
            return null;
        }
        
    }

    public static java.sql.Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
