package com.ma.api;

import javax.ws.rs.*; 
@Path("get") 
public class HelloWorldResource { 
	    @GET 
	    @Produces("text/plain") 
	    public String get() { 
	        return "Hello - Testing the Rest API"; 
	    } 
}
