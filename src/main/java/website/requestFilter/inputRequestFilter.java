package website.requestFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kidding on 2017/6/14.
 * 注： 这里我使用的是OncePerRequestFilter，目的是为了保证每次request 只触发一次filter
 */

public class inputRequestFilter extends OncePerRequestFilter{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain filterChain) throws ServletException, IOException {
        logger.info("logger...");
        filterChain.doFilter(req, res);
    }
}
