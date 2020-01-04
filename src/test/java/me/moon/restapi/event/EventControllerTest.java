package me.moon.restapi.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest //Web과 관련된 Bean이 등록됨
public class EventControllerTest {

    @Autowired
    MockMvc mockMvc;
    //mocking되어있는 dispatcher servlet을 상대로. 가짜 servlet을 상대로 req/resp (요청을 만들고 검증)
    //slicing test (web과 관련된 테스트) // 단위테스트라고 보기에는 어려움.

    @Test
    public void createEvent() throws Exception{

        mockMvc.perform(post("/api/events/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaTypes.HAL_JSON))
                .andExpect(status().isCreated()); //201 = created

    }



}
