package com.lec.amigo.vo;
// 걍...화면단에서 나오는것만 나오도록  vo 여러개 만들어서 빼겠습니다... 23p 펫시터지원서.
import java.beans.Transient;

public class SitApplyVO {     // SitterApplyVO  s-sit사진, m-회원명, s-성별, s-birth, m-연락처, 
							//  m-주소, s-흡연, s-현재일, s-가능일, s-시간대, s-반려경험, s-타인반려, s-자기소개
							//  s 는 펫시터,  m 은 회원(멤버)

	//private int sitNo;
	//private int userNo;

		// 여기서 이름, 연락처, 주소는 유저테이블에서 알아서 들어오는값.
	
	private String sitPhoto;
	private String sitName;           // 자동 입력
	private String sitGender;
	private String sitBirth;		  
	private String sitPhone;		   // 자동 입력
	private String sitAddr;				// 자동 입력
	private boolean sitSmoking;
	private String sitJob;
	private String sitDays;
	private String sitTime;
	private boolean sitExp;
	private String sitCareExp;
	private String sitIntro;         //  이게 화면단에서 필요한거.
	//private boolean sitAuthIs;
	
	
	
	public String getSitPhoto() {
		return sitPhoto;
	}
	public void setSitPhoto(String sitPhoto) {
		this.sitPhoto = sitPhoto;
	}
	public String getSitName() {
		return sitName;
	}
	public void setSitName(String sitName) {
		this.sitName = sitName;
	}
	public String getSitGender() {
		return sitGender;
	}
	public void setSitGender(String sitGender) {
		this.sitGender = sitGender;
	}
	public String getSitBirth() {
		return sitBirth;
	}
	public void setSitBirth(String sitBirth) {
		this.sitBirth = sitBirth;
	}
	public String getSitPhone() {
		return sitPhone;
	}
	public void setSitPhone(String sitPhone) {
		this.sitPhone = sitPhone;
	}
	public String getSitAddr() {
		return sitAddr;
	}
	public void setSitAddr(String sitAddr) {
		this.sitAddr = sitAddr;
	}
	public boolean isSitSmoking() {
		return sitSmoking;
	}
	public void setSitSmoking(boolean sitSmoking) {
		this.sitSmoking = sitSmoking;
	}
	public String getSitJob() {
		return sitJob;
	}
	public void setSitJob(String sitJob) {
		this.sitJob = sitJob;
	}
	public String getSitDays() {
		return sitDays;
	}
	public void setSitDays(String sitDays) {
		this.sitDays = sitDays;
	}
	public String getSitTime() {
		return sitTime;
	}
	public void setSitTime(String sitTime) {
		this.sitTime = sitTime;
	}
	public boolean isSitExp() {
		return sitExp;
	}
	public void setSitExp(boolean sitExp) {
		this.sitExp = sitExp;
	}
	public String getSitCareExp() {
		return sitCareExp;
	}
	public void setSitCareExp(String sitCareExp) {
		this.sitCareExp = sitCareExp;
	}
	public String getSitIntro() {
		return sitIntro;
	}
	public void setSitIntro(String sitIntro) {
		this.sitIntro = sitIntro;
	}
	@Override
	public String toString() {
		return "SitterVO [sitPhoto=" + sitPhoto + ", sitName=" + sitName + ", sitGender=" + sitGender + ", sitBirth="
				+ sitBirth + ", sitPhone=" + sitPhone + ", sitAddr=" + sitAddr + ", sitSmoking=" + sitSmoking
				+ ", sitJob=" + sitJob + ", sitDays=" + sitDays + ", sitTime=" + sitTime + ", sitExp=" + sitExp
				+ ", sitCareExp=" + sitCareExp + ", sitIntro=" + sitIntro + "]";
	}
	
	
	

	
	
	
	
}
