import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/login"})
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = CookiesUtils.get("username", req);
		String password = CookiesUtils.get("password", req);
		
		req.setAttribute("username", username);
		req.setAttribute("password", password);
		
		req.getRequestDispatcher("/views/login/login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String remember = req.getParameter("remember");
		System.out.println(remember);
		if(!username.equalsIgnoreCase("quanks202")) {
			req.setAttribute("message", "Sai tên đăng nhập!");
			}
			else if(password.length() < 6) {
			req.setAttribute("message", "Sai mật khẩu!");
			}
			else {
			req.setAttribute("message", "Đăng nhập thành công!");

			int hours = (remember == null) ? 0 : 30*24; // 0 = xóa
			CookiesUtils.add("username", username, hours, resp);
			CookiesUtils.add("password", password, hours, resp);
			}
		
		req.getRequestDispatcher("/views/login/login.jsp").forward(req, resp);
	}
}
