package com.kyaracter.gtfs;

import com.parse.ParseClassName;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;

@ParseClassName("stops")
public class Stops extends ParseObject {
    private static final String TAG = Stops.class.getSimpleName();

    public Stops() {
        super();
    }

    public String getStopId() {
        return getString("stop_id");
    }

    public void setStopId(String _stopId) {
        put("stop_id", _stopId);
    }

    public String getStopCode() {
        return getString("stop_code");
    }

    public void setStopCode(String _stopCode) {
        put("stop_code", _stopCode);
    }

    public String getStopName() {
        return getString("stop_name");
    }

    public void setStopName(String _stopName) {
        put("stop_name", _stopName);
    }

    public String getStopDesc() {
        return getString("stop_desc");
    }

    public void setStopDesc(String _stopDesc) {
        put("stop_desc", _stopDesc);
    }

    public ParseGeoPoint getStopLatLon() {
        return getParseGeoPoint("stop_latlon");
    }

    public void setStopLatLon(ParseGeoPoint _stopLatLon) {
        put("stop_latlon", _stopLatLon);
    }

    public String getZoneId() {
        return getString("zone_id");
    }

    public void setZoneId(String _zoneId) {
        put("zone_id", _zoneId);
    }

    public String getStopUrl() {
        return getString("stop_url");
    }

    public void setStopUrl(String _stopUrl) {
        put("stop_url", _stopUrl);
    }

    public String getLocationType() {
        return getString("location_type");
    }

    public void setLocationType(String _locationType) {
        put("location_type", _locationType);
    }

    public String getParentStation() {
        return getString("parent_station");
    }

    public void setParentStation(String _parentStation) {
        put("parent_station", _parentStation);
    }

    public String getStopTimezone() {
        return getString("stop_timezone");
    }

    public void setStopTimezone(String _stopTimezone) {
        put("stop_timezone", _stopTimezone);
    }

    public int getWheelchairBoarding() {
        return getInt("wheelchair_boarding");
    }

    public void setWheelchairBoarding(int _wheelchairBoarding) {
        put("wheelchair_boarding", _wheelchairBoarding);
    }
}
