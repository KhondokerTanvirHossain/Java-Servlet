/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-22 04:19:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import net.codejava.javaee.Book;

public final class Bookform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Books Store Application</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Books Form</h1>\n");
      out.write("        <h2>\n");
      out.write("            <a href=\"new\">Add New Book</a>\n");
      out.write("            &nbsp;&nbsp;&nbsp;\n");
      out.write("            <a href=\"list\">List All Books</a>\n");
      out.write("\n");
      out.write("        </h2>\n");
      out.write("    </center>\n");
      out.write("    <div align=\"center\">\n");
      out.write("        ");
 Book book = (Book)request.getAttribute("book");
        if (book != null){ 
      out.write("\n");
      out.write("            <form action=\"update\" method=\"post\">\n");
      out.write("        ");
 } else{ 
      out.write("\n");
      out.write("            <form action=\"insert\" method=\"post\">\n");
      out.write("         ");
 } 
      out.write("\n");
      out.write("        <table border=\"1\" cellpadding=\"5\">\n");
      out.write("            <caption>\n");
      out.write("                <h2>\n");
      out.write("                    ");
 if (book != null){ 
      out.write("\n");
      out.write("                        Edit Book\n");
      out.write("                    ");
 } else { 
      out.write("\n");
      out.write("                        Add New Book\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </h2>\n");
      out.write("            </caption>\n");
      out.write("                ");
 if (book != null) { 
      out.write("\n");
      out.write("                    <input type=\"hidden\" name=\"id\" value=\" ");
      out.print( book.getId() );
      out.write("\" />\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th>Title: </th>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"title\" size=\"45\"\n");
      out.write("                            ");
 if (book != null){ 
      out.write("\n");
      out.write("                            value=\"");
      out.print(book.getTitle() );
      out.write("\"\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                        />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Author: </th>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"author\" size=\"45\"\n");
      out.write("                            ");
 if (book != null){ 
      out.write("\n");
      out.write("                                                        value=\"");
      out.print(book.getAuthor() );
      out.write("\"\n");
      out.write("                                                        ");
 } 
      out.write("\n");
      out.write("                    />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Price: </th>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"price\" size=\"5\"\n");
      out.write("                            ");
 if (book != null){ 
      out.write("\n");
      out.write("                                                        value=\"");
      out.print(book.getPrice() );
      out.write("\"\n");
      out.write("                                                        ");
 } 
      out.write("\n");
      out.write("                    />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" align=\"center\">\n");
      out.write("                    <input type=\"submit\" value=\"Save\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
