package com.oracle.web.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.github.pagehelper.PageHelper;
import com.oracle.web.bean.Monster;
import com.oracle.web.bean.MonsterExample;
import com.oracle.web.bean.MonsterExample.Criteria;
import com.oracle.web.mapper.MonsterMapper;


public class testMybatis {

	private SqlSession session;
	
	private MonsterMapper mapper;
	
	
	@Before
	public void init() throws IOException {

		InputStream inputStream = Resources.getResourceAsStream("Mybatis-config.xml");

		// 2.鍒涘缓浼氳瘽宸ュ巶

		SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);

		// 3.寮�鍚痵qlsession
		session = sqlSessionFactory.openSession();
		
		//4.鑾峰彇鎺ュ彛
		mapper = session.getMapper(MonsterMapper.class);
		
		
	}
	@Test
         
	public void teastMApper(){
        	//封装条件  
		MonsterExample example=new MonsterExample();
			//设置条件
		
		example.setOrderByClause("monsterid desc");
		//去除重复
		example.setDistinct(true);
		
		//复杂条件
		
		Criteria criteria = example.createCriteria();
	
		
		//criteria.andMonsteridIn(Arrays.asList(1,2,8,9,10,18,19));
		
		
		//criteria.andMosternameLike("%王%");
		//分页
		PageHelper.startPage(1, 3);
		List<Monster> list = mapper.selectByExample(example);
		
		for (Monster monster : list) {
			
			System.out.println(monster);
		}
        	  
          }
	@After
	public void destory() {

		// 6.鍏抽棴浜嬪姟
		session.commit();

		session.close();

	}

}
