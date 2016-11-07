<%-- 
    Document   : Account
    Created on : Oct 30, 2016, 11:23:09 PM
    Author     : Sorrasak
--%>

<%@page import="sportlogin.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Page</title>
    </head>
    <body>
        <h1>Account JSP</h1>
        <div style="background-color: #FFBBCC; width:100%;">
        
        <br />
        
        <h2><a href="ListController">List Account</a></h2>
            
        <h2><a href="AddAccount.jsp">Add Account</a></h2>
            
        <h2><a href="ListControllerDelete">Delete Account</a></h2>
            
            
            <h2>Account Search Form</h2>
            <form name="searchForm" action="SearchController">
                Enter Employee ID:<input type="text" name="searchValue" value="" >
                <input type="submit" value="Find Account Details" name="searchButton" />
            </form>

            <%
                try {
                    // Create a session object if it is already not  created.
                    Account acc = (Account) session.getAttribute("searchResult");

                    if (acc != null) {
            %>


            <table border="1">

                <tbody>
                    <tr>
                        <td>Employee ID</td>
                        <td><% out.println(acc.getId()); %></td>
                    </tr>
                    <tr>
                        <td>Username</td>
                        <td><% out.println(acc.getUser()); %></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><% out.println("*****"); %></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><% out.println(acc.getSname()); %></td>
                    </tr>
                    <tr>
                        <td>Surname</td>
                        <td><% out.println(acc.getSsurname()); %></td>
                    </tr>
                    <tr>
                        <td>Sex</td>
                        <td><% out.println(acc.getSex()); %></td>
                    </tr>
                </tbody>
            </table>

            <%
                    }

                } catch (Exception e) {
                    out.println(e.getMessage());
                }

            %>
            </div>
    </body>
</html>
