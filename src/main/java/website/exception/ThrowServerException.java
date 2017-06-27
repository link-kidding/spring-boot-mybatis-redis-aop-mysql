package website.exception;

import website.enums.ResMessageEnum;

/**
 * Created by kidding on 2017/6/15.
 */
public class ThrowServerException extends  RuntimeException{
    private ResMessageEnum resMessageEnum;
    private String msg;

    public ThrowServerException(ResMessageEnum resMessageEnum) {
        super(resMessageEnum.getMsg());
        this.resMessageEnum = resMessageEnum;
    }
    public ResMessageEnum getMessageEnum() {
        return resMessageEnum;
    }
    public String getMsg(String msg){
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
