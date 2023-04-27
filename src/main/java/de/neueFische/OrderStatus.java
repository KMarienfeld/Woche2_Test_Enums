package de.neueFische;

public enum OrderStatus {
    RECEIVED("Received"),
    IN_PROGRESS ("In Progress"),
    IN_DELIVERY("In Delivery"),
    COMPLETED("Completed"),
    CANCELED("Affe");

    private String beschreibung;

    private OrderStatus(String description) {
        this.beschreibung = description;
    }

    @Override
    public String toString() {
        return "OrderStatus{} " + super.toString();
    }

    public String getDescription() {
        return beschreibung;
    }

}
