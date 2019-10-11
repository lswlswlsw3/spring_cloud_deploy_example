package com.sicc.vo;

/**
 * WorkVO
 * @author Woongs
 */
public class WorkVO {
	private String sn;			// 업무sn
	private String title;		// 업무명
	private String contents;	// 업무내용
	
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "WorkVO [sn=" + sn + ", title=" + title + ", contents=" + contents + "]";
	}
}
