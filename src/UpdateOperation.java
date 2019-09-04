import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateOperation {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String db_url = "jdbc:mysql://localhost:3306/java";
			String db_uname = "root";
			String db_upass = "root";
			Connection con = DriverManager.getConnection(db_url, db_uname, db_upass);
			PreparedStatement st = con.prepareStatement("update employee set ename=?,salary=? where empno=?");
			st.setString(1,"mini");
			st.setInt(2, 56320);
			st.setInt(3, 102);
			st.executeUpdate();
			System.out.println("Data Updated..!");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();

		

	}

	}
}
