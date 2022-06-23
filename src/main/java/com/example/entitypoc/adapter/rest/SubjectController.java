package com.example.entitypoc.adapter.rest;

import com.example.entitypoc.app.api.CreateSubjectInbound;
import com.example.entitypoc.app.api.GetAllSubjectsInbound;
import com.example.pojopoc.domain.PojoSubject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.lanit.duidiligence.domainpoc.domain.Subject;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class SubjectController {

    private final CreateSubjectInbound createSubjectInbound;
    private final GetAllSubjectsInbound getAllSubjectsInbound;

    @GetMapping("/subject")
    @ResponseStatus(HttpStatus.OK)
    public List<Subject> getSubject(){
        List<Subject> subjects = getAllSubjectsInbound.execute();
        log.info(subjects.toString());
        return subjects;
    }

    @PostMapping("/subject")
    @ResponseStatus(HttpStatus.CREATED)
    public void createSubject(@RequestParam Long id){
        createSubjectInbound.execute(new Subject(id));
    }

    @GetMapping("/pojoSubject")
    @ResponseStatus(HttpStatus.OK)
    public PojoSubject pojoSubject(){
        PojoSubject pojoSubject = new PojoSubject(666L);
        return pojoSubject;
    }

}
