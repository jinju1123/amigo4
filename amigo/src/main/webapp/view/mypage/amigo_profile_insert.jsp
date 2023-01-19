<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script
  src="https://code.jquery.com/jquery-3.6.3.min.js"
  integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
  crossorigin="anonymous"></script>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>Insert title here</title>
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <![endif]-->
</head>
<body>
	
	<%@include file="/includes/header.jsp" %>
			<div class="container mt-5 col-4 justify-content-center">
			
			   <hr>
			<!-- insert폼 -->
			<form action="insertDog.do" method="post">
			
			   <!-- 사진등록 -->
			   <div class="input-group mb-3">
					<div class="input-group-text"><i>사진등록</i></div>
					<input type="file" name="dog_image_url" placeholder="사진등록">
              </div>
			
			
			   <!-- 기본사항 : 이름,성별,품종,생일,몸무게,중성화,광견병,기타,동의 -->
			   <hr>
				<div class="modal-content">				
					<div class="modal-header bg-primary text-white">
						<h1 class="motal-title fs-5" id="staticBackdropLabel">기본사항</h1>
					</div> <!-- modal-header -->
					
					<div class="modal-body">
					
						<div class="input-group mb-3">
							<div class="input-group-text"><i>이름</i></div>
							<input type="text" name="dog_name" class="form-control" value="푸쿠" required placeholder="예) 댕댕이">
						</div>
						
					
					 <div class="input-group mb-3">
					   <div class="input-group-text"><i>성별</i></div>
							<div class="form-check form-check-inline">
							  <input class="form-check-input" type="radio" name="dog_gender" id="female" value="f" checked>
							  <label class="form-check-label" for="female">여자아이</label>
							</div>
							<div class="form-check form-check-inline">
							  <input class="form-check-input" type="radio" name="dog_gender" id="male" value="m" >
							  <label class="form-check-label" for="male">남자아이</label>
						    </div>
					 </div>
						
						
						<div class="input-group mb-3">
							<div class="input-group-text"><i class="fas fa-address-book">품종</i></div>
							<input type="text" name="dog_breeds" class="form-control" value="시바" required placeholder="예) 말티즈">
						</div>
						
						<div class="input-group mb-3">
							<div class="input-group-text"><i class="fas fa-address-book">생일</i></div>
							<input type="text" name="dog_birth" class="form-control" value="2023.01.17" required placeholder="예) 2023.01.17">
						</div>
						
						<div class="input-group mb-3">
							<div class="input-group-text"><i class="fas fa-address-book">몸무게(kg)</i></div>
							<input type="text" name="dog_weight" class="form-control" value="6.25" required placeholder="예) 5.25">
						</div>
						
					 <div class="input-group mb-3">
					   <div class="input-group-text"><i>중성화</i></div>
						<div class="form-check form-check-inline">
						  <input class="form-check-input" type="radio" name="dog_neutered" id="yes" checked>
						  <label class="form-check-label" for="yes">
						    했어요
						  </label>
						</div>
						<div class="form-check form-check-inline">
						  <input class="form-check-input" type="radio" name="dog_neutered" id="no" >
						  <label class="form-check-label" for="no">
						    안했어요
						  </label>
						</div>
					</div>
						
					 <div class="input-group mb-3">
					   <div class="input-group-text"><i>광견병 접종여부</i></div>
						<div class="form-check form-check-inline">
						  <input class="form-check-input" type="radio" name="dog_rabies_vacc" id="yes" checked>
						  <label class="form-check-label" for="yes">
						    했어요
						  </label>
						</div>
						<div class="form-check form-check-inline">
						  <input class="form-check-input" type="radio" name="dog_rabies_vacc" id="no" >
						  <label class="form-check-label" for="no">
						    안했어요
						  </label>
						</div>
					</div>
				<hr>
					<div class="mb-3">
					  <label for="notice" class="form-label">우리강아지(성격 및 건강상태 등..)</label>
					  <input class="form-control" id="notice" rows="3" name="dog_notice" value="성형이"
					   placeholder="펫시터에게 알려줘야할 사항들을 나열해주세요. 성격 및 건상상태를 알려주시면 됩니다.">
					</div>
				<hr>
				
					<div class="form-check">
					  <input class="form-check-input" type="checkbox" name="dog_terms" value="1" id="terms" required>
					  <label class="form-check-label" for="terms">
					    아래 내용을 확인하였습니다.
					  </label>
					  <p>위 내용(예. 몸무게, 마킹 등)을 사실과 다르게 기재한 경우, 약관에 따라 서비스 이용이 거부될 수 있습니다.</p>
					</div>
					 
					<!-- user_no 벨류값 받아서 폼에 기입해야함 (현재 임의로 1 넣음)-->
					<input class="" type="hidden" value="1" name="user_no">
				
					<div class="modal-footer">
						<button type="submit" class="btn btn-primary">등록완료</button>
					</div> 
				</div>
			  </div>
			</form>	
	</div>
	<%@include file="/includes/footer.jsp" %>

	
</body>
</html>