package Yue;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
public class C5173 implements InterfaceC5171 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final String f12215 = "GhostViewApi21";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static Class<?> f12216;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static boolean f12217;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static Method f12218;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static boolean f12219;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static Method f12220;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static boolean f12221;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final View f12222;

    public C5173(@InterfaceC6391 View view) {
        this.f12222 = view;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟ */
    public static InterfaceC5171 m1947(View view, ViewGroup viewGroup, Matrix matrix) {
        m15852();
        Method method = f12218;
        if (method != null) {
            try {
                return new C5173((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m15852() {
        if (f12219) {
            return;
        }
        try {
            m15853();
            Method declaredMethod = f12216.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f12218 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            Log.i(f12215, "Failed to retrieve addGhost method", e);
        }
        f12219 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m15853() {
        if (f12217) {
            return;
        }
        try {
            f12216 = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e) {
            Log.i(f12215, "Failed to retrieve GhostView class", e);
        }
        f12217 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m15854() {
        if (f12221) {
            return;
        }
        try {
            m15853();
            Method declaredMethod = f12216.getDeclaredMethod("removeGhost", View.class);
            f12220 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            Log.i(f12215, "Failed to retrieve removeGhost method", e);
        }
        f12221 = true;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m15855(View view) {
        m15854();
        Method method = f12220;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // Yue.InterfaceC5171
    public void setVisibility(int i) {
        this.f12222.setVisibility(i);
    }

    @Override // Yue.InterfaceC5171
    /* JADX INFO: renamed from: ۥ */
    public void mo1943(ViewGroup viewGroup, View view) {
    }
}
