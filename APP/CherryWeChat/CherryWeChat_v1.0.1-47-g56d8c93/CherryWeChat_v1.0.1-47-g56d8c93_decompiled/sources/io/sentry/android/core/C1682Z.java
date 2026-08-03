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
    public final C2029a f6070c = new C2029a();

    public C1682Z(SentryAndroidOptions sentryAndroidOptions, C0252Fu c0252Fu) {
        AbstractC1856a.m4048D("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f6069b = sentryAndroidOptions;
        this.f6068a = c0252Fu;
    }

    /* JADX INFO: renamed from: a */
    public static void m3863a(C1740f c1740f, C1944A c1944a) {
        C1601K2 c1601k2;
        if (c1740f.f6306a != EnumC1739e.COLD) {
            return;
        }
        C1953c c1953c = c1944a.f5605b;
        ArrayList arrayList = c1944a.f6842s;
        C1589H2 c1589h2Mo4126h = c1953c.mo4126h();
        if (c1589h2Mo4126h == null) {
            return;
        }
        C1970t c1970t = c1589h2Mo4126h.f5738a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                c1601k2 = null;
                break;
            }
            C1973w c1973w = (C1973w) it.next();
            if (c1973w.f7025f.contentEquals("app.start.cold")) {
                c1601k2 = c1973w.f7023d;
                break;
            }
        }
        C1741g c1741g = new C1741g();
        C1741g c1741g2 = c1740f.f6308c;
        long j = c1741g2.f6321b;
        long j2 = c1741g2.f6322c;
        long j3 = C1740f.f6303o;
        c1741g.f6320a = "Process Initialization";
        c1741g.f6321b = j;
        c1741g.f6322c = j2;
        c1741g.f6323d = j3;
        if (c1741g.m3919b() && Math.abs(c1741g.m3918a()) <= 10000) {
            arrayList.add(m3866e(c1741g, c1601k2, c1970t, "process.load"));
        }
        ArrayList arrayList2 = new ArrayList(c1740f.f6311f.values());
        Collections.sort(arrayList2);
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(m3866e((C1741g) it2.next(), c1601k2, c1970t, "contentprovider.load"));
            }
        }
        C1741g c1741g3 = c1740f.f6310e;
        if (c1741g3.f6323d != 0) {
            arrayList.add(m3866e(c1741g3, c1601k2, c1970t, "application.load"));
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3864b(C1944A c1944a) {
        for (C1973w c1973w : c1944a.f6842s) {
            if (c1973w.f7025f.contentEquals("app.start.cold") || c1973w.f7025f.contentEquals("app.start.warm")) {
                return true;
            }
        }
        C1589H2 c1589h2Mo4126h = c1944a.f5605b.mo4126h();
        if (c1589h2Mo4126h == null) {
            return false;
        }
        String str = c1589h2Mo4126h.f5742e;
        return str.equals("app.start.cold") || str.equals("app.start.warm");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3865c(C1944A c1944a) {
        Double d;
        Double d2;
        Object obj;
        ArrayList<C1973w> arrayList = c1944a.f6842s;
        C1973w c1973w = null;
        C1973w c1973w2 = null;
        for (C1973w c1973w3 : arrayList) {
            if ("ui.load.initial_display".equals(c1973w3.f7025f)) {
                c1973w = c1973w3;
            } else if ("ui.load.full_display".equals(c1973w3.f7025f)) {
                c1973w2 = c1973w3;
            }
            if (c1973w != null && c1973w2 != null) {
                break;
            }
        }
        if (c1973w == null && c1973w2 == null) {
            return;
        }
        for (C1973w c1973w4 : arrayList) {
            if (c1973w4 != c1973w && c1973w4 != c1973w2) {
                Map map = c1973w4.f7030k;
                Double d3 = c1973w4.f7020a;
                boolean z = false;
                boolean z2 = map == null || (obj = map.get("thread.name")) == null || "main".equals(obj);
                if (c1973w != null) {
                    double dDoubleValue = d3.doubleValue();
                    boolean z3 = dDoubleValue >= c1973w.f7020a.doubleValue() && ((d2 = c1973w.f7021b) == null || dDoubleValue <= d2.doubleValue()) && z2;
                    if (c1973w2 != null) {
                        double dDoubleValue2 = d3.doubleValue();
                        if (dDoubleValue2 >= c1973w2.f7020a.doubleValue() && ((d = c1973w2.f7021b) == null || dDoubleValue2 <= d.doubleValue())) {
                            z = true;
                        }
                    }
                    if (z3 || z) {
                        Map concurrentHashMap = c1973w4.f7030k;
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                            c1973w4.f7030k = concurrentHashMap;
                        }
                        if (z3) {
                            concurrentHashMap.put("ui.contributes_to_ttid", Boolean.TRUE);
                        }
                        if (z) {
                            concurrentHashMap.put("ui.contributes_to_ttfd", Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static C1973w m3866e(C1741g c1741g, C1601K2 c1601k2, C1970t c1970t, String str) {
        long jM3918a;
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(C1716d.f6224b));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        Double dValueOf = Double.valueOf(c1741g.f6321b / 1000.0d);
        if (c1741g.m3919b()) {
            jM3918a = c1741g.m3918a() + c1741g.f6321b;
        } else {
            jM3918a = 0;
        }
        return new C1973w(dValueOf, Double.valueOf(jM3918a / 1000.0d), c1970t, new C1601K2(), c1601k2, str, c1741g.f6320a, EnumC1605L2.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: f */
    public final C1944A mo3584f(C1944A c1944a, C1586H c1586h) {
        Map map;
        SentryAndroidOptions sentryAndroidOptions = this.f6069b;
        C1981r c1981rM4173a = this.f6070c.m4173a();
        try {
            if (!sentryAndroidOptions.isTracingEnabled()) {
                c1981rM4173a.close();
                return c1944a;
            }
            C1740f c1740fM3914b = C1740f.m3914b();
            boolean zM3864b = m3864b(c1944a);
            HashMap map2 = c1944a.f6843t;
            C1953c c1953c = c1944a.f5605b;
            if (zM3864b) {
                if (c1740fM3914b.f6317l && c1740fM3914b.f6307b) {
                    long jM3918a = c1740fM3914b.m3915a(sentryAndroidOptions).m3918a();
                    if (jM3918a != 0) {
                        map2.put(c1740fM3914b.f6306a == EnumC1739e.COLD ? "app_start_cold" : "app_start_warm", new C1960j(Float.valueOf(jM3918a), EnumC1579F0.MILLISECOND.apiName()));
                        m3863a(c1740fM3914b, c1944a);
                        c1740fM3914b.f6317l = false;
                        c1740fM3914b.f6311f.clear();
                        c1740fM3914b.f6312g.clear();
                    }
                }
                C1951a c1951aMo4122d = c1953c.mo4122d();
                if (c1951aMo4122d == null) {
                    c1951aMo4122d = new C1951a();
                    c1953c.mo4130l(c1951aMo4122d);
                }
                c1951aMo4122d.f6881j = c1740fM3914b.f6306a == EnumC1739e.COLD ? "cold" : "warm";
            }
            m3865c(c1944a);
            C1970t c1970t = c1944a.f5604a;
            C1589H2 c1589h2Mo4126h = c1953c.mo4126h();
            if (c1970t != null && c1589h2Mo4126h != null && c1589h2Mo4126h.f5742e.contentEquals("ui.load")) {
                C0252Fu c0252Fu = this.f6068a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0252Fu.f821c;
                C1981r c1981rM4173a2 = ((C2029a) c0252Fu.f824f).m4173a();
                try {
                    if (c0252Fu.m531h()) {
                        Map map3 = (Map) concurrentHashMap.get(c1970t);
                        concurrentHashMap.remove(c1970t);
                        c1981rM4173a2.close();
                        map = map3;
                    } else {
                        c1981rM4173a2.close();
                        map = null;
                    }
                    if (map != null) {
                        map2.putAll(map);
                    }
                } finally {
                }
            }
            c1981rM4173a.close();
            return c1944a;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: i */
    public final C1627R1 mo3585i(C1627R1 c1627r1, C1586H c1586h) {
        return c1627r1;
    }
}
