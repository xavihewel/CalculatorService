/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.myfirstwebapp.interceptores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Xavier Vergés Berga
 */
@Log
@RequestScoped
public class BookShow implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    public List<String> getMoviesList(String gender){
        System.out.println("getMoviesList() Method Starts Execution");
        List<String> moviesAvaiable = new ArrayList<String>();
        moviesAvaiable.add("12 Angry men");
        moviesAvaiable.add("Kings speech");
        System.out.println("getMoviesList() Method Finish Execution");
        return moviesAvaiable;
    }
    
    public Integer getDiscountedPrice(int tickedPrice){
        return tickedPrice - 50;
    }
}
