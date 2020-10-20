package com.kh.mybatis.board.model.service;

import static com.kh.mybatis.common.Template.getSqlSession;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.board.model.dao.BoardDao;
import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.common.vo.PageInfo;

public class BoardServiceImpl implements BoardService{

	private BoardDao bDao = new BoardDao();

	@Override
	public int selectListCount() {
		
		SqlSession sqlSession = getSqlSession();
		
		int listCount = bDao.selectListCount(sqlSession);
		
		sqlSession.close();
		
		return listCount;
	}

	@Override
	public ArrayList<Board> selectList(PageInfo pi) {
		
		SqlSession sqlSession = getSqlSession();
		
		ArrayList<Board> list = bDao.selectList(sqlSession, pi);
		
		sqlSession.close();
		
		return list;
	}
}
