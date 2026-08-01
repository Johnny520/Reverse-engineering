package p000;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p000.kf1;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class fk0 {

    /* JADX INFO: renamed from: p */
    private static final boolean f1761p = true;

    /* JADX INFO: renamed from: q */
    private static final int f1762q = 44;

    /* JADX INFO: renamed from: r */
    private static final int f1763r = 30;

    /* JADX INFO: renamed from: s */
    private static final int f1764s = 72;

    /* JADX INFO: renamed from: a */
    public static final fk0 f1746a = new fk0();

    /* JADX INFO: renamed from: b */
    private static final int f1747b = 2131623938;

    /* JADX INFO: renamed from: c */
    private static final u60 f1748c = new x51(new sc0(20));

    /* JADX INFO: renamed from: d */
    private static final u60 f1749d = new x51(new sc0(24));

    /* JADX INFO: renamed from: e */
    private static final u60 f1750e = new x51(new sc0(12));

    /* JADX INFO: renamed from: f */
    private static final u60 f1751f = new x51(new sc0(13));

    /* JADX INFO: renamed from: g */
    private static final u60 f1752g = new x51(new sc0(14));

    /* JADX INFO: renamed from: h */
    private static final u60 f1753h = new x51(new sc0(15));

    /* JADX INFO: renamed from: i */
    private static final u60 f1754i = new x51(new sc0(16));

    /* JADX INFO: renamed from: j */
    private static final u60 f1755j = new x51(new sc0(17));

    /* JADX INFO: renamed from: k */
    private static final u60 f1756k = new x51(new sc0(18));

    /* JADX INFO: renamed from: l */
    private static final u60 f1757l = new x51(new sc0(19));

    /* JADX INFO: renamed from: m */
    private static final u60 f1758m = new x51(new sc0(21));

    /* JADX INFO: renamed from: n */
    private static final u60 f1759n = new x51(new sc0(22));

    /* JADX INFO: renamed from: o */
    private static final u60 f1760o = new x51(new sc0(23));

    /* JADX INFO: renamed from: t */
    public static final int f1765t = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private fk0() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final String m1104A() {
        return ik0.f2579a.m1592a(40, 10, 21, 80, 63, 29, 60, 88, 37, 19, 21, 67);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final String m1105B() {
        return ik0.f2579a.m1592a(47, 29, 4, 80, 40, 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final String m1106C() {
        return ik0.f2579a.m1592a(44, 29, 4, 103, 34, 29, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final String m1107D() {
        return ik0.f2579a.m1592a(36, 22, 51, 67, 46, 25, 4, 84);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final String m1108E() {
        return ik0.f2579a.m1592a(36, 22, 32, 80, 62, 11, 21);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final String m1109F() {
        return ik0.f2579a.m1592a(36, 22, 34, 84, 56, 13, 29, 84);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    private final Object m1110G(Object obj, String str, Object... objArr) {
        Object objInvoke = null;
        if (obj == null) {
            return null;
        }
        try {
            Method[] methods = obj.getClass().getMethods();
            methods.getClass();
            ArrayList arrayList = new ArrayList();
            for (Method method : methods) {
                if (p30.m3002l(method.getName(), str) && method.getParameterTypes().length == objArr.length) {
                    arrayList.add(method);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    objInvoke = ((Method) it.next()).invoke(obj, Arrays.copyOf(objArr, objArr.length));
                    break;
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    private final int m1111H(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    private final Field m1112I(Activity activity) {
        for (Class<?> superclass = activity.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(m1119P());
                declaredField.getClass();
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    private final String m1113J() {
        return (String) f1757l.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    private final String m1114K() {
        return (String) f1759n.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    private final String m1115L() {
        return (String) f1758m.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    private final String m1116M() {
        return (String) f1760o.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    private final String m1117N() {
        return (String) f1756k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    private final int m1118O(Activity activity) {
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : m1111H(activity, 24.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    private final String m1119P() {
        return (String) f1751f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    private final String m1120Q() {
        return (String) f1754i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    private final String m1121R() {
        return (String) f1753h.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    private final String m1122S() {
        return (String) f1752g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    private final String m1123T() {
        return (String) f1755j.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    private final String m1124U() {
        return (String) f1748c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    private final String m1125V() {
        return (String) f1750e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    private final String m1126W() {
        return (String) f1749d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final Object m1127Y(XposedInterface.Chain chain) {
        chain.getClass();
        Object objProceed = chain.proceed();
        try {
            Object thisObject = chain.getThisObject();
            thisObject.getClass();
            new Handler(Looper.getMainLooper()).postDelayed(new ek0((Activity) thisObject, 0), 300L);
        } catch (Exception unused) {
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final void m1128Z(Activity activity) {
        try {
            Window window = activity.getWindow();
            View decorView = window != null ? window.getDecorView() : null;
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup == null) {
                return;
            }
            f1746a.m1134c0(viewGroup, activity);
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final Object m1130a0(XposedInterface.Chain chain) {
        chain.getClass();
        Object objProceed = chain.proceed();
        try {
            Object thisObject = chain.getThisObject();
            thisObject.getClass();
            f1746a.m1162g0((Activity) thisObject, true);
        } catch (Exception unused) {
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final Object m1132b0(XposedInterface.Chain chain) {
        chain.getClass();
        Object objProceed = chain.proceed();
        try {
            Object thisObject = chain.getThisObject();
            thisObject.getClass();
            f1746a.m1162g0((Activity) thisObject, false);
        } catch (Exception unused) {
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    private final void m1134c0(ViewGroup viewGroup, Activity activity) {
        Context context = viewGroup.getContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences(m1117N(), 0);
        if (sharedPreferences.getBoolean(m1113J(), true)) {
            int i = f1747b;
            if (viewGroup.findViewWithTag(Integer.valueOf(i)) != null) {
                return;
            }
            float fM4907n = w60.m4907n(sharedPreferences.getInt(m1115L(), 44), 30, 72);
            int iM1111H = m1111H(context, fM4907n);
            int i2 = context.getResources().getDisplayMetrics().widthPixels;
            int i3 = context.getResources().getDisplayMetrics().heightPixels;
            int iM1111H2 = m1111H(context, 48.0f) + m1118O(activity);
            int i4 = sharedPreferences.getInt(m1114K(), -1);
            int i5 = sharedPreferences.getInt(m1116M(), -1);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM1111H, iM1111H);
            layoutParams.gravity = 8388659;
            if (i4 < 0 || i5 < 0) {
                fk0 fk0Var = f1746a;
                layoutParams.leftMargin = (i2 - fk0Var.m1111H(context, 16.0f)) - iM1111H;
                layoutParams.topMargin = (i3 - fk0Var.m1111H(context, 160.0f)) - iM1111H;
            } else {
                layoutParams.leftMargin = w60.m4907n(i4, 0, i2 - iM1111H);
                layoutParams.topMargin = w60.m4907n(i5, iM1111H2, i3 - iM1111H);
            }
            GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
            gradientDrawableM4150h.setCornerRadius(0.22f * fM4907n * context.getResources().getDisplayMetrics().density);
            gradientDrawableM4150h.setColor(Color.argb(204, 254, 44, 85));
            wt0 wt0Var = new wt0();
            wt0 wt0Var2 = new wt0();
            xt0 xt0Var = new xt0();
            xt0 xt0Var2 = new xt0();
            vt0 vt0Var = new vt0();
            TextView textView = new TextView(context);
            textView.setText("⬆");
            textView.setTextSize(0.36f * fM4907n);
            textView.setTextColor(-1);
            textView.setGravity(17);
            textView.setTag(Integer.valueOf(i));
            textView.setBackground(gradientDrawableM4150h);
            textView.setElevation(f1746a.m1111H(context, 4.0f));
            textView.setOnTouchListener(new dk0(wt0Var, wt0Var2, xt0Var, xt0Var2, vt0Var, i2, iM1111H, iM1111H2, i3, context, activity));
            viewGroup.addView(textView, layoutParams);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final boolean m1136d0(wt0 wt0Var, wt0 wt0Var2, xt0 xt0Var, xt0 xt0Var2, vt0 vt0Var, int i, int i2, int i3, int i4, Context context, Activity activity, View view, MotionEvent motionEvent) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int action = motionEvent.getAction();
        int i5 = 1;
        if (action == 0) {
            wt0Var.f7189d = motionEvent.getRawX();
            wt0Var2.f7189d = motionEvent.getRawY();
            xt0Var.f7423d = layoutParams2.leftMargin;
            xt0Var2.f7423d = layoutParams2.topMargin;
            vt0Var.f6825d = false;
            return true;
        }
        if (action == 1) {
            if (!vt0Var.f6825d) {
                new Handler(Looper.getMainLooper()).post(new ek0(activity, i5));
                return true;
            }
            fk0 fk0Var = f1746a;
            context.getSharedPreferences(fk0Var.m1117N(), 0).edit().putInt(fk0Var.m1114K(), layoutParams2.leftMargin).putInt(fk0Var.m1116M(), layoutParams2.topMargin).apply();
            return true;
        }
        if (action != 2) {
            return false;
        }
        int rawX = (int) (motionEvent.getRawX() - wt0Var.f7189d);
        int rawY = (int) (motionEvent.getRawY() - wt0Var2.f7189d);
        if (Math.abs(rawX) <= 8 && Math.abs(rawY) <= 8) {
            return true;
        }
        vt0Var.f6825d = true;
        layoutParams2.leftMargin = w60.m4907n(xt0Var.f7423d + rawX, 0, i - i2);
        layoutParams2.topMargin = w60.m4907n(xt0Var2.f7423d + rawY, i3, i4 - i2);
        view.setLayoutParams(layoutParams2);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m1138e0(Activity activity) {
        f1746a.m1140f0(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    private final void m1140f0(Activity activity) {
        ViewGroup viewGroup;
        try {
            Field fieldM1112I = m1112I(activity);
            if (fieldM1112I != null && (viewGroup = (ViewGroup) activity.findViewById(R.id.content)) != null) {
                m1110G(fieldM1112I.get(activity), m1122S(), new Object[0]);
                View childAt = viewGroup.getChildAt(0);
                if (childAt != null) {
                    viewGroup.removeView(childAt);
                }
                Object objM1110G = m1110G(activity, m1121R(), viewGroup);
                m1110G(objM1110G, m1120Q(), null);
                Object objM1110G2 = m1110G(objM1110G, m1123T(), new Object[0]);
                View view = objM1110G2 instanceof View ? (View) objM1110G2 : null;
                if (view != null) {
                    viewGroup.addView(view);
                }
                fieldM1112I.set(activity, objM1110G);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final String m1154t() {
        return m00.f3663S.m2346I();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final String m1155u() {
        return m00.f3663S.m2347J();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final String m1156v() {
        return m00.f3663S.m2348K();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final String m1157w() {
        return m00.f3663S.m2349L();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final String m1158x() {
        return m00.f3663S.m2362Y();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final String m1159y() {
        return ik0.f2579a.m1592a(39, 17, 30, 90, 46, 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final String m1160z() {
        return ik0.f2579a.m1592a(42, 12, 4, 80, 40, 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public final void m1161X(ClassLoader classLoader, Class<?> cls) {
        XposedInterface.HookBuilder hookBuilderHook;
        XposedInterface.HookBuilder hookBuilderHook2;
        XposedInterface.HookBuilder hookBuilderHook3;
        classLoader.getClass();
        if (cls == null) {
            return;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(m1124U(), Bundle.class);
            kf1.C0391a c0391a = kf1.f3100G;
            kf1 kf1VarM1887b = c0391a.m1887b();
            if (kf1VarM1887b != null && (hookBuilderHook3 = kf1VarM1887b.hook(declaredMethod)) != null) {
                hookBuilderHook3.intercept(new C0796ua(18));
            }
            Method declaredMethod2 = cls.getDeclaredMethod(m1126W(), null);
            kf1 kf1VarM1887b2 = c0391a.m1887b();
            if (kf1VarM1887b2 != null && (hookBuilderHook2 = kf1VarM1887b2.hook(declaredMethod2)) != null) {
                hookBuilderHook2.intercept(new C0796ua(19));
            }
            Method declaredMethod3 = cls.getDeclaredMethod(m1125V(), null);
            kf1 kf1VarM1887b3 = c0391a.m1887b();
            if (kf1VarM1887b3 == null || (hookBuilderHook = kf1VarM1887b3.hook(declaredMethod3)) == null) {
                return;
            }
            hookBuilderHook.intercept(new C0796ua(20));
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public final void m1162g0(Activity activity, boolean z) {
        View viewFindViewWithTag;
        activity.getClass();
        try {
            Window window = activity.getWindow();
            View decorView = window != null ? window.getDecorView() : null;
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null && (viewFindViewWithTag = viewGroup.findViewWithTag(Integer.valueOf(f1747b))) != null) {
                viewFindViewWithTag.setVisibility(z ? 0 : 8);
            }
        } catch (Exception unused) {
        }
    }
}
