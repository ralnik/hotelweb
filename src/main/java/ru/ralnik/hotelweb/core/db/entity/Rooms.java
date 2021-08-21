package ru.ralnik.hotelweb.core.db.entity;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "rooms")
@Proxy(lazy = false)
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "true")
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false)
    private Integer number;

    @Column(nullable = false)
    private Integer floor;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "roomtypes_id", nullable = false)
    private RoomTypes roomType;

    @Column
    private String comments;
}
