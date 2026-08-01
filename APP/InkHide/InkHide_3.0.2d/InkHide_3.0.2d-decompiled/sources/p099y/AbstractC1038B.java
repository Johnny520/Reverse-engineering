package p099y;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.p055lu.wxmask272.R;
import p085r.C0811c;

/* JADX INFO: renamed from: y.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1038B {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m2226a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C1075g0 m2227b(View view, C1075g0 c1075g0, Rect rect) {
        WindowInsets windowInsetsM2343b = c1075g0.m2343b();
        if (windowInsetsM2343b != null) {
            return C1075g0.m2342c(view.computeSystemWindowInsets(windowInsetsM2343b, rect), view);
        }
        rect.setEmpty();
        return c1075g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m2228c(View view, float f, float f2, boolean z2) {
        return view.dispatchNestedFling(f, f2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m2229d(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m2230e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m2231f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static ColorStateList m2232g(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static PorterDuff.Mode m2233h(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static float m2234i(View view) {
        return view.getElevation();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C1075g0 m2235j(View view) {
        if (!AbstractC1056U.f3673d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = AbstractC1056U.f3670a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) AbstractC1056U.f3671b.get(obj);
            Rect rect2 = (Rect) AbstractC1056U.f3672c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            AbstractC1060Y c1059x = i2 >= 30 ? new C1059X() : i2 >= 29 ? new C1058W() : new C1057V();
            c1059x.mo2310c(C0811c.m1479a(rect.left, rect.top, rect.right, rect.bottom));
            c1059x.mo2311d(C0811c.m1479a(rect2.left, rect2.top, rect2.right, rect2.bottom));
            C1075g0 c1075g0Mo2309b = c1059x.mo2309b();
            c1075g0Mo2309b.f3705a.mo2320l(c1075g0Mo2309b);
            c1075g0Mo2309b.f3705a.mo2315d(view.getRootView());
            return c1075g0Mo2309b;
        } catch (IllegalAccessException e2) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m2236k(View view) {
        return view.getTransitionName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static float m2237l(View view) {
        return view.getTranslationZ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static float m2238m(View view) {
        return view.getZ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static boolean m2239n(View view) {
        return view.hasNestedScrollingParent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static boolean m2240o(View view) {
        return view.isImportantForAccessibility();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m2241p(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m2242q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m2243r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static void m2244s(View view, float f) {
        view.setElevation(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static void m2245t(View view, boolean z2) {
        view.setNestedScrollingEnabled(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static void m2246u(View view, InterfaceC1084p interfaceC1084p) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC1084p);
        }
        if (interfaceC1084p == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC1037A(view, interfaceC1084p));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static void m2247v(View view, String str) {
        view.setTransitionName(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m2248w(View view, float f) {
        view.setTranslationZ(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m2249x(View view, float f) {
        view.setZ(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static boolean m2250y(View view, int i2) {
        return view.startNestedScroll(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static void m2251z(View view) {
        view.stopNestedScroll();
    }
}
