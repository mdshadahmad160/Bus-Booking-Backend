package com.example.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketDto {

    private Long id;

    private String busCode;

    private int seatNumber;

    private boolean cancellable;

    private String journeyDate;

    private String sourceStop;

    private String destinationStop;

    private String passengerName;

    private String passengerMobileNumber;
}
