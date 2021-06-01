import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class htsession4 extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out=response.getWriter();
HttpSession hs=request.getSession(false);
try
{ String n=(String)hs.getAttribute("s_id");
} catch(NullPointerException ne)
{out.println("Session Invalidated");}
out.println("<form action='/htsession/index.html'>");
out.println("<p><input type='submit' value='logout'></p></form>");
}
}