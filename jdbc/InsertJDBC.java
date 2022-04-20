package jdbc;
import java.sql.*;

public class InsertJDBC {

	public static void main(String[] args) {
		
		try
		{
			//Load the driver
           Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating a connection
			String url="jdbc:mysql://localhost:3306/myjdbc";
			String username="root";
			String password="7534050774";
			Connection con=DriverManager.getConnection(url, username, password);
			
			//Create a query
			String q="create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";
			//create a statement
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table created in database...");
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
