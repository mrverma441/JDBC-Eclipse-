package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DisplayImages extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					DisplayImages frame = new DisplayImages();
//					frame.setVisible(true);
//					
			        JFrame f= new JFrame();  
			        JTextField tf1 = new JTextField();  
			        tf1.setBounds(50,50,150,20); 
			        JLabel l1;  
			        l1=new JLabel();  
			        l1.setBounds(50,50, 100,30);  

			        JButton b1 = new JButton("DisplayImage");  
			        b1.setBounds(50,100,130,50);  
			        f.add(b1);
			        f.add(tf1);
			        f.add(l1);
			        f.setSize(300,300);  
			        f.setLayout(null);  
			        f.setVisible(true);  


				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DisplayImages() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
