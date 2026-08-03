package Yue;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface InterfaceC3496 {
    int order() default 0;

    EnumC3367[] value();
}
