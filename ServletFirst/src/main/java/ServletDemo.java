
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String s = request.getParameter("user");
		String p = request.getParameter("password");

		PrintWriter pw = response.getWriter();

		if (s.equals("immu") && p.equals("098")) {
			System.out.println("11" + s);
			pw.println("Login Successfully");

		} else {
			pw.println("Invalid");
		}
	}

}
