package website.requestFilter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;


/**
 * Created by kidding on 2017/6/14.
 */
//@Configuration
public class StarsFilterConfiguration {
     /**FilterRegistrationBean 用来配置urlpattern 来确定哪些路径触发filter */
     public FilterRegistrationBean someFilterRegistration() {

         FilterRegistrationBean registration = new FilterRegistrationBean();
         registration.setFilter(AuthFilter());
         registration.addUrlPatterns("/*");
         registration.setOrder(1);
         return registration;
     }
    /*使用annotation tag来取代<bean></bean>*/
    @Bean()
    public Filter AuthFilter() {
        return new inputRequestFilter();
    }
}
