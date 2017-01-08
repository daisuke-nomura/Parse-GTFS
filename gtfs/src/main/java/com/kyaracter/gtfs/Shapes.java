package com.kyaracter.gtfs;

import com.parse.ParseClassName;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;

@ParseClassName("shapes")
public class Shapes extends ParseObject {
    private static final String TAG = Shapes.class.getSimpleName();

    public Shapes() {
        super();
    }

    public String getShapeId() {
        return getString("shape_id");
    }

    public void setShapeId(String _shapeId) {
        put("shape_id", _shapeId);
    }

    public ParseGeoPoint getShapePtLatlon() {
        return getParseGeoPoint("shape_pt_latlon");
    }

    public void setShapePtLatlon(ParseGeoPoint _shapePtLatlon) {
        put("shape_pt_latlon", _shapePtLatlon);
    }

    public int getShapePtSequence() {
        return getInt("shape_pt_sequence");
    }

    public void setShapePtSequence(int _shapePtSequence) {
        put("shape_pt_sequence", _shapePtSequence);
    }

    public int getShapeDistTraveled() {
        return getInt("shape_dist_traveled");
    }

    public void setShapeDistTraveled(int _shapeDistTraveled) {
        put("shape_dist_traveled", _shapeDistTraveled);
    }
}
