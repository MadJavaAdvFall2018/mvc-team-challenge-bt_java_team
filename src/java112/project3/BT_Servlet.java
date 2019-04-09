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
    * The createTapList method will create a list of TapList beans, instantiate several
    * new tap list items and add them to the list. It will then set the list to the request.
    *
    * @param request the request
    * @return the request data
    */
    public HttpServletRequest createTapList(HttpServletRequest request) {

        List<BT_JavaBean> tapList = new ArrayList<BT_JavaBean>();

        BT_JavaBean tapOne = new BT_JavaBean(1, "Tankard O' Ale", "Stout", 7.5, 33.4, 32,
               "A hearty blend of roasts with a caramel flavor", true);
       tapList.add(tapOne);

       BT_JavaBean tapTwo = new BT_JavaBean(2, "Dark Vader",
               "Dark IPA", 9.2, 59.5, 36,
               "Dark Ale with a robust flavor mix", false);
       tapList.add(tapTwo);

       BT_JavaBean tapThree = new BT_JavaBean(3, "Caribou Slobber",
               "American Brown Ale", 5.9, 15.5, 19,
               "Clone of Moose Drool", false);
       tapList.add(tapThree);

       BT_JavaBean tapFour = new BT_JavaBean(4, "Top O' Da Mornin Vanilla Stout",
               "Stout", 6.2, 23.5, 28,
               "Classic Irish Stout with vanilla flavor", true);
       tapList.add(tapFour);

       BT_JavaBean tapFive = new BT_JavaBean(5, "Holiday Ale",
               "American Specialty", 5.2, 14, 12,
               "Clone of Great Lakes Christmas Ale", false);
       tapList.add(tapFive);

       BT_JavaBean tapSix = new BT_JavaBean(6, "Lando's Cherries on a Cloud",
               "American Pale Ale", 4.9, 9.1, 6,
               "Ale with a strawberry flavor", true);
       tapList.add(tapSix);


        // Set the bean to the request
        request.setAttribute("requestData", tapList);

        return request;

    }

}
