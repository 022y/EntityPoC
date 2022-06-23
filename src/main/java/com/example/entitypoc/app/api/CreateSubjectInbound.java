package com.example.entitypoc.app.api;

import ru.lanit.duidiligence.domainpoc.domain.Subject;

public interface CreateSubjectInbound {
    public void execute(Subject subject);
}
