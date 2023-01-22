package com.ardylearnsspring.currencyconversionservices;


import java.math.BigDecimal;


public class CurrencyConversion {
    private Long id;
    private String from;
    private String to;
    private BigDecimal quantity;
    private BigDecimal conversionMultiple;
    private BigDecimal toCalculatedAmount;
    private String environment;

    public CurrencyConversion() {
    }

    public CurrencyConversion(Long id,
                              String from,
                              String to,
                              BigDecimal quantity,
                              BigDecimal conversionMultiple,
                              BigDecimal toCalculatedAmount,
                              String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.conversionMultiple = conversionMultiple;
        this.toCalculatedAmount = toCalculatedAmount;
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public BigDecimal getToCalculatedAmount() {
        return toCalculatedAmount;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public void setToCalculatedAmount(BigDecimal toCalculatedAmount) {
        this.toCalculatedAmount = toCalculatedAmount;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
