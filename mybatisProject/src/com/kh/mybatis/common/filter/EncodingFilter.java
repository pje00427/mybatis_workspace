package com.kh.mybatis.common.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
// Filter : 어떤 서블릿이 실행되기 전에 공통적으로 처리해야할 내용이 있을 경우 
// 			필터를 사용해서 처리할 수 있다. 
/**
 * Servlet Filter implementation class EncodingFilter
 */

// 어떤 서블릿 가기전에 이 필터를 거쳐서 가게끔 할건지 등록하는게 바로 어노테이션의 역할 
@WebFilter( urlPatterns="/*")
public class EncodingFilter implements Filter {

    /**
     * Default constructor. 
     */
    public EncodingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 내가 등록한 서블릿 가기전에 이 doFilter가 먼저 호출될꺼임 
		
		// 매 서블릿마다 공통적으로 실행해야만 하는 코드 
		request.setCharacterEncoding("UTF-8");
		
		chain.doFilter(request, response);
		// 만약에 또다른 필터가 존재한다면 그 필터를 호출하는 거고 
		// 만약에 또다른 필터가 없다면(즉, 이게 마지막 필터라면) 사용자가 요청했던 Servlet 을 호출하는 개념 
		// 절대 지우면 안됨
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
