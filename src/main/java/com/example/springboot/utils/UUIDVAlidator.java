package com.example.springboot.utils;

import java.util.UUID;
import java.util.regex.Pattern;

public class UUIDVAlidator {
public  static final Pattern UUID_PATTERN = Pattern.compile(
            "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$",
                  Pattern.CASE_INSENSITIVE
);
public static  boolean isValidUUID(String id){
    return  UUID_PATTERN.matcher(id).matches();
}

}

