package fr.tbr.iam.web.servlets;

import java.io.IOException;
import java.util.Collection;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.tbr.iam.log.IAMLogger;
import fr.tbr.iam.log.impl.IAMLogManager;
import fr.tbr.iamcore.datamodel.Identity;
import fr.tbr.iamcore.exception.DAOSaveException;
import fr.tbr.iamcore.exception.DAOSearchException;
import fr.tbr.iamcore.exception.DAOUpdateException;
import fr.tbr.iamcore.service.dao.IdentityDAOInterface;

/**
 * Servlet implementation class Login
 */

@WebServlet(name="Modify", urlPatterns="/Modify")
public class Modify extends GenericSpringServlet {
	private static final long serialVersionUID = 1L;
	
	IAMLogger logger = IAMLogManager.getIAMLogger(Modify.class);
	
	@Inject
	IdentityDAOInterface dao;
	

    /**
     * Default constructor. 
     */
    public Modify() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		response.sendRedirect("modify.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("firstNameModif");
		String lname = request.getParameter("lastNameModif");
		String birthDate = request.getParameter("dateModif");
		Identity identity = new Identity(fname, lname, birthDate);
	
		logger.info("received this query - :  = fname" + fname + " lname = " + lname + "birthDate" + birthDate);
		try {
			dao.update(identity);
		} catch (DAOUpdateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}