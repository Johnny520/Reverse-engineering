package p000a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: i */
/* JADX WARN: Method from annotation default annotation not found: n */
/* JADX WARN: Method from annotation default annotation not found: s */
/* JADX INFO: renamed from: a.L4 */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC0205L4 {
    /* JADX INFO: renamed from: c */
    String m577c() default "";

    /* JADX INFO: renamed from: f */
    String m578f() default "";

    /* JADX INFO: renamed from: l */
    int[] m579l() default {};

    /* JADX INFO: renamed from: m */
    String m580m() default "";

    /* JADX INFO: renamed from: v */
    int m581v() default 1;
}
