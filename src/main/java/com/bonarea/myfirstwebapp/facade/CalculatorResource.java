/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.myfirstwebapp.facade;

import com.google.gson.JsonObject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author alumne
 */
@Path("calculator")
public class CalculatorResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CalculatorResource
     */
    public CalculatorResource() {
    }

    /**
     * Retrieves representation of an instance of com.bonarea.myfirstwebapp.facade.CalculatorResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "això és una prova";
    }

    /**
     * PUT method for updating or creating an instance of CalculatorResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    
    @GET
    @Path("suma/{num1}/{num2}")
    public Response getSuma(@PathParam("num1") int num1, @PathParam("num2") int num2){
        int output = num2 + num1;
        JsonObject object = new JsonObject();
        object.addProperty("resultado", output);
        return Response.status(200).entity(object.toString()).build();
    }
}
