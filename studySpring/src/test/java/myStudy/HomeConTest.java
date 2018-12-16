package myStudy;

import org.junit.Test;
import  org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import springMvc.controller.HomeController;

/**
 * @Auther: ybl
 * @Date: 2018/12/14 00145 11:15
 * @Description:
 */
public class HomeConTest {
    @Test
    public void testHome() throws Exception{
        HomeController homeController=new HomeController();
        MockMvc mockMvc=standaloneSetup(homeController).build();
        mockMvc.perform(get("/home")).andExpect(view().name("homePage"));
    }
}
 b      