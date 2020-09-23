package cn.celess.mvc.annotation;

import java.lang.annotation.*;

/**
 * @author : xiaohai
 * @date : 2020/09/11 17:20
 * @desc :
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {
    String value() default "";
}
