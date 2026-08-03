package de.robv.android.xposed;

import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p001A0.AbstractC0040p;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p031Q0.AbstractC0307g;
import p089x0.C1121e;

/* JADX INFO: renamed from: de.robv.android.xposed.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0762d {

    /* JADX INFO: renamed from: a */
    public static volatile XposedModule f2675a;

    static {
        ClassLoader.getSystemClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static final void m1951a(Class r5, String r6, AbstractC0761c r7) {
        Method[] r52 = r5.getDeclaredMethods();
        AbstractC0307g.m702d(r52, "getDeclaredMethods(...)");
        ArrayList r02 = new ArrayList();
        int r1 = r52.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        Method r3 = r52[r2];
        if (AbstractC0307g.m699a(r3.getName(), r6) == false) goto L7;
        r02.add(r3);
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        ArrayList r53 = new ArrayList(AbstractC0183n.m559k0(r02, 10));
        Iterator r62 = r02.iterator();
    L10:
        if (r62.hasNext() == false) goto L12;
        Method r03 = (Method) r62.next();
        AbstractC0307g.m700b(r03);
        r53.add(m1952b(r03, r7));
        goto L10
    L12:
        AbstractC0181l.m542B0(r53);
    }

    /* JADX INFO: renamed from: b */
    public static final C1121e m1952b(Member r2, final AbstractC0761c r3) {
        AbstractC0307g.m703e(r2, "member");
        if ((r2 instanceof Executable) == false) goto L5;
        final Executable r02 = (Executable) r2;
    L6:
        if (r02 == null) goto L14;
        XposedModule r22 = f2675a;
        if (r22 == null) goto L12;
        AbstractC0307g.m702d(r22.hook(r02).setPriority(r3.f2674a).setExceptionMode(XposedInterface.ExceptionMode.PASSTHROUGH).intercept(new XposedBridge$LegacyHooker(r02, r3)), "intercept(...)");
        return new C1121e(28);
    L12:
        throw new IllegalStateException("libxposed module is not initialized".toString());
    L14:
        throw new IllegalArgumentException("Only methods and constructors can be hooked: " + r2);
    L5:
        r02 = null;
        goto L6
    }

    /* JADX INFO: renamed from: c */
    public static final void m1953c(XposedModule r1) {
        AbstractC0307g.m703e(r1, "module");
        f2675a = r1;
    }

    /* JADX INFO: renamed from: d */
    public static final void m1954d(String r4) {
        AbstractC0307g.m703e(r4, "text");
        XposedModule r02 = f2675a;     // Catch: Throwable -> L7
        if (r02 == null) goto L12;
        r02.log(4, "OKK-Xposed", r4, null);     // Catch: Throwable -> L7
        return;
    L12:
        return;
    L7:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: e */
    public static final void m1955e(Throwable r4) {
        r4.getMessage();
        XposedModule r02 = f2675a;     // Catch: Throwable -> L8
        if (r02 == null) goto L16;
        String r2 = r4.getMessage();     // Catch: Throwable -> L8
        if (r2 != null) goto L10;
        r2 = r4.getClass().getName();     // Catch: Throwable -> L8
    L10:
        r02.log(6, "OKK-Xposed", r2, r4);     // Catch: Throwable -> L8
        return;
    L16:
        return;
    L8:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }
}
