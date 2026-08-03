package io.sentry.android.core;

import io.sentry.C1586H;
import io.sentry.C1589H2;
import io.sentry.C1601K2;
import io.sentry.C1627R1;
import io.sentry.C1981r;
import io.sentry.EnumC1579F0;
import io.sentry.EnumC1605L2;
import io.sentry.InterfaceC1566C;
import io.sentry.android.core.internal.util.C1716d;
import io.sentry.android.core.performance.C1740f;
import io.sentry.android.core.performance.C1741g;
import io.sentry.android.core.performance.EnumC1739e;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1951a;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1960j;
import io.sentry.protocol.C1970t;
import io.sentry.protocol.C1973w;
import io.sentry.util.C2029a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.C0252Fu;

/* JADX INFO: renamed from: io.sentry.android.core.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C1682Z implements InterfaceC1566C {

    /* JADX INFO: renamed from: a */
    public final C0252Fu f6068a;

    /* JADX INFO: renamed from: b */
    public final SentryAndroidOptions f6069b;

    /* JADX INFO: renamed from: c */
    public final C2029a f6070c;

    public C1682Z(SentryAndroidOptions r2, C0252Fu r3) {
        this.f6070c = new C2029a();
        AbstractC1856a.m4048D("SentryAndroidOptions is required", r2);
        this.f6069b = r2;
        this.f6068a = r3;
    }

    /* JADX INFO: renamed from: a */
    public static void m3863a(C1740f r10, C1944A r11) {
        if (r10.f6306a != EnumC1739e.COLD) goto L34;
        C1953c r0 = r11.f5605b;
        ArrayList r112 = r11.f6842s;
        C1589H2 r02 = r0.mo4126h();
        if (r02 != null) goto L8;
        return;
    L8:
        C1970t r03 = r02.f5738a;
        Iterator r1 = r112.iterator();
    L10:
        if (r1.hasNext() == false) goto L14;
        C1973w r2 = (C1973w) r1.next();
        if (r2.f7025f.contentEquals("app.start.cold") == false) goto L10;
        C1601K2 r12 = r2.f7023d;
    L15:
        C1741g r22 = new C1741g();
        C1741g r3 = r10.f6308c;
        long r4 = r3.f6321b;
        long r6 = r3.f6322c;
        long r8 = C1740f.f6303o;
        r22.f6320a = "Process Initialization";
        r22.f6321b = r4;
        r22.f6322c = r6;
        r22.f6323d = r8;
        if (r22.m3919b() == true) goto L18;
    L20:
        ArrayList r23 = new ArrayList(r10.f6311f.values());
        Collections.sort(r23);
        if (r23.isEmpty() == true) goto L26;
        Iterator r24 = r23.iterator();
    L24:
        if (r24.hasNext() == false) goto L26;
        r112.add(m3866e((C1741g) r24.next(), r12, r03, "contentprovider.load"));
    L26:
        C1741g r102 = r10.f6310e;
        if (r102.f6323d == 0) goto L35;
        r112.add(m3866e(r102, r12, r03, "application.load"));
        return;
    L35:
        return;
    L18:
        if (Math.abs(r22.m3918a()) > 10000) goto L20;
        r112.add(m3866e(r22, r12, r03, "process.load"));
        goto L20
    L14:
        r12 = null;
        goto L15
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3864b(C1944A r5) {
        Iterator r0 = r5.f6842s.iterator();
    L4:
        if (r0.hasNext() == false) goto L10;
        C1973w r1 = (C1973w) r0.next();
        if (r1.f7025f.contentEquals("app.start.cold") == true) goto L25;
        if (r1.f7025f.contentEquals("app.start.warm") == false) goto L4;
        return true;
    L25:
        return true;
    L10:
        C1589H2 r52 = r5.f5605b.mo4126h();
        if (r52 == null) goto L18;
        String r53 = r52.f5742e;
        if (r53.equals("app.start.cold") == false) goto L15;
        return true;
    L15:
        if (r53.equals("app.start.warm") == false) goto L27;
        return true;
    L27:
        return false;
    L18:
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m3865c(C1944A r11) {
        ArrayList r112 = r11.f6842s;
        Iterator r0 = r112.iterator();
        C1973w r1 = null;
        C1973w r2 = null;
    L4:
        if (r0.hasNext() == false) goto L13;
        C1973w r3 = (C1973w) r0.next();
        if ("ui.load.initial_display".equals(r3.f7025f) == false) goto L9;
        r1 = r3;
    L11:
        if (r1 == null) goto L4;
        if (r2 == null) goto L4;
    L9:
        if ("ui.load.full_display".equals(r3.f7025f) == false) goto L11;
        r2 = r3;
    L13:
        if (r1 != null) goto L16;
        if (r2 != null) goto L16;
        return;
    L16:
        Iterator r113 = r112.iterator();
    L18:
        if (r113.hasNext() == false) goto L78;
        C1973w r02 = (C1973w) r113.next();
        if (r02 == r1) goto L18;
        if (r02 == r2) goto L18;
        Map r32 = r02.f7030k;
        Double r4 = r02.f7020a;
        boolean r5 = false;
        if (r32 == null) goto L31;
        Object r33 = r32.get("thread.name");
        if (r33 == null) goto L31;
        if ("main".equals(r33) == true) goto L31;
        boolean r34 = false;
    L32:
        if (r1 == null) goto L41;
        double r7 = r4.doubleValue();
        if (r7 < r1.f7020a.doubleValue()) goto L41;
        Double r9 = r1.f7021b;
        if (r9 != null) goto L38;
    L39:
        if (r34 == false) goto L41;
        boolean r35 = true;
    L42:
        if (r2 == null) goto L50;
        double r72 = r4.doubleValue();
        if (r72 < r2.f7020a.doubleValue()) goto L50;
        Double r42 = r2.f7021b;
        if (r42 != null) goto L48;
    L49:
        r5 = true;
        goto L50
    L48:
        if (r72 <= r42.doubleValue()) goto L49;
    L50:
        if (r35 == true) goto L52;
        if (r5 == false) goto L18;
    L52:
        Map r43 = r02.f7030k;
        if (r43 != null) goto L55;
        r43 = new ConcurrentHashMap();
        r02.f7030k = r43;
    L55:
        if (r35 == false) goto L57;
        r43.put("ui.contributes_to_ttid", Boolean.TRUE);
    L57:
        if (r5 == false) goto L18;
        r43.put("ui.contributes_to_ttfd", Boolean.TRUE);
        goto L18
    L38:
        if (r7 <= r9.doubleValue()) goto L39;
    L41:
        r35 = false;
    L31:
        r34 = true;
        goto L32
    }

    /* JADX INFO: renamed from: e */
    public static C1973w m3866e(C1741g r13, C1601K2 r14, C1970t r15, String r16) {
        HashMap r12 = new HashMap(2);
        r12.put("thread.id", Long.valueOf(C1716d.f6224b));
        r12.put("thread.name", "main");
        Boolean r0 = Boolean.TRUE;
        r12.put("ui.contributes_to_ttid", r0);
        r12.put("ui.contributes_to_ttfd", r0);
        Double r1 = Double.valueOf(r13.f6321b / 1000.0d);
        if (r13.m3919b() == false) goto L5;
        long r7 = r13.m3918a() + r13.f6321b;
    L7:
        return new C1973w(r1, Double.valueOf(r7 / 1000.0d), r15, new C1601K2(), r14, r16, r13.f6320a, EnumC1605L2.f5786OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), r12);
    L5:
        r7 = 0;
        goto L7
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: f */
    public final C1944A mo3584f(C1944A r10, C1586H r11) {
        SentryAndroidOptions r112 = this.f6069b;
        C1981r r0 = this.f6070c.m4173a();
    L19:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L56
    L58:
        throw th;
    L56:
        th = move-exception;
        th.addSuppressed(th);
        goto L58
    L4:
        if (r112.isTracingEnabled() == true) goto L7;
        r0.close();
        return r10;
    L7:
        C1740f r1 = C1740f.m3914b();     // Catch: Throwable -> L19
        boolean r2 = m3864b(r10);     // Catch: Throwable -> L19
        HashMap r3 = r10.f6843t;
        C1953c r4 = r10.f5605b;
        if (r2 == true) goto L11;
    L31:
        m3865c(r10);     // Catch: Throwable -> L19
        C1970t r113 = r10.f5604a;     // Catch: Throwable -> L19
        C1589H2 r12 = r4.mo4126h();     // Catch: Throwable -> L19
        if (r113 == null) goto L52;
        if (r12 == null) goto L52;
        if (r12.f5742e.contentEquals("ui.load") == false) goto L52;
        C0252Fu r13 = this.f6068a;     // Catch: Throwable -> L19
        ConcurrentHashMap r22 = (ConcurrentHashMap) r13.f821c;     // Catch: Throwable -> L19
        C1981r r42 = ((C2029a) r13.f824f).m4173a();     // Catch: Throwable -> L19
    L46:
        th = move-exception;
        r42.close();     // Catch: Throwable -> L49
    L51:
        throw th;     // Catch: Throwable -> L19
    L49:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L19
        goto L51
    L38:
        if (r13.m531h() == true) goto L41;
        r42.close();     // Catch: Throwable -> L19
        Map r114 = null;
    L43:
        if (r114 == null) goto L52;
        r3.putAll(r114);     // Catch: Throwable -> L19
        goto L52
    L41:
        Map r14 = (Map) r22.get(r113);     // Catch: Throwable -> L46
        r22.remove(r113);     // Catch: Throwable -> L46
        r42.close();     // Catch: Throwable -> L19
        r114 = r14;
        goto L43
    L52:
        r0.close();
        return r10;
    L11:
        if (r1.f6317l == true) goto L13;
    L23:
        C1951a r115 = r4.mo4122d();     // Catch: Throwable -> L19
        if (r115 != null) goto L27;
        r115 = new C1951a();     // Catch: Throwable -> L19
        r4.mo4130l(r115);     // Catch: Throwable -> L19
    L27:
        if (r1.f6306a != EnumC1739e.COLD) goto L29;
        String r15 = "cold";
    L30:
        r115.f6881j = r15;     // Catch: Throwable -> L19
        goto L31
    L29:
        r15 = "warm";
        goto L30
    L13:
        if (r1.f6307b == false) goto L23;
        long r5 = r1.m3915a(r112).m3918a();     // Catch: Throwable -> L19
        if (r5 == 0) goto L23;
        C1960j r116 = new C1960j(Float.valueOf(r5), EnumC1579F0.MILLISECOND.apiName());     // Catch: Throwable -> L19
        if (r1.f6306a != EnumC1739e.COLD) goto L21;
        String r23 = "app_start_cold";
    L22:
        r3.put(r23, r116);     // Catch: Throwable -> L19
        m3863a(r1, r10);     // Catch: Throwable -> L19
        r1.f6317l = false;     // Catch: Throwable -> L19
        r1.f6311f.clear();     // Catch: Throwable -> L19
        r1.f6312g.clear();     // Catch: Throwable -> L19
        goto L23
    L21:
        r23 = "app_start_warm";
        goto L22
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: i */
    public final C1627R1 mo3585i(C1627R1 r1, C1586H r2) {
        return r1;
    }
}
