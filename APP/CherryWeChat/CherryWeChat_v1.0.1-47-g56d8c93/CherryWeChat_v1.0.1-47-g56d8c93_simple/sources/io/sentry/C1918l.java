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

    public C1918l(InterfaceC1645X r2, InterfaceC1645X r3, InterfaceC1645X r4) {
        this.f6804a = 0;
        this.f6805b = r2;
        this.f6806c = r3;
        this.f6807d = r4;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: A */
    public C1948E mo3751A() {
        C1948E r0 = ((InterfaceC1645X) this.f6807d).mo3751A();
        if (r0 == null) goto L5;
        return r0;
    L5:
        C1948E r02 = ((InterfaceC1645X) this.f6806c).mo3751A();
        if (r02 == null) goto L9;
        return r02;
    L9:
        return ((InterfaceC1645X) this.f6805b).mo3751A();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: B */
    public void mo3752B(C1918l r2) {
        m4141b(null).mo3752B(r2);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: C */
    public EnumC1657a2 mo3753C() {
        EnumC1657a2 r0 = ((InterfaceC1645X) this.f6807d).mo3753C();
        if (r0 == null) goto L5;
        return r0;
    L5:
        EnumC1657a2 r02 = ((InterfaceC1645X) this.f6806c).mo3753C();
        if (r02 == null) goto L9;
        return r02;
    L9:
        return ((InterfaceC1645X) this.f6805b).mo3753C();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: D */
    public C1970t mo3754D() {
        C1970t r0 = ((InterfaceC1645X) this.f6807d).mo3754D();
        C1970t r1 = C1970t.f7011b;
        if (r1.equals(r0) == true) goto L5;
        return r0;
    L5:
        C1970t r02 = ((InterfaceC1645X) this.f6806c).mo3754D();
        if (r1.equals(r02) == true) goto L9;
        return r02;
    L9:
        return ((InterfaceC1645X) this.f6805b).mo3754D();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: E */
    public C1918l mo3755E() {
        return m4141b(null).mo3755E();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: F */
    public C1581F2 mo3756F(InterfaceC1936o1 r2) {
        return m4141b(null).mo3756F(r2);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: G */
    public List mo3757G() {
        return AbstractC1856a.m4054J((CopyOnWriteArrayList) mo3769m());
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: H */
    public void mo3758H(String r2) {
        m4141b(null).mo3758H(r2);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: I */
    public String mo3759I() {
        String r0 = ((InterfaceC1645X) this.f6807d).mo3759I();
        if (r0 == null) goto L5;
        return r0;
    L5:
        String r02 = ((InterfaceC1645X) this.f6806c).mo3759I();
        if (r02 == null) goto L9;
        return r02;
    L9:
        return ((InterfaceC1645X) this.f6805b).mo3759I();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: J */
    public InterfaceC1826b0 mo3760J() {
        InterfaceC1826b0 r0 = ((InterfaceC1645X) this.f6807d).mo3760J();
        if ((r0 instanceof C1626R0) == true) goto L5;
        return r0;
    L5:
        InterfaceC1826b0 r02 = ((InterfaceC1645X) this.f6806c).mo3760J();
        if ((r02 instanceof C1626R0) == true) goto L9;
        return r02;
    L9:
        return ((InterfaceC1645X) this.f6805b).mo3760J();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: K */
    public Map mo3761K() {
        ConcurrentHashMap r0 = new ConcurrentHashMap();
        r0.putAll(((InterfaceC1645X) this.f6805b).mo3761K());
        r0.putAll(((InterfaceC1645X) this.f6806c).mo3761K());
        r0.putAll(((InterfaceC1645X) this.f6807d).mo3761K());
        return r0;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: a */
    public C1964n mo3762a() {
        C1964n r0 = ((InterfaceC1645X) this.f6807d).mo3762a();
        if (r0 == null) goto L5;
        return r0;
    L5:
        C1964n r02 = ((InterfaceC1645X) this.f6806c).mo3762a();
        if (r02 == null) goto L9;
        return r02;
    L9:
        return ((InterfaceC1645X) this.f6805b).mo3762a();
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC1645X m4141b(EnumC2027u1 r8) {
        InterfaceC1645X r0 = (InterfaceC1645X) this.f6806c;
        InterfaceC1645X r1 = (InterfaceC1645X) this.f6807d;
        InterfaceC1645X r2 = (InterfaceC1645X) this.f6805b;
        if (r8 == null) goto L15;
        int r82 = AbstractC1914k.f6803a[r8.ordinal()];
        if (r82 == 1) goto L14;
        if (r82 == 2) goto L13;
        if (r82 != 3) goto L9;
        return r2;
    L9:
        if (r82 != 4) goto L15;
        return this;
    L13:
        return r0;
    L14:
        return r1;
    L15:
        int r83 = AbstractC1914k.f6803a[r2.mo3768l().getDefaultScopeType().ordinal()];
        if (r83 == 1) goto L22;
        if (r83 == 2) goto L21;
        if (r83 == 3) goto L20;
        return r1;
    L20:
        return r2;
    L21:
        return r0;
    L22:
        return r1;
    }

    @Override // io.sentry.InterfaceC1645X
    public void clear() {
        m4141b(null).clear();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m5483clone() {
        switch(this.f6804a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.clone();
    L7:
        return clone();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: d */
    public InterfaceC1895i0 mo3763d() {
        InterfaceC1895i0 r0 = ((InterfaceC1645X) this.f6807d).mo3763d();
        if (r0 == null) goto L5;
        return r0;
    L5:
        InterfaceC1895i0 r02 = ((InterfaceC1645X) this.f6806c).mo3763d();
        if (r02 == null) goto L9;
        return r02;
    L9:
        return ((InterfaceC1645X) this.f6805b).mo3763d();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: f */
    public void mo3764f(C1871f r2, C1586H r3) {
        m4141b(null).mo3764f(r2, r3);
    }

    @Override // io.sentry.InterfaceC1645X
    public Map getExtras() {
        ConcurrentHashMap r0 = new ConcurrentHashMap();
        r0.putAll(((InterfaceC1645X) this.f6805b).getExtras());
        r0.putAll(((InterfaceC1645X) this.f6806c).getExtras());
        r0.putAll(((InterfaceC1645X) this.f6807d).getExtras());
        return r0;
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
    public void mo3767k(C1970t r2) {
        m4141b(null).mo3767k(r2);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: l */
    public C2046v2 mo3768l() {
        return ((InterfaceC1645X) this.f6805b).mo3768l();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: m */
    public List mo3769m() {
        CopyOnWriteArrayList r0 = new CopyOnWriteArrayList();
        r0.addAll(((InterfaceC1645X) this.f6805b).mo3769m());
        r0.addAll(((InterfaceC1645X) this.f6806c).mo3769m());
        r0.addAll(((InterfaceC1645X) this.f6807d).mo3769m());
        Collections.sort(r0);
        return r0;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: n */
    public List mo3770n() {
        CopyOnWriteArrayList r0 = new CopyOnWriteArrayList();
        r0.addAll(((InterfaceC1645X) this.f6805b).mo3770n());
        r0.addAll(((InterfaceC1645X) this.f6806c).mo3770n());
        r0.addAll(((InterfaceC1645X) this.f6807d).mo3770n());
        return r0;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: o */
    public void mo3771o() {
        m4141b(null).mo3771o();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: p */
    public void mo3772p(C1627R1 r2) {
        ((InterfaceC1645X) this.f6805b).mo3772p(r2);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: q */
    public C1953c mo3773q() {
        InterfaceC1645X r1 = (InterfaceC1645X) this.f6805b;
        return new C1910j(r1.mo3773q(), ((InterfaceC1645X) this.f6806c).mo3773q(), ((InterfaceC1645X) this.f6807d).mo3773q(), r1.mo3768l().getDefaultScopeType());
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: r */
    public C1918l mo3774r(InterfaceC1931n1 r2) {
        return m4141b(null).mo3774r(r2);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: s */
    public String mo3775s() {
        String r0 = ((InterfaceC1645X) this.f6807d).mo3775s();
        if (r0 == null) goto L5;
        return r0;
    L5:
        String r02 = ((InterfaceC1645X) this.f6806c).mo3775s();
        if (r02 == null) goto L9;
        return r02;
    L9:
        return ((InterfaceC1645X) this.f6805b).mo3775s();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: t */
    public InterfaceC1876g0 mo3776t() {
        InterfaceC1876g0 r0 = ((InterfaceC1645X) this.f6807d).mo3776t();
        if (r0 == null) goto L5;
        return r0;
    L5:
        InterfaceC1876g0 r02 = ((InterfaceC1645X) this.f6806c).mo3776t();
        if (r02 == null) goto L9;
        return r02;
    L9:
        return ((InterfaceC1645X) this.f6805b).mo3776t();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: u */
    public void mo3777u(InterfaceC1940p1 r2) {
        m4141b(null).mo3777u(r2);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: v */
    public void mo3778v(C1970t r2) {
        ((InterfaceC1645X) this.f6805b).mo3778v(r2);
        ((InterfaceC1645X) this.f6806c).mo3778v(r2);
        ((InterfaceC1645X) this.f6807d).mo3778v(r2);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: w */
    public void mo3779w(InterfaceC1895i0 r2) {
        m4141b(null).mo3779w(r2);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: x */
    public List mo3780x() {
        List r0 = ((InterfaceC1645X) this.f6807d).mo3780x();
        if (r0.isEmpty() == true) goto L5;
        return r0;
    L5:
        List r02 = ((InterfaceC1645X) this.f6806c).mo3780x();
        if (r02.isEmpty() == true) goto L9;
        return r02;
    L9:
        return ((InterfaceC1645X) this.f6805b).mo3780x();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: y */
    public C1581F2 mo3781y() {
        C1581F2 r0 = ((InterfaceC1645X) this.f6807d).mo3781y();
        if (r0 == null) goto L5;
        return r0;
    L5:
        C1581F2 r02 = ((InterfaceC1645X) this.f6806c).mo3781y();
        if (r02 == null) goto L9;
        return r02;
    L9:
        return ((InterfaceC1645X) this.f6805b).mo3781y();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: z */
    public Queue mo3782z() {
        ArrayList r0 = new ArrayList();
        r0.addAll(((InterfaceC1645X) this.f6805b).mo3782z());
        r0.addAll(((InterfaceC1645X) this.f6806c).mo3782z());
        InterfaceC1645X r1 = (InterfaceC1645X) this.f6807d;
        r0.addAll(r1.mo3782z());
        Collections.sort(r0);
        Queue r12 = C1979q1.m4154b(r1.mo3768l().getMaxBreadcrumbs());
        r12.addAll(r0);
        return r12;
    }

    @Override // io.sentry.InterfaceC1645X
    public InterfaceC1645X clone() {
        return new C1918l((InterfaceC1645X) this.f6805b, ((InterfaceC1645X) this.f6806c).clone(), ((InterfaceC1645X) this.f6807d).clone());
    }

    public C1918l(C1621P2 r2, Double r3) {
        this.f6804a = 2;
        this.f6805b = r2;
        this.f6806c = r3;
        this.f6807d = Collections.EMPTY_MAP;
    }

    public C1918l() {
        this.f6804a = 1;
        this(new C1970t(), new C1601K2(), null);
    }

    public C1918l(C1970t r2, C1601K2 r3, C1832c r4) {
        this.f6804a = 1;
        this.f6805b = r2;
        this.f6806c = r3;
        this.f6807d = AbstractC1856a.m4062h(r4, null, null, null);
    }

    public C1918l(C1918l r3) {
        this.f6804a = 1;
        this((C1970t) r3.f6805b, (C1601K2) r3.f6806c, (C1832c) r3.f6807d);
    }
}
