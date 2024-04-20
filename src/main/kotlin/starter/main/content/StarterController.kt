package starter.main.content

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StarterController {

    @GetMapping("/")
    fun sayHello(): String {
        return "hello"
    }
}