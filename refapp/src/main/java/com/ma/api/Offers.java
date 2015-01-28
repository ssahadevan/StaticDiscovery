package com.ma.api;

import javax.ws.rs.*; 
@Path("offers") 
public class Offers { 
            
           // This method is called if XML is request
           @GET
           @Produces("text/xml")
           public String listAllXml() {
           return "<?xml version=\"1.0\"?>" 
                  + "<Offers> List of offers" 
                  + "<offer><id>1</id> <name>Rolex </name> <type>Watch </type><description>A Gold plated watch</description></offer>"
                  + "<offer><id>2</id> <name>Tennis Racquet </name> <type>Sports Equipment</type><description>Autographed by Roger</description></offer>"
                  + "<offer><id>3</id> <name>Air Jordan</name> <type>Shoes </type><description>Red</description></offer>"
                  + "</Offers>";
           }

}
