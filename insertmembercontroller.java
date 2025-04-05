package controllers;
import java.util.Date;
import businesslogic.Booklogic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class insertmembercontroller
 */
@WebServlet("/insertmembercontroller")



public class insertmembercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public insertmembercontroller() 
    {
        super();
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//System.out.println("Insert Member Servlet");
				request.setCharacterEncoding("UTF-8"); // for suppoer farsi lang
				
				common.member m = new common.member();
				m.setMemberNO(request.getParameter("txtmno"));
				m.setName(request.getParameter("txtname"));
				m.setFamily(request.getParameter("txtfamily"));
				m.setAddress(request.getParameter("txtaddress"));
				m.setPhone(request.getParameter("txtphone"));
				m.setAge(Integer.parseInt(request.getParameter("txtage")));
				
				java.sql.Date sqlDate = new java.sql.Date(new Date().getTime());
				m.setMemdate(sqlDate);
				
				System.out.println(m.toString());
				
				
				Booklogic bl = new Booklogic();
				bl.AddMember(m);
				
				
				response.sendRedirect("insertmember.jsp?Ido=1");
				
				
				/*
				 * request.getSession().setAttribute("Books", BookEntity.selectAll());
				 * 
				 * response.sendRedirect("gLibUI/BookUI/InsertBook.jsp");
				 * 
				 * //System.out.println("OOKK");
				 */
		
		
		
		
		
		
	}

}
