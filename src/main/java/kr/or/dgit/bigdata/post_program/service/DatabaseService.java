package kr.or.dgit.bigdata.post_program.service;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.bigdata.post_program.dto.Post;
import kr.or.dgit.bigdata.post_program.mappers.PostMapper;
import kr.or.dgit.bigdata.post_program.setting.Config;
import kr.or.dgit.bigdata.post_program.util.MyBatisSqlSessionFactory;

public class DatabaseService {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(DatabaseService.class);

	private static DatabaseService instance = new DatabaseService();

	private DatabaseService() {}

	public static DatabaseService getInstance() {
		return instance;
	}
	
	public int createDatabase(){
		String sql = "CREATE DATABASE " + Config.DB_NAME;
		
		if (logger.isDebugEnabled()) {
			logger.debug("createDataBase() - start");
		}
		
		//SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		int res;
		PreparedStatement pstmt = null;
		
		Connection con;
		try {
			con = DriverManager.getConnection(Config.URL);
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			res = 1;
		} catch (SQLException e) {
			res = 0;
		}
		
		return res;
	}
	
	/*
	private void dropDatabase() {
		try {
			Connection con = DBCon.getConnection();
			pstmt = con.prepareStatement("DROP DATABASE IF EXISTS " + Config.DB_NAME);
			pstmt.execute();
			System.out.printf("DROP DATABASE(%s) Success! %n", Config.DB_NAME);
		} catch (SQLException e) {
			System.out.printf("DROP DATABASE(%s) Fail! %n", Config.DB_NAME);
		} finally {
			JdbcUtil.close(pstmt);
		}
		
	}

	public void selectUseDatabase() {
		try {
			Connection con = DBCon.getConnection();
			pstmt = con.prepareStatement("USE " + Config.DB_NAME);
			pstmt.execute();
			System.out.printf("USE DATABASE(%s) Selected Success! %n", Config.DB_NAME);
		} catch (SQLException e) {
			System.out.printf("USE DATABASE(%s) Selected Fail! %n", Config.DB_NAME);
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}		
	}
*/
}
