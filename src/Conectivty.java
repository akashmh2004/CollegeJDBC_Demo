import java.sql.Connection;
import java.sql.DriverManager;

public class Conectivty 
{

    public static void main(String[] args) 
    {
        
        try 
        {
           Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connected to Driver Sucess...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college ", "root", "root");
            System.out.println("Connected Database Sucess...");
            
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}