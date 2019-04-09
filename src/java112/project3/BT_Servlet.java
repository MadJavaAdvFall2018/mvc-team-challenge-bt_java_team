package java112.project3;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * The BT_Servlet class is the controller for the Beer Tap application. It will create a list of
 * taplist data using the BT_JavaBean model and send the data to the view.
 *
 * @author jalexander1
 * @version 1.0
 * @since 04/04/2019
 *
 */
@WebServlet(
        name = "bt_servlet",
        urlPatterns = { "/beer-tap" }
)
public class BT_Servlet extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Create the taplist data
        HttpServletRequest requestData = createTapList(request);

        // Create the forwarding URL
        String url = "/BT_Taplist.jsp";

        // Forward the request to the JSP
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(requestData, response);

    }

    /**
     *
     *
     * @param request the request
     * @return the request data
     */
    public HttpServletRequest createTapList(HttpServletRequest request) {

        List<BT_JavaBean> tapList = new ArrayList<BT_JavaBean>();

        tapList.Add(new BT_JavaBean(1, "Tankard O' Ale", "Stout", 7.5, 33.4, 32,
                "A hearty blend of roasts with a caramel flavor", true));

        // Set the bean to the request
        request.setAttribute("requestData", tapList);

        return request;

    }

}
