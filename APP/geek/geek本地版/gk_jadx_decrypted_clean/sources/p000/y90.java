package p000;

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
    /* JADX INFO: renamed from: a */
    public static void m2655a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static wc0 m2656b(View view, wc0 wc0Var, Rect rect) {
        WindowInsets windowInsetsM2568f = wc0Var.m2568f();
        if (windowInsetsM2568f != null) {
            return wc0.m2563g(view, view.computeSystemWindowInsets(windowInsetsM2568f, rect));
        }
        rect.setEmpty();
        return wc0Var;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2657c(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2658d(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2659e(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2660f(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m2661g(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: h */
    public static PorterDuff.Mode m2662h(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: i */
    public static float m2663i(View view) {
        return view.getElevation();
    }

    /* JADX INFO: renamed from: j */
    public static wc0 m2664j(View view) {
        if (hc0.f2272d && view.isAttachedToWindow()) {
            try {
                Object obj = hc0.f2269a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) hc0.f2270b.get(obj);
                    Rect rect2 = (Rect) hc0.f2271c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i = Build.VERSION.SDK_INT;
                        mc0 lc0Var = i >= 30 ? new lc0() : i >= 29 ? new kc0() : new ic0();
                        lc0Var.mo1434e(C0195ep.m1050b(rect.left, rect.top, rect.right, rect.bottom));
                        lc0Var.mo1435g(C0195ep.m1050b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        wc0 wc0VarMo1433b = lc0Var.mo1433b();
                        wc0VarMo1433b.f4955a.mo1937p(wc0VarMo1433b);
                        wc0VarMo1433b.f4955a.mo1931d(view.getRootView());
                        return wc0VarMo1433b;
                    }
                }
            } catch (IllegalAccessException e) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static String m2665k(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: renamed from: l */
    public static float m2666l(View view) {
        return view.getTranslationZ();
    }

    /* JADX INFO: renamed from: m */
    public static float m2667m(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m2668n(View view) {
        return view.hasNestedScrollingParent();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m2669o(View view) {
        return view.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m2670p(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: q */
    public static void m2671q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: renamed from: r */
    public static void m2672r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: renamed from: s */
    public static void m2673s(View view, float f) {
        view.setElevation(f);
    }

    /* JADX INFO: renamed from: t */
    public static void m2674t(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    /* JADX INFO: renamed from: u */
    public static void m2675u(View view, InterfaceC0649qw interfaceC0649qw) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0649qw);
        }
        if (interfaceC0649qw == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new x90(view, interfaceC0649qw));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m2676v(View view, String str) {
        view.setTransitionName(str);
    }

    /* JADX INFO: renamed from: w */
    public static void m2677w(View view, float f) {
        view.setTranslationZ(f);
    }

    /* JADX INFO: renamed from: x */
    public static void m2678x(View view, float f) {
        view.setZ(f);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m2679y(View view, int i) {
        return view.startNestedScroll(i);
    }

    /* JADX INFO: renamed from: z */
    public static void m2680z(View view) {
        view.stopNestedScroll();
    }
}
