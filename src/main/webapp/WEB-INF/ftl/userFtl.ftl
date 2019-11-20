<#import "spring.ftl" as spring />
<html>
	<head>
		<title>smart</title>
	</head>
	<body>
		用户列表
		<table>
           <#list userList as user>
				<tr>
					<td>
					   <a href="<@spring.url '/user/showUser/${user.userName}.html'/>">  
					    ${user.userName}
					   </a>
					</td>
			        <td>${user.userId}</td>
			        <td>${user.userId}</td>    
				</tr>
           </#list>
		 <table>
	</body>
</html>