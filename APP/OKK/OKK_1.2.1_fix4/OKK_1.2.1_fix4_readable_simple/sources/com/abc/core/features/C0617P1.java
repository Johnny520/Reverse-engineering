package com.abc.core.features;

import android.os.Handler;
import android.os.Looper;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p009E0.AbstractC0181l;
import p009E0.C0177h;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0431p;

/* JADX INFO: renamed from: c0.P1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0617P1 {

    /* JADX INFO: renamed from: a */
    public static final C0617P1 f1903a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1904b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f1905c = null;

    /* JADX INFO: renamed from: d */
    public static final Handler f1906d = null;

    /* JADX INFO: renamed from: e */
    public static final Pattern f1907e = null;

    static {
        f1903a = new C0617P1();
        f1904b = new AtomicBoolean(false);
        f1905c = new AtomicBoolean(false);
        f1906d = new Handler(Looper.getMainLooper());
        f1907e = Pattern.compile("lat\\s*([-+]?\\d*\\.?\\d+)\\s*;\\s*lng\\s*([-+]?\\d*\\.?\\d+)\\s*;", 2);
    }

    /* JADX INFO: renamed from: a */
    public static C0139e m1513a(Object r9) {
        ArrayList r1 = new ArrayList(new C0177h(new String[]{r9.toString()}, true));
        Method[] r02 = r9.getClass().getMethods();
        AbstractC0307g.m702d(r02, "getMethods(...)");
        ArrayList r2 = new ArrayList();
        int r4 = r02.length;
        int r5 = 0;
    L3:
        if (r5 >= r4) goto L12;
        Method r6 = r02[r5];
        Class<?>[] r7 = r6.getParameterTypes();
        AbstractC0307g.m702d(r7, "getParameterTypes(...)");
        if (r7.length != 0) goto L11;
        if (AbstractC0307g.m699a(r6.getReturnType(), String.class) == false) goto L11;
        if (AbstractC0307g.m699a(r6.getName(), "toString") == true) goto L11;
        r2.add(r6);
    L11:
        r5 = r5 + 1;
        goto L3
    L12:
        Iterator r03 = AbstractC0181l.m549u0(16, r2).iterator();
    L13:
        String r42 = null;
        if (r03.hasNext() == false) goto L32;
        Method r22 = (Method) r03.next();
        r22.setAccessible(true);     // Catch: Throwable -> L19
        Object r23 = r22.invoke(r9, null);     // Catch: Throwable -> L19
        if ((r23 instanceof String) == false) goto L21;
        String r24 = (String) r23;     // Catch: Throwable -> L19
    L22:
        if (r24 == null) goto L13;
        int r52 = r24.length();     // Catch: Throwable -> L19
        if (5 <= r52) goto L26;
    L28:
        if (r42 == null) goto L13;
        r1.add(r42);     // Catch: Throwable -> L19
        goto L13
    L26:
        if (r52 >= 501) goto L28;
        r42 = r24;
        goto L28
    L21:
        r24 = null;
    L19:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L13
    L32:
        Iterator r92 = r1.iterator();
    L34:
        if (r92.hasNext() == false) goto L38;
        C0139e r04 = m1514b((String) r92.next());
        if (r04 == null) goto L34;
        return r04;
    L38:
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C0139e m1514b(String r17) {
        AbstractC0307g.m703e(r17, "text");
        Matcher r1 = f1907e.matcher(r17);
        if (r1.find() == false) goto L24;
        String r2 = r1.group(1);
        if (r2 == null) goto L7;
        Double r22 = AbstractC0431p.m1024y0(r2);
    L8:
        String r12 = r1.group(2);
        if (r12 == null) goto L11;
        Double r13 = AbstractC0431p.m1024y0(r12);
    L12:
        if (r22 == null) goto L24;
        if (r13 == null) goto L24;
        double r14 = r22.doubleValue();
        if (r14 < (-90.0d)) goto L24;
        if (r14 > 90.0d) goto L24;
        double r142 = r13.doubleValue();
        if (r142 < (-180.0d)) goto L24;
        if (r142 > 180.0d) goto L24;
        return new C0139e(r22, r13);
    L11:
        r13 = null;
        goto L12
    L7:
        r22 = null;
    L24:
        Matcher r15 = Pattern.compile("lat(?:itude)?[=:\\s]+([-+]?\\d+\\.?\\d*)", 2).matcher(r17);
        Matcher r02 = Pattern.compile("(?:lng|lon|longitude)[=:\\s]+([-+]?\\d+\\.?\\d*)", 2).matcher(r17);
        if (r15.find() == true) goto L27;
    L48:
        return null;
    L27:
        if (r02.find() == false) goto L48;
        String r16 = r15.group(1);
        if (r16 == null) goto L31;
        Double r18 = AbstractC0431p.m1024y0(r16);
    L32:
        String r03 = r02.group(1);
        if (r03 == null) goto L35;
        Double r04 = AbstractC0431p.m1024y0(r03);
    L36:
        if (r18 == null) goto L48;
        if (r04 == null) goto L48;
        double r132 = r18.doubleValue();
        if (r132 < (-90.0d)) goto L48;
        if (r132 > 90.0d) goto L48;
        double r7 = r04.doubleValue();
        if (r7 < (-180.0d)) goto L48;
        if (r7 > 180.0d) goto L48;
        return new C0139e(r18, r04);
    L35:
        r04 = null;
        goto L36
    L31:
        r18 = null;
        goto L32
    }

    /* JADX INFO: renamed from: c */
    public static void m1515c(String r2) {
        AbstractC0762d.m1954d("[OKK-MapPick] " + r2);     // Catch: Throwable -> L5
        return;
    }
}
