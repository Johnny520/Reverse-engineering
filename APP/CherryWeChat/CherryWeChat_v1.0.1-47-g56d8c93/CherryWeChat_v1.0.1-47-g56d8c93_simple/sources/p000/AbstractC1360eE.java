package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: eE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1360eE {
    /* JADX INFO: renamed from: a */
    public static void m2629a(WindowInsets r1, View r2) {
        View.OnApplyWindowInsetsListener r0 = (View.OnApplyWindowInsetsListener) r2.getTag(R.id.tag_window_insets_animation_callback);
        if (r0 == null) goto L6;
        r0.onApplyWindowInsets(r2, r1);
        return;
    }

    /* JADX INFO: renamed from: b */
    public static C0489LF m2630b(View r1, C0489LF r2, Rect r3) {
        WindowInsets r0 = r2.m945g();
        if (r0 != null) goto L5;
        r3.setEmpty();
        return r2;
    L5:
        return C0489LF.m939h(r1, r1.computeSystemWindowInsets(r0, r3));
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m2631c(View r0) {
        return r0.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m2632d(View r0) {
        return r0.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: e */
    public static float m2633e(View r0) {
        return r0.getElevation();
    }

    /* JADX INFO: renamed from: f */
    public static String m2634f(View r0) {
        return r0.getTransitionName();
    }

    /* JADX INFO: renamed from: g */
    public static float m2635g(View r0) {
        return r0.getZ();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2636h(View r0) {
        return r0.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: i */
    public static void m2637i(View r0, ColorStateList r1) {
        r0.setBackgroundTintList(r1);
    }

    /* JADX INFO: renamed from: j */
    public static void m2638j(View r0, PorterDuff.Mode r1) {
        r0.setBackgroundTintMode(r1);
    }

    /* JADX INFO: renamed from: k */
    public static void m2639k(View r0, float r1) {
        r0.setElevation(r1);
    }

    /* JADX INFO: renamed from: l */
    public static void m2640l(View r2, InterfaceC1470gt r3) {
        if (r3 == null) goto L4;
        ViewOnApplyWindowInsetsListenerC1317dE r0 = new ViewOnApplyWindowInsetsListenerC1317dE(r2, r3);
    L6:
        if (Build.VERSION.SDK_INT >= 30) goto L9;
        r2.setTag(R.id.tag_on_apply_window_listener, r0);
    L9:
        if (r2.getTag(R.id.tag_compat_insets_dispatch) == null) goto L11;
        return;
    L11:
        if (r0 == null) goto L14;
        r2.setOnApplyWindowInsetsListener(r0);
        return;
    L14:
        r2.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) r2.getTag(R.id.tag_window_insets_animation_callback));
        return;
    L4:
        r0 = null;
        goto L6
    }

    /* JADX INFO: renamed from: m */
    public static void m2641m(View r0) {
        r0.stopNestedScroll();
    }
}
