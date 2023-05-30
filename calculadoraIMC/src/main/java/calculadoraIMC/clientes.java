package calculadoraIMC;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class productos
 */
@WebServlet("/Registro de clientes")
public class clientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<html><head><title>Registro de clientes</title></head>");
	        out.println("<center><body><h1>Registro de clientes</h1></center>");
	        out.println("<form method=\"post\">");
	        out.println("<center>Clave del clientes: <input type=\"text\" name=\"clave\"><br></center>");
	        out.println("<center>Nombre del cliente: <input type=\"text\" name=\"nombre\"><br></center>");
	        out.println("<center>Direccion: <input type=\"text\" name=\"direccion\"><br></center>");
	        out.println("<center>Telefono: <input type=\"text\" name=\"telefono\"><br></center>");
	        out.println("<center><input type=\"submit\" value=\"Registrar\"></center>");
	        out.println("</form>");
	        out.println("</body></html>");

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String Nombre = request.getParameter("nombre");
		String Direccion = request.getParameter("direccion");
		double Telefono = Double.parseDouble(request.getParameter("telefono"));
		int TelefonoInt = (int) Math.round(Telefono);
		
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Clientes</title></head>");
        out.println("<body><h1>Cliente registrado exitosamente</h1>");
        

	}
}


