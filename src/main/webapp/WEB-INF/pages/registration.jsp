<%--
  Created by IntelliJ IDEA.
  User: otari
  Date: 6/7/2024
  Time: 11:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<%@ include file="/WEB-INF/shared/header.jsp"%>

    <script>
        function validateform(){
         var password1 = document.getElementById(exampleInputPassword1).value;
         var password2 = document.getElementById(exampleInputPassword2).value;
         if(password1 != password2){
             alert("Passwords don't match!");
             return false;
         }
         if(password1.length < 8){
             alert("Password must be at least 8 characters long!");
             return false;
         }
         return true;
        }
    </script>

    <h1>Registration Page!</h1>

    <form class="row g-3 needs-validation" method="post" novalidate>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input required name="exampleInputEmail1" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input required type="password" class="form-control" id="exampleInputPassword1" name="exampleInputPassword1">
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword2" class="form-label">Confirm Password</label>
            <input required type="password" class="form-control" id="exampleInputPassword2" name="exampleInputPassword2">
        </div>


        <div class="col-12">
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
                <label class="form-check-label" for="invalidCheck">
                    Agree to terms and conditions
                </label>
                <div class="invalid-feedback">
                    You must agree before submitting.
                </div>
            </div>
        </div>
        <div class="col-12">
            <button class="btn btn-primary" type="submit">Sign Up</button>
        </div>
    </form>

<%@ include file="/WEB-INF/shared/footer.jsp"%>
</body>
</html>