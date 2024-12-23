package com.translator.apptranslator.controller;

import com.translator.apptranslator.dto.Request;
import com.translator.apptranslator.dto.Response;
import com.translator.apptranslator.service.TranslatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/api/translate")
public class ApiController {

    private final TranslatorService translatorService;

    @PostMapping
    public ResponseEntity<Response> translate(@RequestBody Request request){
        try {
            Response response = translatorService.translate(request);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
