package springMvc.configs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;
/**
 * @Auther: ybl
 * @Date: 2018/12/14 0014 10:17
 * @Description:
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "springMvc.controller")
public class Webconfig extends WebMvcConfigurerAdapter {
    //视图解析器
    @Bean
    public ViewResolver viewResolver(SpringTemplateEngine templateEngine) {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine);
        return viewResolver;
    }
    //模板引擎
    @Bean
    public SpringTemplateEngine templateEngine(TemplateResolver templateResolver) {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        return templateEngine;
    }
    //模板解析器
    @Bean
    public TemplateResolver templateResolver() {
        TemplateResolver templateResolver = new ServletContextTemplateResolver();
        templateResolver.setPrefix("/resources/templates");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML5");
        return templateResolver;
    }
    /* @Bean
     public ViewResolver viewResolver() {
         InternalResourceViewResolver resolver = new InternalResourceViewResolver();
         resolver.setPrefix("/web/WEB-INF/");
         resolver.setSuffix(".jsp");
         resolver.setExposeContextBeansAsAttributes(true);
        //resolver.setcl
         return resolver;
     }*/
   /* @Bean
    public ViewResolver viewResolver(SpringTemplateEngine springTemplateEngine) {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(springTemplateEngine);
        ITemplateResolver
        return viewResolver;
    }*/
  /*  @Bean
    public ServletContextTemplateResolver templateResolver(){
    TemplateResolver templateResolver=new ServletContextTemplateResolver();

        return templateResolver;
    }*/

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
