package kr.or.dgit.bigdata.post_program.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.bigdata.post_program.dto.Post;
import kr.or.dgit.bigdata.post_program.mappers.PostMapper;
import kr.or.dgit.bigdata.post_program.util.MyBatisSqlSessionFactory;

public class PostService{
	private static final Logger logger = Logger.getLogger(PostService.class);
	
	private static final PostService instance = new PostService();
	
	public static PostService getInstance(){
		return instance;
	}
	
	private PostService(){}
	
	public List<Post> selectSido(){
		if (logger.isDebugEnabled()) {
			logger.debug("selectSido() - start");
		}
		
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		
		try {
			PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
			return postMapper.selectSido();
		} finally {
			sqlSession.close();
		}
	}
	
	public List<Post> searchDoro(Post post){
		if (logger.isDebugEnabled()) {
			logger.debug("searchDoro(Post) - start");
		}
		
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		
		try {
			PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
			return postMapper.searchDoro(post);
		} finally {
			sqlSession.close();
		}
	}
}
