package com.ma.api;

import javax.ws.rs.*; 
@Path("payments") 
public class Payments { 
            
           // This method is called if XML is request
           @GET
           @Produces("text/xml")
           public String listAllXml() {
           return "<?xml version=\"1.0\"?>" 
                  + "<Payments> List of Payments" 
                  + "<payment><id>1</id> <merchantname>ATarget </merchantname><date>11 Jan 2015</date><time>10:30 PM</time> <item>Watch </item><description>A Gold plated watch</description></payment>"
                  + "<payment><id>2</id><merchantname>BQTrip </merchantname><date>10 Feb 2014</date><time>10:10 PM</time> <item>Fuel</item><description>Fuel</description></payment>"
                  + "<payment><id>3</id><merchantname>Target </merchantname><date>29 Dec 2014</date><time>10:20 PM</time> <item>Watch </item><description>A Gold plated watch</description></payment>"
                  + "</Payments>";
           }

}
