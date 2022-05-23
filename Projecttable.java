import java.sql.*;
import javax.swing.*;


public class Projecttable
{
	public static void main(String args[])
	{
		
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.1.21/ty49","ty49","");
			System.out.println("Conection Established");

			
			JFrame f=new JFrame("Project Details");

			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from PROJECT");

			ResultSetMetaData rsmd = rs.getMetaData();
			int cols=rsmd.getColumnCount();
			
			int rows =0;

			while(rs.next())
			{
				rows++;
			}

		rows++;
		System.out.println("Rows"+rows+ "cols"+cols);
		rs.close();

			rs = s.executeQuery("Select * from PROJECT");

		JTable t= new JTable(rows,cols);


		int row =1;
		
		for(int i=1;i<=cols;i++)
		{
			t.setValueAt(rsmd.getColumnName(i),0,i-1);
		}

		while (rs.next())
		{
			t.setValueAt(new Integer(rs.getInt(1)),row,0);
			t.setValueAt(rs.getString(2),row,1);
			t.setValueAt(rs.getString(3),row,2);
			t.setValueAt(rs.getString(4),row,3);
			row++;
		}
		f.add(t);
		f.setVisible(true);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		catch(Exception e)
		{
		}
		
	}
}

	
