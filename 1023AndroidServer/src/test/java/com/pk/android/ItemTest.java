package com.pk.android;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pk.android.dao.ItemDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class ItemTest {
	@Autowired
	private SqlSession sqlSession;
	private ItemDAO itemDao;
	@Test
	public void connectTest() {
		//System.out.println(sqlSession);
		//System.out.println(sqlSession.selectList("item.listItem"));
		//System.out.println(sqlSession.selectList("item.getItem", 1));
		//System.out.println(sqlSession.selectOne("item.getItem", 0)+"");
		
		//System.out.println(itemDao);
		//System.out.println(itemDao.listItem());
		System.out.println(itemDao.getItem(1));
	}
}
