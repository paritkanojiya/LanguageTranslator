package com.translator.apptranslator.utils;

import java.util.*;

public class LanguageCodeFactory {

    public static Language getLanguageCode(String lang) throws Exception {
        try {
            return Language.valueOf(lang);
        }
        catch (Exception e){
            throw new Exception(e);
        }
    }
}
