/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.myfirstwebapp.interceptores;

import java.util.Arrays;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author Xavier Vergés Berga
 */
@Interceptor
@Log
public class LoggingInterceptor {
    
    @AroundInvoke
    public Object logMethodEntry(InvocationContext ctx) throws Exception{
        System.out.println("Start Interceptor logMethodEntry");
        System.out.println("Entering method: " + ctx.getMethod().getName());
        System.out.println("Show Method Parameters Values: " +
                Arrays.toString(ctx.getParameters()));
        System.out.println("Finish Interceptor logMethodEntry");
        return ctx.proceed();
    }
    
}
