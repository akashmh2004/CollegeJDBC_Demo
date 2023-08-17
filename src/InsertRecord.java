import java.sql.*;

public class InsertRecord {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connected to Drive Sucess...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
            System.out.println("Connected Database Sucess...");

            Statement stmt = con.createStatement();
            System.out.println("Statement Created Sucess...");
            
            

            stmt.executeUpdate("insert into students(s_id,name,address,class_name,subject) values(1011,'Rohan','Khanda Colony','S.Y.Bs.IT','C++')");
            
            System.out.println("Records Insert Sucess...");
             ResultSet rs = stmt.executeQuery("select * from college.students");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
            }
            stmt.close();
            con.close();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
