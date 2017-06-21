import dataStructure.StopsInTrip;
import dataStructure.WholeFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/")
public class Api {

    private static final Logger LOGGER = LogManager.getLogger(Api.class);

    @EJB
    private LoadDataOnStart wholeData;
    @EJB
    private RouteIdFinder data;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public WholeFile returnAllData(){
        return wholeData.getWholeFile();
    }

    @GET
    @Path("/{date}/{routeId}")
    @Produces(MediaType.APPLICATION_JSON)
    public StopsInTrip returnRouteIdByDate(@PathParam("date") String date,
                                           @PathParam("routeId") String routeId){
        LOGGER.debug("Search for data - date: {}, routeId: {}", date, routeId);
        return data.findRouteIdByDate(date, routeId);
    }
}
