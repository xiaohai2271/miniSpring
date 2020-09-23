package cn.celess.mvc.annotation;

import java.lang.annotation.*;

/**
 * @author : xiaohai
 * @date : 2020/09/11 17:14
 * @desc :
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RestController {
    String value() default "";
}
