package com.yonyou.testCase;
import static com.yonyou.businessLogic.loginScuess.login;

import org.testng.annotations.Test;

import com.yonyou.pageObject.imsVo;
import com.yonyou.pageObject.init;
import com.yonyou.pageObject.loginPageVo;

public class testCase1 {
	/**
	 * 抽象出登陆页面对象和登录数据对象
	 * 使登录测试用例的数据与代码的分离
	 * 
	 * **/
	@Test(description = "登录成功")
    public void testCase_001 () throws InterruptedException {
		//构建登录页面数据
		imsVo ims = new imsVo("http://localhost:9002/login","zhangsan","zhangsan123456","zhangsan");		
		//构建登录页面DOM
		loginPageVo loginPage = new  loginPageVo("input[type='text']","input[type='password']","el-button","","#nav > div:nth-child(2) > span");
		//执行登录方法
		login(loginPage,ims);

    }

}
