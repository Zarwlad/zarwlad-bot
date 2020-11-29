package ru.zarwlad.zarwladbot.entity.utraceauth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@AllArgsConstructor
@Component
public class UtAuthorization {
    private volatile static String accessToken;
}
