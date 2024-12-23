package com.translator.apptranslator.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class Response {
    private String text;
    private HttpStatus statusCode;
}
