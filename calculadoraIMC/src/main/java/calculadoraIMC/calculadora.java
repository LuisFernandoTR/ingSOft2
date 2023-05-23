package calculadoraIMC;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculadora
 */
@WebServlet("/calculadora")
public class calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculadora() {
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
	        out.println("<center><body><h1>Calculadora de IMC</h1></center>");
	        out.println("<form method=\"post\">");
	        out.println("<center>Clave del producto: <input type=\"text\" name=\"nombre\"><br></center>");
	        out.println("<center>Nombre del producto (metros): <input type=\"text\" name=\"altura\"><br></center>");
	        out.println("<center>Peso (kilogramos): <input type=\"text\" name=\"peso\"><br></center>");
	        out.println("<center><input type=\"submit\" value=\"Calcular IMC\"></center>");
	        out.println("</form>");
	        out.println("</body></html>");

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String nombre = request.getParameter("nombre");
		double altura = Double.parseDouble(request.getParameter("altura"));
		double peso = Double.parseDouble(request.getParameter("peso"));
        double imc = peso / (altura * altura);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Resultado del IMC</title></head>");
        out.println("<body><h1>Resultado del IMC</h1>");
        out.println("<p>De acuerdo con lo establecido " + nombre + ", tu IMC es: " + imc + "</p>");
        if(imc<18.5) {
        	out.println("<p>Tu peso es muy bajo </p>");	
        }
        else if(imc>18.5 && imc<24.9) {
        	out.println("<p>Estas en un estatus saludable </p>");	
        }
        else if(imc>25 && imc<29.9) {
        	out.println("<p>Estas en un estatus de sobrepeso </p>");	
        }
        else if(imc>30) {
        	out.println("<p>Estas en un estatus de obesidad </p>");	
        }
        out.println("</body></html>");
    }

	}


