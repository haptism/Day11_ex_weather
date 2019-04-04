package com.rjm.member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberView {
	
	public void view(HashMap<String, Member> map) {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			Member member = map.get(key);
			this.view(member);
		}
		
	}
	
	public void view(Member member) {
		System.out.println("Name : "+member.getName());
		System.out.println("Id : "+member.getId());
		System.out.println("Pw : "+member.getPw());
		System.out.println("Age : "+member.getAge());
		System.out.println("Level : "+member.getLevel());
		
	}
	
	public void view(String str) {
		System.out.println(str);
	}

}