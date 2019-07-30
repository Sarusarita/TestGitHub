package testgithub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCtesting {

	public static void main(String[] args) {
		Connection con;
		
			 try {
				con= DriverManager.getConnection("jdbc:db2://bldbz172063.cloud.dst.ibm.com:60019/RAFTPRD:sslConnection=true;sslTrustStoreLocation=C:\\DB SSL\\ibm-ssl-truststore.jks;sslTrustStorePassword=Test1234;","sarikum1","Saritakumari@12345");
				 Statement statement=con.createStatement();
				 String query="Select Begru from RDC.KNA1";
				 ResultSet result=statement.executeQuery(query);
				 while(result.next())
				 {
					String s1=result.getString("Begru"); 
					System.out.println(s1);
				 }
				 con.close();
				 System.out.println("query executed successfully");
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		

	}

}
