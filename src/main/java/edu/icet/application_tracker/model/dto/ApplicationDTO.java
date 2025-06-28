package edu.icet.application_tracker.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationDTO {

    private Long id;

    private String company;

    private String role;

    private LocalDate appliedDate;

    private String status;

    private String email;

    private String note;
}
