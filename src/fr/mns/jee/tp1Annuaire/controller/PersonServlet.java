package fr.mns.jee.tp1Annuaire.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mns.jee.tp1Annuaire.dao.PersonDao;
import fr.mns.jee.tp1Annuaire.model.Person;

import java.io.IOException;
import java.util.List;

@WebServlet(name="PersonServlet",value="/persons")
public class PersonServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       List<Person> persons=new PersonDao().findAll();
       System.out.println(persons.size());
        request.setAttribute("persons", persons);
       
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("persons.jsp");
        requestDispatcher.forward(request, response);
    }
}