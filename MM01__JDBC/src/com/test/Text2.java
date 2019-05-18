package com.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.basedao.BaseDAO;
import com.entity.Movie;

public class Text2 extends  BaseDAO{

	public static void main(String[] args) throws SQLException {
		// TODO 自动生成的方法存根
		BaseDAO basedao=new BaseDAO();
		//1.Movie movie =new Movie();
		List<Movie> movielist =new ArrayList<Movie>();
		Connection conn = basedao.getConnection();
		Statement stmt=conn.createStatement();
		ResultSet rs =stmt.executeQuery("select * from t_movie");
		while (rs.next()) {
			//System.out.println(rs.getString("mname"));
			Movie movie =new Movie();
			movie.setMid(rs.getInt("mid"));
			movie.setMname(rs.getString("mname"));
			movie.setPrice(rs.getString("price"));
			movie.setShowtime(rs.getString("showtime"));
			movie.setAddtime(rs.getString("addtime"));
			//1.System.out.println(movie.toString());
			movielist.add(movie);
		}
		for(Movie i:movielist) {
			System.out.println(i.toString());
		}
		basedao.closeAll(conn, stmt,rs);
		
	}

}
