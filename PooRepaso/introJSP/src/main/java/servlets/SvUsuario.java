package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Usuario;
import java.util.List;
import java.util.ArrayList;

@WebServlet(name = "SvUsuario", urlPatterns = "/SvUsuario")
public class SvUsuario extends HttpServlet {
//	private static final long serialVersionUID = 1L;
      
    public SvUsuario() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Usuario> listaUsuarios = new ArrayList<>();
		
		listaUsuarios.add(new Usuario(123456,"Nio", "Ramos"));
		listaUsuarios.add(new Usuario(115377,"Tatu","Gomez"));
		listaUsuarios.add(new Usuario(848484, "Alan", "Perreyra"));
		
		HttpSession miSesion = request.getSession();
		miSesion.setAttribute("listaUsuarios", listaUsuarios);
		response.sendRedirect("mostrarUsuarios.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dni = request.getParameter("dni");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		
		System.out.println("El dni es :"+ dni);
		System.out.println("El nombre es:"+ nombre);
		System.out.println("El apellido es:" + apellido);
		
		response.sendRedirect("Index.jsp");
	}

}
