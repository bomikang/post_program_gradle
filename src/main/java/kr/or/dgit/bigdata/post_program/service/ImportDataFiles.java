package kr.or.dgit.bigdata.post_program.service;

import java.sql.Connection;
import java.sql.SQLException;

public class ImportDataFiles {
	private static ImportDataFiles instance = new ImportDataFiles();
	
	public static ImportDataFiles getInstance(){
		return instance;
	}
	
	private ImportDataFiles(){}
	
	public void getDataFiles(){
		String sql = "";
	}
}
