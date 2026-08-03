package Yue;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@InterfaceC7470(version = "1.4")
@InterfaceC6297
@Documented
@Retention(RetentionPolicy.RUNTIME)
@InterfaceC7722(allowedTargets = {EnumC3260.f5016, EnumC3260.f5024, EnumC3260.f5019, EnumC3260.f5017, EnumC3260.f5023, EnumC3260.f5026, EnumC3260.f5025, EnumC3260.f5030})
public @interface InterfaceC4374 {
    String errorSince() default "";

    String hiddenSince() default "";

    String warningSince() default "";
}
