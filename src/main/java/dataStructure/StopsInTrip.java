package dataStructure;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class StopsInTrip {

    private Long routeId;
    private Long tripId;
    private Long stopId;
    private int stopSequence;
    private int agencyId;
    private int topologyVersionId;
    private Date tripActivationDate;
    private Date stopActivationDate;

    @JsonProperty("routeId")
    public Long getRouteId() {
        return routeId;
    }

    @JsonProperty("tripId")
    public Long getTripId() {
        return tripId;
    }

    @JsonProperty("stopId")
    public Long getStopId() {
        return stopId;
    }

    @JsonProperty("stopSequence")
    public int getStopSequence() {
        return stopSequence;
    }

    @JsonProperty("agencyId")
    public int getAgencyId() {
        return agencyId;
    }

    @JsonProperty("topologyVersionId")
    public int getTopologyVersionId() {
        return topologyVersionId;
    }

    @JsonProperty("tripActivationDate")
    public Date getTripActivationDate() {
        return tripActivationDate;
    }

    @JsonProperty("stopActivationDate")
    public Date getStopActivationDate() {
        return stopActivationDate;
    }
}
