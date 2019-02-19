package com.chinaredstar.qm.action;

import org.openqa.selenium.WebElement;

public class BaiduSearchPageAction {
	
	//定义输入操作
	public void input(WebElement element,String inputKey) {
		element.sendKeys(inputKey);
	}
	//定义点击按钮操作
	public void click(WebElement element) {
		element.click();
	}

}
