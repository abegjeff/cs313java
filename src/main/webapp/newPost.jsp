<%-- 
    Document   : newPost
    Created on : Jun 18, 2015, 4:39:40 PM
    Author     : Jeff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <link rel="stylesheet" href="new.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Post</title>
    </head>
    <body style="text-align: center;">
        <h1>Create A New Post</h1>



        <form action="createPost" method="POST">
            <textarea rows="4" cols="50" name ="postText"></textarea><br/>
            <input type="submit" value="Submit" />
        </form>
        <br/>
        <a href='createPost'>View Posts</a>

        <%

        // String user = (String)session.getAttribute("username");
            //System.out.println("Create Post user: " + user);
            //    out.println(user);
%>
    </body>
</html>
