package wasdev.sample.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().print(getMessage());
    }
    
    public static String getMessage() {
    	String str1 = "Hello World! Welcome to the Financial Advisor Site!";
    	String str2 = "A budget tells us what we can't afford, but it doesn't keep us from buying it!";
    	long time = System.currentTimeMillis();
    	if ( (time & 1) == 0 ) { 
    		return str1;
    	} else { 
    		return str2;
    	}
    }

}
