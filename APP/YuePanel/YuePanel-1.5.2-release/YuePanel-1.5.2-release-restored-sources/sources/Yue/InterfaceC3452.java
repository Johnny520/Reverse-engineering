package Yue;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface InterfaceC3452 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۠۠$ۥ */
    @Target({})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0140 {
        int mask() default 0;

        @InterfaceC6391
        String name();

        int value();
    }

    @InterfaceC6391
    InterfaceC0140[] intMapping() default {};

    @InterfaceC6391
    String value();
}
