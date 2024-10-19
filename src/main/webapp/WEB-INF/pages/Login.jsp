<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Application - log in or sign up</title>
<%--    <script defer>--%>
<%--        document.getElementById("loginButtonID").addEventListener("click",()=>{--%>
<%--            let email=document.getElementById("inputEmail").value--%>
<%--            let password=document.getElementById("inputPassword").value--%>
<%--            if(email==""||password==""){--%>
<%--                return;--%>
<%--            }--%>
<%--            console.log("sabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");--%>
<%--            // window.location.assign(`http://localhost:8080/webProject/central`)--%>
<%--        })--%>
<%--    </script>--%>
</head>
<body style="align-items:center; justify-content: center;">
    <%@ include file="/WEB-INF/shared/header.jsp"%>
<%--    <%@ include file="/WEB-INF/pages/LoginNavigation.jsp"%>--%>
    <h1>Welcome to home Page</h1>
    <form method="post">
<%--        action="${pageContext.request.contextPath}/Login"--%>
        <div class="mb-3">
            <label for="inputEmail"></label>
            <input required id="inputEmail" name="inputEmail" type="email" class="form-control" placeholder="Email">
        </div>
        <div class="mb-3">
            <label for="inputPassword"></label>
            <input required id="inputPassword" name="inputPassword" type="password" class="form-control" placeholder="Password">
        </div>

        <div class="mb-3" class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <button required id="loginButtonID" type="submit" class="btn" style="background-color: #BF00FF; color:white;">Log in</button>
                </li>
            </ul>
        </div>
<%--    action="${pageContext.request.contextPath}/central"--%>
        <div class="mb-3" class="collapse navbar-collapse" id="navbarSupportedContent1">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover" href="${pageContext.request.contextPath}/recover">
                        Forgot password?
                    </a>
                </li>
            </ul>
        </div>
        <hr>
        <div class ="mb-3" class="collapse navbar-collapse" id="navbarSupportedContent2">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a type="button" class="btn" style="background-color: #8806CE; color: white;" href="${pageContext.request.contextPath}/registration">Create new account</a>
                </li>
            </ul>
        </div>
    </form>
    <%@ include file="/WEB-INF/shared/footer.jsp"%>
</body>
</html>