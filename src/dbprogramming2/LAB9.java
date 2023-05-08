
package dbprogramming2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB9 {

   
    public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/mydb2";
    String username = "root";
    String password = "Lodchong_1236";  
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();  
            String sql = "INSERT INTO student " + "VALUES ('65010','Jiranan' , 'Yenlab' , 'aaaaa@gmail.com' ,'IT')";
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
}
