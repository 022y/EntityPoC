package com.example.entitypoc.adapter.persistence;

import com.example.entitypoc.app.api.SubjectRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.lanit.duidiligence.domainpoc.domain.Subject;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class SubjectRepositoryImpl implements SubjectRepository {

    private final SubjectJpaRepository subjectJpaRepository;

    @Override
    public void create(Subject subject) {
        log.info("Saving subject");
        subjectJpaRepository.save(subject);
    }

    @Override
    public List<Subject> findAll() {
        log.info("Getting subjects");
        return subjectJpaRepository.findAll();
    }
}
