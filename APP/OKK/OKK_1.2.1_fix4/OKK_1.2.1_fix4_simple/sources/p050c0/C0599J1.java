package p050c0;

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
    public static final C0599J1 f1831a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1832b = null;

    static {
        f1831a = new C0599J1();
        f1832b = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static final void m1483a(Object r10) {
        Activity r02 = m1484b(r10);     // Catch: Throwable -> L5
        Field r1 = r10.getClass().getDeclaredField("f190366c");     // Catch: Throwable -> L5
        r1.setAccessible(true);     // Catch: Throwable -> L5
        Object r102 = r1.get(r10);     // Catch: Throwable -> L5
        Method r3 = null;
        if ((r102 instanceof View) == false) goto L7;
        View r103 = (View) r102;     // Catch: Throwable -> L5
    L8:
        if (r103 == null) goto L12;
        ViewPropertyAnimator r12 = r103.animate();     // Catch: Throwable -> L5
        if (r12 == null) goto L12;
        r12.cancel();     // Catch: Throwable -> L5
    L12:
        if (r103 == null) goto L15;
        r103.clearAnimation();     // Catch: Throwable -> L5
    L15:
        if (r103 == null) goto L17;
        r103.setTranslationX(0.0f);     // Catch: Throwable -> L5
    L17:
        if (r103 == null) goto L20;
        r103.setTranslationY(0.0f);     // Catch: Throwable -> L5
    L20:
        if (r103 == null) goto L22;
        r103.setAlpha(1.0f);     // Catch: Throwable -> L5
    L22:
        if (r103 == null) goto L24;
        r103.setVisibility(8);     // Catch: Throwable -> L5
    L24:
        if (r02 == null) goto L39;
        Method[] r104 = r02.getClass().getMethods();     // Catch: Throwable -> L5
        if (r104 == null) goto L39;
        int r4 = r104.length;     // Catch: Throwable -> L5
        int r6 = 0;
    L28:
        if (r6 >= r4) goto L37;
        Method r7 = r104[r6];     // Catch: Throwable -> L5
        if (AbstractC0307g.m699a(r7.getName(), "onSwipe") == false) goto L36;
        if (r7.getParameterTypes().length != 1) goto L36;
        if (AbstractC0307g.m699a(r7.getParameterTypes()[0], Float.TYPE) == false) goto L36;
        r3 = r7;
    L36:
        r6 = r6 + 1;     // Catch: Throwable -> L5
    L37:
        if (r3 == null) goto L39;
        r3.invoke(r02, new Object[]{Float.valueOf(1.0f)});     // Catch: Throwable -> L5
    L39:
        m1485c("snap home reveal");     // Catch: Throwable -> L5
        return;
    L7:
        r103 = null;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: b */
    public static Activity m1484b(Object r3) {
        Object r02 = null;
        Field r1 = r3.getClass().getDeclaredField("f190364a");     // Catch: Throwable -> L7
        r1.setAccessible(true);     // Catch: Throwable -> L7
        Object r32 = r1.get(r3);     // Catch: Throwable -> L7
        if ((r32 instanceof Activity) == false) goto L9;
        Object r33 = (Activity) r32;     // Catch: Throwable -> L7
    L12:
        if ((r33 instanceof C0140f) == true) goto L16;
        r02 = r33;
    L16:
        return (Activity) r02;
    L9:
        r33 = null;
    L7:
        th = move-exception;
        r33 = AbstractC0040p.m116u(th);
        goto L12
    }

    /* JADX INFO: renamed from: c */
    public static void m1485c(String r2) {
        AbstractC0762d.m1954d("OKK-ThemeWpHook: " + r2);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }
}
