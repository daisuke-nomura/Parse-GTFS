package com.kyaracter.gtfs;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("routes")
public class Routes extends ParseObject {
    private static final String TAG = Routes.class.getSimpleName();

    public String getRouteId() {
        return getString("route_id");
    }

    public void setRouteId(String _routeId) {
        put("route_id", _routeId);
    }

    public String getAgencyId() {
        return getString("agency_id");
    }

    public void setAgencyId(String _agencyId) {
        put("agency_id", _agencyId);
    }

    public String getRouteShortName() {
        return getString("route_short_name");
    }

    public void setRouteShortName(String _routeShortName) {
        put("route_short_name", _routeShortName);
    }

    public String getRouteLongName() {
        return getString("route_long_name");
    }

    public void setRouteLongName(String _routeLongName) {
        put("route_long_name", _routeLongName);
    }

    public String getRouteDesc() {
        return getString("route_desc");
    }

    public void setRouteDesc(int _routeDesc) {
        put("route_desc", _routeDesc);
    }

    public int gerRouteType() {
        return getInt("route_type");
    }

    public void serRouteType(String _routeType) {
        put("route_type", _routeType);
    }

    public String getRouteUrl() {
        return getString("route_url");
    }

    public void setRouteUrl(String _routeUrl) {
        put("route_url", _routeUrl);
    }

    public String gerRouteColor() {
        return getString("route_color");
    }

    public void serRouteColor(String _routeColor) {
        put("route_color", _routeColor);
    }

    public String getRouteTextColor() {
        return getString("route_text_color");
    }

    public void setRouteTextColor(String _routeTextColor) {
        put("route_text_color", _routeTextColor);
    }
}
