package com.teckiz.ecommerce.entity;

import com.teckiz.ecommerce.service.common.IdGenerator;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "entity_key")
    private String entityKey;
    @PrePersist
    public void prePersist() {
        this.entityKey = IdGenerator.generateUniqueId();
    }

    @Column(name = "created_at")
    private final LocalDateTime createdAt = LocalDateTime.now();

    public Long getId() {
        return id;
    }

    public String getEntityKey() {
        return entityKey;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
