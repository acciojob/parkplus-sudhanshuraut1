package com.driver.model;

import org.springframework.boot.test.autoconfigure.data.cassandra.DataCassandraTest;

import javax.persistence.*;

@Entity
@Table(name = "Parking_lot")
public class ParkingLot {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id ;

}
