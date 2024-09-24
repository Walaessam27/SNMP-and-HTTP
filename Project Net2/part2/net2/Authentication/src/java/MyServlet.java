import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;

@WebServlet(urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
  PrintWriter out = response.getWriter();
        try  { 
            String password= request.getParameter("password");
            String name =request.getParameter("name");
             boolean exists = isExists(password, name);
             if (exists) {
                out.println("ok");
             } else {
        out.println("no");
            }

        }catch(Exception e) {
           out.println(e.toString()) ;
        }
    }
    
    private boolean isExists(String password,String name) throws IOException {
         String filePath = getServletContext().getRealPath("/WEB-INF/data.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts[2].equals(password) && parts[0].equals(name)) {
                    return true;
                }
            }
        }

        return false;
    }
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
