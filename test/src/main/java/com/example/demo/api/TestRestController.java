package com.example.demo.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.MemberVO;

/**
 * RestController
 * @author Woongs
 */
@RestController
@RequestMapping("/test")
public class TestRestController {

	@RequestMapping("/{sabun}/{name}/{division}")
	public MemberVO getMemberInfo(@PathVariable String sabun, @PathVariable String name, @PathVariable String division) {
		MemberVO memberVO = new MemberVO();
		memberVO.setSabun(sabun);
		memberVO.setName(name);
		memberVO.setDivision(division);
				
		return memberVO;
	}
}
