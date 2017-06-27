package website.responseJson;


import org.springframework.stereotype.Component;
import website.entity.ResponseDto;
import website.enums.ResMessageEnum;

/**
 * Created by kidding on 2017/6/15.
 */
@Component
public class ResEncapsulation {
    public static ResponseDto responseDate(){
        ResponseDto responseDto = new ResponseDto(ResMessageEnum.SUCCESS);
        return responseDto;
    }
    public static ResponseDto responseDate(Object data){
        ResponseDto<Object> responseDto = new ResponseDto<Object>(ResMessageEnum.SUCCESS);
        responseDto.setData(data);
        return responseDto;
    }
    public static ResponseDto error(ResMessageEnum resMessageEnum){
        ResponseDto responseDto = new ResponseDto(ResMessageEnum.FIND_ERR);
        return responseDto;
    }
}
