package Yue;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3677 {

    /* JADX INFO: renamed from: ۥ */
    public static Method f452;

    /* JADX INFO: renamed from: ۥ۟ */
    public static Method f453;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f6500;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟$ۥ */
    @InterfaceC7113(29)
    public static class C0219 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m746(Canvas canvas) {
            canvas.disableZ();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m747(Canvas canvas) {
            canvas.enableZ();
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ */
    public static void m745(@InterfaceC6391 Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                C0219.m747(canvas);
                return;
            } else {
                C0219.m746(canvas);
                return;
            }
        }
        if (i == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f6500) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                f452 = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                f453 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f6500 = true;
        }
        if (z) {
            try {
                Method method2 = f452;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        if (z || (method = f453) == null) {
            return;
        }
        method.invoke(canvas, null);
    }
}
