import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DBCustomerServlet", value = "/")
public class DBCustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DBCustomer dbcustomer = DBCustomer.getDbCustomer();
        List<Customer> list = dbcustomer.getCustomerList();

        request.setAttribute("DBCus", list);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");

        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
