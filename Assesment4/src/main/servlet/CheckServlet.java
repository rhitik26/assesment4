package main.servlet;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import main.ConnectionManager;
//import quiz.connectionManager;
import main.servlet.modal.Ads;
//import quiz.connectionManager;

/**
 * Servlet implementation class CheckServlet
 */
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		MongoDatabase db = ConnectionManager.getDb("Assement4");
		MongoCollection<Document> collection = db.getCollection("Ads");
		MongoCursor<Document> cursor = collection.find().iterator();
		List<Ads> ads=new LinkedList<>();
		while(cursor.hasNext()) {
			Document d=(Document)cursor.next();
			Ads ad=new Ads(d.getString("Category"));
			ads.add(ad);
		}
		request.setAttribute("list", ads);
		request.getRequestDispatcher("index.jsp").forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		MongoDatabase db = ConnectionManager.getDb("Assement4");
		MongoCollection<Document> collection = db.getCollection("Ads");
		String cat=request.getParameter("ad");
		Document d1=new Document("Category",cat);
		collection.insertOne(d1);
		MongoCursor<Document> cursor = collection.find().iterator();
		List<Ads>ads=new LinkedList<>();
		while(cursor.hasNext()) {
			Document d=(Document) cursor.next();
			Ads ad=new Ads(d.getString("Category"));
			ads.add(ad);
		}
		request.setAttribute("list", ads);
		request.getRequestDispatcher("second.jsp").forward(request, response);

		
	}

}
