package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tg extends defpackage.vg implements defpackage.qe, defpackage.ld {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater h = null;
    private volatile java.lang.Object _reusableCancellableContinuation;
    public final defpackage.ke d;
    public final defpackage.m50 e;
    public java.lang.Object f;
    public final java.lang.Object g;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_reusableCancellableContinuation"
            java.lang.Class<tg> r2 = defpackage.tg.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            defpackage.tg.h = r0
            return
    }

    public tg(defpackage.ke r2, defpackage.m50 r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            r1.d = r2
            r1.e = r3
            l0 r2 = defpackage.a80.d
            r1.f = r2
            ge r2 = r3.b
            defpackage.ip.l(r2)
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            he r0 = defpackage.he.e
            java.lang.Object r2 = r2.h(r3, r0)
            defpackage.ip.l(r2)
            r1.g = r2
            return
    }

    @Override // defpackage.vg
    public final void a(java.lang.Object r1, java.util.concurrent.CancellationException r2) {
            r0 = this;
            boolean r1 = r1 instanceof defpackage.ob
            if (r1 != 0) goto L5
            return
        L5:
            r1 = 0
            throw r1
    }

    @Override // defpackage.vg
    public final defpackage.ld b() {
            r0 = this;
            return r0
    }

    @Override // defpackage.qe
    public final defpackage.qe c() {
            r1 = this;
            m50 r0 = r1.e
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    @Override // defpackage.ld
    public final defpackage.ge d() {
            r1 = this;
            m50 r0 = r1.e
            ge r0 = r0.b
            defpackage.ip.l(r0)
            return r0
    }

    @Override // defpackage.ld
    public final void f(java.lang.Object r10) {
            r9 = this;
            m50 r0 = r9.e
            ge r1 = r0.b
            defpackage.ip.l(r1)
            java.lang.Throwable r2 = defpackage.f10.a(r10)
            r3 = 0
            if (r2 != 0) goto L10
            r4 = r10
            goto L15
        L10:
            nb r4 = new nb
            r4.<init>(r2, r3)
        L15:
            ke r2 = r9.d
            boolean r5 = r2.e()
            if (r5 == 0) goto L25
            r9.f = r4
            r9.c = r3
            r2.d(r1, r9)
            return
        L25:
            kj r1 = defpackage.t60.a()
            long r5 = r1.c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L47
            r9.f = r4
            r9.c = r3
            k6 r10 = r1.e
            if (r10 != 0) goto L43
            k6 r10 = new k6
            r10.<init>()
            r1.e = r10
        L43:
            r10.addLast(r9)
            return
        L47:
            r2 = 1
            r1.k(r2)
            ge r2 = r0.b     // Catch: java.lang.Throwable -> L66
            defpackage.ip.l(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.Object r3 = r9.g     // Catch: java.lang.Throwable -> L66
            java.lang.Object r3 = defpackage.ff.V(r2, r3)     // Catch: java.lang.Throwable -> L66
            r0.f(r10)     // Catch: java.lang.Throwable -> L68
            defpackage.ff.L(r2, r3)     // Catch: java.lang.Throwable -> L66
        L5c:
            boolean r10 = r1.l()     // Catch: java.lang.Throwable -> L66
            if (r10 != 0) goto L5c
        L62:
            r1.f()
            goto L72
        L66:
            r10 = move-exception
            goto L6d
        L68:
            r10 = move-exception
            defpackage.ff.L(r2, r3)     // Catch: java.lang.Throwable -> L66
            throw r10     // Catch: java.lang.Throwable -> L66
        L6d:
            r0 = 0
            r9.h(r10, r0)     // Catch: java.lang.Throwable -> L73
            goto L62
        L72:
            return
        L73:
            r10 = move-exception
            r1.f()
            throw r10
    }

    @Override // defpackage.vg
    public final java.lang.Object i() {
            r2 = this;
            java.lang.Object r0 = r2.f
            l0 r1 = defpackage.a80.d
            r2.f = r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DispatchedContinuation["
            r0.<init>(r1)
            ke r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            m50 r1 = r2.e
            java.lang.String r1 = defpackage.ff.T(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
