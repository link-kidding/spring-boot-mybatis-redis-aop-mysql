package website.tools;

import org.apache.tomcat.util.buf.StringUtils;

import java.util.UUID;

/**
 * Created by kidding on 2017/6/15.
 */
public class StringUtilUUID {
    public static String getStrUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }

}
