package ru.zarwlad.zarwladbot.dto.utauth;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonAutoDetect
public class PostAuthDto {
    private String login;
    private String password;
}
