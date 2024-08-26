package com.nando.theater.domain;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seat {
    @Id
    @UuidGenerator
    private UUID id;

    private Integer number;

    @Nullable
    private Boolean busy;

    @Nullable
    private String name;

    @ManyToOne
    @JoinColumn(name="session_id")
    private Session session;
}
