package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1948E;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1964n;
import io.sentry.protocol.C1970t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.sentry.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1918l implements InterfaceC1645X {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6804a;

    /* JADX INFO: renamed from: b */
    public final Object f6805b;

    /* JADX INFO: renamed from: c */
    public final Object f6806c;

    /* JADX INFO: renamed from: d */
    public final Object f6807d;

    public C1918l(InterfaceC1645X interfaceC1645X, InterfaceC1645X interfaceC1645X2, InterfaceC1645X interfaceC1645X3) {
        this.f6804a = 0;
        this.f6805b = interfaceC1645X;
        this.f6806c = interfaceC1645X2;
        this.f6807d = interfaceC1645X3;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: A */
    public C1948E mo3751A() {
        C1948E c1948eMo3751A = ((InterfaceC1645X) this.f6807d).mo3751A();
        if (c1948eMo3751A != null) {
            return c1948eMo3751A;
        }
        C1948E c1948eMo3751A2 = ((InterfaceC1645X) this.f6806c).mo3751A();
        return c1948eMo3751A2 != null ? c1948eMo3751A2 : ((InterfaceC1645X) this.f6805b).mo3751A();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: B */
    public void mo3752B(C1918l c1918l) {
        m4141b(null).mo3752B(c1918l);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: C */
    public EnumC1657a2 mo3753C() {
        EnumC1657a2 enumC1657a2Mo3753C = ((InterfaceC1645X) this.f6807d).mo3753C();
        if (enumC1657a2Mo3753C != null) {
            return enumC1657a2Mo3753C;
        }
        EnumC1657a2 enumC1657a2Mo3753C2 = ((InterfaceC1645X) this.f6806c).mo3753C();
        return enumC1657a2Mo3753C2 != null ? enumC1657a2Mo3753C2 : ((InterfaceC1645X) this.f6805b).mo3753C();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: D */
    public C1970t mo3754D() {
        C1970t c1970tMo3754D = ((InterfaceC1645X) this.f6807d).mo3754D();
        C1970t c1970t = C1970t.f7011b;
        if (!c1970t.equals(c1970tMo3754D)) {
            return c1970tMo3754D;
        }
        C1970t c1970tMo3754D2 = ((InterfaceC1645X) this.f6806c).mo3754D();
        return !c1970t.equals(c1970tMo3754D2) ? c1970tMo3754D2 : ((InterfaceC1645X) this.f6805b).mo3754D();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: E */
    public C1918l mo3755E() {
        return m4141b(null).mo3755E();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: F */
    public C1581F2 mo3756F(InterfaceC1936o1 interfaceC1936o1) {
        return m4141b(null).mo3756F(interfaceC1936o1);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: G */
    public List mo3757G() {
        return AbstractC1856a.m4054J((CopyOnWriteArrayList) mo3769m());
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: H */
    public void mo3758H(String str) {
        m4141b(null).mo3758H(str);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: I */
    public String mo3759I() {
        String strMo3759I = ((InterfaceC1645X) this.f6807d).mo3759I();
        if (strMo3759I != null) {
            return strMo3759I;
        }
        String strMo3759I2 = ((InterfaceC1645X) this.f6806c).mo3759I();
        return strMo3759I2 != null ? strMo3759I2 : ((InterfaceC1645X) this.f6805b).mo3759I();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: J */
    public InterfaceC1826b0 mo3760J() {
        InterfaceC1826b0 interfaceC1826b0Mo3760J = ((InterfaceC1645X) this.f6807d).mo3760J();
        if (!(interfaceC1826b0Mo3760J instanceof C1626R0)) {
            return interfaceC1826b0Mo3760J;
        }
        InterfaceC1826b0 interfaceC1826b0Mo3760J2 = ((InterfaceC1645X) this.f6806c).mo3760J();
        return !(interfaceC1826b0Mo3760J2 instanceof C1626R0) ? interfaceC1826b0Mo3760J2 : ((InterfaceC1645X) this.f6805b).mo3760J();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: K */
    public Map mo3761K() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(((InterfaceC1645X) this.f6805b).mo3761K());
        concurrentHashMap.putAll(((InterfaceC1645X) this.f6806c).mo3761K());
        concurrentHashMap.putAll(((InterfaceC1645X) this.f6807d).mo3761K());
        return concurrentHashMap;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: a */
    public C1964n mo3762a() {
        C1964n c1964nMo3762a = ((InterfaceC1645X) this.f6807d).mo3762a();
        if (c1964nMo3762a != null) {
            return c1964nMo3762a;
        }
        C1964n c1964nMo3762a2 = ((InterfaceC1645X) this.f6806c).mo3762a();
        return c1964nMo3762a2 != null ? c1964nMo3762a2 : ((InterfaceC1645X) this.f6805b).mo3762a();
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC1645X m4141b(EnumC2027u1 enumC2027u1) {
        InterfaceC1645X interfaceC1645X = (InterfaceC1645X) this.f6806c;
        InterfaceC1645X interfaceC1645X2 = (InterfaceC1645X) this.f6807d;
        InterfaceC1645X interfaceC1645X3 = (InterfaceC1645X) this.f6805b;
        if (enumC2027u1 != null) {
            int i = AbstractC1914k.f6803a[enumC2027u1.ordinal()];
            if (i == 1) {
                return interfaceC1645X2;
            }
            if (i == 2) {
                return interfaceC1645X;
            }
            if (i == 3) {
                return interfaceC1645X3;
            }
            if (i == 4) {
                return this;
            }
        }
        int i2 = AbstractC1914k.f6803a[interfaceC1645X3.mo3768l().getDefaultScopeType().ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? interfaceC1645X2 : interfaceC1645X3 : interfaceC1645X : interfaceC1645X2;
    }

    @Override // io.sentry.InterfaceC1645X
    public void clear() {
        m4141b(null).clear();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m5483clone() {
        switch (this.f6804a) {
            case 0:
                return clone();
            default:
                return super.clone();
        }
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: d */
    public InterfaceC1895i0 mo3763d() {
        InterfaceC1895i0 interfaceC1895i0Mo3763d = ((InterfaceC1645X) this.f6807d).mo3763d();
        if (interfaceC1895i0Mo3763d != null) {
            return interfaceC1895i0Mo3763d;
        }
        InterfaceC1895i0 interfaceC1895i0Mo3763d2 = ((InterfaceC1645X) this.f6806c).mo3763d();
        return interfaceC1895i0Mo3763d2 != null ? interfaceC1895i0Mo3763d2 : ((InterfaceC1645X) this.f6805b).mo3763d();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: f */
    public void mo3764f(C1871f c1871f, C1586H c1586h) {
        m4141b(null).mo3764f(c1871f, c1586h);
    }

    @Override // io.sentry.InterfaceC1645X
    public Map getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(((InterfaceC1645X) this.f6805b).getExtras());
        concurrentHashMap.putAll(((InterfaceC1645X) this.f6806c).getExtras());
        concurrentHashMap.putAll(((InterfaceC1645X) this.f6807d).getExtras());
        return concurrentHashMap;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: i */
    public C1581F2 mo3765i() {
        return m4141b(null).mo3765i();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: j */
    public C1901c mo3766j() {
        return m4141b(null).mo3766j();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: k */
    public void mo3767k(C1970t c1970t) {
        m4141b(null).mo3767k(c1970t);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: l */
    public C2046v2 mo3768l() {
        return ((InterfaceC1645X) this.f6805b).mo3768l();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: m */
    public List mo3769m() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((InterfaceC1645X) this.f6805b).mo3769m());
        copyOnWriteArrayList.addAll(((InterfaceC1645X) this.f6806c).mo3769m());
        copyOnWriteArrayList.addAll(((InterfaceC1645X) this.f6807d).mo3769m());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: n */
    public List mo3770n() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((InterfaceC1645X) this.f6805b).mo3770n());
        copyOnWriteArrayList.addAll(((InterfaceC1645X) this.f6806c).mo3770n());
        copyOnWriteArrayList.addAll(((InterfaceC1645X) this.f6807d).mo3770n());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: o */
    public void mo3771o() {
        m4141b(null).mo3771o();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: p */
    public void mo3772p(C1627R1 c1627r1) {
        ((InterfaceC1645X) this.f6805b).mo3772p(c1627r1);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: q */
    public C1953c mo3773q() {
        InterfaceC1645X interfaceC1645X = (InterfaceC1645X) this.f6805b;
        return new C1910j(interfaceC1645X.mo3773q(), ((InterfaceC1645X) this.f6806c).mo3773q(), ((InterfaceC1645X) this.f6807d).mo3773q(), interfaceC1645X.mo3768l().getDefaultScopeType());
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: r */
    public C1918l mo3774r(InterfaceC1931n1 interfaceC1931n1) {
        return m4141b(null).mo3774r(interfaceC1931n1);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: s */
    public String mo3775s() {
        String strMo3775s = ((InterfaceC1645X) this.f6807d).mo3775s();
        if (strMo3775s != null) {
            return strMo3775s;
        }
        String strMo3775s2 = ((InterfaceC1645X) this.f6806c).mo3775s();
        return strMo3775s2 != null ? strMo3775s2 : ((InterfaceC1645X) this.f6805b).mo3775s();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: t */
    public InterfaceC1876g0 mo3776t() {
        InterfaceC1876g0 interfaceC1876g0Mo3776t = ((InterfaceC1645X) this.f6807d).mo3776t();
        if (interfaceC1876g0Mo3776t != null) {
            return interfaceC1876g0Mo3776t;
        }
        InterfaceC1876g0 interfaceC1876g0Mo3776t2 = ((InterfaceC1645X) this.f6806c).mo3776t();
        return interfaceC1876g0Mo3776t2 != null ? interfaceC1876g0Mo3776t2 : ((InterfaceC1645X) this.f6805b).mo3776t();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: u */
    public void mo3777u(InterfaceC1940p1 interfaceC1940p1) {
        m4141b(null).mo3777u(interfaceC1940p1);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: v */
    public void mo3778v(C1970t c1970t) {
        ((InterfaceC1645X) this.f6805b).mo3778v(c1970t);
        ((InterfaceC1645X) this.f6806c).mo3778v(c1970t);
        ((InterfaceC1645X) this.f6807d).mo3778v(c1970t);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: w */
    public void mo3779w(InterfaceC1895i0 interfaceC1895i0) {
        m4141b(null).mo3779w(interfaceC1895i0);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: x */
    public List mo3780x() {
        List listMo3780x = ((InterfaceC1645X) this.f6807d).mo3780x();
        if (!listMo3780x.isEmpty()) {
            return listMo3780x;
        }
        List listMo3780x2 = ((InterfaceC1645X) this.f6806c).mo3780x();
        return !listMo3780x2.isEmpty() ? listMo3780x2 : ((InterfaceC1645X) this.f6805b).mo3780x();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: y */
    public C1581F2 mo3781y() {
        C1581F2 c1581f2Mo3781y = ((InterfaceC1645X) this.f6807d).mo3781y();
        if (c1581f2Mo3781y != null) {
            return c1581f2Mo3781y;
        }
        C1581F2 c1581f2Mo3781y2 = ((InterfaceC1645X) this.f6806c).mo3781y();
        return c1581f2Mo3781y2 != null ? c1581f2Mo3781y2 : ((InterfaceC1645X) this.f6805b).mo3781y();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: z */
    public Queue mo3782z() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((InterfaceC1645X) this.f6805b).mo3782z());
        arrayList.addAll(((InterfaceC1645X) this.f6806c).mo3782z());
        InterfaceC1645X interfaceC1645X = (InterfaceC1645X) this.f6807d;
        arrayList.addAll(interfaceC1645X.mo3782z());
        Collections.sort(arrayList);
        Queue queueM4154b = C1979q1.m4154b(interfaceC1645X.mo3768l().getMaxBreadcrumbs());
        queueM4154b.addAll(arrayList);
        return queueM4154b;
    }

    @Override // io.sentry.InterfaceC1645X
    public InterfaceC1645X clone() {
        return new C1918l((InterfaceC1645X) this.f6805b, ((InterfaceC1645X) this.f6806c).clone(), ((InterfaceC1645X) this.f6807d).clone());
    }

    public C1918l(C1621P2 c1621p2, Double d) {
        this.f6804a = 2;
        this.f6805b = c1621p2;
        this.f6806c = d;
        this.f6807d = Collections.EMPTY_MAP;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1918l() {
        this(new C1970t(), new C1601K2(), (C1832c) null);
        this.f6804a = 1;
    }

    public C1918l(C1970t c1970t, C1601K2 c1601k2, C1832c c1832c) {
        this.f6804a = 1;
        this.f6805b = c1970t;
        this.f6806c = c1601k2;
        this.f6807d = AbstractC1856a.m4062h(c1832c, null, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1918l(C1918l c1918l) {
        this((C1970t) c1918l.f6805b, (C1601K2) c1918l.f6806c, (C1832c) c1918l.f6807d);
        this.f6804a = 1;
    }
}
