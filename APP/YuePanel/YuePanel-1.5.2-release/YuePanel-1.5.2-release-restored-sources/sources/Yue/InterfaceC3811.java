package Yue;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD})
@InterfaceC7157(EnumC3259.f5012)
@InterfaceC6297
@Documented
@Retention(RetentionPolicy.CLASS)
@InterfaceC7722(allowedTargets = {EnumC3260.f5024, EnumC3260.f5025, EnumC3260.f5026, EnumC3260.f5020})
public @interface InterfaceC3811 {
    int api() default -1;

    String codename() default "";

    int extension() default 0;

    int lambda() default -1;

    int parameter() default -1;
}
