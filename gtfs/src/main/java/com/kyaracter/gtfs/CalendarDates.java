package com.kyaracter.gtfs;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("calendar_dates")
public class CalendarDates extends ParseObject {
    private static final String TAG = CalendarDates.class.getSimpleName();

    public String getServiceId() {
        return getString("service_id");
    }

    public void setServiceId(String _serviceId) {
        put("service_id", _serviceId);
    }

    public String getDate() {
        return getString("date");
    }

    public void setDate(String _date) {
        put("date", _date);
    }

    public int getDateNum() {
        return getInt("date_num");
    }

    public void setDateNum(int _dateNum) {
        put("date_num", _dateNum);
    }

    public int getExceptionType() {
        return getInt("exception_type");
    }

    public void setExceptionType(int _exceptionType) {
        put("exception_type", _exceptionType);
    }
}
