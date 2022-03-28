package org.tae.controller;

import java.util.ArrayList;

import org.tae.domain.ReplyDTO;
import org.tae.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("replies")
public class ReplyController {
	@Autowired
	private ReplyService rservice;
	// 댓글쓰기를 하기 위한 ReqeustMapping
	// Mapping을 할때 우리가 원하는 데이터 타입을 강제함으로써 오류상황을 줄일 수 있다.
	// consumes : 들어오는 데이터 타입 정의(생략가능)
	// produces : 반환하는 데이터 타입 정의(생략가능)
	// * 생략을 하게 되면, 웹브라우저가 알아서 타입을 판단 *
	@PostMapping(value="new",consumes="application/json",produces={MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> create(@RequestBody ReplyDTO rdto){
		System.out.println("ReplyDTO="+rdto);
		// insert 성공시 ReplyServiceImpl.java로 부터 1
		// insert 실패시 ReplyServiceImpl.java로 부터 0
		// 값을 리턴받는다.
		int result=rservice.write(rdto);
		System.out.println("result="+result);
		return result==1?new ResponseEntity<>("success",HttpStatus.OK)				// insert가 정상적으로 처리되었을 때
					    :new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);	// insert가 비정상적으로 처리되었을 때
	}
	@GetMapping(value="list/{bno}",produces= {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<ArrayList<ReplyDTO>> getList(@PathVariable int bno){// @PathVariable : REST방식에서 주로 사용.URL경로의 일부를 파라미터 사용하고자할 때
		System.out.println(bno);
		return new ResponseEntity<>(rservice.list(bno),HttpStatus.OK);
	}
	// 댓글수정을 하기 위해 댓글내용 가져오기
	@GetMapping(value="{rno}",produces= {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<ReplyDTO> getDetail(@PathVariable int rno){// @PathVariable : REST방식에서 주로 사용.URL경로의 일부를 파라미터 사용하고자할 때
		System.out.println(rno);
		return new ResponseEntity<>(rservice.detail(rno),HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
