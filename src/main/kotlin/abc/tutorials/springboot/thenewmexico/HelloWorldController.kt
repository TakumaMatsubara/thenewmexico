package abc.tutorials.springboot.thenewmexico

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
//クラスはRequestMapping，rootのURLを指定
class HelloWorldController {

    @GetMapping("/a")
//GetMappingはメソッドのURLを指定
    fun helloWorld(): String = "Hello, this is a REST endpoint!"

    @GetMapping("/b")
    fun goodMorning(): String = "Good morning!"


}