package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: in */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0319in implements gc3 {

    /* JADX INFO: renamed from: h */
    public Object f4700h = AbstractC0430ln.f6214p;

    /* JADX INFO: renamed from: i */
    public C0469mp f4701i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0356jn f4702j;

    public C0319in(C0356jn c0356jn) {
        this.f4702j = c0356jn;
    }

    @Override // p000.gc3
    /* JADX INFO: renamed from: a */
    public final void mo1829a(lm2 lm2Var, int i) {
        C0469mp c0469mp = this.f4701i;
        if (c0469mp != null) {
            c0469mp.mo1829a(lm2Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m2373b(u00 u00Var) throws Throwable {
        C0589pq c0589pqM2535k;
        Object obj = this.f4700h;
        boolean z = true;
        if (obj == AbstractC0430ln.f6214p || obj == AbstractC0430ln.f6210l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0356jn.f5117n;
            C0356jn c0356jn = this.f4702j;
            C0589pq c0589pq = (C0589pq) atomicReferenceFieldUpdater.get(c0356jn);
            while (true) {
                c0356jn.getClass();
                if (c0356jn.m2540r(C0356jn.f5112i.get(c0356jn), true)) {
                    this.f4700h = AbstractC0430ln.f6210l;
                    Throwable thM2536l = c0356jn.m2536l();
                    if (thM2536l != null) {
                        int i = yt2.f13617a;
                        throw thM2536l;
                    }
                    z = false;
                } else {
                    long andIncrement = C0356jn.f5113j.getAndIncrement(c0356jn);
                    long j = AbstractC0430ln.f6200b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (c0589pq.f6198c != j2) {
                        c0589pqM2535k = c0356jn.m2535k(j2, c0589pq);
                        if (c0589pqM2535k == null) {
                            continue;
                        }
                    } else {
                        c0589pqM2535k = c0589pq;
                    }
                    Object objM2527C = c0356jn.m2527C(c0589pqM2535k, i2, andIncrement, null);
                    hh1 hh1Var = AbstractC0430ln.f6211m;
                    if (objM2527C == hh1Var) {
                        C0676s.m4653l("unreachable");
                        return null;
                    }
                    hh1 hh1Var2 = AbstractC0430ln.f6213o;
                    if (objM2527C == hh1Var2) {
                        if (andIncrement < c0356jn.m2539p()) {
                            c0589pqM2535k.m3666b();
                        }
                        c0589pq = c0589pqM2535k;
                    } else {
                        if (objM2527C == AbstractC0430ln.f6212n) {
                            C0356jn c0356jn2 = this.f4702j;
                            C0469mp c0469mpM4221B = qp0.m4221B(gf1.m1908z(u00Var));
                            try {
                                this.f4701i = c0469mpM4221B;
                                Object objM2527C2 = c0356jn2.m2527C(c0589pqM2535k, i2, andIncrement, this);
                                if (objM2527C2 == hh1Var) {
                                    mo1829a(c0589pqM2535k, i2);
                                } else {
                                    if (objM2527C2 == hh1Var2) {
                                        if (andIncrement < c0356jn2.m2539p()) {
                                            c0589pqM2535k.m3666b();
                                        }
                                        C0589pq c0589pq2 = (C0589pq) C0356jn.f5117n.get(c0356jn2);
                                        while (true) {
                                            if (c0356jn2.m2540r(C0356jn.f5112i.get(c0356jn2), true)) {
                                                C0469mp c0469mp = this.f4701i;
                                                c0469mp.getClass();
                                                this.f4701i = null;
                                                this.f4700h = AbstractC0430ln.f6210l;
                                                Throwable thM2536l2 = c0356jn.m2536l();
                                                if (thM2536l2 == null) {
                                                    c0469mp.mo2509h(Boolean.FALSE);
                                                } else {
                                                    c0469mp.mo2509h(new x92(thM2536l2));
                                                }
                                            } else {
                                                long andIncrement2 = C0356jn.f5113j.getAndIncrement(c0356jn2);
                                                long j3 = AbstractC0430ln.f6200b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (c0589pq2.f6198c != j4) {
                                                    C0589pq c0589pqM2535k2 = c0356jn2.m2535k(j4, c0589pq2);
                                                    if (c0589pqM2535k2 != null) {
                                                        c0589pq2 = c0589pqM2535k2;
                                                    }
                                                }
                                                Object objM2527C3 = c0356jn2.m2527C(c0589pq2, i3, andIncrement2, this);
                                                if (objM2527C3 == AbstractC0430ln.f6211m) {
                                                    mo1829a(c0589pq2, i3);
                                                    break;
                                                }
                                                if (objM2527C3 == AbstractC0430ln.f6213o) {
                                                    if (andIncrement2 < c0356jn2.m2539p()) {
                                                        c0589pq2.m3666b();
                                                    }
                                                } else {
                                                    if (objM2527C3 == AbstractC0430ln.f6212n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c0589pq2.m3666b();
                                                    this.f4700h = objM2527C3;
                                                    this.f4701i = null;
                                                }
                                            }
                                        }
                                    } else {
                                        c0589pqM2535k.m3666b();
                                        this.f4700h = objM2527C2;
                                        this.f4701i = null;
                                    }
                                    c0469mpM4221B.mo2510i(Boolean.TRUE, null);
                                }
                                return c0469mpM4221B.m3150t();
                            } catch (Throwable th) {
                                c0469mpM4221B.m3140D();
                                throw th;
                            }
                        }
                        c0589pqM2535k.m3666b();
                        this.f4700h = objM2527C;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: c */
    public final Object m2374c() throws Throwable {
        Object obj = this.f4700h;
        hh1 hh1Var = AbstractC0430ln.f6214p;
        if (obj == hh1Var) {
            C0676s.m4653l("`hasNext()` has not been invoked");
            return null;
        }
        this.f4700h = hh1Var;
        if (obj != AbstractC0430ln.f6210l) {
            return obj;
        }
        Throwable thM2537n = this.f4702j.m2537n();
        int i = yt2.f13617a;
        throw thM2537n;
    }
}
