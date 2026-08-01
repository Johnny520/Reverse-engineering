package p000;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ck0 {

    /* JADX INFO: renamed from: i */
    private static final int f848i = 52;

    /* JADX INFO: renamed from: j */
    private static final boolean f849j = true;

    /* JADX INFO: renamed from: a */
    public static final ck0 f840a = new ck0();

    /* JADX INFO: renamed from: b */
    private static final u60 f841b = new x51(new sc0(5));

    /* JADX INFO: renamed from: c */
    private static final u60 f842c = new x51(new sc0(6));

    /* JADX INFO: renamed from: d */
    private static final u60 f843d = new x51(new sc0(7));

    /* JADX INFO: renamed from: e */
    private static final u60 f844e = new x51(new sc0(8));

    /* JADX INFO: renamed from: f */
    private static final u60 f845f = new x51(new sc0(9));

    /* JADX INFO: renamed from: g */
    private static final u60 f846g = new x51(new sc0(10));

    /* JADX INFO: renamed from: h */
    private static final u60 f847h = new x51(new sc0(11));

    /* JADX INFO: renamed from: k */
    public static final int f850k = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ck0() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    private final String m551A() {
        return (String) f843d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    private final String m552B() {
        return (String) f841b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    private final String m553C() {
        return (String) f844e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final Object m554E(XposedInterface.Chain chain) {
        chain.getClass();
        Object objProceed = chain.proceed();
        try {
            Object thisObject = chain.getThisObject();
            thisObject.getClass();
            f840a.m555F((Activity) thisObject);
        } catch (Exception unused) {
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    private final void m555F(final Activity activity) {
        try {
            int i = 1;
            if (activity.getSharedPreferences(m585y(), 0).getBoolean(m583w(), true)) {
                View decorView = activity.getWindow().getDecorView();
                ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                if (viewGroup != null && viewGroup.findViewWithTag(m553C()) == null) {
                    int i2 = activity.getSharedPreferences(m585y(), 0).getInt(m584x(), f848i);
                    final int iM581u = m581u(activity, i2);
                    final int i3 = activity.getResources().getDisplayMetrics().widthPixels;
                    final int i4 = activity.getResources().getDisplayMetrics().heightPixels;
                    int iM581u2 = m581u(activity, 276);
                    int iM581u3 = m581u(activity, 68);
                    final int iM582v = m582v(activity);
                    SharedPreferences sharedPreferences = activity.getSharedPreferences(m552B(), 0);
                    int i5 = sharedPreferences.getInt(m586z(), -1);
                    int i6 = sharedPreferences.getInt(m551A(), -1);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM581u, iM581u);
                    layoutParams.gravity = 8388659;
                    if (i5 < 0 || i6 < 0) {
                        layoutParams.leftMargin = (i3 - iM581u3) - iM581u;
                        layoutParams.topMargin = (i4 - iM581u2) - iM581u;
                    } else {
                        layoutParams.leftMargin = w60.m4907n(i5, 0, i3 - iM581u);
                        layoutParams.topMargin = w60.m4907n(i6, iM582v, i4 - iM581u);
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(1);
                    gradientDrawable.setColor(Color.argb(230, 245, 245, 245));
                    ck0 ck0Var = f840a;
                    float f = i2;
                    int i7 = (int) (0.04f * f);
                    gradientDrawable.setStroke(ck0Var.m581u(activity, i7 < 1 ? 1 : i7), Color.argb(80, 0, 0, 0));
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(1);
                    gradientDrawable2.setColor(Color.argb(180, 120, 120, 130));
                    if (i7 >= 1) {
                        i = i7;
                    }
                    gradientDrawable2.setStroke(ck0Var.m581u(activity, i), Color.argb(50, 255, 255, 255));
                    final wt0 wt0Var = new wt0();
                    final wt0 wt0Var2 = new wt0();
                    final xt0 xt0Var = new xt0();
                    final xt0 xt0Var2 = new xt0();
                    final vt0 vt0Var = new vt0();
                    TextView textView = new TextView(activity);
                    textView.setText("↓");
                    textView.setTextSize(0.42f * f);
                    textView.setTextColor(Color.rgb(40, 40, 40));
                    textView.setGravity(17);
                    textView.setTag(ck0Var.m553C());
                    textView.setBackground(gradientDrawable2);
                    int i8 = (int) (0.115f * f);
                    if (i8 < 2) {
                        i8 = 2;
                    }
                    textView.setElevation(ck0Var.m581u(activity, i8));
                    textView.setOnTouchListener(new View.OnTouchListener() { // from class: bk0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            return ck0.m556G(wt0Var, wt0Var2, xt0Var, xt0Var2, vt0Var, i3, iM581u, iM582v, i4, activity, view, motionEvent);
                        }
                    });
                    C0745sz c0745sz = C0745sz.f5862a;
                    c0745sz.m4134z(new C0081c7(9, textView, gradientDrawable));
                    c0745sz.m4133y(new C0607p9(textView, activity, gradientDrawable2, 6));
                    c0745sz.m4128r();
                    viewGroup.addView(textView, layoutParams);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final boolean m556G(wt0 wt0Var, wt0 wt0Var2, xt0 xt0Var, xt0 xt0Var2, vt0 vt0Var, int i, int i2, int i3, int i4, Activity activity, View view, MotionEvent motionEvent) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int action = motionEvent.getAction();
        if (action == 0) {
            wt0Var.f7189d = motionEvent.getRawX();
            wt0Var2.f7189d = motionEvent.getRawY();
            xt0Var.f7423d = layoutParams2.leftMargin;
            xt0Var2.f7423d = layoutParams2.topMargin;
            vt0Var.f6825d = false;
            return true;
        }
        if (action == 1) {
            if (vt0Var.f6825d) {
                ck0 ck0Var = f840a;
                activity.getSharedPreferences(ck0Var.m552B(), 0).edit().putInt(ck0Var.m586z(), layoutParams2.leftMargin).putInt(ck0Var.m551A(), layoutParams2.topMargin).apply();
            } else if (C0745sz.f5862a.m4126o()) {
                new m00(activity).show();
            }
            return true;
        }
        if (action != 2) {
            return false;
        }
        int rawX = (int) (motionEvent.getRawX() - wt0Var.f7189d);
        int rawY = (int) (motionEvent.getRawY() - wt0Var2.f7189d);
        if (Math.abs(rawX) > 6 || Math.abs(rawY) > 6) {
            vt0Var.f6825d = true;
            layoutParams2.leftMargin = w60.m4907n(xt0Var.f7423d + rawX, 0, i - i2);
            layoutParams2.topMargin = w60.m4907n(xt0Var2.f7423d + rawY, i3, i4 - i2);
            view.setLayoutParams(layoutParams2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final na1 m557H(TextView textView, GradientDrawable gradientDrawable) {
        textView.post(new ak0(textView, gradientDrawable, 1));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m558I(TextView textView, GradientDrawable gradientDrawable) {
        textView.setBackground(gradientDrawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final na1 m559J(TextView textView, Activity activity, GradientDrawable gradientDrawable) {
        textView.post(new ak0(textView, gradientDrawable, 0));
        C0745sz c0745sz = C0745sz.f5862a;
        c0745sz.m4130u(activity);
        c0745sz.m4129s(activity);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m560K(TextView textView, GradientDrawable gradientDrawable) {
        textView.setBackground(gradientDrawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final String m574n() {
        return ik0.f2579a.m1592a(45, 20, 31, 80, 63, 39, 18, 69, 37, 39, 21, 95, 42, 26, 28, 84, 47);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final String m575o() {
        return ik0.f2579a.m1592a(45, 20, 31, 80, 63, 39, 18, 69, 37, 39, 3, 88, 49, 29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final String m576p() {
        return ik0.f2579a.m1592a(51, 8, 65, 110, 38, 23, 20, 68, 39, 29, 47, 66, 46, 12, 4, 88, 37, 31, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final String m577q() {
        return ik0.f2579a.m1592a(39, 29, 22, 69, 20, 21, 17, 67, 44, 17, 30);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final String m578r() {
        return ik0.f2579a.m1592a(63, 23, 0, 110, 38, 25, 2, 86, 34, 22);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final String m579s() {
        return ik0.f2579a.m1592a(51, 8, 65, 110, 45, 20, 31, 80, 63, 39, 0, 94, 56);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final String m580t() {
        return ik0.f2579a.m1592a(51, 8, 65, 110, 45, 20, 31, 80, 63, 39, 18, 69, 37);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    private final int m581u(Activity activity, int i) {
        return (int) (i * activity.getResources().getDisplayMetrics().density);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    private final int m582v(Activity activity) {
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : m581u(activity, 24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    private final String m583w() {
        return (String) f847h.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    private final String m584x() {
        return (String) f846g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    private final String m585y() {
        return (String) f845f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    private final String m586z() {
        return (String) f842c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final void m587D(ClassLoader classLoader, Class<?> cls) {
        XposedInterface.HookBuilder hookBuilderHook;
        classLoader.getClass();
        if (cls == null) {
            return;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("onCreate", Bundle.class);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
                return;
            }
            hookBuilderHook.intercept(new C0796ua(17));
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final void m588L(Activity activity, boolean z) {
        View viewFindViewWithTag;
        activity.getClass();
        try {
            View decorView = activity.getWindow().getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null && (viewFindViewWithTag = viewGroup.findViewWithTag(m553C())) != null) {
                viewFindViewWithTag.setVisibility(z ? 0 : 8);
            }
        } catch (Exception unused) {
        }
    }
}
