package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1948E;
import io.sentry.protocol.C1951a;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1964n;
import io.sentry.protocol.C1970t;
import io.sentry.util.AbstractC2033e;
import io.sentry.util.C2029a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
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

    public C1979q1(C2046v2 r3) {
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
        AbstractC1856a.m4048D("SentryOptions is required.", r3);
        this.f7089k = r3;
        this.f7085g = m4154b(this.f7089k.getMaxBreadcrumbs());
        this.f7096r = new C1918l();
    }

    /* JADX INFO: renamed from: b */
    public static Queue m4154b(int r1) {
        if (r1 <= 0) goto L6;
        return new C1609M2(new C1879h(r1));
    L6:
        return new C2060y();
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: A */
    public final C1948E mo3751A() {
        return this.f7081c;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: B */
    public final void mo3752B(C1918l r5) {
        this.f7096r = r5;
        C1589H2 r0 = new C1589H2((C1970t) r5.f6805b, (C1601K2) r5.f6806c, "default", null);
        r0.f5746i = "auto";
        Iterator<InterfaceC1648Y> r52 = this.f7089k.getScopeObservers().iterator();
    L4:
        if (r52.hasNext() == false) goto L6;
        r52.next().mo3786d(r0, this);
        goto L4
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
    public final C1581F2 mo3756F(InterfaceC1936o1 r3) {
        C1981r r0 = this.f7091m.m4173a();
        r3.mo3613a(this.f7090l);     // Catch: Throwable -> L7
        if (this.f7090l == null) goto L9;
        C1581F2 r32 = this.f7090l.m3662a();     // Catch: Throwable -> L7
    L10:
        r0.close();
        return r32;
    L9:
        r32 = null;
    L7:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L14
    L16:
        throw th;
    L14:
        th = move-exception;
        th.addSuppressed(th);
        goto L16
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: G */
    public final List mo3757G() {
        return AbstractC1856a.m4054J(this.f7088j);
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: H */
    public final void mo3758H(String r5) {
        this.f7082d = r5;
        C1953c r0 = this.f7094p;
        C1951a r1 = r0.mo4122d();
        if (r1 != null) goto L5;
        r1 = new C1951a();
        r0.mo4130l(r1);
    L5:
        if (r5 != null) goto L7;
        r1.f6880i = null;
    L8:
        Iterator<InterfaceC1648Y> r52 = this.f7089k.getScopeObservers().iterator();
    L10:
        if (r52.hasNext() == false) goto L12;
        r52.next().mo3787e(r0);
        goto L10
    L12:
        return;
    L7:
        ArrayList r2 = new ArrayList(1);
        r2.add(r5);
        r1.f6880i = r2;
        goto L8
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: I */
    public final String mo3759I() {
        InterfaceC1895i0 r0 = this.f7079a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getName();
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
        Iterator<InterfaceC1648Y> r0 = this.f7089k.getScopeObservers().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        r0.next().mo3783a(this.f7085g);
        goto L4
    L6:
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
    public final void mo3764f(C1871f r3, C1586H r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        if ((this.f7085g instanceof C2060y) == true) goto L14;
        if (r4 != null) goto L8;
        new C1586H();
    L8:
        this.f7089k.getBeforeBreadcrumb();
        this.f7085g.add(r3);
        Iterator<InterfaceC1648Y> r42 = this.f7089k.getScopeObservers().iterator();
    L10:
        if (r42.hasNext() == false) goto L15;
        InterfaceC1648Y r0 = r42.next();
        r0.mo3785c(r3);
        r0.mo3783a(this.f7085g);
        goto L10
    L15:
        return;
    }

    @Override // io.sentry.InterfaceC1645X
    public final Map getExtras() {
        return this.f7087i;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: i */
    public final C1581F2 mo3765i() {
        C1981r r0 = this.f7091m.m4173a();
        C1581F2 r2 = null;
        if (this.f7090l == null) goto L9;
        C1581F2 r1 = this.f7090l;     // Catch: Throwable -> L7
        r1.getClass();     // Catch: Throwable -> L7
        r1.m3663b(AbstractC1856a.m4067m());     // Catch: Throwable -> L7
        this.f7089k.getContinuousProfiler().mo3702p();     // Catch: Throwable -> L7
        C1581F2 r12 = this.f7090l.m3662a();     // Catch: Throwable -> L7
        this.f7090l = null;     // Catch: Throwable -> L7
        r2 = r12;
    L9:
        r0.close();
        return r2;
    L7:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: j */
    public final C1901c mo3766j() {
        C1981r r2 = this.f7091m.m4173a();
    L6:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L23
        throw th;
    L23:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L4:
        if (this.f7090l == null) goto L8;
        C1581F2 r0 = this.f7090l;     // Catch: Throwable -> L6
        r0.getClass();     // Catch: Throwable -> L6
        r0.m3663b(AbstractC1856a.m4067m());     // Catch: Throwable -> L6
        this.f7089k.getContinuousProfiler().mo3702p();     // Catch: Throwable -> L6
    L8:
        C1581F2 r02 = this.f7090l;     // Catch: Throwable -> L6
        C1901c r4 = null;
        C1581F2 r42 = null;
        if (this.f7089k.getRelease() == null) goto L18;
        String r10 = this.f7089k.getDistinctId();     // Catch: Throwable -> L6
        C1948E r3 = this.f7081c;     // Catch: Throwable -> L6
        String r17 = this.f7089k.getEnvironment();     // Catch: Throwable -> L6
        String r18 = this.f7089k.getRelease();     // Catch: Throwable -> L6
        EnumC1577E2 r6 = EnumC1577E2.f5688Ok;     // Catch: Throwable -> L6
        Date r7 = AbstractC1856a.m4067m();     // Catch: Throwable -> L6
        Date r8 = AbstractC1856a.m4067m();     // Catch: Throwable -> L6
        String r11 = AbstractC1856a.m4065k();     // Catch: Throwable -> L6
        Boolean r12 = Boolean.TRUE;     // Catch: Throwable -> L6
        if (r3 == null) goto L13;
        String r15 = r3.f6852d;     // Catch: Throwable -> L6
    L14:
        this.f7090l = new C1581F2(r6, r7, r8, 0, r10, r11, r12, null, null, r15, null, r17, r18, null);     // Catch: Throwable -> L6
        if (r02 == null) goto L17;
        r42 = r02.m3662a();     // Catch: Throwable -> L6
    L17:
        r4 = new C1901c(4, this.f7090l.m3662a(), r42);     // Catch: Throwable -> L6
    L19:
        r2.close();
        return r4;
    L13:
        r15 = null;
        goto L14
    L18:
        this.f7089k.getLogger().mo3680e(EnumC1657a2.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);     // Catch: Throwable -> L6
        goto L19
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: k */
    public final void mo3767k(C1970t r3) {
        this.f7097s = r3;
        Iterator<InterfaceC1648Y> r0 = this.f7089k.getScopeObservers().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        r0.next().mo3788k(r3);
        goto L4
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
        C1981r r0 = this.f7092n.m4173a();
        this.f7079a = null;     // Catch: Throwable -> L9
        r0.close();
        Iterator<InterfaceC1648Y> r02 = this.f7089k.getScopeObservers().iterator();
    L6:
        if (r02.hasNext() == false) goto L8;
        InterfaceC1648Y r2 = r02.next();
        r2.mo3784b(null);
        r2.mo3786d(null, this);
        goto L6
    L8:
        return;
    L9:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L12
    L14:
        throw th;
    L12:
        th = move-exception;
        th.addSuppressed(th);
        goto L14
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: p */
    public final void mo3772p(C1627R1 r3) {
        if (this.f7089k.isTracingEnabled() == true) goto L5;
        return;
    L5:
        if (r3.m3605a() == null) goto L17;
        Map r0 = this.f7099u;
        Throwable r32 = r3.m3605a();
        AbstractC1856a.m4048D("throwable cannot be null", r32);
    L8:
        if (r32.getCause() == null) goto L12;
        if (r32.getCause() == r32) goto L12;
        r32 = r32.getCause();
    L12:
        AbstractC2033e r33 = (AbstractC2033e) r0.get(r32);
        return;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: q */
    public final C1953c mo3773q() {
        return this.f7094p;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: r */
    public final C1918l mo3774r(InterfaceC1931n1 r3) {
        C1981r r0 = this.f7093o.m4173a();
        r3.mo1427e(this.f7096r);     // Catch: Throwable -> L6
        C1918l r32 = new C1918l(this.f7096r);     // Catch: Throwable -> L6
        r0.close();
        return r32;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: s */
    public final String mo3775s() {
        return this.f7082d;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: t */
    public final InterfaceC1876g0 mo3776t() {
        InterfaceC1876g0 r0 = (InterfaceC1876g0) this.f7080b.get();
        if (r0 == null) goto L5;
        return r0;
    L5:
        InterfaceC1895i0 r02 = this.f7079a;
        if (r02 == null) goto L10;
        InterfaceC1876g0 r1 = r02.mo3615a();
        if (r1 == null) goto L10;
        return r1;
    L10:
        return r02;
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: u */
    public final void mo3777u(InterfaceC1940p1 r3) {
        C1981r r0 = this.f7092n.m4173a();
        r3.mo1425c(this.f7079a);     // Catch: Throwable -> L6
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: v */
    public final void mo3778v(C1970t r1) {
    }

    @Override // io.sentry.InterfaceC1645X
    /* JADX INFO: renamed from: w */
    public final void mo3779w(InterfaceC1895i0 r5) {
        C1981r r0 = this.f7092n.m4173a();
        this.f7079a = r5;     // Catch: Throwable -> L9
        Iterator<InterfaceC1648Y> r1 = this.f7089k.getScopeObservers().iterator();     // Catch: Throwable -> L9
    L4:
        if (r1.hasNext() == false) goto L13;
        InterfaceC1648Y r2 = r1.next();     // Catch: Throwable -> L9
        if (r5 != null) goto L8;
        r2.mo3784b(null);     // Catch: Throwable -> L9
        r2.mo3786d(null, this);     // Catch: Throwable -> L9
        goto L4
    L8:
        r2.mo3784b(r5.getName());     // Catch: Throwable -> L9
        r2.mo3786d(r5.mo3627m(), this);     // Catch: Throwable -> L9
        goto L4
    L13:
        r0.close();
        return;
    L9:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L17
    L19:
        throw th;
    L17:
        th = move-exception;
        th.addSuppressed(th);
        goto L19
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
    public C1979q1(C1979q1 r7) {
        C1964n r1 = null;
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
        this.f7079a = r7.f7079a;
        this.f7090l = r7.f7090l;
        this.f7089k = r7.f7089k;
        this.f7098t = r7.f7098t;
        C1948E r0 = r7.f7081c;
        if (r0 == null) goto L5;
        C1948E r2 = new C1948E();
        r2.f6849a = r0.f6849a;
        r2.f6851c = r0.f6851c;
        r2.f6850b = r0.f6850b;
        r2.f6852d = r0.f6852d;
        r2.f6853e = r0.f6853e;
        r2.f6854f = r0.f6854f;
        r2.f6855g = AbstractC1856a.m4045A(r0.f6855g);
        r2.f6856h = AbstractC1856a.m4045A(r0.f6856h);
    L6:
        this.f7081c = r2;
        this.f7082d = r7.f7082d;
        this.f7097s = r7.f7097s;
        C1964n r02 = r7.f7083e;
        if (r02 == null) goto L9;
        r1 = new C1964n();
        r1.f6976a = r02.f6976a;
        r1.f6980e = r02.f6980e;
        r1.f6977b = r02.f6977b;
        r1.f6978c = r02.f6978c;
        r1.f6981f = AbstractC1856a.m4045A(r02.f6981f);
        r1.f6982g = AbstractC1856a.m4045A(r02.f6982g);
        r1.f6984i = AbstractC1856a.m4045A(r02.f6984i);
        r1.f6987l = AbstractC1856a.m4045A(r02.f6987l);
        r1.f6979d = r02.f6979d;
        r1.f6985j = r02.f6985j;
        r1.f6983h = r02.f6983h;
        r1.f6986k = r02.f6986k;
    L9:
        this.f7083e = r1;
        this.f7084f = new ArrayList(r7.f7084f);
        this.f7088j = new CopyOnWriteArrayList(r7.f7088j);
        int r12 = 0;
        C1871f[] r03 = (C1871f[]) r7.f7085g.toArray(new C1871f[0]);
        Queue r22 = m4154b(r7.f7089k.getMaxBreadcrumbs());
        int r3 = r03.length;
    L10:
        if (r12 >= r3) goto L12;
        r22.add(new C1871f(r03[r12]));
        r12 = r12 + 1;
        goto L10
    L12:
        this.f7085g = r22;
        ConcurrentHashMap r04 = r7.f7086h;
        ConcurrentHashMap r13 = new ConcurrentHashMap();
        Iterator r05 = r04.entrySet().iterator();
    L14:
        if (r05.hasNext() == false) goto L18;
        Map.Entry r23 = (Map.Entry) r05.next();
        if (r23 == null) goto L14;
        r13.put((String) r23.getKey(), (String) r23.getValue());
        goto L14
    L18:
        this.f7086h = r13;
        ConcurrentHashMap r06 = r7.f7087i;
        ConcurrentHashMap r14 = new ConcurrentHashMap();
        Iterator r07 = r06.entrySet().iterator();
    L20:
        if (r07.hasNext() == false) goto L24;
        Map.Entry r24 = (Map.Entry) r07.next();
        if (r24 == null) goto L20;
        r14.put((String) r24.getKey(), r24.getValue());
        goto L20
    L24:
        this.f7087i = r14;
        this.f7094p = new C1953c(r7.f7094p);
        this.f7095q = new CopyOnWriteArrayList(r7.f7095q);
        this.f7096r = new C1918l(r7.f7096r);
        return;
    L5:
        r2 = null;
        goto L6
    }
}
