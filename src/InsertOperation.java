import java.sql.*;
import java.util.Scanner;

public class InsertOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee No");
		String s1=sc.next();
		System.out.println("Enter the Emloyee name");
		String s2=sc.next();
		System.out.println("Enter the Emloyee salary");
		String s3=sc.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String db_url = "jdbc:mysql://localhost:3306/java";
			String db_uname = "root";
			String db_upass = "root";
			Connection con = DriverManager.getConnection(db_url, db_uname, db_upass);
			PreparedStatement st = con
					.prepareStatement("insert into employee(empno,ename,salary)values('"+s1+"','"+s2+"','"+s3+"')");
			// Statement st=con.createStatement();
			st.executeUpdate();
			System.out.println("Data Added into Table");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
