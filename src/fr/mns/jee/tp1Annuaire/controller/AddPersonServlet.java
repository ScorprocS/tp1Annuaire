package fr.mns.jee.tp1Annuaire.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mns.jee.tp1Annuaire.dao.Dao;
import fr.mns.jee.tp1Annuaire.dao.PersonDao;
import fr.mns.jee.tp1Annuaire.model.Gender;
import fr.mns.jee.tp1Annuaire.model.Person;

@WebServlet("/addperson")
public class AddPersonServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final Dao<Person> personDAO = new PersonDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("addperson.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String lastname = request.getParameter("lastname");
        String firstname = request.getParameter("firstname");
        // Date birthdate = new Date(request.getParameter("birthdate"));
        LocalDate birthdate = LocalDate.now();
        String phonenumber = request.getParameter("phonenumber");
        
        personDAO.create(new Person(4l,firstname,lastname, birthdate,  phonenumber, Gender.MALE));
        
        response.sendRedirect(request.getContextPath() + "/persons");
    }
}