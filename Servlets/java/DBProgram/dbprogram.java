/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBProgram;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SONY
 */
@WebServlet(name = "dbprogram", urlPatterns = {"/dbprogram"})
public class dbprogram extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Connection c;
    Statement st;
    ResultSet rs;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet dbprogram</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>"+"Internet Programming"+"</h1>");
            
            c=DriverManager.getConnection("jdbc:derby://localhost:1527/student");
          
            st=c.createStatement();
          
            rs=st.executeQuery("select *from details");
            /* TODO output your page here. You may use following sample code. */
           out.println("<table border=2><tr><td>Name</td><td>RollNo</td><td>Mark</td><td>Date</td></tr>");
           while(rs.next())
               
           {
              
               String uname=rs.getString("NAME");
               int pass=rs.getInt("ROLLNO");
               int mark=rs.getInt("MARK");
               String  date=rs.getString("DATE");
               out.println("<tr><td> " +uname + "</td><td>"+pass+"</td><td> " +mark + "</td><td>"+date+"</td></tr>");
               
           }
            
           
            out.println("</table></body>");
            out.println("</html>");
        } 
        catch(Exception e)
        {
            
        }
        finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
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
