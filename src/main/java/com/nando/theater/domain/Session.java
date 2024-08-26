package com.nando.theater.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Session {
    @Id
    @UuidGenerator
    private UUID id;

    private Timestamp schedule;
    private Integer seats_qtt;

    @ManyToOne
    @JoinColumn(name="movie_id")
    private Movie movie;

    @OneToMany(mappedBy = "session", fetch = FetchType.LAZY)
    private Set<Seat> seats = new HashSet<>();


}
