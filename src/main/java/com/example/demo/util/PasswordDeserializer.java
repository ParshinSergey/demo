package com.example.demo.util;

import com.example.demo.config.WebSecurityConfig;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

// https://stackoverflow.com/a/60995048/548473
public class PasswordDeserializer extends JsonDeserializer<String> {
    @Override
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectCodec oc = jsonParser.getCodec();
        JsonNode node = oc.readTree(jsonParser);
        String rawPassword = node.asText();
        return WebSecurityConfig.PASSWORD_ENCODER.encode(rawPassword);
    }
}
