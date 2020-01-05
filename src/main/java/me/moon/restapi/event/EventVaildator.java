package me.moon.restapi.event;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.time.LocalDateTime;

@Component
public class EventVaildator {

    public void vaildate(EventDto eventDto, Errors errors){
        if (eventDto.getBasePrice() > eventDto.getMaxPrice() && eventDto.getMaxPrice() != 0) {
            errors.rejectValue("basePrice","wrong", "Base Price is wrong");
            errors.rejectValue("maxPrice","wrong","Max Price is wrong");

            LocalDateTime endEventDateTime = eventDto.getEndEventDateTime();
            if (endEventDateTime.isBefore(eventDto.getBeginEventDateTime()) ||
            endEventDateTime.isBefore(eventDto.getCloseEnrollmentDateTime()) ||
            endEventDateTime.isBefore(eventDto.getBeginEnrollmentDateTime())){
                errors.rejectValue("endEventDateTime","wrong");
                errors.rejectValue("beginEventDateTime","wrong");

            }
            //TODO BeginEventDateTime
            //TODO ClosedEnrollment
        }
    }
}
