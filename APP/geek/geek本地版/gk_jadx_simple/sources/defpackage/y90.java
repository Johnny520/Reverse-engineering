package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class y90 {
    public static void a(WindowInsets r1, View r2) {
        View.OnApplyWindowInsetsListener r0 = (View.OnApplyWindowInsetsListener) r2.getTag(R.id.tag_window_insets_animation_callback);
        if (r0 == null) goto L6;
        r0.onApplyWindowInsets(r2, r1);
        return;
    }

    public static wc0 b(View r1, wc0 r2, Rect r3) {
        WindowInsets r0 = r2.f();
        if (r0 != null) goto L5;
        r3.setEmpty();
        return r2;
    L5:
        return wc0.g(r1, r1.computeSystemWindowInsets(r0, r3));
    }

    public static boolean c(View r0, float r1, float r2, boolean r3) {
        return r0.dispatchNestedFling(r1, r2, r3);
    }

    public static boolean d(View r0, float r1, float r2) {
        return r0.dispatchNestedPreFling(r1, r2);
    }

    public static boolean e(View r0, int r1, int r2, int[] r3, int[] r4) {
        return r0.dispatchNestedPreScroll(r1, r2, r3, r4);
    }

    public static boolean f(View r0, int r1, int r2, int r3, int r4, int[] r5) {
        return r0.dispatchNestedScroll(r1, r2, r3, r4, r5);
    }

    public static ColorStateList g(View r0) {
        return r0.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View r0) {
        return r0.getBackgroundTintMode();
    }

    public static float i(View r0) {
        return r0.getElevation();
    }

    public static wc0 j(View r7) {
        if (hc0.d == true) goto L5;
    L24:
        return null;
    L5:
        if (r7.isAttachedToWindow() == false) goto L24;
        Object r0 = hc0.a.get(r7.getRootView());     // Catch: IllegalAccessException -> L22
        if (r0 == null) goto L24;
        Rect r2 = (Rect) hc0.b.get(r0);     // Catch: IllegalAccessException -> L22
        Rect r02 = (Rect) hc0.c.get(r0);     // Catch: IllegalAccessException -> L22
        if (r2 == null) goto L24;
        if (r02 == null) goto L24;
        int r3 = Build.VERSION.SDK_INT;     // Catch: IllegalAccessException -> L22
        if (r3 < 30) goto L17;
        mc0 r32 = new lc0();     // Catch: IllegalAccessException -> L22
    L20:
        r32.e(ep.b(r2.left, r2.top, r2.right, r2.bottom));     // Catch: IllegalAccessException -> L22
        r32.g(ep.b(r02.left, r02.top, r02.right, r02.bottom));     // Catch: IllegalAccessException -> L22
        wc0 r03 = r32.b();     // Catch: IllegalAccessException -> L22
        r03.a.p(r03);     // Catch: IllegalAccessException -> L22
        r03.a.d(r7.getRootView());     // Catch: IllegalAccessException -> L22
        return r03;
    L17:
        if (r3 < 29) goto L19;
        r32 = new kc0();     // Catch: IllegalAccessException -> L22
        goto L20
    L19:
        r32 = new ic0();     // Catch: IllegalAccessException -> L22
    L22:
        e = move-exception;
        Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
        goto L24
    }

    public static String k(View r0) {
        return r0.getTransitionName();
    }

    public static float l(View r0) {
        return r0.getTranslationZ();
    }

    public static float m(View r0) {
        return r0.getZ();
    }

    public static boolean n(View r0) {
        return r0.hasNestedScrollingParent();
    }

    public static boolean o(View r0) {
        return r0.isImportantForAccessibility();
    }

    public static boolean p(View r0) {
        return r0.isNestedScrollingEnabled();
    }

    public static void q(View r0, ColorStateList r1) {
        r0.setBackgroundTintList(r1);
    }

    public static void r(View r0, PorterDuff.Mode r1) {
        r0.setBackgroundTintMode(r1);
    }

    public static void s(View r0, float r1) {
        r0.setElevation(r1);
    }

    public static void t(View r0, boolean r1) {
        r0.setNestedScrollingEnabled(r1);
    }

    public static void u(View r2, qw r3) {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        r2.setTag(R.id.tag_on_apply_window_listener, r3);
    L5:
        if (r3 != null) goto L8;
        r2.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) r2.getTag(R.id.tag_window_insets_animation_callback));
        return;
    L8:
        r2.setOnApplyWindowInsetsListener(new x90(r2, r3));
    }

    public static void v(View r0, String r1) {
        r0.setTransitionName(r1);
    }

    public static void w(View r0, float r1) {
        r0.setTranslationZ(r1);
    }

    public static void x(View r0, float r1) {
        r0.setZ(r1);
    }

    public static boolean y(View r0, int r1) {
        return r0.startNestedScroll(r1);
    }

    public static void z(View r0) {
        r0.stopNestedScroll();
    }
}
