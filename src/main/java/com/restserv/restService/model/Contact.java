package com.restserv.restService.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    private Long id;
    private String name;
}
