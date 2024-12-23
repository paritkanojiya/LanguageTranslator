# Language Translator API

A simple language translation service that translates text between different languages. This project demonstrates how to handle translation requests and responses using Java, Spring Boot, and HTTP status codes.

## Overview

This project provides a basic framework for a translator API. It takes a text and its source language, then translates it into the target language.

### Key Classes

- **Request**: A DTO (Data Transfer Object) that contains the text to be translated, the source language, and the target language.
- **Response**: A DTO that contains the translated text and the HTTP status code.

# Request Formate
  {
    "text": "Hello, how are you?",
    "sourceLanguage": "ENGLISH",
    "targetLanguage": "HINDI"
  }
# Response Formate
  {
    "text": "नमस्ते, आप कैसे हैं?",
    "statusCode": "OK"
  }
