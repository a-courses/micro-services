
package com.wfh.se.api.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Current {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String observationTime;
    private Integer temperature;
    private Integer weatherCode;

    @ElementCollection(targetClass=String.class)
    private List<String> weatherIcons = null;

    @ElementCollection(targetClass=String.class)
    private List<String> weatherDescriptions = null;

    private Integer windSpeed;
    private Integer windDegree;
    private String windDir;
    private Integer pressure;
    private Integer precip;
    private Integer humidity;
    private Integer cloudCover;
    private Integer feelsLike;
    private Integer uvIndex;
    private Integer visibility;

}
