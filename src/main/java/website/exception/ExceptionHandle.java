package website.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import website.entity.ResponseDto;
import website.responseJson.ResEncapsulation;

/**
 * Created by kidding on 2017/6/16.
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseDto handle(Exception e){
        ThrowServerException serverException = (ThrowServerException) e;
        return ResEncapsulation.error(serverException.getMessageEnum());
    }
}
