package jpabook.jpashop2.domain;

import javax.persistence.*;

@Entity
public class Delivery {
    @Id @GeneratedValue
    private Long id;

    @Embedded
    private Address address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public DeliveryStataus getDeliveryStataus() {
        return deliveryStataus;
    }

    public void setDeliveryStataus(DeliveryStataus deliveryStataus) {
        this.deliveryStataus = deliveryStataus;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    private DeliveryStataus deliveryStataus;

    @OneToOne(mappedBy = "delivery",fetch = FetchType.LAZY)
    private Order order;
}
