package website.entity;

import website.enums.ResMessageEnum;

/**
 * Created by kidding on 2017/6/15.
 */
public class ResponseDto<T> {
    private Integer code;
    private String msg;
    private T data;
    public ResponseDto(ResMessageEnum resMessageEnum){
        this.code = resMessageEnum.getCode();
        this.msg = resMessageEnum.getMsg();
    }

    public ResponseDto(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
