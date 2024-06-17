package com.ham1142.exer_ck;

public class WriteDto {

	private String wrName;
	private String wrTitle;
	private String wrDetail;
	
	public WriteDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WriteDto(String wrName, String wrTitle, String wrDetail) {
		super();
		this.wrName = wrName;
		this.wrTitle = wrTitle;
		this.wrDetail = wrDetail;
	}

	public String getWrName() {
		return wrName;
	}

	public void setWrName(String wrName) {
		this.wrName = wrName;
	}

	public String getWrTitle() {
		return wrTitle;
	}

	public void setWrTitle(String wrTitle) {
		this.wrTitle = wrTitle;
	}

	public String getWrDetail() {
		return wrDetail;
	}

	public void setWrDetail(String wrDetail) {
		this.wrDetail = wrDetail;
	}

	
}
