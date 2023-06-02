
package util;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Rogerio Amorim 
 */
public class ConnectionFactory {
    
    //public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL    = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER   = "root";
    public static final String PASS   = "7Exodo0108";
    
   public static Connection getConnection() {
       try {
           Class.forName(DRIVER);
           return DriverManager.getConnection (URL, USER, PASS);
           
       } catch ( Exception ex) {
           throw new RuntimeException ( "ERRO de conexão !!!", ex);
       }
   } 
   
   public static void closeConnection ( Connection connection ){
       try {
           
           if (connection != null ) {
               connection.close();
           }
           
       } catch (Exception ex) { 
           
           throw new RuntimeException ("erro..!",ex);
                     
       }
   }
   
   public static void closeConnection ( Connection connection, PreparedStatement s ){
       try {
           
           if (connection != null ) {
               connection.close();
           }
           
           if ( s != null) {
               s.close();
           }
           
       } catch (Exception ex) { 
           
           throw new RuntimeException ("erro..!",ex);
                     
       }
   }
   
   
    public static void closeConnection ( Connection connection, 
            PreparedStatement s, ResultSet r){
       try {
           
           if (connection != null ) {
               connection.close();
           }
           
           if ( s != null) {
               s.close();
           }
           
           if ( r != null ) {
               r.close();
           }
           
       } catch (Exception ex) { 
           
           throw new RuntimeException ("erro..!",ex);
                     
       }
   }
    
}
