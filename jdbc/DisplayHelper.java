package jdbc;

import java.awt.Image;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import com.mysql.cj.jdbc.Blob;

public class DisplayHelper {
public static ImageIcon getImageIconById(int id,Connection con)
{
	ImageIcon icon=null;
	
	
	
	
	try
	{
		String q="select pic from images where id=?";
		java.sql.PreparedStatement pstmt=con.prepareStatement(q);
		
		pstmt.setInt(1, id);
		ResultSet set=pstmt.executeQuery();
		if(set.next())
		{
			java.sql.Blob b=set.getBlob("pic");
			InputStream is=b.getBinaryStream();
			Image image=ImageIO.read(is);
			icon=new ImageIcon(image);
		}

	
	
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return icon;
}
}
