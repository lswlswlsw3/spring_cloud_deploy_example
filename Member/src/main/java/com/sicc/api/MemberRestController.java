package com.sicc.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sicc.vo.MemberVO;
import com.sicc.vo.WorkVO;

/**
 * member RestController
 * @author Woongs
 */
@RestController
@RequestMapping("/member")
public class MemberRestController {
	
	private final String URL = "http://localhost:8082/work";
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/{sabun}/{name}/{division}")
	public String getInfoWithWork(@PathVariable String sabun, @PathVariable String name, @PathVariable String division) {
		MemberVO memberVO = new MemberVO();
		memberVO.setSabun(sabun);
		memberVO.setName(name);
		memberVO.setDivision(division);
		
		WorkVO workVO = new WorkVO();
		
    	ResponseEntity<WorkVO> restExchange =
    			restTemplate.exchange(
                        URL+"/info",
                        HttpMethod.POST,
                        null,
                        WorkVO.class);
    	
    	workVO = restExchange.getBody();
    	
		return memberVO.toString()+" / "+workVO.toString();
	}
}