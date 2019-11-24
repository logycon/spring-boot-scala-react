package com.logycon.hello

import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

@RestController
@RequestMapping(path = Array("/api/hello"))
class HelloController {

  @GetMapping( path = Array(""))
  def hello(): Greeting = Greeting("Hi there!")
}
