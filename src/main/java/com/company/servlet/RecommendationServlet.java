package com.company.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.company.dao.BookRecommendation;
import com.company.dao.RecommendationDAO;

/**
 * Servlet implementation class RecommendationServlet
 */
public class RecommendationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecommendationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    int year = Integer.parseInt(request.getParameter("year"));
        String genre = request.getParameter("genre");
        System.out.println(genre);
        System.out.println(year);
        RecommendationDAO recommendationDAO = new RecommendationDAO();
        List<BookRecommendation> recommendations = recommendationDAO.getRecommendations(year, genre);
        System.out.print(recommendations+ "hell");

        
        request.setAttribute("recommendations", recommendations);
        request.getRequestDispatcher("/recommendation.jsp").forward(request, response);

        
        
	}

}
