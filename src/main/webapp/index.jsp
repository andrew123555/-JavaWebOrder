<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>訂餐首頁</title>
	
	</head>
	<body>
		<form style="pure-form" method="post" action="/JavaWebOrder/order">
			<fieldset>
				<legend>訂單首頁</legend>
				<select name="item">
					<option value="牛肉麵">牛肉麵</option>
					<option value="番茄麵">番茄麵</option>
				
				</select>
			</fieldset>
			<button style="submit">送出</button>
		</form>
	</body>
</html>