package com.demo.streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class StreamApiDemo {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("maria");
		list.add("jhon");
		list.add("johshon");
		list.add("mickle");
		
//		for(String name : list) {
//			System.out.println(name);
//		}
		
//		for(String s :list) {
//			if(s.startsWith("m")) {
//				System.out.println(s);
//			}
//		}
		
		list.stream().filter(t->t.startsWith("m")).forEach(t->System.out.println(t));
//		list.stream().forEach(t ->System.out.println(t));
		
		Map<Integer,String> mapList=new HashMap<>();
		mapList.put(1,"maria");
		mapList.put(2,"jhon");
		mapList.put(3,"johshon");
		mapList.put(4,"devil");

		
		//mapList.forEach((key, value) ->System.out.println(key+":"+value));
		
		//mapList.entrySet().stream().forEach(obj -> System.out.println(obj));
		
		mapList.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
//		Consumer<String> consumer = (t)-> System.out.println(t);
//		for(String s1:list) {
//			consumer.accept(s1);
//		}
		
		
	}

}
