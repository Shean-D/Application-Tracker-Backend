package edu.icet.application_tracker.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table (name = "application")
@Getter
@Setter
public class ApplicationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Company name is required")
    @Size(min = 5, max = 100, message = "Company name must within 5 and 100 charactors" )
    private String company;

    @NotBlank
    @Size(max = 100, message = "Role must be less than 100 charactors")
    private String role;

    @NotNull
    @DateTimeFormat
    @CreatedDate
    private LocalDate appliedDate;

    @NotNull
    @Pattern(regexp = "^(APPLIED|INTERVIEW|OFFERD|REJECTED)$", message = "Status must be one of APPLIED, INTERVIEW, OFFERED, REJECTED")
    private String status;

    @NotBlank
    @Email
    private String email;


    private String note;

}
