package kr.or.dgit.bigdata.post_program;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.bigdata.post_program.service.DatabaseService;

public class DataBaseServiceTest {
	private static DatabaseService databaseService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		databaseService = DatabaseService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		databaseService = null;
	}

	@Test
	public void testCreateDatabase() {
		int res = databaseService.createDatabase();
		System.out.println(res);
		
		Assert.assertEquals(res, 1);
	}

}
