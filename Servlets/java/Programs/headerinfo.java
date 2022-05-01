/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Programs;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SONY
 */
@WebServlet(name = "headerinfo", urlPatterns = {"/headerinfo"})
public class headerinfo extends HttpServlet {

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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");  out.println("<head>");
            out.println("<title> Request Object example </title>");
            out.println("</head>");

            out.println("<body bgcolor=\"yellow\">");

            out.println("<h1>"+"Request object Headers details: " + "</h1>"+"<br>"); 
            Enumeration<String> reqHeaders = request.getHeaderNames();  
            out.println("<table border=0>");

            while (reqHeaders.hasMoreElements()) {
            String name = (String)reqHeaders.nextElement();  
            String value = request.getHeader(name);  
            out.println("<tr><td bgcolor=\"#CCCCCC\">");  
            out.println("<b>" + name + "</b>" +" = " + value);  
            out.println("</td><td>");  
            out.println("</td></tr>");
}
out.println("</table>");

out.println("</body>"); 
out.println("</html>");

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
            throws ServletException, IOException {
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
