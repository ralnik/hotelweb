package ru.ralnik.hotelweb.core.db.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Entity
@Table(name = "reserved")
public class Reserved {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "true")
    @Column(nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rooms_id", nullable = false)
    private Rooms room;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date enterDate;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date exitDate;

    @Column(nullable = false)
    private Integer countPerson;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date reserveDate;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "specialist_id", nullable = false)
    private Specialist specialist;

    @Column
    private String comments;
}
