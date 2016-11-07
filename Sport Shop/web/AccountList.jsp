<%-- 
    Document   : AccountList
    Created on : Oct 30, 2016, 10:55:29 PM
    Author     : Sorrasak
--%>

<%@page import="sportlogin.Account"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account List</title>
    </head>
    <body>
        <h1>Account List</h1>
        
        <%
            try {

                List<Account> alist = (List<Account>) session.getAttribute("listResult");

                if (alist != null) {
                    //out.println("not null");
                    //out.println(filmList.size());
        %>
        <table border="1">

            <tbody>
                <tr>
                    <td>Employee ID</td>
                    <td>Username</td>
                    <td>Password</td>
                    <td>Name</td>
                    <td>Surname</td>
                    <td>Sex</td>
                    

                </tr>
                <% for (Account a : alist) {
                %>
                <tr>
                    <td><% out.println(a.getId()); %></td>
                    <td><% out.println(a.getUser()); %></td>
                    <td><% out.println("*****"); %></td>
                    <td><% out.println(a.getSname()); %></td>
                    <td><% out.println(a.getSsurname()); %></td>
                    <td><% out.println(a.getSex()); %></td>
                </tr>
                <% } %>
            </tbody>
        </table> 
       <a href="Account.jsp">Back to Home</a>
        <%

                } else {
                    out.println("return null");
                }
            } catch (Exception e) {
                e.printStackTrace();
                out.println("error");
            }
            
        %>
    </body>
</html>
