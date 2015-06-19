/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jspdiscussionthread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jeff
 */
@WebServlet(name = "createPost", urlPatterns = {"/createPost"})
public class createPost extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        //   String postText = (String) request.getParameter("postText");
   //     String path = getServletContext().getRealPath("/") + "myFile.txt";
        
        String path = System.getenv("OPENSHIFT_DATA_DIR") + "/" + "myFile.txt";
        if (request.getParameterMap().containsKey("postText")) {
            String username = (String) session.getAttribute("username");

            
            String timeStamp = new SimpleDateFormat("MM-dd-yyyy   HH:mm:ss").format(new Date());
            // System.out.println("Create Post user: " + user);
            //     out.println(user);
            String postText = timeStamp + "       <b>" + username + ":   </b>" + (String) request.getParameter("postText");

            // String path = "C:\\temp\\login.txt";
            //System.out.println("path " + path);
            BufferedWriter out = new BufferedWriter(new FileWriter(path, true));

            out.write(postText + "|~~");
            out.close();
        }

       //  response.sendRedirect("viewPosts.jsp");
        //    request.setAttribute("path", path);
        //    request.getRequestDispatcher("viewPosts.jsp").forward(request, response);
        //    BufferedReader in = new BufferedReader(new FileReader(path));
        //  BufferedReader br = new BufferedReader(new FileReader(path));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        StringBuffer stringBuffer = new StringBuffer();
        String line = null;

        while ((line = bufferedReader.readLine()) != null) {

            stringBuffer.append(line).append("\n");
        }

        String fileContents = stringBuffer.toString();
        //   System.out.println(stringBuffer);

        request.setAttribute("fileContents", fileContents);
        request.getRequestDispatcher("viewPosts.jsp").forward(request, response);

        String delims = "[|~~]";

        String[] postMessage = fileContents.split(delims);
        
        //      request.setAttribute("arrayLength", postMessage.length);
        //       request.getRequestDispatcher("viewPosts.jsp").forward(request, response);

        /*
         for (int i = 0; i < postMessage.length; i++) 
         {
         System.out.println(postMessage[i]);
         }
         */
//        request.setAttribute("postText", postMessage);
        //       request.getRequestDispatcher("viewPosts.jsp").forward(request, response);
        // }
        //       System.out.println("Read File: " + line);
        //  String read = in.readLine();
        //   System.out.println("Read file: " + read);
        // System.out.println(postText);
        //  HttpSession session =request.getSession();
        //    String user = (String)session.getAttribute("username");
        //   System.out.println("Create Post user: " + user);
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
