package starter.main.content

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class StarterController {

    @GetMapping("/")
    @ResponseBody
    fun sayHello(): String {
        return "Hello!"
    }
}