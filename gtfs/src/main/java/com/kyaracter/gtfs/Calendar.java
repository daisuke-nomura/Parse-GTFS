package com.kyaracter.gtfs;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("calendar")
public class Calendar extends ParseObject {
    private static final String TAG = Calendar.class.getSimpleName();

    public String getServiceId() {
        return getString("service_id");
    }

    public void setServiceId(String _serviceId) {
        put("service_id", _serviceId);
    }

    public int getMonday() {
        return getInt("monday");
    }

    public void setMonday(int _monday) {
        put("monday", _monday);
    }

    public int getTuesday() {
        return getInt("tuesday");
    }

    public void setTuesday(int _tuesday) {
        put("tuesday", _tuesday);
    }

    public int getWednesday() {
        return getInt("wednesday");
    }

    public void setWednesday(int _wednesday) {
        put("wednesday", _wednesday);
    }

    public int getThursday() {
        return getInt("thursday");
    }

    public void setThursday(int _thursday) {
        put("thursday", _thursday);
    }

    public int getFriday() {
        return getInt("friday");
    }

    public void setFriday(int _friday) {
        put("friday", _friday);
    }

    public int getSaturday() {
        return getInt("saturday");
    }

    public void setSaturday(int _saturday) {
        put("saturday", _saturday);
    }

    public int getSunday() {
        return getInt("sunday");
    }

    public void setSunday(int _sunday) {
        put("sunday", _sunday);
    }

    public String getStartDate() {
        return getString("start_date");
    }

    public void setStartDate(String _startDate) {
        put("start_date", _startDate);
    }

    public int getStartDateNum() {
        return getInt("start_date_num");
    }

    public void setStartDateNum(int _startDateNum) {
        put("start_date_num", _startDateNum);
    }

    public String getEndDate() {
        return getString("end_date");
    }

    public void setEndDate(String _endDate) {
        put("end_date", _endDate);
    }

    public int getEndDateNum() {
        return getInt("end_date_num");
    }

    public void setEndDateNum(int _endDateNum) {
        put("end_date_num", _endDateNum);
    }
}
