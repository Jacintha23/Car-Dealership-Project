package com.pluralsight;

public abstract class Contracts
{
    private String dateOfContract;
    private String customerName;
    private String customerEmail;
    private boolean isVehicleSold;
    private double totalPrice;
    private double monthlyPrice;

    public Contracts(String dateOfContract, String customerName, String customerEmail, boolean isVehicleSold)
    {
        this.dateOfContract = dateOfContract;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.isVehicleSold = isVehicleSold;
    }

    public String getDateOfContract() {
        return dateOfContract;
    }

    public void setDateOfContract(String dateOfContract) {
        this.dateOfContract = dateOfContract;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public boolean isVehicleSold() {
        return isVehicleSold;
    }

    public void setVehicleSold(boolean vehicleSold) {
        isVehicleSold = vehicleSold;
    }

    public abstract double getTotalPrice();
    public abstract double getMonthlyPayment();


}
