<%--
  Created by IntelliJ IDEA.
  User: slrh5
  Date: 2020/1/14
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登陆</title>
    <style>
        body{
            background-image: url("/bj.png");
            display: flex;
            justify-content: center;
            align-content: center;
        }
        input{
            width: 180px;
            height: 30px;
        }
        #button{
            width: 60px;
            display: block;
            position: relative;
            justify-content: center;
            margin: auto;
            top: 30px;
        }
        #sy{
            width: 100%;
            display: flex;
            position: absolute;
            justify-content: center;
            top: 40px;
            font-size: 40px;
        }
        form{
            height: 400px;
        }
    </style>




</head>

<body>
<p id="sy">后台管理中心</p>
    <form action="/backed/user/login" method="post">
        <p>请输入账户名</p>
            <input type="text" placeholder="账户" name="username">
        <p>请输入密码</p>
            <input type="password" placeholder="密码" name="password">

            <input  id="button" type="submit" value="登陆">
    </form>


</body>
</html>
