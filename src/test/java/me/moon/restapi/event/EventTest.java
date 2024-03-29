package me.moon.restapi.event;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class EventTest {

    @Test
    public void builder(){
        Event event = Event.builder()
                .name("Inflearn spring")
                .description("Rest API")
                .build();
        assertThat(event).isNotNull();

    }

    @Test
    public void javaBean(){
        //Given
        String name = "Event";
        String description = "Spring";

        //When
        Event event = new Event();
        event.setName(name);
        event.setDescription(description);

        //Then
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);
    }

}