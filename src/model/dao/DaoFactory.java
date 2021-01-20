package model.dao;

import java.sql.Connection;

public class DaoFactory {
	
	public static ISellerDao createSellerDao(Connection conn) {
		return new SellerDaoJDBC(conn);
	}
	
	public static IDepartmentDao createDepartmentDao(Connection conn) {
		return new DepartmentDaoJDBC(conn);
	}
	
}
