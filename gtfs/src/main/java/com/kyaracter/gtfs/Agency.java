package com.kyaracter.gtfs;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("agency")
public class Agency extends ParseObject {
    private static final String TAG = Agency.class.getSimpleName();

    public String getAgencyId() {
        return getString("agency_id");
    }

    public void setAgencyId(String _agencyId) {
        put("agency_id", _agencyId);
    }

    public String getAgencyName() {
        return getString("agency_name");
    }

    public void setAgencyName(String _agencyName) {
        put("agency_name", _agencyName);
    }

    public String getAgencyUrl() {
        return getString("agency_url");
    }

    public void setAgencyUrl(String _agencyUrl) {
        put("agency_url", _agencyUrl);
    }

    public String getAgencyTimezone() {
        return getString("agency_timezone");
    }

    public void setAgencyTimezone(String _agencyTimezone) {
        put("agency_timezone", _agencyTimezone);
    }

    public String getAgencyLang() {
        return getString("agency_lang");
    }

    public void setAgencyLang(String _agencyLang) {
        put("agency_lang", _agencyLang);
    }

    public String getAgencyPhone() {
        return getString("agency_phone");
    }

    public void setAgencyPhone(String _agencyPhone) {
        put("agency_phone", _agencyPhone);
    }

    public String getAgencyFareUrl() {
        return getString("agency_fare_url");
    }

    public void setAgencyFareUrl(String _agencyFareUrl) {
        put("agency_fare_url", _agencyFareUrl);
    }
}
