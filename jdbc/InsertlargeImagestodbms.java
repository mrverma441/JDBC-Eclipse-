package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class InsertlargeImagestodbms {

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
			
			JFileChooser jfc=new JFileChooser();
			jfc.showOpenDialog(null);
			jfc.getSelectedFile();
			File file =jfc.getSelectedFile();
			FileInputStream fis=new FileInputStream(file);
			pstmt.setBinaryStream(1, fis,fis.available());
			pstmt.executeUpdate();
			
			System.out.println("Inserted successfully");
			JOptionPane.showMessageDialog(null, "Success");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
