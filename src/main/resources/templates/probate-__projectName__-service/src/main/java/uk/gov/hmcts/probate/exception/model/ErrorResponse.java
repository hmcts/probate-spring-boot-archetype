package uk.gov.hmcts.probate.exception.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorResponse {
    private final int code;
    private final String error;
    private final String message;

    public ErrorResponse(int code, String error, String message) {
        this.code = code;
        this.error = error;
        this.message = message;
    }
}
