package org.tae.service;

import java.util.ArrayList;

import org.tae.domain.ReplyDTO;

public interface ReplyService {
	// 댓글 쓰기 설계
	public int write(ReplyDTO rdto);
	// 댓글 목록리스트 설계
	public ArrayList<ReplyDTO> list(int bno);
	// 댓글수정을 하기 위해 댓글내용 가져오기
	public ReplyDTO detail(int rno);
}
