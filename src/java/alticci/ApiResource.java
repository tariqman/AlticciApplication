/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alticci;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import org.springframework.cache.annotation.Cacheable;

/**
 * REST Web Service
 *
 * @author Tariq
 */
@Path("api")
public class ApiResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ApiResource
     */
    public ApiResource() {
    }

    /**
     * Retrieves representation of an instance of alticci.ApiResource
     * @return an instance of java.lang.String
     */
    @Path("/alticci/{n}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Cacheable("n")
     public int alticciSequence(@PathParam("n") int n) {
           if (n == 0)
               return 0;
           else if (n == 1)
               return 1;
           else if (n == 2)
               return 1;
           else
               return alticciSequence(n-3) + alticciSequence(n-2);
    }
}
