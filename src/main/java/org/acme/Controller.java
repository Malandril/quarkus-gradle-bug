package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Controller {

    @Inject
    HelloService helloService;

    @GET
    @Path("/hello")
    public String hello() {
        return "hello";
    }
}
