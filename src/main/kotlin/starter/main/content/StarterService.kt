package starter.main.content

import org.springframework.stereotype.Service

@Service
class StarterService {
    fun getMessage(): String {
        return "hello!"
    }
}