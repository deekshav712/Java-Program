
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/colorPost"})
public class colorPost extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet colorPost</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet colorPost at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String value=request.getParameter("combo Box2");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<body bgcolor="+value+"text=white>");
        out.println("<center><h2>The selected color is "+value);
        out.close();
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
