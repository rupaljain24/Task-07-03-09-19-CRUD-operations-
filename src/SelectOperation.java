import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class SelectOperation {
	public static void main(String args[]) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String db_url = "jdbc:mysql://localhost:3306/java";
			String db_uname = "root";
			String db_upass = "root";
			Connection con = DriverManager.getConnection(db_url, db_uname, db_upass);
			String q = "Select * from employee";
			Statement st = (Statement) con.createStatement();
			ResultSet rs = (ResultSet) st.executeQuery(q);
			while (rs.next()) {

				System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getInt(3));
			}
			System.out.println("Data Displayed");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
