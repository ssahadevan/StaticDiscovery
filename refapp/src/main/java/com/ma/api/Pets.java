package com.ma.api;

import javax.ws.rs.*; 
@Path("pet") 
public class Pets { 
            
           // This method is called if XML is request
           @GET
           @Produces("text/xml")
           public String listAllXml() {
           return "<?xml version=\"1.0\"?>" 
                  + "<Pets> List of Pets" 
                  + "<pet> <name> Rex </name> <type> dog </type></pet>"
                  + "<pet> <name> Tupsy </name> <type> dog </type></pet>"
                  + "<pet> <name> Whoopi </name> <type> cat </type></pet>"
                  + "<pet> <name> Annabel </name> <type> cat </type></pet>"
                  + "<pet> <name> Tiffany </name> <type> Turtle</type></pet>"
                  + "</Pets>";
           }

}
