import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conectivty 
{
    public boolean getConnectivity()
    {
        try 
        {
           Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connected to Driver Sucess...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college ", "root", "root");
            System.out.println("Connected Database Sucess...");
            Statement stmt = con.createStatement();
            System.out.println("Statement Created");

            return true;
            
        } catch (Exception e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
}