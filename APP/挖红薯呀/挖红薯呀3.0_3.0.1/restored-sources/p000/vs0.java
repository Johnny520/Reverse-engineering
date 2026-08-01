package p000;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p000.kf1;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class vs0 {

    /* JADX INFO: renamed from: b */
    private static volatile boolean f6812b = false;

    /* JADX INFO: renamed from: i */
    private static final boolean f6819i = true;

    /* JADX INFO: renamed from: j */
    private static final int f6820j = 48;

    /* JADX INFO: renamed from: k */
    private static final int f6821k = 30;

    /* JADX INFO: renamed from: l */
    private static final int f6822l = 80;

    /* JADX INFO: renamed from: a */
    public static final vs0 f6811a = new vs0();

    /* JADX INFO: renamed from: c */
    private static final int f6813c = 2131623937;

    /* JADX INFO: renamed from: d */
    private static final u60 f6814d = new x51(new sc0(29));

    /* JADX INFO: renamed from: e */
    private static final u60 f6815e = new x51(new us0(0));

    /* JADX INFO: renamed from: f */
    private static final u60 f6816f = new x51(new us0(1));

    /* JADX INFO: renamed from: g */
    private static final u60 f6817g = new x51(new us0(2));

    /* JADX INFO: renamed from: h */
    private static final u60 f6818h = new x51(new us0(3));

    /* JADX INFO: renamed from: m */
    public static final int f6823m = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private vs0() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    private final void m4761A(ViewGroup viewGroup, Object obj, Activity activity) {
        Context context = viewGroup.getContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences(m4783u(), 0);
        if (sharedPreferences.getBoolean(m4779q(), true)) {
            int i = f6813c;
            if (viewGroup.findViewWithTag(Integer.valueOf(i)) != null) {
                return;
            }
            float fM4907n = w60.m4907n(sharedPreferences.getInt(m4781s(), 48), 30, 80);
            int iM4778p = m4778p(context, fM4907n);
            int i2 = context.getResources().getDisplayMetrics().widthPixels;
            int i3 = context.getResources().getDisplayMetrics().heightPixels;
            int iM4784v = m4784v(activity);
            int i4 = sharedPreferences.getInt(m4780r(), -1);
            int i5 = sharedPreferences.getInt(m4782t(), -1);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM4778p, iM4778p);
            layoutParams.gravity = 8388659;
            if (i4 < 0 || i5 < 0) {
                vs0 vs0Var = f6811a;
                layoutParams.leftMargin = (i2 - vs0Var.m4778p(context, 16.0f)) - iM4778p;
                layoutParams.topMargin = (i3 - vs0Var.m4778p(context, 120.0f)) - iM4778p;
            } else {
                layoutParams.leftMargin = w60.m4907n(i4, 0, i2 - iM4778p);
                layoutParams.topMargin = w60.m4907n(i5, iM4784v, i3 - iM4778p);
            }
            GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
            gradientDrawableM4150h.setCornerRadius(0.25f * fM4907n * context.getResources().getDisplayMetrics().density);
            gradientDrawableM4150h.setColor(Color.argb(204, 254, 44, 85));
            wt0 wt0Var = new wt0();
            wt0 wt0Var2 = new wt0();
            xt0 xt0Var = new xt0();
            xt0 xt0Var2 = new xt0();
            vt0 vt0Var = new vt0();
            TextView textView = new TextView(context);
            textView.setText("⬆");
            textView.setTextSize(0.38f * fM4907n);
            textView.setTextColor(-1);
            textView.setGravity(17);
            textView.setTag(Integer.valueOf(i));
            textView.setBackground(gradientDrawableM4150h);
            textView.setElevation(f6811a.m4778p(context, 4.0f));
            textView.setOnTouchListener(new dk0(wt0Var, wt0Var2, xt0Var, xt0Var2, vt0Var, i2, iM4778p, iM4784v, i3, obj, context));
            viewGroup.addView(textView, layoutParams);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final boolean m4762B(wt0 wt0Var, wt0 wt0Var2, xt0 xt0Var, xt0 xt0Var2, vt0 vt0Var, int i, int i2, int i3, int i4, Object obj, Context context, View view, MotionEvent motionEvent) {
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
        if (action != 1) {
            if (action != 2) {
                return false;
            }
            int rawX = (int) (motionEvent.getRawX() - wt0Var.f7189d);
            int rawY = (int) (motionEvent.getRawY() - wt0Var2.f7189d);
            if (Math.abs(rawX) > 8 || Math.abs(rawY) > 8) {
                vt0Var.f6825d = true;
                layoutParams2.leftMargin = w60.m4907n(xt0Var.f7423d + rawX, 0, i - i2);
                layoutParams2.topMargin = w60.m4907n(xt0Var2.f7423d + rawY, i3, i4 - i2);
                view.setLayoutParams(layoutParams2);
            }
            return true;
        }
        if (vt0Var.f6825d) {
            vs0 vs0Var = f6811a;
            context.getSharedPreferences(vs0Var.m4783u(), 0).edit().putInt(vs0Var.m4780r(), layoutParams2.leftMargin).putInt(vs0Var.m4782t(), layoutParams2.topMargin).apply();
        } else {
            f6812b = true;
            try {
                vs0 vs0Var2 = f6811a;
                Object objM4777o = vs0Var2.m4777o(obj, "getParentFragmentManager", new Object[0]);
                Object objM4777o2 = vs0Var2.m4777o(objM4777o, "beginTransaction", new Object[0]);
                Boolean bool = Boolean.TRUE;
                vs0Var2.m4777o(objM4777o2, "setReorderingAllowed", bool);
                vs0Var2.m4777o(objM4777o2, "detach", obj);
                vs0Var2.m4777o(objM4777o2, "commitNow", new Object[0]);
                Object objM4777o3 = vs0Var2.m4777o(objM4777o, "beginTransaction", new Object[0]);
                vs0Var2.m4777o(objM4777o3, "setReorderingAllowed", bool);
                vs0Var2.m4777o(objM4777o3, "attach", obj);
                vs0Var2.m4777o(objM4777o3, "commitNow", new Object[0]);
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final String m4772j() {
        return m00.f3663S.m2355R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final String m4773k() {
        return m00.f3663S.m2356S();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final String m4774l() {
        return m00.f3663S.m2357T();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final String m4775m() {
        return m00.f3663S.m2358U();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final String m4776n() {
        return m00.f3663S.m2362Y();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    private final Object m4777o(Object obj, String str, Object... objArr) {
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
    /* JADX INFO: renamed from: p */
    private final int m4778p(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    private final String m4779q() {
        return (String) f6815e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    private final String m4780r() {
        return (String) f6817g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    private final String m4781s() {
        return (String) f6816f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    private final String m4782t() {
        return (String) f6818h.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    private final String m4783u() {
        return (String) f6814d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    private final int m4784v(Activity activity) {
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : m4778p(activity, 24.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Object m4785x(XposedInterface.Chain chain) {
        chain.getClass();
        Object objProceed = chain.proceed();
        if (f6812b) {
            f6812b = false;
            return objProceed;
        }
        try {
            Object thisObject = chain.getThisObject();
            Object objM4777o = f6811a.m4777o(thisObject, "getArguments", new Object[0]);
            Bundle bundle = objM4777o instanceof Bundle ? (Bundle) objM4777o : null;
            if ((bundle != null ? bundle.getInt("pageSource", -1) : -1) != 0) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1000zd(1, thisObject));
            }
        } catch (Exception unused) {
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m4786y(Object obj) {
        Window window;
        try {
            vs0 vs0Var = f6811a;
            Object objM4777o = vs0Var.m4777o(obj, "getActivity", new Object[0]);
            Activity activity = objM4777o instanceof Activity ? (Activity) objM4777o : null;
            View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup == null) {
                return;
            }
            obj.getClass();
            vs0Var.m4761A(viewGroup, obj, activity);
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final Object m4787z(XposedInterface.Chain chain) {
        View viewFindViewWithTag;
        Window window;
        chain.getClass();
        Object objProceed = chain.proceed();
        if (!f6812b) {
            try {
                int i = 0;
                Object obj = chain.getArgs().get(0);
                obj.getClass();
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object thisObject = chain.getThisObject();
                vs0 vs0Var = f6811a;
                Object objM4777o = vs0Var.m4777o(thisObject, "getArguments", new Object[0]);
                Bundle bundle = objM4777o instanceof Bundle ? (Bundle) objM4777o : null;
                if ((bundle != null ? bundle.getInt("pageSource", -1) : -1) != 0) {
                    Object objM4777o2 = vs0Var.m4777o(thisObject, "getActivity", new Object[0]);
                    Activity activity = objM4777o2 instanceof Activity ? (Activity) objM4777o2 : null;
                    View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
                    ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                    if (viewGroup != null && (viewFindViewWithTag = viewGroup.findViewWithTag(Integer.valueOf(f6813c))) != null) {
                        if (!zBooleanValue) {
                            i = 8;
                        }
                        viewFindViewWithTag.setVisibility(i);
                        ck0.f840a.m588L(activity, !zBooleanValue);
                        fk0.f1746a.m1162g0(activity, !zBooleanValue);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m4788w(ClassLoader classLoader, Class<?> cls, String str) {
        XposedInterface.HookBuilder hookBuilderHook;
        XposedInterface.HookBuilder hookBuilderHook2;
        classLoader.getClass();
        if (cls == null || str == null) {
            return;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, LayoutInflater.class, ViewGroup.class);
            kf1.C0391a c0391a = kf1.f3100G;
            kf1 kf1VarM1887b = c0391a.m1887b();
            if (kf1VarM1887b != null && (hookBuilderHook2 = kf1VarM1887b.hook(declaredMethod)) != null) {
                hookBuilderHook2.intercept(new C0796ua(21));
            }
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass != null) {
                Method declaredMethod2 = superclass.getDeclaredMethod("setUserVisibleHint", Boolean.TYPE);
                kf1 kf1VarM1887b2 = c0391a.m1887b();
                if (kf1VarM1887b2 == null || (hookBuilderHook = kf1VarM1887b2.hook(declaredMethod2)) == null) {
                    return;
                }
                hookBuilderHook.intercept(new C0796ua(22));
            }
        } catch (Exception unused) {
        }
    }
}
