
package dbprogramming2;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB12 {

   
    public static void main(String[] args) {
         String url = "jdbc:mysql://localhost:3306/mydb2";
         String username = "root";
         String password = "Lodchong_1236"; 
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO student " + "VALUES (?,? , ? ,? ,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1, "65010");
            preparedStatement.setString(2, "Jiranan");
            preparedStatement.setString(3, "Yenlab");
            preparedStatement.setString(4, "aaaa@gmail.com");
            preparedStatement.setString(5, "IT");
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    
}
