package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۢۤۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C8370 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3440 = "ViewUtils";

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean f3441;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Method f24971;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC3811(api = 27)
    public static final boolean f24972;

    /* JADX INFO: renamed from: Yue.ۥۢۤۧۨ$ۥ */
    @InterfaceC7113(29)
    public static class C1507 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4345(@InterfaceC6391 View view, @InterfaceC6391 Rect rect, @InterfaceC6391 Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }

    static {
        f24972 = Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m4343(@InterfaceC6391 View view, @InterfaceC6391 Rect rect, @InterfaceC6391 Rect rect2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1507.m4345(view, rect, rect2);
            return;
        }
        if (!f3441) {
            f3441 = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f24971 = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f24971.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
        Method method = f24971;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m4344(View view) {
        return view.getLayoutDirection() == 1;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m27930(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
    }
}
