package com.pk.android.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pk.android.domain.Member;

@Repository
public class MemberDAO {
@Autowired
private SqlSession sqlSession;

//로그인 처리 메소드 resultType을 그대로 가져와서, 파라미터도 그대로
public Member login(Member member) {
	return sqlSession.selectOne("member.login", member);
}
}
