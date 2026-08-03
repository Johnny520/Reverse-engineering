package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1948E;
import io.sentry.protocol.C1951a;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1964n;
import io.sentry.protocol.C1970t;
import io.sentry.util.C2029a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.sentry.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1979q1 implements InterfaceC1645X {

    /* JADX INFO: renamed from: a */
    public InterfaceC1895i0 f7079a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f7080b;

    /* JADX INFO: renamed from: c */
    public C1948E f7081c;

    /* JADX INFO: renamed from: d */
    public String f7082d;

    /* JADX INFO: renamed from: e */
    public C1964n f7083e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f7084f;

    /* JADX INFO: renamed from: g */
    public volatile Object f7085g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f7086h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f7087i;

    /* JADX INFO: renamed from: j */
    public final CopyOnWriteArrayList f7088j;

    /* JADX INFO: renamed from: k */
    public volatile C2046v2 f7089k;

    /* JADX INFO: renamed from: l */
    public volatile C1581F2 f7090l;

    /* JADX INFO: renamed from: m */
    public final C2029a f7091m;

    /* JADX INFO: renamed from: n */
    public final C2029a f7092n;

    /* JADX INFO: renamed from: o */
    public final C2029a f7093o;

    /* JADX INFO: renamed from: p */
    public final C1953c f7094p;

    /* JADX INFO: renamed from: q */
    public final CopyOnWriteArrayList f7095q;

    /* JADX INFO: renamed from: r */
    public C1918l f7096r;

    /* JADX INFO: renamed from: s */
    public C1970t f7097s;

    /* JADX INFO: renamed from: t */
    public InterfaceC1826b0 f7098t;

    /* JADX INFO: renamed from: u */
    public final Map f7099u;

    public C1979q1(C2046v2 c2046v2) {
        this.f7080b = new WeakReference(null);
        this.f7084f = new ArrayList();
        this.f7086h = new ConcurrentHashMap();
        this.f7087i = new ConcurrentHashMap();
        this.f7088j = new CopyOnWriteArrayList();
        this.f7091m = new C2029a();
        this.f7092n = new C2029a();
        this.f7093o = new C2029a();
        this.f7094p = new C1953c();
        this.f7095q = new CopyOnWriteArrayList();
        this.f7097s = C1970t.f7011b;
        this.f7098t = C1626R0.f5844a;
        this.f7099u = Collections.synchronizedMap(new WeakHashMap());
        AbstractC1856a.m4048D("SentryOptions is required.", c2046v2);
        this.f7089k = c2046v2;
        this.f7085g = m4154b(this.f7089k.getMaxBreadcrumbs());
        this.f7096r = new C1918l();
    }

    /* JADX INFO: renamed from: b */
    public static Queue m4154b(int i) {
        return i > 0 ? new C1609M2(new C1879h(i)) : new C2060y();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: A */
    public final C1948E mo3751A() {
        return this.f7081c;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: B */
    public final void mo3752B(C1918l c1918l) {
        this.f7096r = c1918l;
        C1589H2 c1589h2 = new C1589H2((C1970t) c1918l.f6805b, (C1601K2) c1918l.f6806c, "default", null);
        c1589h2.f5746i = "auto";
        Iterator<InterfaceC1648Y> it = this.f7089k.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo3786d(c1589h2, this);
        }
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: C */
    public final EnumC1657a2 mo3753C() {
        return null;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: D */
    public final C1970t mo3754D() {
        return this.f7097s;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: E */
    public final C1918l mo3755E() {
        return this.f7096r;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: F */
    public final C1581F2 mo3756F(InterfaceC1936o1 interfaceC1936o1) {
        C1981r c1981rM4173a = this.f7091m.m4173a();
        try {
            interfaceC1936o1.mo3613a(this.f7090l);
            C1581F2 c1581f2Clone = this.f7090l != null ? this.f7090l.clone() : null;
            c1981rM4173a.close();
            return c1581f2Clone;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: G */
    public final List mo3757G() {
        return AbstractC1856a.m4054J(this.f7088j);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: H */
    public final void mo3758H(String str) {
        this.f7082d = str;
        C1953c c1953c = this.f7094p;
        C1951a c1951aMo4122d = c1953c.mo4122d();
        if (c1951aMo4122d == null) {
            c1951aMo4122d = new C1951a();
            c1953c.mo4130l(c1951aMo4122d);
        }
        if (str == null) {
            c1951aMo4122d.f6880i = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c1951aMo4122d.f6880i = arrayList;
        }
        Iterator<InterfaceC1648Y> it = this.f7089k.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo3787e(c1953c);
        }
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: I */
    public final String mo3759I() {
        InterfaceC1895i0 interfaceC1895i0 = this.f7079a;
        if (interfaceC1895i0 != null) {
            return interfaceC1895i0.getName();
        }
        return null;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: J */
    public final InterfaceC1826b0 mo3760J() {
        return this.f7098t;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: K */
    public final Map mo3761K() {
        return AbstractC1856a.m4045A(this.f7086h);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: a */
    public final C1964n mo3762a() {
        return this.f7083e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    @Override // io.sentry.InterfaceC1645X
    public final void clear() {
        this.f7081c = null;
        this.f7083e = null;
        this.f7082d = null;
        this.f7084f.clear();
        this.f7085g.clear();
        Iterator<InterfaceC1648Y> it = this.f7089k.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo3783a(this.f7085g);
        }
        this.f7086h.clear();
        this.f7087i.clear();
        this.f7088j.clear();
        mo3771o();
        this.f7095q.clear();
    }

    @Override // io.sentry.InterfaceC1645X
    public final InterfaceC1645X clone() {
        return new C1979q1(this);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: d */
    public final InterfaceC1895i0 mo3763d() {
        return this.f7079a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Queue] */
    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: f */
    public final void mo3764f(C1871f c1871f, C1586H c1586h) {
        if (c1871f == null || (this.f7085g instanceof C2060y)) {
            return;
        }
        if (c1586h == null) {
            new C1586H();
        }
        this.f7089k.getBeforeBreadcrumb();
        this.f7085g.add(c1871f);
        for (InterfaceC1648Y interfaceC1648Y : this.f7089k.getScopeObservers()) {
            interfaceC1648Y.mo3785c(c1871f);
            interfaceC1648Y.mo3783a(this.f7085g);
        }
    }

    @Override // io.sentry.InterfaceC1645X
    public final Map getExtras() {
        return this.f7087i;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: i */
    public final C1581F2 mo3765i() {
        C1981r c1981rM4173a = this.f7091m.m4173a();
        try {
            C1581F2 c1581f2 = null;
            if (this.f7090l != null) {
                C1581F2 c1581f22 = this.f7090l;
                c1581f22.getClass();
                c1581f22.m3663b(AbstractC1856a.m4067m());
                this.f7089k.getContinuousProfiler().mo3702p();
                C1581F2 c1581f2Clone = this.f7090l.clone();
                this.f7090l = null;
                c1581f2 = c1581f2Clone;
            }
            c1981rM4173a.close();
            return c1581f2;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: j */
    public final C1901c mo3766j() {
        C1981r c1981rM4173a = this.f7091m.m4173a();
        try {
            if (this.f7090l != null) {
                C1581F2 c1581f2 = this.f7090l;
                c1581f2.getClass();
                c1581f2.m3663b(AbstractC1856a.m4067m());
                this.f7089k.getContinuousProfiler().mo3702p();
            }
            C1581F2 c1581f22 = this.f7090l;
            C1901c c1901c = null;
            if (this.f7089k.getRelease() != null) {
                String distinctId = this.f7089k.getDistinctId();
                C1948E c1948e = this.f7081c;
                this.f7090l = new C1581F2(EnumC1577E2.Ok, AbstractC1856a.m4067m(), AbstractC1856a.m4067m(), 0, distinctId, AbstractC1856a.m4065k(), Boolean.TRUE, null, null, c1948e != null ? c1948e.f6852d : null, null, this.f7089k.getEnvironment(), this.f7089k.getRelease(), null);
                c1901c = new C1901c(4, this.f7090l.clone(), c1581f22 != null ? c1581f22.clone() : null);
            } else {
                this.f7089k.getLogger().mo3680e(EnumC1657a2.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            c1981rM4173a.close();
            return c1901c;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: k */
    public final void mo3767k(C1970t c1970t) {
        this.f7097s = c1970t;
        Iterator<InterfaceC1648Y> it = this.f7089k.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo3788k(c1970t);
        }
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: l */
    public final C2046v2 mo3768l() {
        return this.f7089k;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: m */
    public final List mo3769m() {
        return this.f7088j;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: n */
    public final List mo3770n() {
        return new CopyOnWriteArrayList(this.f7095q);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: o */
    public final void mo3771o() {
        C1981r c1981rM4173a = this.f7092n.m4173a();
        try {
            this.f7079a = null;
            c1981rM4173a.close();
            for (InterfaceC1648Y interfaceC1648Y : this.f7089k.getScopeObservers()) {
                interfaceC1648Y.mo3784b(null);
                interfaceC1648Y.mo3786d(null, this);
            }
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: p */
    public final void mo3772p(C1627R1 c1627r1) {
        if (!this.f7089k.isTracingEnabled() || c1627r1.m3605a() == null) {
            return;
        }
        Map map = this.f7099u;
        Throwable thM3605a = c1627r1.m3605a();
        AbstractC1856a.m4048D("throwable cannot be null", thM3605a);
        while (thM3605a.getCause() != null && thM3605a.getCause() != thM3605a) {
            thM3605a = thM3605a.getCause();
        }
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: q */
    public final C1953c mo3773q() {
        return this.f7094p;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: r */
    public final C1918l mo3774r(InterfaceC1931n1 interfaceC1931n1) {
        C1981r c1981rM4173a = this.f7093o.m4173a();
        try {
            interfaceC1931n1.mo1427e(this.f7096r);
            C1918l c1918l = new C1918l(this.f7096r);
            c1981rM4173a.close();
            return c1918l;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: s */
    public final String mo3775s() {
        return this.f7082d;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: t */
    public final InterfaceC1876g0 mo3776t() {
        InterfaceC1876g0 interfaceC1876g0Mo3615a;
        InterfaceC1876g0 interfaceC1876g0 = (InterfaceC1876g0) this.f7080b.get();
        if (interfaceC1876g0 != null) {
            return interfaceC1876g0;
        }
        InterfaceC1895i0 interfaceC1895i0 = this.f7079a;
        return (interfaceC1895i0 == null || (interfaceC1876g0Mo3615a = interfaceC1895i0.mo3615a()) == null) ? interfaceC1895i0 : interfaceC1876g0Mo3615a;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: u */
    public final void mo3777u(InterfaceC1940p1 interfaceC1940p1) {
        C1981r c1981rM4173a = this.f7092n.m4173a();
        try {
            interfaceC1940p1.mo1425c(this.f7079a);
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: v */
    public final void mo3778v(C1970t c1970t) {
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: w */
    public final void mo3779w(InterfaceC1895i0 interfaceC1895i0) {
        C1981r c1981rM4173a = this.f7092n.m4173a();
        try {
            this.f7079a = interfaceC1895i0;
            for (InterfaceC1648Y interfaceC1648Y : this.f7089k.getScopeObservers()) {
                if (interfaceC1895i0 != null) {
                    interfaceC1648Y.mo3784b(interfaceC1895i0.getName());
                    interfaceC1648Y.mo3786d(interfaceC1895i0.mo3627m(), this);
                } else {
                    interfaceC1648Y.mo3784b(null);
                    interfaceC1648Y.mo3786d(null, this);
                }
            }
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: x */
    public final List mo3780x() {
        return this.f7084f;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: y */
    public final C1581F2 mo3781y() {
        return this.f7090l;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: z */
    public final Queue mo3782z() {
        return this.f7085g;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m5484clone() {
        return new C1979q1(this);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.Collection] */
    public C1979q1(C1979q1 c1979q1) {
        C1948E c1948e;
        C1964n c1964n = null;
        this.f7080b = new WeakReference(null);
        this.f7084f = new ArrayList();
        this.f7086h = new ConcurrentHashMap();
        this.f7087i = new ConcurrentHashMap();
        this.f7088j = new CopyOnWriteArrayList();
        this.f7091m = new C2029a();
        this.f7092n = new C2029a();
        this.f7093o = new C2029a();
        this.f7094p = new C1953c();
        this.f7095q = new CopyOnWriteArrayList();
        this.f7097s = C1970t.f7011b;
        this.f7098t = C1626R0.f5844a;
        this.f7099u = Collections.synchronizedMap(new WeakHashMap());
        this.f7079a = c1979q1.f7079a;
        this.f7090l = c1979q1.f7090l;
        this.f7089k = c1979q1.f7089k;
        this.f7098t = c1979q1.f7098t;
        C1948E c1948e2 = c1979q1.f7081c;
        if (c1948e2 != null) {
            c1948e = new C1948E();
            c1948e.f6849a = c1948e2.f6849a;
            c1948e.f6851c = c1948e2.f6851c;
            c1948e.f6850b = c1948e2.f6850b;
            c1948e.f6852d = c1948e2.f6852d;
            c1948e.f6853e = c1948e2.f6853e;
            c1948e.f6854f = c1948e2.f6854f;
            c1948e.f6855g = AbstractC1856a.m4045A(c1948e2.f6855g);
            c1948e.f6856h = AbstractC1856a.m4045A(c1948e2.f6856h);
        } else {
            c1948e = null;
        }
        this.f7081c = c1948e;
        this.f7082d = c1979q1.f7082d;
        this.f7097s = c1979q1.f7097s;
        C1964n c1964n2 = c1979q1.f7083e;
        if (c1964n2 != null) {
            c1964n = new C1964n();
            c1964n.f6976a = c1964n2.f6976a;
            c1964n.f6980e = c1964n2.f6980e;
            c1964n.f6977b = c1964n2.f6977b;
            c1964n.f6978c = c1964n2.f6978c;
            c1964n.f6981f = AbstractC1856a.m4045A(c1964n2.f6981f);
            c1964n.f6982g = AbstractC1856a.m4045A(c1964n2.f6982g);
            c1964n.f6984i = AbstractC1856a.m4045A(c1964n2.f6984i);
            c1964n.f6987l = AbstractC1856a.m4045A(c1964n2.f6987l);
            c1964n.f6979d = c1964n2.f6979d;
            c1964n.f6985j = c1964n2.f6985j;
            c1964n.f6983h = c1964n2.f6983h;
            c1964n.f6986k = c1964n2.f6986k;
        }
        this.f7083e = c1964n;
        this.f7084f = new ArrayList(c1979q1.f7084f);
        this.f7088j = new CopyOnWriteArrayList(c1979q1.f7088j);
        C1871f[] c1871fArr = (C1871f[]) c1979q1.f7085g.toArray(new C1871f[0]);
        Queue queueM4154b = m4154b(c1979q1.f7089k.getMaxBreadcrumbs());
        for (C1871f c1871f : c1871fArr) {
            queueM4154b.add(new C1871f(c1871f));
        }
        this.f7085g = queueM4154b;
        ConcurrentHashMap concurrentHashMap = c1979q1.f7086h;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f7086h = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = c1979q1.f7087i;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap4.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.f7087i = concurrentHashMap4;
        this.f7094p = new C1953c(c1979q1.f7094p);
        this.f7095q = new CopyOnWriteArrayList(c1979q1.f7095q);
        this.f7096r = new C1918l(c1979q1.f7096r);
    }
}
