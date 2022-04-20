package jdbc;
import java.sql.*;
import java.io.*;

public class InsertingImagetoDatabase {
public static void main(String[] args) {
	try
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Creating a connection
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="7534050774";
		Connection con=DriverManager.getConnection(url, username, password);
		
		String q="insert into images(pic) values(?)";
		java.sql.PreparedStatement pstmt=con.prepareStatement(q);

	
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Downloads\\download.jpg");
		
		pstmt.setBinaryStream(1, fis,fis.available());
		
		pstmt.executeUpdate();
		System.out.println("Picture inserted successfully");
		
	}catch(Exception e)
	{
		System.out.println("Some error occured");
	}
}
}
