package com.kh.mybatis.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.mybatis.board.model.service.BoardService;
import com.kh.mybatis.board.model.service.BoardServiceImpl;
import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.common.Pagination;
import com.kh.mybatis.common.vo.PageInfo;

/**
 * Servlet implementation class BoardListController
 */
@WebServlet("/list.bo")
public class BoardListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//----------------------------페이징 처리---------------------------
		
		// 총게시글 갯수, 사용자가 요청한 페이지, 페이지목록 최대갯수, 게시글목록최대갯수 
		// 위의 4개의 값을 가지고 페이징바의 시작수, 끝수, 마지막페이지 
		// 인터페이스는 레퍼런스변수로는 사용가능하나 객체 생성할 수 없음
		BoardService bService = new BoardServiceImpl();
		
		// * listCount : 총 게시글 갯수
		int listCount = bService.selectListCount();
				
		// * currentPage : 사용자가 요청한 페이지
		int currentPage = Integer.parseInt(request.getParameter("currentPage"));
		
		// * pageLimit : 한 페이지 하단에 보여질 페이지 최대갯수 => 10
		// * boardLimit : 한 페이지당 게시글 최대갯수 => 5
//		int pageLimit =10;
//		int boardLimit=5;
//		
		PageInfo pi = Pagination.getPageInfo(listCount, currentPage, 10, 5);
		
		ArrayList<Board> list = bService.selectList(pi);
		
		request.getRequestDispatcher("WEB-INF/views/board/boardListView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
