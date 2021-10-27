package com.yonyou.pageObject;

public class loginPageVo {
	public String usernameElement;
	public String passwordElement;
	public String loginButton;
	public String yanzhengmaElement;
	public String assertElement;
	
	
	public loginPageVo(String usernameElement, String passwordElement, String loginButton, String yanzhengmaElement) {
		super();
		this.usernameElement = usernameElement;
		this.passwordElement = passwordElement;
		this.loginButton = loginButton;
		this.yanzhengmaElement = yanzhengmaElement;
	}
	public String getUsernameElement() {
		return usernameElement;
	}
	public void setUsernameElement(String usernameElement) {
		this.usernameElement = usernameElement;
	}
	public String getPasswordElement() {
		return passwordElement;
	}
	public void setPasswordElement(String passwordElement) {
		this.passwordElement = passwordElement;
	}
	public String getLoginButton() {
		return loginButton;
	}
	public void setLoginButton(String loginButton) {
		this.loginButton = loginButton;
	}
	public String getYanzhengmaElement() {
		return yanzhengmaElement;
	}
	public void setYanzhengmaElement(String yanzhengmaElement) {
		this.yanzhengmaElement = yanzhengmaElement;
	}
	public String getAssertElement() {
		return assertElement;
	}
	public void setAssertElement(String assertElement) {
		this.assertElement = assertElement;
	}
	public loginPageVo(String usernameElement, String passwordElement, String loginButton, String yanzhengmaElement,
			String assertElement) {
		super();
		this.usernameElement = usernameElement;
		this.passwordElement = passwordElement;
		this.loginButton = loginButton;
		this.yanzhengmaElement = yanzhengmaElement;
		this.assertElement = assertElement;
	}
	
	

}
