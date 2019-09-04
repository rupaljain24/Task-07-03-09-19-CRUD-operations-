import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String db_url = "jdbc:mysql://localhost:3306/java";
			String db_uname = "root";
			String db_upass = "root";
			Connection con = DriverManager.getConnection(db_url, db_uname, db_upass);
			PreparedStatement st = con.prepareStatement("create table user(Username varchar(20),Userpass varchar(20))");
			// Statement st=con.createStatement();
			st.executeUpdate();
			System.out.println("Table created");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
