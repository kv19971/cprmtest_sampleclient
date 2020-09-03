package com.example.consumerExample.dto;

public class CustomerNavUpdate<T> {
    private T payload;
    private Long timestamp;
    private Long customerId;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public CustomerNavUpdate(Long customerId, T payload, Long timestamp) {
        this.payload = payload;
        this.timestamp = timestamp;
        this.customerId = customerId;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "CustomerNavUpdate{" +
                "customerid=" + customerId +
                "payload=" + payload.toString() +
                ", timestamp=" + timestamp +
                '}';
    }
}
