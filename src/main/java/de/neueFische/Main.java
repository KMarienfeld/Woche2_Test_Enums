package de.neueFische;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();

        order.setOrderStatus(OrderStatus.CANCELED);


        switch (order.getOrderStatus()) {
            case COMPLETED:
                System.out.println(order.getOrderStatus());
                break;
            case IN_PROGRESS:
                System.out.println(order.getOrderStatus());
                break;
            case IN_DELIVERY:
                System.out.println(order.getOrderStatus());
                break;
            case CANCELED:
                System.out.println(order.getOrderStatus());
                break;
            default:
                System.out.println("falscher Status");
                break;
        }

        System.out.println( order.getOrderStatus().getDescription());

    }
}
