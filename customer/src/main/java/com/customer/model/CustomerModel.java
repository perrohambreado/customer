package com.customer.model;

import com.customer.dto.Customer;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", columnDefinition = "varchar(80)")
    private String name;

    @Column(name = "phone", columnDefinition = "varchar(20)")
    private String phone;

    @Column(name = "email", columnDefinition = "varchar(110)")
    private String email;

    public Customer toDto() {
        return Customer.builder()
                .id(this.id)
                .name(this.name)
                .phone(this.phone)
                .email(this.email)
                .build();
    }
}