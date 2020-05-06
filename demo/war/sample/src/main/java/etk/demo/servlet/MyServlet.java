package etk.demo.servlet;import java.io.*;import java.util.Date;import javax.servlet.*;public class MyServlet extends GenericServlet {  public void init(ServletConfig config) throws ServletException {    super.init(config);    log("MyServlet initialized at:" + new Date());  }  public void service(ServletRequest request, ServletResponse response)                          throws ServletException, IOException {    response.setContentType("text/html");    PrintWriter out = response.getWriter();    out.println("<html><head><title>" +        "Professional JSP 2, 4th Edition</title>");    out.println("<link rel=\"stylesheet\" href=\"projsp.css\"></head>");    out.println("<body><h2>" + getServletName() + "</h2>");    out.println("This is a basic servlet.<br>");    out.println("<hr></body></html>");    out.close();  }  public void destroy() {    log("MyServlet was destroyed at:" + new Date());  }}