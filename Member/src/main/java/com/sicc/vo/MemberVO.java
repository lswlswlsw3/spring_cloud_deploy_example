package com.sicc.vo;

/**
 * MemberVO
 * @author Woongs
 */
public class MemberVO {
	private String sabun;		// ���
	private String name;		// �̸�
	private String division;	// �μ�
	
	// setter & getter
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
	
	// toString()
	@Override
	public String toString() {
		return "MemberVO [sabun=" + sabun + ", name=" + name + ", division=" + division + "]";
	}
}
