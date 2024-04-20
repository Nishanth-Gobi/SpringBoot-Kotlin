package starter.main.content

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class StarterController {

    @GetMapping("/")
    fun sayHello(): String {
        return "hello.html"
    }
}