package edu.icet.application_tracker.service;

import edu.icet.application_tracker.model.dto.ApplicationDTO;

import java.util.List;

public interface ApplicationService {

    List<ApplicationDTO>getAllApplications();

    ApplicationDTO addApplication(ApplicationDTO application);

    ApplicationDTO updateApplication(ApplicationDTO application);

    ApplicationDTO deleteApplication(ApplicationDTO application);
}
