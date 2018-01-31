/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.calculatorservice.web;

import com.bonarea.calculatorservice.service.ICalculatorService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumne
 */
public class CalculatorServiceServlet extends HttpServlet {
    
    @Inject
    private ICalculatorService calculatorService;
    
    private int num1;
    private int num2;
    private String operation;

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculatorServiceServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalculatorServiceServlet at " + request.getContextPath() + "</h1>");
            out.println("<h1>operació: " + calculate() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        this.num1 = Integer.parseInt(request.getParameter("num1"));
        this.num2 = Integer.parseInt(request.getParameter("num2"));
        this.operation = request.getParameter("operation");
        processRequest(request, response);
    }
    
    private String calculate(){
        String resultText = "";
        int result = 0; 
        switch(this.operation){
            case "add":
                result = this.calculatorService.add(this.num1, this.num2);
                break;
            case "substract":
                result = this.calculatorService.substract(this.num1, this.num2);
                break;
                case "multiply":
                result = this.calculatorService.multiply(this.num1, this.num2);
                break;
                case "divide":
                result = this.calculatorService.divide(this.num1, this.num2);
                break;
        }
        resultText = String.valueOf(this.num1).concat(this.operation).concat(String.valueOf(this.num2)).concat("=").concat(String.valueOf(result));
        return resultText;
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
