/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.service.qualifiers;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Xavier Vergés Berga
 */
@RequestScoped
public class HelloWorldMessage implements Message {

    @Override
    public String get() {
        return "Hello World From HelloWorldMessage";
    }
    
}
