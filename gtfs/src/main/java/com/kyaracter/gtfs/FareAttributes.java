package com.kyaracter.gtfs;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("fare_attributes")
public class FareAttributes extends ParseObject {
    private static final String TAG = FareAttributes.class.getSimpleName();

    public String getFareId() {
        return getString("fare_id");
    }

    public void setFareId(String _fareId) {
        put("fare_id", _fareId);
    }

    public int getPrice() {
        return getInt("price");
    }

    public void setPrice(int _price) {
        put("price", _price);
    }

    public String getCurrencyType() {
        return getString("currency_type");
    }

    public void setCurrencyType(String _currencyType) {
        put("currency_type", _currencyType);
    }

    public int getPaymentMethod() {
        return getInt("payment_method");
    }

    public void setPaymentMethod(int _paymentMethod) {
        put("payment_method", _paymentMethod);
    }

    public int getTransfers() {
        return getInt("transfers");
    }

    public void setTransfers(int _transfers) {
        put("transfers", _transfers);
    }

    public int getTransferDuration() {
        return getInt("transfer_duration");
    }

    public void setTransferDuration(int _transferDuration) {
        put("transfer_duration", _transferDuration);
    }
}
