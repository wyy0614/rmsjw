<%--
  Created by IntelliJ IDEA.
  User: slrh5
  Date: 2020/1/14
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台首页</title>
    <style>
        #left{
            width: 30%;
            height: 100%;
            float: left;
            background-color: antiquewhite;
        }
        #right{
            width: 70%;
            float: right;
            background-color: blanchedalmond;
        }
    </style>



</head>
<body>
<div id="left">
    <h1>欢迎${user.data.username}登陆管理后台</h1>
    <a href="/product/getall">获取所有商品数据</a>
</div>
<div id="right">

</div>
</body>
</html>
