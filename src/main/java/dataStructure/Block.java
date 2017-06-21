package dataStructure;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

public class Block {


    private String lastUpdate;
    private List<StopsInTrip> stopsInTrip;

    @JsonProperty("lastUpdate")
    public String getLastUpdate() {
        return lastUpdate;
    }

    @JsonDeserialize(as=List.class)
    @JsonProperty("stopsInTrip")
    public List<StopsInTrip> getStopsInTrip() {
        return stopsInTrip;
    }
}
