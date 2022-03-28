package org.tae.mapper;

import java.util.ArrayList;

import org.tae.domain.ReplyDTO;

public interface ReplyMapper {
	// 댓글 쓰기 설계
	// insert 성공시 ReplyMapper.xml로 부터 1
	// insert 실패시 ReplyMapper.xml로 부터 0
	// 값을 리턴받는다.
	public int write(ReplyDTO rdto);
	public ArrayList<ReplyDTO> list(int bno);
	public ReplyDTO detail(int rno);

}
