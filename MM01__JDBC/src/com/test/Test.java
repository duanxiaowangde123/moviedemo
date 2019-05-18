package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1：加载并且注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2:创建数据库连接
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies?useSSL=true&charsetEncoding=utf8","root","root");
		if(conn!=null){
			System.out.println("连接成功");
		}
		//3.创建Statement对象
		Statement stmt=conn.createStatement();
		//执行sql操作
//		int rs=stmt.executeUpdate("insert into t_movie(mname,price,showtime)value('外星人','80.00','2019-07-23 08:08:08')");
//		System.out.println(rs);
		//处理返回结果
		ResultSet result= stmt.executeQuery("select * from t_movie");
		while (result.next()) {
			System.out.println(result.getString("mname"));
		}
		
			//查看操作行数1
		 	/*result.last();  
	        System.out.println("行数:"+result.getRow());  
	        //如果后面需要遍历  
	        result.first();//将指针移动到第一行  
*/		
			//查看操作行数2
		/*int count =1;
		while (result.next()) {
			System.out.println(result.getString("mname"));
			count++;
		}
		System.out.println(count);*/
		
		
		//关闭数据库资源
		result.close();
		stmt.close();
		conn.close();
		
	}

}
