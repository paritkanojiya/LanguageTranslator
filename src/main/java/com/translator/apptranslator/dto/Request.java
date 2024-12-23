package com.translator.apptranslator.dto;

import lombok.Data;

@Data
public class Request {
    private String text;
    private String sourceLanguage;
    private String targetLanguage;
}
