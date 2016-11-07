/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportlogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Sorrasak
 */
public class AccountService extends HttpServlet {

    public List getAccount(int startID, int endID) {
        List alist = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Account where ID between '" + startID + "' and '" + endID + "'");
            alist = (List<Account>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return alist;
    }

    public String addAccount(Account account) {
        String message = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.getTransaction();
            tx.begin();
            session.save(account);
            tx.commit();
            message = "Saved Data";
            return message;
        } catch (Exception e) {
            return (e.getMessage());
        } finally {
            session.close();
        }
    }

    public Account searchLogin(short search_Id) {
        String message = null;
        Session session = null;
        Transaction tx = null;
        Account a = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Account where ID=" + search_Id);
            a = (Account) query.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return a;
    }
    
     public List searchKeyword(String keyword) {
        String message = null;
        Session session = null;
        Transaction tx = null;
        List a = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            //tx.begin();
            Query query = session.createQuery("from Account where Sname like '%"+keyword+"%' or Ssurname like '%"+keyword+"%' or User like '%"+keyword+"%'");
            a = (List<Account>) query.list();
           // tx.commit();
        } catch (Exception e) {           
            
            e.printStackTrace();
        } 
        return a;
    }


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FilmServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FilmServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
