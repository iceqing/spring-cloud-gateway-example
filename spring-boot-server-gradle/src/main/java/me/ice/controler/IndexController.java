package me.ice.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:shuiyunqing@outlook.com">ice</a>
 */
@RestController
@RequestMapping("api")
public class IndexController {

    @GetMapping("ping")
    public String index() throws InterruptedException {
        Thread.sleep(10);
        return "OK";
    }
}
