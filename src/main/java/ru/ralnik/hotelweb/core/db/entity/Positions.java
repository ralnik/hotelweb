package ru.ralnik.hotelweb.core.db.entity;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "positions")
@Proxy(lazy = false)
public class Positions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "true")
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String comments;
}
