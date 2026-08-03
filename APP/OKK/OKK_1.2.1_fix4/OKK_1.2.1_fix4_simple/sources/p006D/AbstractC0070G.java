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
    public static void m211a(WindowInsets r1, View r2) {
        View.OnApplyWindowInsetsListener r02 = (View.OnApplyWindowInsetsListener) r2.getTag(C1031R.id.tag_window_insets_animation_callback);
        if (r02 == null) goto L6;
        r02.onApplyWindowInsets(r2, r1);
        return;
    }

    /* JADX INFO: renamed from: b */
    public static C0122q0 m212b(View r1, C0122q0 r2, Rect r3) {
        WindowInsets r02 = r2.m431c();
        if (r02 != null) goto L5;
        r3.setEmpty();
        return r2;
    L5:
        return C0122q0.m429d(r1, r1.computeSystemWindowInsets(r02, r3));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m213c(View r02, float r1, float r2, boolean r3) {
        return r02.dispatchNestedFling(r1, r2, r3);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m214d(View r02, float r1, float r2) {
        return r02.dispatchNestedPreFling(r1, r2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m215e(View r02, int r1, int r2, int[] r3, int[] r4) {
        return r02.dispatchNestedPreScroll(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m216f(View r02, int r1, int r2, int r3, int r4, int[] r5) {
        return r02.dispatchNestedScroll(r1, r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m217g(View r02) {
        return r02.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: h */
    public static PorterDuff.Mode m218h(View r02) {
        return r02.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: i */
    public static float m219i(View r02) {
        return r02.getElevation();
    }

    /* JADX INFO: renamed from: j */
    public static C0122q0 m220j(View r7) {
        if (AbstractC0098e0.f256d == true) goto L5;
        return null;
    L5:
        if (r7.isAttachedToWindow() == false) goto L32;
        View r02 = r7.getRootView();
        Object r03 = AbstractC0098e0.f253a.get(r02);     // Catch: IllegalAccessException -> L22
        if (r03 == null) goto L28;
        Rect r2 = (Rect) AbstractC0098e0.f254b.get(r03);     // Catch: IllegalAccessException -> L22
        Rect r04 = (Rect) AbstractC0098e0.f255c.get(r03);     // Catch: IllegalAccessException -> L22
        if (r2 == null) goto L29;
        if (r04 == null) goto L30;
        int r3 = Build.VERSION.SDK_INT;     // Catch: IllegalAccessException -> L22
        if (r3 < 30) goto L17;
        AbstractC0106i0 r32 = new C0104h0();     // Catch: IllegalAccessException -> L22
    L20:
        r32.mo363e(C1102c.m2598b(r2.left, r2.top, r2.right, r2.bottom));     // Catch: IllegalAccessException -> L22
        r32.mo364g(C1102c.m2598b(r04.left, r04.top, r04.right, r04.bottom));     // Catch: IllegalAccessException -> L22
        C0122q0 r05 = r32.mo362b();     // Catch: IllegalAccessException -> L22
        r05.f309a.mo386p(r05);     // Catch: IllegalAccessException -> L22
        View r72 = r7.getRootView();     // Catch: IllegalAccessException -> L22
        r05.f309a.mo380d(r72);     // Catch: IllegalAccessException -> L22
        return r05;
    L17:
        if (r3 < 29) goto L19;
        r32 = new C0102g0();     // Catch: IllegalAccessException -> L22
        goto L20
    L19:
        r32 = new C0100f0();     // Catch: IllegalAccessException -> L22
        goto L20
    L30:
        return null;
    L29:
        return null;
    L28:
        return null;
    L22:
        e = move-exception;
        e.getMessage();
        return null;
    L32:
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static String m221k(View r02) {
        return r02.getTransitionName();
    }

    /* JADX INFO: renamed from: l */
    public static float m222l(View r02) {
        return r02.getTranslationZ();
    }

    /* JADX INFO: renamed from: m */
    public static float m223m(View r02) {
        return r02.getZ();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m224n(View r02) {
        return r02.hasNestedScrollingParent();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m225o(View r02) {
        return r02.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m226p(View r02) {
        return r02.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: q */
    public static void m227q(View r02, ColorStateList r1) {
        r02.setBackgroundTintList(r1);
    }

    /* JADX INFO: renamed from: r */
    public static void m228r(View r02, PorterDuff.Mode r1) {
        r02.setBackgroundTintMode(r1);
    }

    /* JADX INFO: renamed from: s */
    public static void m229s(View r02, float r1) {
        r02.setElevation(r1);
    }

    /* JADX INFO: renamed from: t */
    public static void m230t(View r02, boolean r1) {
        r02.setNestedScrollingEnabled(r1);
    }

    /* JADX INFO: renamed from: u */
    public static void m231u(View r2, InterfaceC0121q r3) {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        r2.setTag(C1031R.id.tag_on_apply_window_listener, r3);
    L5:
        if (r3 != null) goto L8;
        r2.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) r2.getTag(C1031R.id.tag_window_insets_animation_callback));
        return;
    L8:
        r2.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0069F(r2, r3));
    }

    /* JADX INFO: renamed from: v */
    public static void m232v(View r02, String r1) {
        r02.setTransitionName(r1);
    }

    /* JADX INFO: renamed from: w */
    public static void m233w(View r02, float r1) {
        r02.setTranslationZ(r1);
    }

    /* JADX INFO: renamed from: x */
    public static void m234x(View r02, float r1) {
        r02.setZ(r1);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m235y(View r02, int r1) {
        return r02.startNestedScroll(r1);
    }

    /* JADX INFO: renamed from: z */
    public static void m236z(View r02) {
        r02.stopNestedScroll();
    }
}
