package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1�����ز���ע������
		Class.forName("com.mysql.jdbc.Driver");
		//2:�������ݿ�����
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies?useSSL=true&charsetEncoding=utf8","root","root");
		if(conn!=null){
			System.out.println("���ӳɹ�");
		}
		//3.����Statement����
		Statement stmt=conn.createStatement();
		//ִ��sql����
//		int rs=stmt.executeUpdate("insert into t_movie(mname,price,showtime)value('������','80.00','2019-07-23 08:08:08')");
//		System.out.println(rs);
		//�����ؽ��
		ResultSet result= stmt.executeQuery("select * from t_movie");
		while (result.next()) {
			System.out.println(result.getString("mname"));
		}
		
			//�鿴��������1
		 	/*result.last();  
	        System.out.println("����:"+result.getRow());  
	        //���������Ҫ����  
	        result.first();//��ָ���ƶ�����һ��  
*/		
			//�鿴��������2
		/*int count =1;
		while (result.next()) {
			System.out.println(result.getString("mname"));
			count++;
		}
		System.out.println(count);*/
		
		
		//�ر����ݿ���Դ
		result.close();
		stmt.close();
		conn.close();
		
	}

}
