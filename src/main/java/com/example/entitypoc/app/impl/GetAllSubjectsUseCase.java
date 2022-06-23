package com.example.entitypoc.app.impl;

import com.example.entitypoc.app.api.GetAllSubjectsInbound;
import com.example.entitypoc.app.api.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import ru.lanit.duidiligence.domainpoc.domain.Subject;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetAllSubjectsUseCase implements GetAllSubjectsInbound {

    private final SubjectRepository subjectRepository;

    @Override
    public List<Subject> execute() {
        return subjectRepository.findAll();
    }
}
