package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sportlogin.Account;

public final class Account_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Account Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Account JSP</h1>\n");
      out.write("        <div style=\"background-color: #FFBBCC; width:100%;\">\n");
      out.write("        \n");
      out.write("        <br />\n");
      out.write("        \n");
      out.write("        <h2><a href=\"ListController\">List Account</a></h2>\n");
      out.write("            \n");
      out.write("        <h2><a href=\"AddAccount.jsp\">Add Account</a></h2>\n");
      out.write("            \n");
      out.write("        <h2><a href=\"ListControllerDelete\">Delete Account</a></h2>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <h2>Account Search Form</h2>\n");
      out.write("            <form name=\"searchForm\" action=\"SearchController\">\n");
      out.write("                Enter Employee ID:<input type=\"text\" name=\"searchValue\" value=\"\" >\n");
      out.write("                <input type=\"submit\" value=\"Find Account Details\" name=\"searchButton\" />\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            ");

                try {
                    // Create a session object if it is already not  created.
                    Account acc = (Account) session.getAttribute("searchResult");

                    if (acc != null) {
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table border=\"1\">\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Employee ID</td>\n");
      out.write("                        <td>");
 out.println(acc.getId()); 
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Username</td>\n");
      out.write("                        <td>");
 out.println(acc.getUser()); 
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password</td>\n");
      out.write("                        <td>");
 out.println("*****"); 
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Name</td>\n");
      out.write("                        <td>");
 out.println(acc.getSname()); 
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Surname</td>\n");
      out.write("                        <td>");
 out.println(acc.getSsurname()); 
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Sex</td>\n");
      out.write("                        <td>");
 out.println(acc.getSex()); 
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            ");

                    }

                } catch (Exception e) {
                    out.println(e.getMessage());
                }

            
      out.write("\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
