<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/css/plugin/datepicker/bootstrap-datepicker.css">

<script
  src="https://code.jquery.com/jquery-3.6.3.min.js"
  integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
  crossorigin="anonymous"></script>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
  <script src="resources/js/plugin/datepicker/bootstrap-datepicker.js"></script>


<!--한국어  달력 쓰려면 추가 로드-->
<script src="resources/js/plugin/datepicker/bootstrap-datepicker.ko.min.js"></script>  
<meta name="viewport" content="width=device-width, initial-scale=1">

<meta charset="UTF-8">
<title>펫시터02_펫시터예약폼</title>
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <![endif]-->
    
    <style>
    	td{
    		width:100px;heigth:500px;
    	}
    </style>
</head>
<body>
	
	<%@include file="/includes/header.jsp" %>
		<div class="container">
		
			<button class="btn btn-secondary">방문</button>
			<button class="btn btn-secondary">위탁</button>
			
			<br>
			<b>예약날짜</b>
			
			<br>
			
			
			<button type="button" class="btn" data-bs-toggle="modal" data-bs-target="#myModal">
				<img src="http://192.168.0.101:8088/amigo/resources/img/dool.png" alt="달력" /> 	
			</button><br>
			
			
			이용주소 <input type="text" name="address" value="" /><button>변경</button><br>
			반려동물 <input type="text" name="pet" value=""/><button>변경</button><br>
			휴대전화 <input type="text" name="phone" value=""/><button>변경</button><br>
			
			<b>특이사항</b><br>
			<textarea></textarea><br>
			
			<b>비용:30000원</b><br>
			
			<b>개인정보이용동의</b><br>
			
			<p>얼마나 튼튼하며 그들의 피부가 얼마나ㅁㄴㅇㅁㄴㅇㄴㅁㅇ</p>
			
			<div class="btn" onclick="">더보기</div><br>
			
			
			
			<button class="btn btn-primary" onclick="history.back(-1)">이전</button>
			<button class="btn btn-primary">확인</button>
			
			
			

		</div>
		
	<%@include file="/includes/footer.jsp" %>
	
	
	
<div class="modal" id="myModal">
  <div class="modal-dialog">
    <div class="modal-content">

      <!-- Modal Header -->
      <div class="modal-header">
        <h4 class="modal-title">Modal Heading</h4>
        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
      </div>

      <!-- Modal body -->
      <div class="modal-body">
        
      </div>

      <!-- Modal footer -->
      <div class="modal-footer">
        <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
      </div>

    </div>
  </div>
</div>

	
</body>
</html>