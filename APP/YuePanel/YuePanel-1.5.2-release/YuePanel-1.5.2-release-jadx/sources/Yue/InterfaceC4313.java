package Yue;

import com.android.p001dx.rop.code.RegisterSpec;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE})
@InterfaceC7470(version = "1.3")
@Retention(RetentionPolicy.RUNTIME)
@InterfaceC7722(allowedTargets = {EnumC3260.f5016})
public @interface InterfaceC4313 {
    @InterfaceC5572(name = "c")
    /* JADX INFO: renamed from: c */
    String m1272c() default "";

    @InterfaceC5572(name = "f")
    /* JADX INFO: renamed from: f */
    String m1273f() default "";

    @InterfaceC5572(name = "i")
    /* JADX INFO: renamed from: i */
    int[] m1274i() default {};

    @InterfaceC5572(name = "l")
    /* JADX INFO: renamed from: l */
    int[] m1275l() default {};

    @InterfaceC5572(name = C6597.f2164)
    /* JADX INFO: renamed from: m */
    String m1276m() default "";

    @InterfaceC5572(name = "n")
    /* JADX INFO: renamed from: n */
    String[] m1277n() default {};

    @InterfaceC5572(name = "s")
    /* JADX INFO: renamed from: s */
    String[] m1278s() default {};

    @InterfaceC5572(name = RegisterSpec.PREFIX)
    /* JADX INFO: renamed from: v */
    int m1279v() default 1;
}
