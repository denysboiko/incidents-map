package com.dceta.alertsmap;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Project {

    @Id
    @Generated
    private Long id;
    private String name;
    private String description;

}
