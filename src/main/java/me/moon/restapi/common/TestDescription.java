package me.moon.restapi.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)//에노테이션이 붙은 코드를 얼마나 오래가져갈것인가. 컴파일 이후에 가져갈 필요가 없으니 SOURCE로
public @interface TestDescription {

    String value();

}
