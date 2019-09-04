import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.*;

public class DeleteOperation {
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Employee No to delete");
	String s1=sc.next();

	try {
		Class.forName("com.mysql.jdbc.Driver");
		String db_url = "jdbc:mysql://localhost:3306/java";
		String db_uname = "root";
		String db_upass = "root";
		Connection con = DriverManager.getConnection(db_url, db_uname, db_upass);
		PreparedStatement st = con.prepareStatement("delete from employee where Empno="+s1);
		// Statement st=con.createStatement();
		st.executeUpdate();
		System.out.println("Data DELETED..!");
		con.close();

	} catch (Exception e) {
		e.printStackTrace();

	}
	}

}
