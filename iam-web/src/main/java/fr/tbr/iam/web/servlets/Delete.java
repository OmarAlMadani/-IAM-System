package fr.tbr.iam.web.servlets;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.tbr.iam.log.IAMLogger;
import fr.tbr.iam.log.impl.IAMLogManager;
import fr.tbr.iamcore.datamodel.Identity;
import fr.tbr.iamcore.exception.DAOUpdateException;
import fr.tbr.iamcore.service.dao.DAODeleteException;
import fr.tbr.iamcore.service.dao.IdentityDAOInterface;

/**
 * Servlet implementation class Delete
 */

@WebServlet(name="Delete", urlPatterns="/Delete")
public class Delete extends GenericSpringServlet {
	private static final long serialVersionUID = 1L;
	
	IAMLogger logger = IAMLogManager.getIAMLogger(Delete.class);
	
	@Inject
	IdentityDAOInterface dao;
	

    /**
     * Default constructor. 
     */
    public Delete() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.sendRedirect("delete.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uName = request.getParameter("uNamemodif");
		
		Identity identity = new Identity(null, null, null,uName,null);
		
		try {
			dao.delete(identity);
		} catch (DAODeleteException e) {
			e.printStackTrace();
		}

		
	}

}