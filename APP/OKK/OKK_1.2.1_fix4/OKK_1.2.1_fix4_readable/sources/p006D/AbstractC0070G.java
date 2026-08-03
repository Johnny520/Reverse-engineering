package p006D;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import org.luckypray.dexkit.C1031R;
import p085v.C1102c;

/* JADX INFO: renamed from: D.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0070G {
    /* JADX INFO: renamed from: a */
    public static void m211a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C1031R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0122q0 m212b(View view, C0122q0 c0122q0, Rect rect) {
        WindowInsets windowInsetsM431c = c0122q0.m431c();
        if (windowInsetsM431c != null) {
            return C0122q0.m429d(view, view.computeSystemWindowInsets(windowInsetsM431c, rect));
        }
        rect.setEmpty();
        return c0122q0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m213c(View view, float f2, float f3, boolean z2) {
        return view.dispatchNestedFling(f2, f3, z2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m214d(View view, float f2, float f3) {
        return view.dispatchNestedPreFling(f2, f3);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m215e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m216f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m217g(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: h */
    public static PorterDuff.Mode m218h(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: i */
    public static float m219i(View view) {
        return view.getElevation();
    }

    /* JADX INFO: renamed from: j */
    public static C0122q0 m220j(View view) {
        if (!AbstractC0098e0.f256d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = AbstractC0098e0.f253a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) AbstractC0098e0.f254b.get(obj);
            Rect rect2 = (Rect) AbstractC0098e0.f255c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            AbstractC0106i0 c0104h0 = i2 >= 30 ? new C0104h0() : i2 >= 29 ? new C0102g0() : new C0100f0();
            c0104h0.mo363e(C1102c.m2598b(rect.left, rect.top, rect.right, rect.bottom));
            c0104h0.mo364g(C1102c.m2598b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            C0122q0 c0122q0Mo362b = c0104h0.mo362b();
            c0122q0Mo362b.f309a.mo386p(c0122q0Mo362b);
            c0122q0Mo362b.f309a.mo380d(view.getRootView());
            return c0122q0Mo362b;
        } catch (IllegalAccessException e2) {
            e2.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m221k(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: renamed from: l */
    public static float m222l(View view) {
        return view.getTranslationZ();
    }

    /* JADX INFO: renamed from: m */
    public static float m223m(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m224n(View view) {
        return view.hasNestedScrollingParent();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m225o(View view) {
        return view.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m226p(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: q */
    public static void m227q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: renamed from: r */
    public static void m228r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: renamed from: s */
    public static void m229s(View view, float f2) {
        view.setElevation(f2);
    }

    /* JADX INFO: renamed from: t */
    public static void m230t(View view, boolean z2) {
        view.setNestedScrollingEnabled(z2);
    }

    /* JADX INFO: renamed from: u */
    public static void m231u(View view, InterfaceC0121q interfaceC0121q) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(C1031R.id.tag_on_apply_window_listener, interfaceC0121q);
        }
        if (interfaceC0121q == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C1031R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0069F(view, interfaceC0121q));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m232v(View view, String str) {
        view.setTransitionName(str);
    }

    /* JADX INFO: renamed from: w */
    public static void m233w(View view, float f2) {
        view.setTranslationZ(f2);
    }

    /* JADX INFO: renamed from: x */
    public static void m234x(View view, float f2) {
        view.setZ(f2);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m235y(View view, int i2) {
        return view.startNestedScroll(i2);
    }

    /* JADX INFO: renamed from: z */
    public static void m236z(View view) {
        view.stopNestedScroll();
    }
}
