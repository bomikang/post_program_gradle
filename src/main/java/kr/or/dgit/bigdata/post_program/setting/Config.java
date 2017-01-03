package kr.or.dgit.bigdata.post_program.setting;

public class Config {
	public static final String DB_NAME = "post_program2";
	
	public static final String URL    = "jdbc:mysql://localhost:3306/post_program";

	public static final String TABLE_NAME = "post";
	
	public static final String IMPORT_DIR = System.getProperty("user.dir")+ "\\DataFiles\\";
	
	public static final String CREATE_TABLE =
			
			"CREATE TABLE post ( "
			+ "zipcode   CHAR(5)     NULL COMMENT '우편번호', "
			+ "sido      VARCHAR(20) NULL COMMENT '시도', "
			+ "sigungu   VARCHAR(20) NULL COMMENT '시군구', "
			+ "doro      VARCHAR(80) NULL COMMENT '도로', "
			+ "building1 INT(5)      NULL COMMENT '건물번호1', "
			+ "building2 INT(5)      NULL COMMENT '건물번호2')" ;
	
}
