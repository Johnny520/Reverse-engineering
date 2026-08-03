package Yue;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥۡۦۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@InterfaceC7157(EnumC3259.f5012)
@InterfaceC6297
@Documented
@Retention(RetentionPolicy.CLASS)
@InterfaceC7722(allowedTargets = {EnumC3260.f5017, EnumC3260.f5024, EnumC3260.f5025, EnumC3260.f5026, EnumC3260.f5023, EnumC3260.f5020, EnumC3260.f5022})
public @interface InterfaceC7118 {

    /* JADX INFO: renamed from: Yue.ۥۡۦۥۨ$ۥ */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    @InterfaceC7722(allowedTargets = {EnumC3260.f5020, EnumC3260.f5024, EnumC3260.f5025, EnumC3260.f5026, EnumC3260.f5022})
    public @interface InterfaceC1175 {
        InterfaceC7118 value() default @InterfaceC7118;
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۥۨ$ۥ۟ */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    @InterfaceC7722(allowedTargets = {EnumC3260.f5020, EnumC3260.f5024, EnumC3260.f5025, EnumC3260.f5026, EnumC3260.f5022})
    public @interface InterfaceC1176 {
        InterfaceC7118 value() default @InterfaceC7118;
    }

    String[] allOf() default {};

    String[] anyOf() default {};

    boolean conditional() default false;

    String value() default "";
}
