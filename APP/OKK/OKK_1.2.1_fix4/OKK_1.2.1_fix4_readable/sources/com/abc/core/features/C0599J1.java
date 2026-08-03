package com.abc.core.features;

import android.app.Activity;
import android.view.View;
import android.view.ViewPropertyAnimator;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.J1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0599J1 {

    /* JADX INFO: renamed from: a */
    public static final C0599J1 f1831a = new C0599J1();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1832b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static final void m1483a(Object obj) {
        Method[] methods;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        try {
            Activity activityM1484b = m1484b(obj);
            Field declaredField = obj.getClass().getDeclaredField("f190366c");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            Method method = null;
            View view = obj2 instanceof View ? (View) obj2 : null;
            if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            if (view != null) {
                view.clearAnimation();
            }
            if (view != null) {
                view.setTranslationX(0.0f);
            }
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (view != null) {
                view.setAlpha(1.0f);
            }
            if (view != null) {
                view.setVisibility(8);
            }
            if (activityM1484b != null && (methods = activityM1484b.getClass().getMethods()) != null) {
                int length = methods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Method method2 = methods[i2];
                    if (AbstractC0307g.m699a(method2.getName(), "onSwipe") && method2.getParameterTypes().length == 1 && AbstractC0307g.m699a(method2.getParameterTypes()[0], Float.TYPE)) {
                        method = method2;
                        break;
                    }
                    i2++;
                }
                if (method != null) {
                    method.invoke(activityM1484b, Float.valueOf(1.0f));
                }
            }
            m1485c("snap home reveal");
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Activity m1484b(Object obj) {
        Object objM116u;
        try {
            Field declaredField = obj.getClass().getDeclaredField("f190364a");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            objM116u = obj2 instanceof Activity ? (Activity) obj2 : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (Activity) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: c */
    public static void m1485c(String str) {
        try {
            AbstractC0762d.m1954d("OKK-ThemeWpHook: " + str);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }
}
