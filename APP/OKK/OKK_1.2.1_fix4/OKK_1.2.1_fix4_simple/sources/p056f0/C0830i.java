package p056f0;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.AbstractC0040p;
import p001A0.RunnableC0028d;
import p007D0.C0137c;
import p007D0.C0140f;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0183n;
import p009E0.AbstractC0193x;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p049b0.AbstractC0561k;
import p049b0.C0551a;
import p049b0.C0564n;
import p049b0.EnumC0563m;
import p054e0.C0767a;
import p054e0.C0769c;

/* JADX INFO: renamed from: f0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0830i {

    /* JADX INFO: renamed from: a */
    public static final C0830i f3000a = null;

    /* JADX INFO: renamed from: b */
    public static final Handler f3001b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f3002c = null;

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f3003d = null;

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f3004e = null;

    /* JADX INFO: renamed from: f */
    public static final AtomicInteger f3005f = null;

    /* JADX INFO: renamed from: g */
    public static WeakReference f3006g;

    /* JADX INFO: renamed from: h */
    public static Context f3007h;

    /* JADX INFO: renamed from: i */
    public static ClassLoader f3008i;

    static {
        f3000a = new C0830i();
        f3001b = new Handler(Looper.getMainLooper());
        f3002c = new AtomicBoolean(false);
        f3003d = new AtomicBoolean(false);
        f3004e = new AtomicBoolean(false);
        f3005f = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m2151a(Activity r1, String r2) {
        f3006g = new WeakReference(r1);
        if (m2153c(r1) == false) goto L7;
        m2156f(r2);
        return;
    }

    /* JADX INFO: renamed from: b */
    public static Activity m2152b() {
        Object r02 = null;
        Object r1 = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", null).invoke(null, null);     // Catch: Throwable -> L9
        if (r1 != null) goto L6;
        return null;
    L6:
        Field r2 = r1.getClass().getDeclaredField("mActivities");     // Catch: Throwable -> L9
        r2.setAccessible(true);     // Catch: Throwable -> L9
        Object r12 = r2.get(r1);     // Catch: Throwable -> L9
        if ((r12 instanceof Map) == false) goto L11;
        Map r13 = (Map) r12;     // Catch: Throwable -> L9
    L12:
        if (r13 != null) goto L14;
        return null;
    L14:
        Iterator r14 = r13.values().iterator();     // Catch: Throwable -> L9
    L15:
        if (r14.hasNext() == false) goto L44;
        Object r22 = r14.next();     // Catch: Throwable -> L9
        if (r22 == null) goto L15;
        Field r4 = r22.getClass().getDeclaredField("paused");     // Catch: Throwable -> L21
        r4.setAccessible(true);     // Catch: Throwable -> L21
        Object r42 = Boolean.valueOf(r4.getBoolean(r22));     // Catch: Throwable -> L21
    L23:
        Object r5 = Boolean.TRUE;     // Catch: Throwable -> L9
        if ((r42 instanceof C0140f) == false) goto L27;
        r42 = r5;
    L27:
        if (((Boolean) r42).booleanValue() == true) goto L15;
        Field r43 = r22.getClass().getDeclaredField("activity");     // Catch: Throwable -> L32
        r43.setAccessible(true);     // Catch: Throwable -> L32
        Object r23 = r43.get(r22);     // Catch: Throwable -> L32
        if ((r23 instanceof Activity) == false) goto L34;
        Object r24 = (Activity) r23;     // Catch: Throwable -> L32
    L37:
        if ((r24 instanceof C0140f) == false) goto L39;
        r24 = null;
    L39:
        Activity r25 = (Activity) r24;     // Catch: Throwable -> L9
        if (r25 == null) goto L15;
        if (r25.isFinishing() == true) goto L15;
        return r25;
    L34:
        r24 = null;
        goto L37
    L32:
        th = move-exception;
        r24 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L9
        goto L37
    L21:
        th = move-exception;
        r42 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L9
        goto L23
    L44:
        C0140f r15 = null;
    L47:
        if ((r15 instanceof C0140f) == true) goto L51;
        r02 = r15;
    L51:
        return (Activity) r02;
    L11:
        r13 = null;
    L9:
        th = move-exception;
        r15 = AbstractC0040p.m116u(th);
        goto L47
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2153c(Activity r3) {
        String r32 = r3.getClass().getName();
        if (r32.equals("com.tencent.mm.ui.LauncherUI") == false) goto L6;
        return true;
    L6:
        if (AbstractC0433r.m1028C0(r32, ".LauncherUI") == false) goto L9;
        return true;
    L9:
        if (AbstractC0425j.m1005J0(r32, "LauncherUI", false) == false) goto L14;
        if (AbstractC0425j.m1005J0(r32, "tencent.mm", false) == false) goto L14;
        return true;
    L14:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static String m2154d(String r6, String r7, String r8) {
        List r72 = AbstractC0182m.m556h0(new String[]{r7, r8});
        ArrayList r02 = new ArrayList();
        Iterator r73 = r72.iterator();
    L4:
        if (r73.hasNext() == false) goto L8;
        Object r82 = r73.next();
        if ((!AbstractC0425j.m1013R0((String) r82)) == false) goto L4;
        r02.add(r82);
        goto L4
    L8:
        String r74 = AbstractC0181l.m546r0(r02, " · ", null, null, null, 62);
        if (AbstractC0425j.m1013R0(r6) == false) goto L12;
        return r74;
    L12:
        return r6 + " · " + r74;
    }

    /* JADX INFO: renamed from: e */
    public static C0551a m2155e(C0551a r12) {
        ConcurrentHashMap r02 = C0769c.f2728a;
        List r03 = C0769c.m1968h();
        int r2 = AbstractC0193x.m563g0(AbstractC0183n.m559k0(r03, 10));
        if (r2 >= 16) goto L5;
        r2 = 16;
    L5:
        LinkedHashMap r3 = new LinkedHashMap(r2);
        Iterator r04 = r03.iterator();
    L7:
        if (r04.hasNext() == false) goto L9;
        Object r22 = r04.next();
        r3.put(((C0767a) r22).f2719a, r22);
        goto L7
    L9:
        List r05 = r12.f1641d;
        ArrayList r10 = new ArrayList(AbstractC0183n.m559k0(r05, 10));
        Iterator r06 = r05.iterator();
    L11:
        if (r06.hasNext() == false) goto L32;
        C0564n r1 = (C0564n) r06.next();
        C0767a r23 = (C0767a) r3.get(r1.f1668a);
        if (r23 == null) goto L31;
        int r4 = r23.f2720b.ordinal();
        if (r4 == 0) goto L31;
        EnumC0563m r6 = EnumC0563m.f1666c;
        String r9 = r1.f1671d;
        String r24 = r23.f2721c;
        if (r4 != 1) goto L20;
        r1 = C0564n.m1375a(r1, null, r6, m2154d(r9, "运行时安装失败", r24), 3);
        goto L31
    L20:
        if (r4 == 2) goto L29;
        if (r4 != 3) goto L28;
        if (r1.f1670c == r6) goto L26;
        r6 = EnumC0563m.f1665b;
    L26:
        r1 = C0564n.m1375a(r1, null, r6, m2154d(r9, "运行时部分生效", r24), 3);
        goto L31
    L28:
        throw new C0137c();
    L29:
        r1 = C0564n.m1375a(r1, null, r6, m2154d(r9, "本次未安装", r24), 3);
    L31:
        r10.add(r1);
        goto L11
    L32:
        String r62 = r12.f1638a;
        AbstractC0307g.m703e(r62, "fingerprint");
        String r7 = r12.f1639b;
        AbstractC0307g.m703e(r7, "wechatSummary");
        return new C0551a(r62, r7, r12.f1640c, r10, r12.f1642e);
    }

    /* JADX INFO: renamed from: f */
    public static void m2156f(String r8) {
        if (f3003d.get() == false) goto L6;
        return;
    L6:
        if (AbstractC0358S.f729i == false) goto L8;
    L10:
        WeakReference r02 = f3006g;
        Activity r1 = null;
        if (r02 == null) goto L23;
        Activity r03 = (Activity) r02.get();
        if (r03 == null) goto L23;
        if (m2153c(r03) == true) goto L17;
    L19:
        r03 = null;
    L20:
        if (r03 == null) goto L23;
        final Activity r7 = r03;
    L32:
        if (f3004e.compareAndSet(false, true) == true) goto L34;
        return;
    L34:
        m2157g("start interactive scan (" + r8 + ")");
        Context r82 = f3007h;
        if (r82 != null) goto L37;
        r82 = r7.getApplicationContext();
    L37:
        final Context r3 = r82;
        ClassLoader r83 = f3008i;
        if (r83 != null) goto L40;
        r83 = r7.getClassLoader();
    L40:
        final ClassLoader r4 = r83;
        final String r5 = AbstractC0805P.f2920a;
        final DialogC0823e r6 = new DialogC0823e(r7, AbstractC0561k.f1659b.size());
        f3001b.post(new RunnableC0028d(9, r6));
        new Thread(new RunnableC0821d(r3, r4, r5, r6, r7)).start();
        return;
    L17:
        if (r03.isFinishing() == true) goto L19;
    L23:
        Activity r04 = m2152b();
        if (r04 != null) goto L26;
    L28:
        if (r1 != null) goto L30;
        return;
    L30:
        r7 = r1;
        goto L32
    L26:
        if (m2153c(r04) == false) goto L28;
        r1 = r04;
        goto L28
    L8:
        if (AbstractC0358S.f728h == true) goto L10;
    }

    /* JADX INFO: renamed from: g */
    public static void m2157g(String r2) {
        AbstractC0762d.m1954d("[OKK-CompatUi] " + r2);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }
}
