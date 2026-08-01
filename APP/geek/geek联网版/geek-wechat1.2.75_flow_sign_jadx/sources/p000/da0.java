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
public abstract class da0 {
    /* JADX INFO: renamed from: a */
    public static void m883a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static bd0 m884b(View view, bd0 bd0Var, Rect rect) {
        WindowInsets windowInsetsM520f = bd0Var.m520f();
        if (windowInsetsM520f != null) {
            return bd0.m515g(view, view.computeSystemWindowInsets(windowInsetsM520f, rect));
        }
        rect.setEmpty();
        return bd0Var;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m885c(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m886d(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m887e(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m888f(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m889g(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: h */
    public static PorterDuff.Mode m890h(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: i */
    public static float m891i(View view) {
        return view.getElevation();
    }

    /* JADX INFO: renamed from: j */
    public static bd0 m892j(View view) {
        if (mc0.f3128d && view.isAttachedToWindow()) {
            try {
                Object obj = mc0.f3125a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) mc0.f3126b.get(obj);
                    Rect rect2 = (Rect) mc0.f3127c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i = Build.VERSION.SDK_INT;
                        rc0 qc0Var = i >= 30 ? new qc0() : i >= 29 ? new pc0() : new nc0();
                        qc0Var.mo1945e(C0346ip.m1524b(rect.left, rect.top, rect.right, rect.bottom));
                        qc0Var.mo1946g(C0346ip.m1524b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        bd0 bd0VarMo1944b = qc0Var.mo1944b();
                        bd0VarMo1944b.f724a.mo2373p(bd0VarMo1944b);
                        bd0VarMo1944b.f724a.mo2367d(view.getRootView());
                        return bd0VarMo1944b;
                    }
                }
            } catch (IllegalAccessException e) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static String m893k(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: renamed from: l */
    public static float m894l(View view) {
        return view.getTranslationZ();
    }

    /* JADX INFO: renamed from: m */
    public static float m895m(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m896n(View view) {
        return view.hasNestedScrollingParent();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m897o(View view) {
        return view.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m898p(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: q */
    public static void m899q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: renamed from: r */
    public static void m900r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: renamed from: s */
    public static void m901s(View view, float f) {
        view.setElevation(f);
    }

    /* JADX INFO: renamed from: t */
    public static void m902t(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    /* JADX INFO: renamed from: u */
    public static void m903u(View view, InterfaceC0945yw interfaceC0945yw) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0945yw);
        }
        if (interfaceC0945yw == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ca0(view, interfaceC0945yw));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m904v(View view, String str) {
        view.setTransitionName(str);
    }

    /* JADX INFO: renamed from: w */
    public static void m905w(View view, float f) {
        view.setTranslationZ(f);
    }

    /* JADX INFO: renamed from: x */
    public static void m906x(View view, float f) {
        view.setZ(f);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m907y(View view, int i) {
        return view.startNestedScroll(i);
    }

    /* JADX INFO: renamed from: z */
    public static void m908z(View view) {
        view.stopNestedScroll();
    }
}
