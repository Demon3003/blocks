package com.zhurawell.base.api.security.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;

@Setter
@Getter
public class JwtAuthenticationException extends AuthenticationException {

    private HttpStatus httpStatus;

    private String errorCode;

    public JwtAuthenticationException(String msg) {
        this(msg, HttpStatus.UNAUTHORIZED, "401");
    }

    public JwtAuthenticationException(String msg, HttpStatus httpStatus, String errorCode) {
        super(msg);
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
    }

    public JwtAuthenticationException(String msg, Throwable cause, HttpStatus httpStatus) {
        super(msg, cause);
        this.httpStatus = httpStatus;
    }
}
