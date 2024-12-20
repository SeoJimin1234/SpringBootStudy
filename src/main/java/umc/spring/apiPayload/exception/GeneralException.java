package umc.spring.apiPayload.exception;

import lombok.*;
import umc.spring.apiPayload.code.*;

@Getter
@AllArgsConstructor

public class GeneralException extends RuntimeException{
    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason() {
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}
