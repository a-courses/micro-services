
package com.wfh.se.api.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Location {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String country;
    private String region;
    private String lat;
    private String lon;
    private String timezoneId;
    private String localTimeDate;
    private Integer localtimeEpoch;
    private String utcOffset;
}
