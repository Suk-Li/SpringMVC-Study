package site.whatsblog.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/8 15:45</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        // 业务代码
        String result = "HelloSpringMVC";
        mv.addObject("msg",result);
        // 视图跳转
        mv.setViewName("test");
        return mv;
    }
}
