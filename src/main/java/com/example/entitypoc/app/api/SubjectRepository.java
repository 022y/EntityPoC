package com.example.entitypoc.app.api;


import ru.lanit.duidiligence.domainpoc.domain.Subject;

import java.util.List;

public interface SubjectRepository {
    void create(Subject subject);

    List<Subject> findAll();
}
