package website.enums;

/**
 * Created by kidding on 2017/6/15.
 */
public enum  ResMessageEnum {

    SUCCESS(0,"操作成功"),

    UNKNOWN_ERROR(-999,"系统未知错误"),
    TIMEOUT_ERROR(-998,"系统内部繁忙"),
    POWER_ERR(-997,"无权限"),

    LOGIN_ERR(-901,"用户名和密码不匹配"),
    TOKEN_ERR(-902,"token 错误"),

    FIND_ERR(-903,"未找到满足条件的数据"),
    INSERT_ERR(-904,"添加数据失败"),
    DELETE_ERR(-905,"删除数据失败"),
    UPDATE_ERR(-906,"更新数据失败"),

    PARAMS_MISS(-907,"参数缺失:{}"),
    ;
    private Integer code;
    private String msg;

    ResMessageEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
