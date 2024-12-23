package com.translator.apptranslator.utils;

public enum Language {
    ENGLISH("en"),
    SPANISH("es"),
    FRENCH("fr"),
    GERMAN("de"),
    ITALIAN("it"),
    PORTUGUESE("pt"),
    ARABIC("ar"),
    CHINESE("zh"),
    RUSSIAN("ru"),
    HINDI("hi"),
    JAPANESE("ja"),
    KOREAN("ko"),
    TURKISH("tr"),
    UKRAINIAN("uk"),
    POLISH("pl"),
    DUTCH("nl");

    private final String lanCode;

    Language(String lanCode) {
        this.lanCode = lanCode;
    }

    public String getLanCode() {
        return lanCode;
    }
}
