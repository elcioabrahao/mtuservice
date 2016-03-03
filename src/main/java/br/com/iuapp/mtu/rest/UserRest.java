package br.com.iuapp.mtu.rest;

import br.com.iuapp.mtu.service.UserService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

/**
 * Created by elcio on 03/03/16.
 */
@Path("/user")
public class UserRest {

    @GET
    @Path("/todos")
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getAllProdutos()
            throws  InstantiationException, IllegalAccessException, ClassNotFoundException {

        UserService userService = new UserService();

        return Response.ok(userService.getAllUsers()).build();
    }

}
