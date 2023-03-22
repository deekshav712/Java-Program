import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/First"})
public class First extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");
        PrintWriter out = response.getWriter();
            try {
                if(uname.equalsIgnoreCase("VCET")&&pass.equalsIgnoreCase("mca2022"))
                {
                    HttpSession session=request.getSession();
                    session.setAttribute("User", uname);
                    RequestDispatcher rd=request.getRequestDispatcher("second");
                    rd.forward(request, response);
                }
                else 
                {
                    RequestDispatcher rd=request.getRequestDispatcher("login.html");
                    rd.include(request,response);
                }
        }
            finally {
                out.close();
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
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
