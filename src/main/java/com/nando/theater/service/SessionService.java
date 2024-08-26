package com.nando.theater.service;


import com.nando.theater.domain.Session;
import com.nando.theater.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SessionService {
    @Autowired
    private SessionRepository sessionRepository;

    public List<Session> findAll() {
        return sessionRepository.findAll();
    }

    public Session save(Session session) {
        return sessionRepository.save(session);
    }

    public Optional<Session> findById(UUID id) {
        return sessionRepository.findById(id);
    }
}
