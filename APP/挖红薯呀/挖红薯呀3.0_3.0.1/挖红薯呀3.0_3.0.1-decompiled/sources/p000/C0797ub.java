package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ub */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0797ub implements yc1 {

    /* JADX INFO: renamed from: d */
    public Object f6182d = AbstractC0920xb.f7310p;

    /* JADX INFO: renamed from: e */
    public C0884wc f6183e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0834vb f6184f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0797ub(C0834vb c0834vb) {
        this.f6184f = c0834vb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yc1
    /* JADX INFO: renamed from: a */
    public final void mo539a(nz0 nz0Var, int i) {
        C0884wc c0884wc = this.f6183e;
        if (c0884wc != null) {
            c0884wc.mo539a(nz0Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m4292b(AbstractC0358jk abstractC0358jk) {
        C0885wd c0885wdM4463n;
        Object obj = this.f6182d;
        boolean z = true;
        if (obj == AbstractC0920xb.f7310p || obj == AbstractC0920xb.f7306l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0834vb.f6637j;
            C0834vb c0834vb = this.f6184f;
            C0885wd c0885wd = (C0885wd) atomicReferenceFieldUpdater.get(c0834vb);
            while (true) {
                c0834vb.getClass();
                if (c0834vb.m4471y(C0834vb.f6632e.get(c0834vb), true)) {
                    this.f6182d = AbstractC0920xb.f7306l;
                    Throwable thM4465p = c0834vb.m4465p();
                    if (thM4465p != null) {
                        int i = q31.f5038a;
                        throw thM4465p;
                    }
                    z = false;
                } else {
                    long andIncrement = C0834vb.f6633f.getAndIncrement(c0834vb);
                    long j = AbstractC0920xb.f7296b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (c0885wd.f4374e != j2) {
                        c0885wdM4463n = c0834vb.m4463n(j2, c0885wd);
                        if (c0885wdM4463n == null) {
                            continue;
                        }
                    } else {
                        c0885wdM4463n = c0885wd;
                    }
                    Object objM4452J = c0834vb.m4452J(c0885wdM4463n, i2, andIncrement, null);
                    C1014zr c1014zr = AbstractC0920xb.f7307m;
                    if (objM4452J == c1014zr) {
                        C0921xc.m5134o("unreachable");
                        return null;
                    }
                    C1014zr c1014zr2 = AbstractC0920xb.f7309o;
                    if (objM4452J == c1014zr2) {
                        if (andIncrement < c0834vb.m4468u()) {
                            c0885wdM4463n.m1582a();
                        }
                        c0885wd = c0885wdM4463n;
                    } else {
                        if (objM4452J == AbstractC0920xb.f7308n) {
                            C0834vb c0834vb2 = this.f6184f;
                            C0884wc c0884wcM3496y = rd0.m3496y(rd0.m3497z(abstractC0358jk));
                            try {
                                this.f6183e = c0884wcM3496y;
                                Object objM4452J2 = c0834vb2.m4452J(c0885wdM4463n, i2, andIncrement, this);
                                if (objM4452J2 == c1014zr) {
                                    mo539a(c0885wdM4463n, i2);
                                } else {
                                    if (objM4452J2 == c1014zr2) {
                                        if (andIncrement < c0834vb2.m4468u()) {
                                            c0885wdM4463n.m1582a();
                                        }
                                        C0885wd c0885wd2 = (C0885wd) C0834vb.f6637j.get(c0834vb2);
                                        while (true) {
                                            if (c0834vb2.m4471y(C0834vb.f6632e.get(c0834vb2), true)) {
                                                C0884wc c0884wc = this.f6183e;
                                                c0884wc.getClass();
                                                this.f6183e = null;
                                                this.f6182d = AbstractC0920xb.f7306l;
                                                Throwable thM4465p2 = c0834vb.m4465p();
                                                if (thM4465p2 == null) {
                                                    c0884wc.mo541i(Boolean.FALSE);
                                                } else {
                                                    c0884wc.mo541i(new bv0(thM4465p2));
                                                }
                                            } else {
                                                long andIncrement2 = C0834vb.f6633f.getAndIncrement(c0834vb2);
                                                long j3 = AbstractC0920xb.f7296b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (c0885wd2.f4374e != j4) {
                                                    C0885wd c0885wdM4463n2 = c0834vb2.m4463n(j4, c0885wd2);
                                                    if (c0885wdM4463n2 != null) {
                                                        c0885wd2 = c0885wdM4463n2;
                                                    }
                                                }
                                                Object objM4452J3 = c0834vb2.m4452J(c0885wd2, i3, andIncrement2, this);
                                                if (objM4452J3 == AbstractC0920xb.f7307m) {
                                                    mo539a(c0885wd2, i3);
                                                    break;
                                                }
                                                if (objM4452J3 == AbstractC0920xb.f7309o) {
                                                    if (andIncrement2 < c0834vb2.m4468u()) {
                                                        c0885wd2.m1582a();
                                                    }
                                                } else {
                                                    if (objM4452J3 == AbstractC0920xb.f7308n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c0885wd2.m1582a();
                                                    this.f6182d = objM4452J3;
                                                    this.f6183e = null;
                                                }
                                            }
                                        }
                                    } else {
                                        c0885wdM4463n.m1582a();
                                        this.f6182d = objM4452J2;
                                        this.f6183e = null;
                                    }
                                    c0884wcM3496y.m4980F(Boolean.TRUE, null);
                                }
                                return c0884wcM3496y.m4990t();
                            } catch (Throwable th) {
                                c0884wcM3496y.m4978D();
                                throw th;
                            }
                        }
                        c0885wdM4463n.m1582a();
                        this.f6182d = objM4452J;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m4293c() {
        Object obj = this.f6182d;
        C1014zr c1014zr = AbstractC0920xb.f7310p;
        if (obj == c1014zr) {
            C0921xc.m5134o("`hasNext()` has not been invoked");
            return null;
        }
        this.f6182d = c1014zr;
        if (obj != AbstractC0920xb.f7306l) {
            return obj;
        }
        Throwable thM4466r = this.f6184f.m4466r();
        int i = q31.f5038a;
        throw thM4466r;
    }
}
