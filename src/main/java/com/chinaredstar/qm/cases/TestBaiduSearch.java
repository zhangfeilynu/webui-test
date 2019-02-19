package com.chinaredstar.qm.cases;


import org.testng.annotations.Test;

import com.chinaredstar.qm.business.BaiduSearch;

public class TestBaiduSearch  extends BaiduSearch{
	//BaiduSearch search=new BaiduSearch();
	
	
	@Test
	public void testSearch() throws InterruptedException {
		search("张飞");
		Thread.sleep(5000);
	}
	
	
}
