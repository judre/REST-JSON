package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import myfacade.MyFacade;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 *
 * @author andre
 */
@Path("person")
public class RESTPerson
{

    @Context
    private UriInfo context;

    Gson gson;
    MyFacade f = new MyFacade(Persistence.createEntityManagerFactory("pu"));

    public RESTPerson()
    {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }
    
    @Path("{getamount}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersonsFromAmountJson(@PathParam("getamount") int amount)
    {
        String json = gson.toJson(f.getAllPersonsFromAmount(amount));

        return Response.ok(json).build();
    }

}
