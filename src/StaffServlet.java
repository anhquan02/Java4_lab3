

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

/**
 * Servlet implementation class StaffServlet
 */
@MultipartConfig
@WebServlet("/staff")
public class StaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/views/staff/form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Staff staff = new Staff();
		try {		
			File dir= new File(request.getServletContext().getRealPath("/files"));
			if(!dir.exists()) {
				dir.mkdirs();
			}
			Part photo = request.getPart("photo_file");
			File photoFile= new File(dir,photo.getSubmittedFileName());
			photo.write(photoFile.getAbsolutePath());
			DateTimeConverter dtc = new DateConverter(new Date());
			dtc.setPattern("yyyy-MM-dd");
			ConvertUtils.register(dtc, Date.class);
			BeanUtils.populate(staff, request.getParameterMap());
			staff.setPhoto(photoFile.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("staff",staff);
		request.getRequestDispatcher("/views/staff/result.jsp").forward(request, response);
	}

}
