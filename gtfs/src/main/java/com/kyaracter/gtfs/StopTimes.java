package com.kyaracter.gtfs;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("stop_times")
public class StopTimes extends ParseObject {
    private static final String TAG = StopTimes.class.getSimpleName();

    public StopTimes() {
        super();
    }

    public String getTripId() {
        return getString("trip_id");
    }

    public void setTripId(String _tripId) {
        put("trip_id", _tripId);
    }

    public String getArrivalTime() {
        return getString("arrival_time");
    }

    public void setArrivalTime(String _arrivalTime) {
        put("arrival_time", _arrivalTime);
    }

    public String getDepartureTime() {
        return getString("departure_time");
    }

    public void setDepartureTime(String _departureTime) {
        put("departure_time", _departureTime);
    }

    public String getStopId() {
        return getString("stop_id");
    }

    public void setStopId(String _stopId) {
        put("stop_id", _stopId);
    }

    public int getStopSequence() {
        return getInt("stop_sequence");
    }

    public void setStopSequence(int _stopSequence) {
        put("stop_sequence", _stopSequence);
    }

    public String getStopHeadsign() {
        return getString("stop_headsign");
    }

    public void setStopHeadsign(String _stopHeadsign) {
        put("stop_headsign", _stopHeadsign);
    }

    public int getPickupType() {
        return getInt("pickup_type");
    }

    public void setPickupType(int _pickupType) {
        put("pickup_type", _pickupType);
    }

    public int getDropOffType() {
        return getInt("drop_off_type");
    }

    public void setDropOffType(int _dropOffType) {
        put("drop_off_type", _dropOffType);
    }

    public double getShapeDistTraveled() {
        return getDouble("shape_dist_traveled");
    }

    public void setShapeDistTraveled(double _shapeDistTraveled) {
        put("shape_dist_traveled", _shapeDistTraveled);
    }
}
