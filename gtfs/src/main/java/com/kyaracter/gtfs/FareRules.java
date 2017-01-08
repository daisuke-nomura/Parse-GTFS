package com.kyaracter.gtfs;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("fare_rules")
public class FareRules extends ParseObject {
    private static final String TAG = FareRules.class.getSimpleName();

    public String getFareId() {
        return getString("fare_id");
    }

    public void setFareId(String _fareId) {
        put("fare_id", _fareId);
    }

    public String getPrice() {
        return getString("route_id");
    }

    public void setPrice(String _routeId) {
        put("route_id", _routeId);
    }

    public String getOriginId() {
        return getString("origin_id");
    }

    public void setOriginId(String _originId) {
        put("origin_id", _originId);
    }

    public int getDestinationId() {
        return getInt("destination_id");
    }

    public void setDestinationId(int _destinationId) {
        put("destination_id", _destinationId);
    }

    public String getContainsId() {
        return getString("contains_id");
    }

    public void setContainsId(String _containsId) {
        put("contains_id", _containsId);
    }
}
