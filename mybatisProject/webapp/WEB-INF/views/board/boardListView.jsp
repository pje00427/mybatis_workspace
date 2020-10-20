<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
   #list-area{
       border:1px solid white;
       text-align: center;
   }
   #list-area>tbody>tr:hover{
       background: darkgray;
       cursor: pointer;
   }
   #paging-area a{
       color: white;
       text-decoration: none;
   }
</style>
<body>
  <jsp:include page="../common/menubar.jsp"/>

    <div class="outer">

        <br>
        <h1 align="center">게시판</h1>
        <br>

        <!--검색영역-->
        <div id="search-area" align="center">
            <form action="search.bo">
                <select name="condition">
                    <option value="writer">작성자</option>
                    <option value="title">제목</option>
                    <option value="content">내용</option>
                </select>
                <input type="text" name="keyword">
                <button type="submit">검색</button>
            </form>
        </div>
        <br><br>

        <table id="list-area" align="center">
            <thead>
                <tr>
                    <th>글번호</th>
                    <th width="400">제목</th>
                    <th>작성자</th>
                    <th>조회수</th>
                    <th>작성일</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>3</td>
                    <td>글제목입니다.</td>
                    <td>user02</td>
                    <td>10</td>
                    <td>2020-10-20</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>제목임둥</td>
                    <td>admin</td>
                    <td>20</td>
                    <td>2020-10-01</td>
                </tr>
                <tr>
                    <td>1</td>
                    <td>제목이라고</td>
                    <td>user01</td>
                    <td>30</td>
                    <td>2020-09-10</td>
                </tr>
            </tbody>
        </table>

        <br>

        <div id="paging-area" align="center">
            <a href="">[이전]</a>

            <a href="">[1]</a>
            <a href="">[2]</a>
            <a href="">[3]</a>
            <a href="">[4]</a>
            <a href="">[5]</a>
            <a href="">[다음]</a>
        </div>
        <br><Br>
    </div>
</body>
</html>