package p000;

import android.content.Context;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import p000.kf1;
import p000.m00;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class yu0 {

    /* JADX INFO: renamed from: a */
    public static final yu0 f7694a = new yu0();

    /* JADX INFO: renamed from: b */
    public static final int f7695b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private yu0() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final Object m5295c(XposedInterface.Chain chain) {
        chain.getClass();
        return !f7694a.m5296d() ? chain.proceed() : Boolean.TRUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    private final boolean m5296d() {
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
            Context context = objInvoke instanceof Context ? (Context) objInvoke : null;
            if (context == null) {
                return false;
            }
            m00.C0452a c0452a = m00.f3663S;
            return context.getSharedPreferences(c0452a.m2362Y(), 0).getBoolean(c0452a.m2352O(), false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5297b(ClassLoader classLoader, Class<?> cls, String str) {
        classLoader.getClass();
        if (cls == null || str == null) {
            return;
        }
        kf1.C0391a c0391a = kf1.f3100G;
        if (c0391a.m1887b() == null) {
            return;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, null);
            kf1 kf1VarM1887b = c0391a.m1887b();
            kf1VarM1887b.getClass();
            kf1VarM1887b.hook(declaredMethod).intercept(new C0796ua(23)).getClass();
        } catch (Exception unused) {
        }
    }
}
