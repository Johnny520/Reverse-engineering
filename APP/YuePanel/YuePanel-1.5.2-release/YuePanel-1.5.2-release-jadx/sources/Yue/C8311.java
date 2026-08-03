package Yue;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۢۤۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8311 {

    /* JADX INFO: renamed from: ۥ */
    public static boolean f3400 = true;

    /* JADX INFO: renamed from: ۥ۟ */
    public static Method f3401;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f24803;

    /* JADX INFO: renamed from: Yue.ۥۢۤۥۧ$ۥ */
    @InterfaceC7113(29)
    public static class C1482 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m4295(ViewGroup viewGroup, int i) {
            return viewGroup.getChildDrawingOrder(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m4296(ViewGroup viewGroup, boolean z) {
            viewGroup.suppressLayout(z);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static int m4293(@InterfaceC6391 ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C1482.m4295(viewGroup, i);
        }
        if (!f24803) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f3401 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f24803 = true;
        }
        Method method = f3401;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m4294(@InterfaceC6391 ViewGroup viewGroup, boolean z) {
        if (f3400) {
            try {
                C1482.m4296(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f3400 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m27700(@InterfaceC6391 ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1482.m4296(viewGroup, z);
        } else {
            m4294(viewGroup, z);
        }
    }
}
