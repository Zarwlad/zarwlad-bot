package ru.zarwlad.zarwladbot.dto.utauth;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonAutoDetect
@ToString
public class PostAuthAnswerDto {
    private String accessToken;
    private String login;
}
