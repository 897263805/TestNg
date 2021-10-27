package com.yonyou.pageObject;

public class imsVo {
	public String url;
	public String username;
	public String password;
	public String assertKey;
	
	
	public imsVo(String url, String username, String password, String assertKey) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
		this.assertKey = assertKey;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAssertKey() {
		return assertKey;
	}
	public void setAssertKey(String assertKey) {
		this.assertKey = assertKey;
	}
	

}
