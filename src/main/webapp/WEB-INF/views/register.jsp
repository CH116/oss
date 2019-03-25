<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<div>
    <form id="register" action="/user/register" method="post">
        用户名：<input type="text" required id="username" name="username"><br>
        密码：<input type="password" required id="password" name="password"><br>
        <input type="submit" value="注册">
        <input type="button" value="已有账号？去登录" onclick="location.href='/user/login'">
    </form>
</div>
</body>
<script>

    //对应后台返回的提示
    if ('${status}' != '') {
        if ('${status}' == 1) {
            alert('注册成功,即将跳转至登陆页面！')
            location.href = '/user/login'
        }else if ('${status}' == 2) {
            alert('该用户名已存在！');
        }
        else if ('${status}' == 0) {
            alert('注册失败!')
        }
    }
</script>
</html>