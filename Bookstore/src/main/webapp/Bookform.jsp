<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "net.codejava.javaee.Book" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Books Store Application</title>
</head>
<body>
    <center>
        <h1>Books Form</h1>
        <h2>
            <a href="new">Add New Book</a>
            &nbsp;&nbsp;&nbsp;
            <a href="list">List All Books</a>

        </h2>
    </center>
    <div align="center">
        <% Book book = (Book)request.getAttribute("book");
        if (book != null){ %>
            <form action="update" method="post">
        <% } else{ %>
            <form action="insert" method="post">
         <% } %>
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    <% if (book != null){ %>
                        Edit Book
                    <% } else { %>
                        Add New Book
                    <% } %>
                </h2>
            </caption>
                <% if (book != null) { %>
                    <input type="hidden" name="id" value=" <%= book.getId() %>" />
                <% } %>
            <tr>
                <th>Title: </th>
                <td>
                    <input type="text" name="title" size="45"
                            <% if (book != null){ %>
                            value="<%=book.getTitle() %>"
                            <% } %>
                        />
                </td>
            </tr>
            <tr>
                <th>Author: </th>
                <td>
                    <input type="text" name="author" size="45"
                            <% if (book != null){ %>
                                                        value="<%=book.getAuthor() %>"
                                                        <% } %>
                    />
                </td>
            </tr>
            <tr>
                <th>Price: </th>
                <td>
                    <input type="text" name="price" size="5"
                            <% if (book != null){ %>
                                                        value="<%=book.getPrice() %>"
                                                        <% } %>
                    />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save" />
                </td>
            </tr>
        </table>
        </form>
    </div>
</body>
</html>