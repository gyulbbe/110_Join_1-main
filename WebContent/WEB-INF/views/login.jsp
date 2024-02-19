<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>CodePen - Flat HTML5/CSS3 Login Form</title>
  <link rel="stylesheet" href="/resources/style.css">

<script type="text/javascript">
	//컨트롤러에서 보낸 메세지가 있을 경우
	window.onload = function(e){ 
		var resultMsg = '${resultMsg}';
		if(resultMsg.length > 0){
			alert(resultMsg);
		}
	}
</script>
</head>
<body>
<!-- partial:index.partial.html -->
<div class="login-page">
  <div class="form">
    <form class="register-form">
      <input type="text" name="memberId" placeholder="name"/>
      <input type="password" name="passWd" placeholder="password"/>
      <input type="text" name="email" placeholder="email address"/>
      <button>create</button>
      <p class="message">Already registered? <a href="#">Sign In</a></p>
    </form>
    <form class="login-form">
      <input type="text" name="memberId" placeholder="username"/>
      <input type="password" name="passWd" placeholder="password"/>
      <button>login</button>
      <p class="message">Not registered? <a href="#">Create an account</a></p>
    </form>
  </div>
</div>
<!-- partial -->
<script src='//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script  src="/resources/script.js"></script>

</body>
</html>
