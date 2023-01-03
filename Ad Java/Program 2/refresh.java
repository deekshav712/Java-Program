
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/refresh"})
public class refresh extends HttpServlet {
    protected void PerformTask(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("TestServlet says Hi at" + new Date());
        try 
        {
            String AccName=request.getParameter("AccName");
            String AccNum=request.getParameter("AccNum");
            String Branch=request.getParameter("Branch");
            String Place=request.getParameter("Place");
            String date=request.getParameter("date");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Program 2</title");
            out.println("<head>");
            out.println("<body>");
            out.println("<h2>Customer Account Details</h2>");
            out.println("<fontface=6>Dear User<br>");
            out.println("Ypur Information <br><br>");
            out.println("Account Name :"+AccName+"<br><br>");
            out.println("Account Number :"+AccNum+"<br>");
            out.println("Branch :"+Branch+"<br>");
            out.println("Place :"+Place+"<br><br>");
            out.println("Date :"+date+"<br><br></font>");
            out.println("</body>");
            out.println("</html>");
        }
        finally
        {
            out.close();
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet refresh</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet refresh at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        PerformTask(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        PerformTask(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
