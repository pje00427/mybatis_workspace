package com.kh.mybatis.member.model.service;

import com.kh.mybatis.member.model.vo.Member;

public interface MemberService { // 모든 필드 == 상수필드, 모든 메소드 == 추상 메소드 (미완성된 메소드)

	// MemberService 라는 인터페이스를 실체화(implements)하는 자식 클래스에서 본격적으로 완성시켜야됨 
	
	// 1. 회원가입용 서비스
	/*public abstract*/ int insertMember(Member m);
	
	// 2. 로그인용 서비스
	Member loginMember(Member m);
	
	// 3. 회원정보 수정용 서비스
	int updateMember(Member m);
	
	// 4. 회원 탈퇴용 서비스
	int deleteMember(Member m);
	
	// 5. id찾기용 서비스 
	
	// 6. pwd변경용 서비스 
	
	
}
