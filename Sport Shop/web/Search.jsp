<%-- 
    Document   : Search
    Created on : Nov 7, 2016, 12:54:21 AM
    Author     : Sorrasak
--%>
<%@page import="java.util.List"%>
<%@page import="sportlogin.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search By Keyword</title>
    </head>
    <body>
        <h1>Search By Keyword</h1>
        
        <%
            try {

                List<Account> alist = (List<Account>) session.getAttribute("searchAccount1");

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
                out.println(e);
            }

        %>
    </body>
</html>
