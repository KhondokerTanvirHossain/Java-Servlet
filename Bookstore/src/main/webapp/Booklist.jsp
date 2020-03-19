<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.List"
    import = "net.codejava.javaee.Book"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Books Store Application</title>
</head>
<body>
    <% List<Book> listBook = (List<Book>) request.getAttribute("listBook");
        int s = listBook.size();

    %>
    <center>
        <h1>Books Management</h1>
        <h2>
            <a href="Bookstore/new">Add New Book</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/list">List All Books</a>

        </h2>
    </center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Books</h2></caption>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Price</th>
                <th>Actions</th>
            </tr>
            <% for(Book bk : listBook){ %>
                <tr>
                                <td><%=bk.getId() %></td>
                                <td><%=bk.getTitle() %></td>
                                <td><%=bk.getAuthor() %></td>
                                <td><%=bk.getPrice() %></td>
                                <td>
                                    <a href="/edit?id=<%= bk.getId() %>">Edit</a>
                                    &nbsp;&nbsp;&nbsp;&nbsp;
                                    <a href="/delete?id=<%= bk.getId() %>">Delete</a>
                                </td>
                 </tr>
             <%}%>

        </table>
    </div>
</body>
</html>