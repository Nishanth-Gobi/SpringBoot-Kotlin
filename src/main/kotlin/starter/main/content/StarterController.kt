package starter.main.content

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StarterController(private val starterService: StarterService) {

    @GetMapping("/")
    fun sayHello(): String {
        return starterService.getMessage()
    }
}