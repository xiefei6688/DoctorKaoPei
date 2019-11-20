<#import "spring.ftl" as spring />
<html>
	<head>
		<title>整合angularJs</title>
		<meta charset="utf-8">
		<script src="../angular-1.5.8/angular.min.js"></script>
	</head>
	<body>
		<div ng-app="">
		 	<p>名字 : <input type="text" ng-model="name"></p>
		 	<h1>Hello {{name}}</h1>
		</div>
	</body>
</html>