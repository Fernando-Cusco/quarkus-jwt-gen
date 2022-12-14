package cusco.mejia.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import cusco.mejia.service.JwtService;

@Path("/api/jwt")
@Produces("text/plain")
public class ProductJwtController {
    
    @Inject
    JwtService jwtService;

    @GET
    public Response getJwt() {
        String jwt = jwtService.generateJwt();
        return Response.ok(jwt).build();
    }

}
