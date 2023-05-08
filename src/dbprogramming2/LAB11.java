
package dbprogramming2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB11 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
    String url = "jdbc:mysql://localhost:3306/mydb2";
    String username = "root";
    String password = "Lodchong_1236";  
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();  
            String sql = "delete from student where studentID = '65010'";
            statement.executeUpdate(sql); 
            
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(LAB10.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(LAB10.class.getName()).log(Level.SEVERE, null, ex);
       }
       
      
    }
}
