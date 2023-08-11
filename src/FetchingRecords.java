import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchingRecords {
     public static void main(String[] args) 
    {
        
        try 
        {
           Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connected to Driver Sucess...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college ", "root", "root");
            System.out.println("Connected Database Sucess...");

            Statement stmt = con.createStatement();
            System.out.println("Statement Created");
            ResultSet rs = stmt.executeQuery("select * from college.students");
            while(rs.next())
            {
              System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));  
            }
            

            
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
