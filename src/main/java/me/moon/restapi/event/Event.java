package me.moon.restapi.event;

import lombok.*;


import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter @Setter @EqualsAndHashCode(of="id")
@Builder @AllArgsConstructor @NoArgsConstructor

// Builder만 있으면, 기본 생성자만 생성됨. > Target가서 컴파일된 소스코드 확인.
// Custom 애노테이션을 만들수는 있음.
// Data 애노테이션은 모든 프로터티를 다 구현하기떄문에.. 상호참조의 경우 stackoverlfow가 발생할 가능성이 있음.
@Entity
public class Event {

    @Id @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private LocalDateTime beginEnrollmentDateTime;
    private LocalDateTime closeEnrollmentDateTime;
    private LocalDateTime beginEventDateTime;
    private LocalDateTime endEventDateTime;
    private String location; // (optional) 이게 없으면 온라인 모임
    private int basePrice; // (optional)
    private int maxPrice; // (optional)
    private int limitOfEnrollment;
    private boolean offline;
    private boolean free;
    @Enumerated
    private EventStatus eventStatus;


}
