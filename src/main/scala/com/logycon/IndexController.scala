package com.logycon

import java.nio.charset.StandardCharsets

import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Controller
import org.springframework.util.StreamUtils
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody}

@Controller
class IndexController {

  @ResponseBody
  @RequestMapping(value = Array("/"), produces = Array("text/html; charset=utf-8"))
  def index: String = {
    StreamUtils.copyToString(new ClassPathResource("public/index.html").getInputStream, StandardCharsets.UTF_8)
  }


}
