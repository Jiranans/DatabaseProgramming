
package dbprogramming2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB13 {

   
    public static void main(String[] args) {
         String url = "jdbc:mysql://localhost:3306/mydb2";
         String username = "root";
         String password = "Lodchong_1236"; 
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "update student set email = ? where studentID = ?";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,"aaaa@kmutt.ac.th");
            preparedStatement.setString(2,"65010");
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    
}
