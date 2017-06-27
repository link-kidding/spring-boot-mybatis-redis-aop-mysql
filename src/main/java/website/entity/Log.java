package website.entity;

import website.tools.StringUtilUUID;

import java.util.Date;

/**
 * Created by kidding on 2017/6/15.
 */

public class Log {
    private String id;
    private String content;
    private Date starttime;

    public Log() {
        this.id = StringUtilUUID.getStrUUID();
        this.starttime = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

}
