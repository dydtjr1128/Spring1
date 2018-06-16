package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Order;
import service.OrderService;

/**
 * Servlet implementation class DoOrder
 */
@WebServlet("/doOrder")
public class DoOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		OrderService orderService = new OrderService();

		String page;
		if (orderService.isCardEqual(request.getParameter("cardNum"), request.getParameter("cardNumCheck"))) {
			// Same Credit Number
			page = "/view/order.jsp";

			String cardNum = orderService.checkEmpty(request.getParameter("cardNum"));
			String cardType = orderService.checkEmpty(request.getParameter("cardType"));
			String price = orderService.checkEmpty(request.getParameter("price"));
			String initial = orderService.checkEmpty(request.getParameter("initial"));
			String itemNum = orderService.checkEmpty(request.getParameter("itemNum"));
			String address = orderService.checkEmpty(request.getParameter("address"));
			String firstName = orderService.checkEmpty(request.getParameter("firstName"));
			String description = orderService.checkEmpty(request.getParameter("description"));
			String lastName = orderService.checkEmpty(request.getParameter("lastName"));

			Order order = new Order(cardNum, cardType, price, initial, itemNum, address, firstName, description, lastName);		
			
			request.setAttribute("order", order);
			RequestDispatcher dispatcher = request.getRequestDispatcher(page);
			dispatcher.forward(request, response);
		} else {
			response.getWriter().println(
					"<html><script>alert(\"Card Numbur is Empty or Not Same!\");history.back();</script></html>");

		}

	}

}
