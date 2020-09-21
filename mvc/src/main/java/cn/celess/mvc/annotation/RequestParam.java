package cn.celess.mvc.annotation;

import java.lang.annotation.*;

/**
 * @author : xiaohai
 * @date : 2020/09/11 17:23
 * @desc :
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {
    String value() default "";
}
