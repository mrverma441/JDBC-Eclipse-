package jdbc;
//Program for jdbc 
import java.sql.*;

public class Firstjdbc {
	public static void main(String[] args) {
		
		try
		{
			//Load the driver;
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating a connection
			String url="jdbc:mysql://localhost:3306/myjdbc";
			String username="root";
			String password="7534050774";
			Connection con=DriverManager.getConnection(url, username, password);
			
			if(con.isClosed())
			{
				System.out.println("Connection is closed");
			}
			else
			{
				System.out.println("Connection established....");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
