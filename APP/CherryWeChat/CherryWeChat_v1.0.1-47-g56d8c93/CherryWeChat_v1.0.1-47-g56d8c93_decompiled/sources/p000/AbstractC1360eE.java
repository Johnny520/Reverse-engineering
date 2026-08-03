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
    public static void m2629a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0489LF m2630b(View view, C0489LF c0489lf, Rect rect) {
        WindowInsets windowInsetsM945g = c0489lf.m945g();
        if (windowInsetsM945g != null) {
            return C0489LF.m939h(view, view.computeSystemWindowInsets(windowInsetsM945g, rect));
        }
        rect.setEmpty();
        return c0489lf;
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m2631c(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m2632d(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: e */
    public static float m2633e(View view) {
        return view.getElevation();
    }

    /* JADX INFO: renamed from: f */
    public static String m2634f(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: renamed from: g */
    public static float m2635g(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2636h(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: i */
    public static void m2637i(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: renamed from: j */
    public static void m2638j(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: renamed from: k */
    public static void m2639k(View view, float f) {
        view.setElevation(f);
    }

    /* JADX INFO: renamed from: l */
    public static void m2640l(View view, InterfaceC1470gt interfaceC1470gt) {
        ViewOnApplyWindowInsetsListenerC1317dE viewOnApplyWindowInsetsListenerC1317dE = interfaceC1470gt != null ? new ViewOnApplyWindowInsetsListenerC1317dE(view, interfaceC1470gt) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC1317dE);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC1317dE != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC1317dE);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m2641m(View view) {
        view.stopNestedScroll();
    }
}
