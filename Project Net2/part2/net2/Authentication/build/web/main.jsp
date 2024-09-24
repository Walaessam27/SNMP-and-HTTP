<%@ page import="java.io.BufferedReader,java.io.FileReader,java.io.IOException" %>

<%
   jsp
    String password = request.getParameter("password");
    boolean exists = false;
    String filePath = "C:\Users\DELL\Desktop\Study\Year4 Sem2 A\Network2\Project\NetHW2\part2\net2\Authentication\data.txt";
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(" ");
            if (parts[1].equals(id) && parts[2].equals(password)) {
                exists = true;
                break;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    if (exists) {
        out.println("ok");
    } else {
        out.println("no");
    }
%>
