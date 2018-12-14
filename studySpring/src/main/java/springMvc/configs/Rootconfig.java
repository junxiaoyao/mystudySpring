package springMvc.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Auther: ybl
 * @Date: 2018/12/14 0014 10:16
 * @Description:
 */
@ComponentScan(basePackages = {"springMvc.service","springMvc.dao"},
        excludeFilters = {@Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class Rootconfig {
}
