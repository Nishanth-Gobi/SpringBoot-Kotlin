package starter.main.content

import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
class StarterControllerTest(@Autowired val mockMvc: MockMvc) {
//    Integration test
    @MockBean
    private lateinit var starterService: StarterService

    @Test
    fun shouldReturnHello() {

        `when`(starterService.getMessage()).thenReturn("hello!")

        this.mockMvc.perform(MockMvcRequestBuilders.get("/"))
            .andDo(print())
            .andExpect(status().isOk)
            .andExpect(content().string("hello!"))
    }
}