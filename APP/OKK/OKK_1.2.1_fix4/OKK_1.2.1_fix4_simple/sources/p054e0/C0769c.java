package p054e0;

import com.abc.core.hooks.ModuleLog;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0183n;
import p026N0.AbstractC0270k;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p037U.C0375k;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: e0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0769c {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f2728a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicInteger f2729b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicInteger f2730c = null;

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f2731d = null;

    static {
        f2728a = new ConcurrentHashMap();
        f2729b = new AtomicInteger(0);
        f2730c = new AtomicInteger(0);
        f2731d = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static List m1961a() {
        Collection r02 = f2728a.values();
        AbstractC0307g.m702d(r02, "<get-values>(...)");
        ArrayList r1 = new ArrayList();
        Iterator r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L8;
        Object r2 = r03.next();
        if (((C0767a) r2).f2720b != EnumC0768b.f2724b) goto L4;
        r1.add(r2);
        goto L4
    L8:
        ArrayList r04 = new ArrayList(AbstractC0183n.m559k0(r1, 10));
        Iterator r12 = r1.iterator();
    L10:
        if (r12.hasNext() == false) goto L13;
        r04.add(((C0767a) r12.next()).f2719a);
        goto L10
    L13:
        if (r04.size() <= 1) goto L26;
        Object[] r05 = r04.toArray(new Comparable[0]);
        Comparable[] r13 = (Comparable[]) r05;
        AbstractC0307g.m703e(r13, "<this>");
        if (r13.length <= 1) goto L19;
        Arrays.sort(r13);
    L19:
        return AbstractC0179j.m530g0(r05);
    L26:
        return AbstractC0181l.m553y0(r04);
    }

    /* JADX INFO: renamed from: b */
    public static void m1962b(String r1, InterfaceC0275a r2) {
        ConcurrentHashMap r02 = f2731d;     // Catch: Throwable -> L7
        r02.remove(r1);     // Catch: Throwable -> L7
        r2.invoke();     // Catch: Throwable -> L7
        C0139e r22 = (C0139e) r02.get(r1);     // Catch: Throwable -> L7
        if (r22 != null) goto L5;
    L9:
        if (r22 == null) goto L12;
        String r23 = (String) r22.f329b;     // Catch: Throwable -> L7
        if (r23 == null) goto L12;
    L13:
        m1964d(r1, r23);     // Catch: Throwable -> L7
        return;
    L12:
        r23 = "";
        goto L13
    L5:
        if (((Boolean) r22.f328a).booleanValue() == true) goto L9;
        m1965e(r1, (String) r22.f329b);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        m1963c(r1, th);     // Catch: Throwable -> L17
        return;
    L17:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: c */
    public static void m1963c(String r4, Throwable r5) {
        String r52 = r5.getClass().getSimpleName() + ": " + r5.getMessage();
        f2728a.put(r4, new C0767a(r4, EnumC0768b.f2724b, r52));
        f2730c.incrementAndGet();
        m1970j("FAIL " + r4 + " -> " + r52);
        ModuleLog.INSTANCE.m1812e("功能安装失败: " + r4 + " · " + r52);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: d */
    public static void m1964d(String r5, String r6) {
        f2728a.put(r5, new C0767a(r5, EnumC0768b.f2723a, r6));
        f2729b.incrementAndGet();
        m1970j("OK  " + r5 + " " + AbstractC0425j.m1021Z0(r6, 80));
        ModuleLog r2 = ModuleLog.INSTANCE;     // Catch: Throwable -> L6
        if (AbstractC0425j.m1013R0(r6) == false) goto L8;
        String r62 = "";
    L9:
        r2.m1813i("功能安装成功: " + r5 + r62);     // Catch: Throwable -> L6
        return;
    L8:
        r62 = " · ".concat(r6);     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: e */
    public static void m1965e(String r4, String r5) {
        AbstractC0307g.m703e(r5, "detail");
        f2728a.put(r4, new C0767a(r4, EnumC0768b.f2726d, r5));
        m1970j("PARTIAL " + r4 + " " + r5);
        ModuleLog.INSTANCE.m1814w("功能部分生效: " + r4 + " · " + r5);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: f */
    public static void m1966f() {
        File r2 = new File("/sdcard/Android/media/com.tencent.mm/OKK");
        r2.mkdirs();     // Catch: Throwable -> L7
        File r3 = new File(r2, "hook_features.txt");     // Catch: Throwable -> L7
        StringBuilder r22 = new StringBuilder();     // Catch: Throwable -> L7
        r22.append("time=" + System.currentTimeMillis());     // Catch: Throwable -> L7
        r22.append('\n');     // Catch: Throwable -> L7
        r22.append(m1969i());     // Catch: Throwable -> L7
        r22.append('\n');     // Catch: Throwable -> L7
        r22.append("---");     // Catch: Throwable -> L7
        r22.append('\n');     // Catch: Throwable -> L7
        Iterator r4 = m1968h().iterator();     // Catch: Throwable -> L7
    L5:
        if (r4.hasNext() == false) goto L9;
        C0767a r5 = (C0767a) r4.next();     // Catch: Throwable -> L7
        r22.append(r5.f2720b + "\t" + r5.f2719a + "\t" + r5.f2721c);     // Catch: Throwable -> L7
        r22.append('\n');     // Catch: Throwable -> L7
        goto L5
    L9:
        String r02 = r22.toString();     // Catch: Throwable -> L7
        AbstractC0307g.m702d(r02, "toString(...)");     // Catch: Throwable -> L7
        AbstractC0270k.m694k0(r3, r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: g */
    public static void m1967g(String r3, String r4, boolean r5) {
        f2731d.put(r3, new C0139e(Boolean.valueOf(r5), r4));
        m1970j("effective report " + r3 + " ok=" + r5 + " " + r4);
    }

    /* JADX INFO: renamed from: h */
    public static List m1968h() {
        Collection r02 = f2728a.values();
        AbstractC0307g.m702d(r02, "<get-values>(...)");
        return AbstractC0181l.m548t0(r02, new C0375k(1));
    }

    /* JADX INFO: renamed from: i */
    public static String m1969i() {
        ConcurrentHashMap r02 = f2728a;
        Collection r1 = r02.values();
        AbstractC0307g.m702d(r1, "<get-values>(...)");
        int r5 = 0;
        if (r1.isEmpty() == false) goto L5;
        int r3 = 0;
    L15:
        Collection r12 = r02.values();
        AbstractC0307g.m702d(r12, "<get-values>(...)");
        if (r12.isEmpty() == false) goto L18;
        int r6 = 0;
    L28:
        Collection r13 = r02.values();
        AbstractC0307g.m702d(r13, "<get-values>(...)");
        if (r13.isEmpty() == false) goto L31;
        int r7 = 0;
    L41:
        Collection r14 = r02.values();
        AbstractC0307g.m702d(r14, "<get-values>(...)");
        if (r14.isEmpty() == true) goto L55;
        Iterator r15 = r14.iterator();
    L46:
        if (r15.hasNext() == false) goto L55;
        if (((C0767a) r15.next()).f2720b != EnumC0768b.f2726d) goto L46;
        r5 = r5 + 1;
        if (r5 >= 0) goto L46;
        AbstractC0182m.m557i0();
        throw null;
    L55:
        return "ok=" + r3 + " partial=" + r5 + " fail=" + r6 + " skip=" + r7 + " total=" + r02.size();
    L31:
        Iterator r16 = r13.iterator();
        r7 = 0;
    L33:
        if (r16.hasNext() == false) goto L41;
        if (((C0767a) r16.next()).f2720b != EnumC0768b.f2725c) goto L33;
        r7 = r7 + 1;
        if (r7 >= 0) goto L33;
        AbstractC0182m.m557i0();
        throw null;
    L18:
        Iterator r17 = r12.iterator();
        r6 = 0;
    L20:
        if (r17.hasNext() == false) goto L28;
        if (((C0767a) r17.next()).f2720b != EnumC0768b.f2724b) goto L20;
        r6 = r6 + 1;
        if (r6 >= 0) goto L20;
        AbstractC0182m.m557i0();
        throw null;
    L5:
        Iterator r18 = r1.iterator();
        r3 = 0;
    L7:
        if (r18.hasNext() == false) goto L15;
        if (((C0767a) r18.next()).f2720b != EnumC0768b.f2723a) goto L7;
        r3 = r3 + 1;
        if (r3 >= 0) goto L7;
        AbstractC0182m.m557i0();
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static void m1970j(String r2) {
        AbstractC0762d.m1954d("[OKK-FeatureReg] " + r2);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }
}
