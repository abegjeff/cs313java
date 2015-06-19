<%-- 
    Document   : newPost
    Created on : Jun 18, 2015, 4:39:40 PM
    Author     : Jeff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Post</title>
    </head>
    <body style="text-align: center;">
        <h1>Create A New Post</h1>

        <a href='createPost'>View Posts</a>

        <form action="createPost" method="POST">
            <textarea rows="4" cols="50" name ="postText"></textarea>
            <input type="submit" value="Submit" />
        </form>


        <%

        // String user = (String)session.getAttribute("username");
            //System.out.println("Create Post user: " + user);
            //    out.println(user);
        %>
    </body>
</html>
