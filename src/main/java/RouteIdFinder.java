import dataStructure.Block;
import dataStructure.StopsInTrip;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.Map;

@Stateless
public class RouteIdFinder {

    private static final Logger LOGGER = LogManager.getLogger(RouteIdFinder.class);

    @EJB
    private LoadDataOnStart data;

    public StopsInTrip findRouteIdByDate(String date, String routeId){

        for(Map<String, Block> item : data.getWholeFile().getData()){
            if(item.containsKey(date)){
                return findRouteInDate(item.get(date), routeId);
            }
        }
        LOGGER.debug("No record found by date: {}", date);
        return null;
    }

    private StopsInTrip findRouteInDate(Block data, String routeId){
        for(StopsInTrip item : data.getStopsInTrip()){
            if(String.valueOf(item.getRouteId()).equals(routeId)){
                return item;
            }
        }
        LOGGER.debug("No record found by routeId: {}", routeId);
        return null;
    }
}
