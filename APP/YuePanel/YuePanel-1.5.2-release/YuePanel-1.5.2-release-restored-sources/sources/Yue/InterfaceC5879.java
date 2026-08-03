package Yue;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC7157(EnumC3259.f5011)
@Retention(RetentionPolicy.SOURCE)
@InterfaceC7722(allowedTargets = {EnumC3260.f5017})
public @interface InterfaceC5879 {
    boolean flag() default false;

    boolean open() default false;

    long[] value() default {};
}
