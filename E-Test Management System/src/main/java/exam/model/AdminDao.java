package exam.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import exam.database.Admin;
import exam.database.Instructions;
import exam.database.Provider;

public class AdminDao {

	public static boolean doValidate(Admin admin) {
		boolean status = false;
		try
		{
		
		Connection con = Provider.getOracleConnection();
		String sql = "select * from admintable where userid=? and password=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, admin.getUsername());
		pst.setString(2, admin.getPassword());
		ResultSet rs = pst.executeQuery();
		if(rs.next())
		{
			status = true;
		}
		else
		{
			status = false;
		}
		 //System.out.println("Validation Status: " + status);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
}
