<%--
  Created by IntelliJ IDEA.
  User: ch
  Date: 2019/3/20
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>跳转成功</p>
    <input type="button" value="返回" onclick="back()">
</body>
<script type="text/javascript">
    function back() {
        window.location.href="/index.jsp";
    }
</script>
</html>
