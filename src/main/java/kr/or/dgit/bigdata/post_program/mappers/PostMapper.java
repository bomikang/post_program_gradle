package kr.or.dgit.bigdata.post_program.mappers;

import java.util.List;

import kr.or.dgit.bigdata.post_program.dto.Post;

public interface PostMapper {
	List<Post> selectSido();
	List<Post> searchDoro(Post post);
}
