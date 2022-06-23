package com.example.entitypoc.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "process")
public class Process {
    @Id
    private Long id;
}
