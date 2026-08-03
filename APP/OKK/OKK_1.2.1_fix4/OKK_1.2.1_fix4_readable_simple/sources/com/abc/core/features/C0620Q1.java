package com.abc.core.features;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0182m;
import p009E0.C0191v;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.Q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0620Q1 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f1911a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f1912b = null;

    static {
        f1911a = new AtomicReference(null);
        f1912b = new AtomicReference(0);
    }

    /* JADX INFO: renamed from: a */
    public static Method m1516a(ClassLoader r16) {
        int r02 = System.identityHashCode(r16);
        AtomicReference r2 = f1912b;
        Integer r3 = (Integer) r2.get();
        AtomicReference r4 = f1911a;
        if (r3 != null) goto L6;
    L7:
        r4.set(null);
        r2.set(Integer.valueOf(r02));
    L8:
        Method r03 = (Method) r4.get();
        if (r03 == null) goto L11;
        return r03;
    L11:
        Iterator r22 = AbstractC0182m.m556h0(new String[]{"v05.l", "u05.l", "w05.l", "t05.l", "x05.l", "y05.l", "z05.l", "v15.l", "v04.l", "v06.l"}).iterator();
    L13:
        if (r22.hasNext() == false) goto L47;
        Method[] r04 = Class.forName((String) r22.next(), false, r16).getDeclaredMethods();     // Catch: Throwable -> L27
        AbstractC0307g.m702d(r04, "getDeclaredMethods(...)");     // Catch: Throwable -> L27
        int r7 = r04.length;     // Catch: Throwable -> L27
        int r8 = 0;
    L17:
        if (r8 >= r7) goto L30;
        Method r10 = r04[r8];     // Catch: Throwable -> L27
        if (r10.getParameterTypes().length < 4) goto L29;
        if (Context.class.isAssignableFrom(r10.getParameterTypes()[0]) == false) goto L29;
        if (AbstractC0307g.m699a(r10.getParameterTypes()[1], String.class) == false) goto L29;
        if (AbstractC0307g.m699a(r10.getParameterTypes()[2], String.class) == false) goto L29;
        Method r102 = r10;
    L31:
        if (r102 == null) goto L34;
        r102.setAccessible(true);     // Catch: Throwable -> L27
        Object r103 = r102;
    L36:
        boolean r05 = r103 instanceof C0140f;
        Object r104 = r103;
        if (r05 == false) goto L39;
        r104 = null;
    L39:
        Method r105 = (Method) r104;
        if (r105 == null) goto L13;
        r4.set(r105);
        AbstractC0762d.m1954d("[OKK-WxLaunch] " + ("plugin hub " + r105.getDeclaringClass().getName() + "." + r105.getName()));     // Catch: Throwable -> L44
    L46:
        return r105;
    L44:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L46
    L34:
        r103 = null;
    L29:
        r8 = r8 + 1;     // Catch: Throwable -> L27
        goto L17
    L30:
        r102 = null;
    L27:
        th = move-exception;
        r103 = AbstractC0040p.m116u(th);
        goto L36
    L47:
        return null;
    L6:
        if (r3.intValue() == r02) goto L8;
        goto L7
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1517b(Activity r3, String r4, Map r5) {
        AbstractC0307g.m703e(r3, "activity");
        AbstractC0307g.m703e(r5, "extras");
        ClassLoader r02 = r3.getClassLoader();
        AbstractC0307g.m702d(r02, "getClassLoader(...)");
        Object r03 = Class.forName(r4, false, r02);     // Catch: Throwable -> L5
    L8:
        if ((r03 instanceof C0140f) == false) goto L11;
        r03 = null;
    L11:
        if (((Class) r03) != null) goto L22;
        return false;
    L22:
        Intent r04 = new Intent();     // Catch: Throwable -> L15
        r04.setClassName(r3, r4);     // Catch: Throwable -> L15
        m1519d(r04, r5);     // Catch: Throwable -> L15
        r3.startActivity(r04);     // Catch: Throwable -> L15
        Object r32 = Boolean.TRUE;     // Catch: Throwable -> L15
    L17:
        Object r42 = Boolean.FALSE;
        if ((r32 instanceof C0140f) == false) goto L21;
        r32 = r42;
    L21:
        return ((Boolean) r32).booleanValue();
    L15:
        th = move-exception;
        r32 = AbstractC0040p.m116u(th);
    L5:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L8
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1518c(Activity r8, String r9, String r10) {
        C0191v r02 = C0191v.f402a;
        AbstractC0307g.m703e(r8, "activity");
        Intent r1 = new Intent();
        m1519d(r1, r02);
        ClassLoader r4 = r8.getClassLoader();     // Catch: Throwable -> L9
        AbstractC0307g.m702d(r4, "getClassLoader(...)");     // Catch: Throwable -> L9
        Method r42 = m1516a(r4);     // Catch: Throwable -> L9
        if (r42 != null) goto L6;
        boolean r12 = false;
    L7:
        Object r13 = Boolean.valueOf(r12);     // Catch: Throwable -> L9
    L11:
        Object r43 = Boolean.FALSE;
        if ((r13 instanceof C0140f) == false) goto L15;
        r13 = r43;
    L15:
        if (((Boolean) r13).booleanValue() == false) goto L18;
        return true;
    L18:
        if (AbstractC0433r.m1033H0(r10, ".", false) == false) goto L21;
        r10 = AbstractC0324d.m723f("com.tencent.mm.plugin.", r9, r10);
    L21:
        return m1517b(r8, AbstractC0433r.m1031F0(r10, "..", ".", false), r02);
    L6:
        int r5 = r42.getParameterTypes().length;     // Catch: Throwable -> L9
        Object[] r6 = new Object[r5];     // Catch: Throwable -> L9
        r6[0] = r8;     // Catch: Throwable -> L9
        r6[1] = r9;     // Catch: Throwable -> L9
        r6[2] = r10;     // Catch: Throwable -> L9
        r6[3] = r1;     // Catch: Throwable -> L9
        r42.invoke(null, Arrays.copyOf(r6, r5));     // Catch: Throwable -> L9
        r12 = true;
    L9:
        th = move-exception;
        r13 = AbstractC0040p.m116u(th);
        goto L11
    }

    /* JADX INFO: renamed from: d */
    public static void m1519d(Intent r4, Map r5) {
        Iterator r52 = r5.entrySet().iterator();
    L4:
        if (r52.hasNext() == false) goto L21;
        Map.Entry r02 = (Map.Entry) r52.next();
        String r1 = (String) r02.getKey();
        Object r03 = r02.getValue();
        if (r03 == null) goto L4;
        if ((r03 instanceof String) == true) goto L10;
        if ((r03 instanceof Boolean) == true) goto L13;
        if ((r03 instanceof Integer) == true) goto L16;
        if ((r03 instanceof Long) == true) goto L19;
        r4.putExtra(r1, r03.toString());
        goto L4
    L19:
        r4.putExtra(r1, ((Number) r03).longValue());
        goto L4
    L16:
        r4.putExtra(r1, ((Number) r03).intValue());
        goto L4
    L13:
        r4.putExtra(r1, ((Boolean) r03).booleanValue());
        goto L4
    L10:
        r4.putExtra(r1, (String) r03);
        goto L4
    }
}
