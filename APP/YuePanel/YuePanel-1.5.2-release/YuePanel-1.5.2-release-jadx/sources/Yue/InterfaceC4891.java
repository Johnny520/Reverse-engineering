package Yue;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC4891 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6390
    public static final String f11289 = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6390
    public static final String f11290 = "this";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6390
    public static final String f11291 = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6390
    public static final String f11292 = "The return value of this method";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6390
    public static final String f11293 = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}
