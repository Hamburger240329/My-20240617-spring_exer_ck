package com.ham1142.exer_ck;

public class WriteDto {

	private String wrName;	//wrName 이외에 WrName 로 지정하여도 하단 초기화 자에서 대문자 > 소문자 로 변경될 경우 DL 기입법에서 소문자로 기입해야 한다
	private String wrTitle;
	private String wrDetail;
	
	public WriteDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WriteDto(String wrName, String wrTitle, String wrDetail) {
		super();
		this.wrName = wrName;	// 여기 있는 this.wrName 가 아닌 wrName 부분이 DL 표기법에서 적용되는 부분!! 중요함
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
