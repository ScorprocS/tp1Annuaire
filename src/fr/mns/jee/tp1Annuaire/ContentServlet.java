package fr.mns.jee.tp1Annuaire;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/content")
public class ContentServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String content="Ceci est un contenu";
        request.setAttribute("content", content);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("content.jsp");
        requestDispatcher.forward(request, response);
    }
}