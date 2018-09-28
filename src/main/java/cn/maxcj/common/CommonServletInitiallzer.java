package cn.maxcj.common;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * @author Maxcj
 * @date 2018-09-28-0028
 * 在Web容器中部署
 */
public class CommonServletInitiallzer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CommonApplication.class);
    }
}
