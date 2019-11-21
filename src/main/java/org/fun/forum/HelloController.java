package org.fun.forum;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangxin on 2019/11/21.
 */
@Controller
public class HelloController {

  @GetMapping("/hello")
  public String hello(@RequestParam(name = "name") String name, Model model) {
    model.addAttribute("name", name);
    return "hello";
  }
}
