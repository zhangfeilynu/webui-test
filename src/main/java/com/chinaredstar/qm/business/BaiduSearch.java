package com.chinaredstar.qm.business;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import com.chinaredstar.qm.action.BaiduSearchPageAction;
import com.chinaredstar.qm.page.BaiduSearchPageElements;

public class BaiduSearch {
	
	
	//声明元素类与操作类
	BaiduSearchPageElements elements=new BaiduSearchPageElements();
	BaiduSearchPageAction action =new BaiduSearchPageAction();
	//定义浏览器
	WebDriver driver;
	
	public BaiduSearch() {
		System.setProperty("webdriver.chrome.driver", "D:\\work\\selenium\\tools\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	//定义百度首页搜索操作类
	public void search(String inputKey) {
		//打开首页
		driver.get("https://www.baidu.com/");		
		driver.manage().window().maximize();
		//输入关键词
		action.input(elements.inputFrame(driver), inputKey);
		//点击搜索按钮
		action.click(elements.searchButton(driver));
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.id("kw")).sendKeys("kkkkk");;
	}
	
	@AfterTest
	public void tearDown() {
		if(driver!=null){
			driver.quit();
		}
		
	}

}
