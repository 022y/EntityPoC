package com.example.entitypoc.app.impl;

import com.example.entitypoc.app.api.CreateSubjectInbound;
import com.example.entitypoc.app.api.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.lanit.duidiligence.domainpoc.domain.Subject;
import javax.transaction.Transactional;

@Component
@RequiredArgsConstructor
@Transactional
public class CreateSubjectUseCase implements CreateSubjectInbound {

    private final SubjectRepository subjectRepository;

    @Override
    public void execute(Subject subject) {
        subjectRepository.create(subject);
    }
}
