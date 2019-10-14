package com.example.demo.vo;

import org.springframework.stereotype.Component;

/**
 * member VO
 * @author Woongs
 */
@Component
public class MemberVO {
	private String sabun;
	private String name;
	private String division;
	
	public String getSabun() {
		return sabun;
	}
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	
	@Override
	public String toString() {
		return "MemberVO [sabun=" + sabun + ", name=" + name + ", division=" + division + "]";
	}	
}
