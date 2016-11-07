<%-- 
    Document   : AddAccount
    Created on : Oct 31, 2016, 10:35:15 AM
    Author     : Sorrasak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;
              charset=UTF-8">
        <title>Add Account</title>
    </head>
    <body>
        <h1>Add Account</h1>


        <%
            String message = request.getParameter("message");
            if (message != null) {
                out.println(message);
            }

        %>

        <form name="formAddAccount" action="AddAccountController">
            Username: <input type="text" name="user"
                              value="" />
            Password: <input type="text" name="password"
                             value="" />
            Name: <input type="text" name="sname"
                              value="" />
            Surname: <input type="text" name="ssurname"
                             value="" />
            Sex: <input type="text" name="sex"
                              value="" />
           
            <input type="submit" value="Submit"
                   name="Add Account" />
        </form>

        <br><br>

        <form name="formSearchActor" action="SearchKeywordController" >

            Search by Keyword: <input type="text" name="searchAccount" value="" />
            <input type="submit" value="Search" name="searchButton" />
        </form>
        <a href="Account.jsp">Back to Home</a>
    </body>
</html>