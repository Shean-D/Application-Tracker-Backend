package edu.icet.application_tracker.service.impl;

import edu.icet.application_tracker.model.dto.ApplicationDTO;
import edu.icet.application_tracker.repository.ApplicationRepository;
import edu.icet.application_tracker.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {

    final ApplicationRepository repository;



    @Override
    public List<ApplicationDTO> getAllApplications() {



        return List.of();
    }

    @Override
    public ApplicationDTO addApplication(ApplicationDTO application) {
        return null;
    }

    @Override
    public ApplicationDTO updateApplication(ApplicationDTO application) {
        return null;
    }

    @Override
    public ApplicationDTO deleteApplication(ApplicationDTO application) {
        return null;
    }
}
