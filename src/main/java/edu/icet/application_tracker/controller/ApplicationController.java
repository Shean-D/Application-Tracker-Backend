package edu.icet.application_tracker.controller;

import edu.icet.application_tracker.model.dto.ApplicationDTO;
import edu.icet.application_tracker.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/application")
@RequiredArgsConstructor
public class ApplicationController {

    final ApplicationService service;

    @GetMapping
    public List<ApplicationDTO> getAllApplications() {
        return service.getAllApplications();
    }

    @PostMapping
    public ApplicationDTO addApplication(@RequestBody ApplicationDTO applicationDTO) {
        return service.addApplication(applicationDTO);
    }

    @PutMapping
    public ApplicationDTO updateApplication(@RequestBody ApplicationDTO applicationDTO){
        return service.updateApplication(applicationDTO);
    }

    @DeleteMapping
    public ApplicationDTO deleteApplication(@RequestBody ApplicationDTO applicationDTO){
        return service.deleteApplication(applicationDTO);
    }



}
