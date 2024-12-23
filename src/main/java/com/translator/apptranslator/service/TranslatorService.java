package com.translator.apptranslator.service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequest;
import com.translator.apptranslator.dto.Request;
import com.translator.apptranslator.dto.Response;
import com.translator.apptranslator.utils.Language;
import com.translator.apptranslator.utils.LanguageCodeFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class TranslatorService {
    @Value("${translator.api.url}")
    private String url;
    
    public Response translate(Request request) throws Exception {
        Language sourceLanguage = LanguageCodeFactory.getLanguageCode(request.getSourceLanguage());
        Language targetLanguage = LanguageCodeFactory.getLanguageCode(request.getTargetLanguage());
        HttpResponse<JsonNode> response = Unirest.get(url).queryString("client", "gtx")
                .queryString("sl", sourceLanguage.getLanCode())
                .queryString("tl", targetLanguage.getLanCode())
                .queryString("dt", "t")
                .queryString("q", request.getText()).asJson();
        return getResponse(response);
    }

    private Response getResponse(HttpResponse<JsonNode> response){
        JsonNode responseBody = response.getBody();
        return Response.builder()
                .text(responseBody.getArray().getJSONArray(0)
                        .getJSONArray(0).getString(0)).statusCode(HttpStatus.OK).build();
    }
}
