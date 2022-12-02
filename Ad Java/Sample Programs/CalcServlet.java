import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/CalcServlet"})
public class CalcServlet extends HttpServlet 
{
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalcServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html> <head> <title>Servlet Calculator Servlet </title></head></html>");
        double n1= Double.parseDouble(request.getParameter("txtN1"));
        
        double n2= Double.parseDouble(request.getParameter("txtN2"));
        double result=0;
        String opr=request.getParameter("opr");
        
        if(opr.equals("+"))
            result=n1+n2;
        
        if(opr.equals("-"))
            result=n1-n2;
        
        if(opr.equals("*"))
            result=n1*n2;
        
        if(opr.equals("/"))
            result=n1/n2;
        
        out.println("<h1> Result = "+result);
        out.println("</body></html>");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
