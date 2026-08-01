package p000;

import android.app.Activity;
import android.view.MotionEvent;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import p000.m00;

/* JADX INFO: renamed from: ap */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0026ap {

    /* JADX INFO: renamed from: b */
    private static long f218b = 0;

    /* JADX INFO: renamed from: c */
    private static float f219c = 0.0f;

    /* JADX INFO: renamed from: d */
    private static float f220d = 0.0f;

    /* JADX INFO: renamed from: e */
    private static final long f221e = 500;

    /* JADX INFO: renamed from: f */
    private static final float f222f = 80.0f;

    /* JADX INFO: renamed from: a */
    public static final C0026ap f217a = new C0026ap();

    /* JADX INFO: renamed from: g */
    public static final int f223g = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0026ap() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    private final void m192c(ClassLoader classLoader, String str) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Method declaredMethod = classLoader.loadClass(str).getDeclaredMethod("dispatchTouchEvent", MotionEvent.class);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
                return;
            }
            hookBuilderHook.intercept(new C0796ua(8));
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Object m193d(XposedInterface.Chain chain) {
        Object thisObject;
        m00.C0452a c0452a;
        boolean z;
        chain.getClass();
        try {
            thisObject = chain.getThisObject();
            thisObject.getClass();
            c0452a = m00.f3663S;
            z = false;
        } catch (Exception unused) {
        }
        if (!((Activity) thisObject).getSharedPreferences(c0452a.m2362Y(), 0).getBoolean(c0452a.m2384k(), false)) {
            return chain.proceed();
        }
        Object obj = chain.getArgs().get(0);
        obj.getClass();
        MotionEvent motionEvent = (MotionEvent) obj;
        int action = motionEvent.getAction();
        if (action == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (Math.abs(rawX - f219c) < f222f && Math.abs(rawY - f220d) < f222f) {
                z = true;
            }
            long j = f218b;
            if (j > 0 && jCurrentTimeMillis - j < f221e && z) {
                return Boolean.TRUE;
            }
            f218b = 0L;
        }
        if (action == 1) {
            f218b = System.currentTimeMillis();
            f219c = motionEvent.getRawX();
            f220d = motionEvent.getRawY();
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m194b(ClassLoader classLoader) {
        classLoader.getClass();
        m192c(classLoader, "com.xingin.matrix.notedetail.NoteDetailActivity");
        m192c(classLoader, "com.xingin.matrix.detail.activity.DetailFeedActivity");
    }
}
