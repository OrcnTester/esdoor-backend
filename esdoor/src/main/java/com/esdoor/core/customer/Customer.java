package com.esdoor.core.customer;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity @Table(name = "customers")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String name;
    private String taxNumber;
    private String iban;
    private String phone;
    private String email;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
