package starter.main.content

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class StarterControllerTest(@Autowired val testRestTemplate: TestRestTemplate) {
//    Integration test
    @Test
    fun shouldReturnHello() {
        val response = testRestTemplate.getForEntity<String>("/")

        assertEquals(HttpStatus.OK, response.statusCode)
        assertEquals("hello", response.body)
    }
}