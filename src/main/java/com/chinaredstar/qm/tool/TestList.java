package com.chinaredstar.qm.tool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestList {

	public static void main(String[] args) {
		List<Map<String,Object>>  detailList=new ArrayList<>();
		Map<String,Object> map1=new HashMap<>();
		map1.put("comName", "mmc-web");
		map1.put("apiDesc", "订单查询");
		map1.put("caseName", "成功查询");
		Map<String,Object> map2=new HashMap<>();
		map2.put("comName", "mmc-web");
		map2.put("apiDesc", "订单查询");
		map2.put("caseName", "未登录");
		Map<String,Object> map3=new HashMap<>();
		map3.put("comName", "mmc-web");
		map3.put("apiDesc", "添加购物车");
		map3.put("caseName", "成功查询");
		
		Map<String,Object> map4=new HashMap<>();
		map4.put("comName", "mmc-web-b");
		map4.put("apiDesc", "下订单");
		map4.put("caseName", "成功下单");
		
		Map<String,Object> map5=new HashMap<>();
		map5.put("comName", "mmc-web-b");
		map5.put("apiDesc", "删除订单");
		map5.put("caseName", "成功删除");		
		detailList.add(map1);
		detailList.add(map2);
		detailList.add(map3);
		detailList.add(map4);
		detailList.add(map5);
		
		List<Map<String,Object>> newMap=new ArrayList<>();
		
		
		
		for(int i=0;i<detailList.size();i++) {
			
			
		}
		

	}

}
