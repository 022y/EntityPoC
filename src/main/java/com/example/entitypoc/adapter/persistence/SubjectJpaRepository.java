package com.example.entitypoc.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lanit.duidiligence.domainpoc.domain.Subject;

@Repository
public interface SubjectJpaRepository extends JpaRepository<Subject, Long> {
}
