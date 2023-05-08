package dbprogramming2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB15 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "Lodchong_1236";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet results = statement.executeQuery(sql);
            ResultSetMetaData rsMetaData = results.getMetaData();
           
            System.out.println(rsMetaData.getColumnCount());
            
                for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
                    System.out.printf("%s\t",rsMetaData.getColumnName(i)," 8");
                }
             System.out.println();
             while (results.next()) {
             for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
                 System.out.printf("%-10s\t",results.getString(i));
            }
            System.out.println();
             }
              connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB15.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB15.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
