package com.kh.practice.map.view;

import java.util.Scanner;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();

	public void mainMenu() {
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 같은 이름 회원 찾기");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호  >>");
		int input = sc.nextInt();
		if (input == 1) {
			joinMembership();
		} else if (input == 2) {
			login();
		} else if (input == 3) {
			sameName();
		} else if (input == 9) {
			System.out.println("프로그램 종료");
		} else {
			System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
		}
	}

	public void joinMembership() {
		sc.nextLine();
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		mc.joinMembership(id, new Member(password, name));
	}

	public void login() {

	}

	public void sameName() {

	}

}
