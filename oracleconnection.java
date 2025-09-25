package oracle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class oracleconnection {

	public static void main(String[] args)throws Exception {
		//load the JDBC deiver
		Class.forName("oracle.jdbc.driver.oracleDriver");
		//connection obj
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","123");
		//JDBC obj for statement
		Statement st=con.createStatement();
		//write the query
		String query="select*From employee";
				//creat JDBC resultset obj
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+""+rs.getString(2));

	}
rs.close();
st.close();
con.close();
}
}