package p166l2;

import p117i.AbstractC3090v0;
import p117i.C3074n0;
import p120i2.AbstractC3167a;

/* JADX INFO: renamed from: l2.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4569n {

    /* JADX INFO: renamed from: a */
    public final boolean f13426a;

    /* JADX INFO: renamed from: b */
    public C3074n0 f13427b;

    /* JADX INFO: renamed from: c */
    public final C4536e2 f13428c = new C4536e2(AbstractC4572o.f13435a);

    public C4569n(boolean z10) {
        this.f13426a = z10;
    }

    /* JADX INFO: renamed from: a */
    public final void m18061a(C4554j0 c4554j0) {
        if (!c4554j0.mo13082d()) {
            AbstractC3167a.m11956b("DepthSortedSet.add called on an unattached node");
        }
        if (this.f13426a) {
            C3074n0 c3074n0M18066f = m18066f();
            int iM11568e = c3074n0M18066f.m11568e(c4554j0, Integer.MAX_VALUE);
            if (iM11568e == Integer.MAX_VALUE) {
                c3074n0M18066f.m11447u(c4554j0, c4554j0.m17889S());
            } else {
                if (!(iM11568e == c4554j0.m17889S())) {
                    AbstractC3167a.m11956b("invalid node depth");
                }
            }
        }
        this.f13428c.add(c4554j0);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18062b(C4554j0 c4554j0) {
        boolean zContains = this.f13428c.contains(c4554j0);
        if (this.f13426a) {
            if (!(zContains == m18066f().m11564a(c4554j0))) {
                AbstractC3167a.m11956b("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18063c() {
        return this.f13428c.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public final C4554j0 m18064d() {
        C4554j0 c4554j0 = (C4554j0) this.f13428c.first();
        m18065e(c4554j0);
        return c4554j0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18065e(C4554j0 c4554j0) {
        if (!c4554j0.mo13082d()) {
            AbstractC3167a.m11956b("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.f13428c.remove(c4554j0);
        if (this.f13426a) {
            C3074n0 c3074n0M18066f = m18066f();
            if (c3074n0M18066f.m11564a(c4554j0)) {
                int iM11566c = c3074n0M18066f.m11566c(c4554j0);
                c3074n0M18066f.m11444r(c4554j0);
                if (!(iM11566c == (zRemove ? c4554j0.m17889S() : Integer.MAX_VALUE))) {
                    AbstractC3167a.m11956b("invalid node depth");
                }
            }
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: f */
    public final C3074n0 m18066f() {
        if (this.f13427b == null) {
            this.f13427b = AbstractC3090v0.m11576b();
        }
        C3074n0 c3074n0 = this.f13427b;
        c3074n0.getClass();
        return c3074n0;
    }

    public String toString() {
        return this.f13428c.toString();
    }
}
