package com.lzjt.util;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {

	// 获取数据库连接
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		// 加载驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("加载数据库驱动程序成功");
		// 数据库的url
		String url = "jdbc:mysql://localhost:3306/javaee?useSSL=true&serverTimezone=GMT";
		// 数据库用户名
		String user = "root";
		// 数据库密码
		String password = "123456";
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}

	// 关闭连接，释放相关资源
	public static void release(java.sql.PreparedStatement pstmt, Connection conn) {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pstmt = null;
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = null;
		}
	}

	// 关闭连接，释放相关资源
	public static void release(java.sql.ResultSet rs, java.sql.PreparedStatement pstmt, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rs = null;
		}

		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pstmt = null;
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = null;
		}
	}

}
