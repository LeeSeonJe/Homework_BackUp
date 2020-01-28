package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	Map<String, Member> map = new HashMap<String, Member>();

	public boolean joinMembership(String id, Member m) {
		System.out.println(map.put(id, m));
		return false;
	}

	public String login(String id, String password) {

		return null;
	}

	public String changhPassword(String id, String oldPw, String newPw) {

		return null;
	}

	public void changeName(String id, String newName) {

	}

	public TreeMap<String, Member> sameName(String name) {

		return null;
	}
}
