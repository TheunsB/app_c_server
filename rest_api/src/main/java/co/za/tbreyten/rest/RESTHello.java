package co.za.tbreyten.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/**
 * Created by theunsb on 16/07/13.
 */
@Path("/")
public class RESTHello {
    @GET
    @Produces("text/html")
    public Response getStartingPage(@Context SecurityContext sc) {

        if (!sc.isUserInRole("admin")) {
            throw new SecurityException();
        }

        String output = "<h1>Welcome to appC<h1>" +
                "<p>RESTful Service is running ... <br>Ping @ " + new Date().toString() + "</p<br>";
        return Response.status(200).entity(output).build();
    }
}
