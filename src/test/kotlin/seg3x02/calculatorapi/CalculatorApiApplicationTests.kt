package seg3x02.calculatorapi

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
class CalculatorApiApplicationTests {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun contextLoads() {
    }

    @Test
    fun testAdd() {
        mockMvc.perform(get("/calculator/add/10/2"))
            .andExpect(status().isOk)
            .andExpect(content().string("12.0"))
    }

    @Test
    fun testSubtract() {
        mockMvc.perform(get("/calculator/subtract/10/2"))
            .andExpect(status().isOk)
            .andExpect(content().string("8.0"))
    }

    @Test
    fun testMultiply() {
        mockMvc.perform(get("/calculator/multiply/10/2"))
            .andExpect(status().isOk)
            .andExpect(content().string("20.0"))
    }

    @Test
    fun testDivide() {
        mockMvc.perform(get("/calculator/divide/10/2"))
            .andExpect(status().isOk)
            .andExpect(content().string("5.0"))
    }

    @Test
    fun testDivideByZero() {
        mockMvc.perform(get("/calculator/divide/10/0"))
            .andExpect(status().isBadRequest)
            .andExpect(content().string("Unable to process request"))
    }
}
