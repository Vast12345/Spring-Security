package com.securityspring.app_security.domain.dtos;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiError {
    private String backedMessage;

    private String message;
    private int httpCode;

    private LocalDateTime time;
}
