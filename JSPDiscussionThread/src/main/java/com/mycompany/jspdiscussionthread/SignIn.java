/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jspdiscussionthread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.net.URL;
import java.util.Properties;
import java.util.Scanner;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import static javax.servlet.SessionTrackingMode.URL;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jeff
 */
@WebServlet(name = "SignIn", urlPatterns = {"/SignIn"})
public class SignIn extends HttpServlet {

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

        
        
        String username = request.getParameter("username");

        System.out.println(username);

        //request.setAttribute("username", username);
        //request.getRequestDispatcher("newPost.jsp").forward(request, response);
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
     
        response.sendRedirect("newPost.jsp");
 
//         = request.getSession();
        //    String formUsername = request.getParameter("username");
        //    String formPassword = request.getParameter("password");
        //  String appPath = request.getServletContext().getRealPath("");
        //   String filePath = appPath + File.separator + "login.txt";
        //    ServletContext application = request.getServletContext();
        //   InputStream inputStream = application.getResourceAsStream("/login.txt");
     /*   
         String path = getServletContext().getRealPath("/") + "myFile.txt";
         // String path = "C:\\temp\\login.txt";
        
         System.out.println("path " + path);
        
         BufferedWriter out = new BufferedWriter(new FileWriter(path));
        
         out.write("test");
         out.close();
        
        
         BufferedReader in = new BufferedReader(new FileReader(path));
        
         String read = in.readLine();
        
         System.out.println(read);
        
         // BufferedReader fr = new BufferedReader(new FileReader("C:\\temp\\login.txt"));
         */
        /*
         while (true) {
         String line = fr.readLine();
         if (line == null) {
         break;
         }
         String[] words = line.split(" ");

         System.out.println(words[0]);
         System.out.println(words[1]);
         }*/
        
        
        /*
        String username = request.getParameter("username");

        System.out.println(username);

        HttpSession session = request.getSession();
        session.setAttribute("username", username);
     
        response.sendRedirect("newPost.jsp");
 */
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
