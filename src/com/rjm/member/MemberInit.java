package com.rjm.member;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberInit {

	private String members;
	private Scanner sc;

	public MemberInit() {
		StringBuffer sb = new StringBuffer();
		sb.append("iu, iu, iu, 26, 1,");
		sb.append("choa, choa, choa, 30, 2,");
		sb.append("suji, suji, suji, 23, 2,");
		sb.append("hani, hani, hani, 15, 0");
		members = sb.toString();
		sc = new Scanner(System.in);

	}

	// delete
	public String memberDelete(HashMap<String, Member> map) {
		System.out.println("삭제할 ID 입력");
		String result = "삭제 실패";
		String id = sc.next();
		Member member = map.get(id);
		if (member != null) {
			map.remove(id);
			result = "삭제 성공";
		}

		return result;
	}

	// login
	public Member memberLogin(HashMap<String, Member> map) {
		Member member = null;
		System.out.println("Id입력");
		String id = sc.next();
		System.out.println("PW입력");
		String pw = sc.next();

		member = map.get(id);
		if (member != null) {
			if (!member.getPw().equals(pw)) {
				member = null;
			}
		}

		return member;
	}

	// join
	public Member memberJoin() {
		Member member = new Member();
		System.out.println("이름을 입력");
		member.setName(sc.next());
		System.out.println("Id를 입력");
		member.setId(sc.next());
		System.out.println("PW를 입력");
		member.setPw(sc.next());
		System.out.println("Age 를 입력");
		member.setAge(sc.nextInt());
		System.out.println("Level 를 입력");
		member.setLevel(sc.nextInt());
		return member;
	}

	// 메서드명 setMember 리턴은 멤버들 MAP
	// 키는 id, 밸류는 member
	public HashMap<String, Member> setMember() {
		HashMap<String, Member> map = new HashMap<String, Member>();
		StringTokenizer st = new StringTokenizer(members, ",");
		while (st.hasMoreTokens()) {
			Member member = new Member();
			member.setName(st.nextToken().trim());
			member.setId(st.nextToken().trim());
			member.setPw(st.nextToken().trim());
			member.setAge(Integer.parseInt(st.nextToken().trim()));
			member.setLevel(Integer.parseInt(st.nextToken().trim()));
			map.put(member.getId(), member);
		}

		return map;
	}

}