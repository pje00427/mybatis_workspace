package com.kh.mybatis.common;

import com.kh.mybatis.common.vo.PageInfo;

public class Pagination {

	public static PageInfo getPageInfo(int listCount, int currentPage, int pageLimit, int boardLimit) {
		
		
		// * maxPage : 제일 마지막 페이지 수 (listCount, boardLimit)
		int maxPage = (int)(Math.ceil((double)listCount/boardLimit));
		
		// * startPage : 사용자가 요청한 페이지 하단에 보여질 페이징바의 시작 수 (currentPage, pageLimit)
		int startPage = (currentPage - 1) / pageLimit * pageLimit + 1;
		
		// * endPage : 사용자가 요청한 페이지 하단의 보여질 페이징바의 끝수 (startPage, pageLimit, maxPage)
		int endPage = startPage + pageLimit - 1;
		if(endPage > maxPage) {
			endPage=maxPage;
		}
		
		PageInfo pi = new PageInfo(listCount, currentPage, startPage, endPage, maxPage, pageLimit, boardLimit);
		// return pi
		
		return new PageInfo(listCount, currentPage, startPage, endPage, maxPage, pageLimit, boardLimit);
		
				
	}
}
