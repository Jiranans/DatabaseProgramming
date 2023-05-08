
package dbprogramming2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB8 {

    public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/mydb2";
    String username = "root";
    String password = "Lodchong_1236";
      
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();  
            String sql = "SELECT * FROM student";
           ResultSet resultSet = statement.executeQuery(sql);
            
           while(resultSet.next()) 
                System.out.println(resultSet.getString(1) + " " 
                + resultSet.getString(2) + " "
                + resultSet.getString(3) + " " 
                + resultSet.getString(4) + " "
                + resultSet.getString(5)); //colume 1 Studentid + colume 2 fristname + colume 3 lastname +....
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
