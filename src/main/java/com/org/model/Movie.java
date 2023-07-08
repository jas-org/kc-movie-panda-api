package com.org.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
     private String movieName;
     private String ticketPrice;

}
