package com.customer.dto;

import com.customer.model.CustomerModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class Customer {

    private Integer id;
    private String name;
    private String phone;
    private String email;

    public CustomerModel toModel() {
        return CustomerModel.builder()
                .id(this.id)
                .name(this.name)
                .phone(this.phone)
                .email(this.email)
                .build();
    }
}