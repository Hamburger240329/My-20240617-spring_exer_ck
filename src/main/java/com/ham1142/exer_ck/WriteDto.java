package com.ham1142.exer_ck;

public class WriteDto {

	private String WrName;
	private String WrTitle;
	private String WrDetail;
	
	public WriteDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WriteDto(String wrName, String wrTitle, String wrDetail) {
		super();
		WrName = wrName;
		WrTitle = wrTitle;
		WrDetail = wrDetail;
	}

	public String getWrName() {
		return WrName;
	}

	public void setWrName(String wrName) {
		WrName = wrName;
	}

	public String getWrTitle() {
		return WrTitle;
	}

	public void setWrTitle(String wrTitle) {
		WrTitle = wrTitle;
	}

	public String getWrDetail() {
		return WrDetail;
	}

	public void setWrDetail(String wrDetail) {
		WrDetail = wrDetail;
	}

	
	
}
