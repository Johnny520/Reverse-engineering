package p265s1;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: s1.l1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7103l1 {

    /* JADX INFO: renamed from: b */
    public static Method f23603b;

    /* JADX INFO: renamed from: c */
    public static Method f23604c;

    /* JADX INFO: renamed from: d */
    public static boolean f23605d;

    /* JADX INFO: renamed from: a */
    public static final C7103l1 f23602a = new C7103l1();

    /* JADX INFO: renamed from: e */
    public static final int f23606e = 8;

    /* JADX INFO: renamed from: a */
    public final void m27987a(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            C7118o1.f23628a.m28052a(canvas, z10);
            return;
        }
        if (!f23605d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f23603b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f23604c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f23603b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f23604c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f23603b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f23604c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f23605d = true;
        }
        if (z10) {
            try {
                Method method4 = f23603b;
                if (method4 != null) {
                    method4.getClass();
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f23604c) == null) {
            return;
        }
        method.getClass();
        method.invoke(canvas, null);
    }
}
