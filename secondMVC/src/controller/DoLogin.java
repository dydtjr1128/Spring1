package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customer_id = request.getParameter("customer_id");
		String customer_password = request.getParameter("customer_password");
		
		CustomerService customerService = new CustomerService();
		
		
		Customer customer = customerService.findCustomer(customer_id);
		String page = "/view/error.jsp";
		if(customer == null) {
			page = "/view/error.jsp";
		}
		else {
			if(customer.getPassword().equals(customer_password)) {
				request.setAttribute("customer", customer);
				page = "/view/form.jsp";
			}
			else {
				page = "/view/error.jsp";
			}
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);	
	}

}
