package loopSQL.dto;

import java.util.Date;

public class Order {

    int orderId;

    int orderMemberId;

    Date orderDate;

    int orderItemId;

    int orderQuantity;

    public int getOrderId() {
        return orderId;
    }

    public int getOrderMemberId() {
        return orderMemberId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }
}
