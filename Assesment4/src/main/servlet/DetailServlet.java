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
import main.servlet.modal.Details;

/**
 * Servlet implementation class DetailServlet
 */
@WebServlet("/detailServlet")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MongoDatabase db = ConnectionManager.getDb("Assement4");
		MongoCollection<Document> collection = db.getCollection("details");
//		MongoCollection<Document> collection2 = db.getCollection("Ads");
		MongoCursor<Document> cursor = collection.find().iterator();
		List<Details> data=new LinkedList<>();
		while(cursor.hasNext()) {
			Document d=(Document) cursor.next();
			Details d1=new Details(d.getString("title"),d.getString("city"),d.getString("zip"),d.getString("desc"),d.getString("email"));
			data.add(d1);
		}
		request.setAttribute("list2", data);
		request.getRequestDispatcher("second.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String title=request.getParameter("title");
		String city=request.getParameter("city");
		String zip=request.getParameter("zip");
		String desc=request.getParameter("desc");
		String email=request.getParameter("email");
		String interested=request.getParameter("int");
		String btn=request.getParameter("inta");
		
		MongoDatabase db = ConnectionManager.getDb("Assement4");
		MongoCollection<Document> collection = db.getCollection("details");
//		MongoCollection<Document> collection2 = db.getCollection("Ads");
		
		
		MongoCursor<Document> cursor = collection.find().iterator();
		List<Details>data=new LinkedList<>();
		while(cursor.hasNext()) {
			Document d=(Document) cursor.next();
			Details d2=new Details(d.getString("title"),d.getString("city"),d.getString("zip"),d.getString("desc"),d.getString("email"));
			data.add(d2);
		}
		request.setAttribute("list2", data);
		request.getRequestDispatcher("second.jsp").forward(request, response);

	}

}
