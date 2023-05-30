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
@WebServlet("/Registro de productos")
public class productos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productos() {
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
	        out.println("<html><head><title>Registro de productos</title></head>");
	        out.println("<center><body><h1>Registro de productos</h1></center>");
	        out.println("<form method=\"post\">");
	        out.println("<center>Clave del producto: <input type=\"text\" name=\"clave\"><br></center>");
	        out.println("<center>Nombre del producto (metros): <input type=\"text\" name=\"nombre\"><br></center>");
	        out.println("<center>Peso (kilogramos): <input type=\"text\" name=\"peso\"><br></center>");
	        out.println("<center>Altura (kilogramos): <input type=\"text\" name=\"altura\"><br></center>");
	        out.println("<center>Cantidad de productos: <input type=\"text\" name=\"cantidad\"><br></center>");
	        out.println("<center>Precio: <input type=\"text\" name=\"precio\"><br></center>");
	        out.println("<center>Estatus: <input type=\"text\" name=\"estatus\"><br></center>");
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
		double Peso = Double.parseDouble(request.getParameter("peso"));
		double Altura = Double.parseDouble(request.getParameter("altura"));
		double cantidad = Double.parseDouble(request.getParameter("cantidad"));
		int cantidadInt = (int) Math.round(cantidad);
		double Precio = Double.parseDouble(request.getParameter("precio"));
		String Estatus = request.getParameter("estatus");
		
       

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        

	}
}


