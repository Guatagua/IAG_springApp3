package appControlers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
   
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Page Title</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Ya taher ya chalghmi jebt l khedma wala lé</h1>");
		out.println("<p>Meher bech yetlhé bel front end</p>");
		out.println("</body>");
		out.println("</html>");
	}
}
