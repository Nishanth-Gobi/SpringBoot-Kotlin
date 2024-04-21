package starter.main.content

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(StarterController::class, StarterService::class)
class StarterControllerTest(@Autowired val mockMvc: MockMvc) {
//  Integration test

    @Test
    fun shouldReturnHello() {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/"))
            .andDo(print())
            .andExpect(status().isOk)
            .andExpect(content().string("hello!"))
    }
}