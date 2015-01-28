package com.ma.api;

import javax.ws.rs.*; 
@Path("products") 
public class Products { 
            
           // This method is called if XML is request
           @GET
           @Produces("text/xml")
           public String listAllXml() {
           return "<?xml version=\"1.0\"?>" 
                  + "<Products> List of Products" 
                  + "<product><id>1</id> <productname>IPS</productname><description>Global Processing Platform</description></product>"
                  + "<product><id>2</id><productname>MDES</productname><description>Tokenization - MasterCard Digital Enablement </description></product>"
                  + "<product><id>3</id><productname>MCBS</productname><description>Billing System</description></product>"
                  + "</Products>";
           }

}
