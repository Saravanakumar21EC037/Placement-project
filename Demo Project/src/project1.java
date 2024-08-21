import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class project1 {
    public static void main(String[] sgd){
        String URL="jdbc:mysql://localhost:3306/Demo1";
        String USER="root";
        String PASSWORD="Saravana510@";
        try{
            Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Success");
            Statement selectStatement=con.createStatement();
            //create table
            String createTableSQL="CREATE TABLE Employee("
            +"Id INT AUTO_INCREMENT PRIMARY KEY,"
            +"F_NAME VARCHAR(17)NOT NULL,"
            +"L+NAME VARCHAR(19)NOT NULL," 
            +"Email VARCHAR(35)NOT NULL,"
            +"joining_date DATE NOT NULL"+")";
            selectStatement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully");
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}