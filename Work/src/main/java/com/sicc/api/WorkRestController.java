package com.sicc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sicc.vo.WorkVO;

/**
 * WorkRestController
 * @author Woongs
 */
@RestController
@RequestMapping("/work")
public class WorkRestController {

	@RequestMapping("/info")
	public WorkVO getWorkInfo() {
		
		WorkVO workVO = new WorkVO();
		workVO.setSn("1");
		workVO.setTitle("Deploy work");
		workVO.setContents("Deploy is complete.");
		
		return workVO;
	}
}
