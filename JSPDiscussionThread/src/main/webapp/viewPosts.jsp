<%-- 
    Document   : viewPosts
    Created on : Jun 18, 2015, 4:46:45 PM
    Author     : Jeff
--%>

<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Posts</title>
    </head>
    <body style ="text-align: center;">
        <h1>Posts</h1>

        <%

        /*    BufferedReader bufferedReader = new BufferedReader(new FileReader((String) request.getAttribute("path")));

           // out.println((String) request.getAttribute("path"));
            StringBuffer stringBuffer = new StringBuffer();
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line).append("\n");
            }

            String fileContents = stringBuffer.toString();
            //   System.out.println(stringBuffer);

       //     request.setAttribute("fileContents", fileContents);
      //      request.getRequestDispatcher("viewPosts.jsp").forward(request, response);

            String delims = "[|~~]";

            String[] postMessage = fileContents.split(delims);

            for (int i = 0; i < postMessage.length; i++) {
                out.println(postMessage[i] + "<br/><br/>");
            }*/
            
            String fileContents = (String) request.getAttribute("fileContents");

            String delims = "[|~~]";
            String[] postMessage = fileContents.split(delims);
            for (int i = postMessage.length - 1; i >= 0; i--) {
                out.println(postMessage[i] + "<br/><br/>");
            }

            /* String[] postText = request.getParameterValues("postText");
            
             int arrayLength = (Integer)request.getAttribute("arrayLength");
            
             out.println("Array Length" + arrayLength + "<br\\>");
            
             out.println("Array size: " + postText.length);
             if (postText.length == 0)
             {    
             out.println("empty");
             }
                
             for (int i = 0; i < postText.length; i++) {
             out.println("i: " + i + postText[i]);
             }*/

        %>  
    </body>
</html>
