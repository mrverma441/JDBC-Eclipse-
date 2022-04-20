package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class Update_JDBC {
public static void main(String[] args) {
	try
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Creating a connection
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="7534050774";
		Connection con=DriverManager.getConnection(url, username, password);

		
		String query="update table1 set tName=?,tCity=? where tId=?";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a new name:");
		String name=br.readLine();
		System.out.println("Enter a new city:");
		String city=br.readLine();
		
		System.out.println("Enter a studentId");
		
		int id=Integer.parseInt(br.readLine());
		
		
		java.sql.PreparedStatement pstmt=con.prepareStatement(query);
		
		pstmt.setString(1,name);
		pstmt.setString(2, city);
		pstmt.setInt(3, id);
		pstmt.executeUpdate();
		
		
		
		System.out.println("Successfully updated");
		con.close();
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
