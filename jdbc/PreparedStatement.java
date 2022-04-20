package jdbc;
import java.sql.*;
import java.io.*;
public class PreparedStatement {
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
	
		//create a query
		
		String q="insert into table1(tName,tCity) values(?,?)";
		
		//get the prepared statement object
		
		java.sql.PreparedStatement pstmt=con.prepareStatement(q);
		//Set the values to query
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name: ");
		String name=br.readLine();
		System.out.println("Enter city: ");
		String city=br.readLine();
		
		pstmt.setString(1,name);
		pstmt.setString(2,city);
		pstmt.executeUpdate();
		
		
		
		System.out.println("Inserted successfully");
		
		con.close();
		
		
		
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
