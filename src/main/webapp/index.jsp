<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
    <a href="/test">点击此处跳转到登陆页面</a>
    <div>
        请输入用户名：<input type="text" name="username" id="username" />
        <input type="button" value="进入主页" onclick="testname()" />
    </div>
</body>
<script type="text/javascript">
    function testname() {
        window.location.href="/testname/username="+document.getElementById("username").value;
    }
</script>
</html>
