package ru.zarwlad.zarwladbot.service.utauth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zarwlad.zarwladbot.entity.utraceauth.UtAuthorization;

@Service
public class UtAuthorizationService {
    private static final Logger log = LoggerFactory.getLogger(UtAuthorizationService.class);

    @Autowired
    private UtAuthorization utAuthorization;

    public static void utAuthenticate(){

    }
}
