package com.kyaracter.gtfs;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("trips")
public class Trips extends ParseObject {
    private static final String TAG = Trips.class.getSimpleName();

    public Trips() {
        super();
    }

    public String getRouteId() {
        return getString("route_id");
    }

    public void setRouteId(String _routeId) {
        put("route_id", _routeId);
    }

    public String getServiceId() {
        return getString("service_id");
    }

    public void setServiceId(String _serviceId) {
        put("service_id", _serviceId);
    }

    public String getTripId() {
        return getString("trip_id");
    }

    public void setTripId(String _tripId) {
        put("trip_id", _tripId);
    }

    public String getTripHeadsign() {
        return getString("trip_headsign");
    }

    public void setTripHeadsign(String _tripHeadsign) {
        put("trip_headsign", _tripHeadsign);
    }

    public String getTripShortName() {
        return getString("trip_short_name");
    }

    public void setTripShortName(String _tripShortName) {
        put("trip_short_name", _tripShortName);
    }

    public String getDirectionId() {
        return getString("direction_id");
    }

    public void setDirectionId(String _directionId) {
        put("direction_id", _directionId);
    }

    public String getBlockId() {
        return getString("block_id");
    }

    public void setBlockId(String _blockId) {
        put("block_id", _blockId);
    }

    public String getShapeId() {
        return getString("shape_id");
    }

    public void setShapeId(String _shapeId) {
        put("shape_id", _shapeId);
    }
}
