package p000;

/* JADX INFO: renamed from: py */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0597py extends C0356jn {

    /* JADX INFO: renamed from: r */
    public final EnumC0283hn f8642r;

    public C0597py(int i, EnumC0283hn enumC0283hn) {
        super(i);
        this.f8642r = enumC0283hn;
        if (enumC0283hn == EnumC0283hn.f4084h) {
            c80.m670n("This implementation does not support suspension for senders, use ", d72.m967a(C0356jn.class).m591c(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        C0676s.m4645c(hk1.m2208g(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4016F(Object obj, boolean z) {
        EnumC0283hn enumC0283hn = this.f8642r;
        EnumC0283hn enumC0283hn2 = EnumC0283hn.f4086j;
        a83 a83Var = a83.f116a;
        if (enumC0283hn == enumC0283hn2) {
            Object objMo2225s = super.mo2225s(obj);
            return (!(objMo2225s instanceof C0552oq) || (objMo2225s instanceof C0509nq)) ? objMo2225s : a83Var;
        }
        aa3 aa3Var = AbstractC0430ln.f6202d;
        C0589pq c0589pq = (C0589pq) C0356jn.f5116m.get(this);
        while (true) {
            long andIncrement = C0356jn.f5112i.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zM2540r = m2540r(andIncrement, false);
            int i = AbstractC0430ln.f6200b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c0589pq.f6198c != j3) {
                C0589pq c0589pqM2522b = C0356jn.m2522b(this, j3, c0589pq);
                if (c0589pqM2522b != null) {
                    c0589pq = c0589pqM2522b;
                } else if (zM2540r) {
                    return new C0509nq(m2538o());
                }
            }
            int iM2524e = C0356jn.m2524e(this, c0589pq, i2, obj, j, aa3Var, zM2540r);
            if (iM2524e == 0) {
                c0589pq.m3666b();
                return a83Var;
            }
            if (iM2524e == 1) {
                break;
            }
            if (iM2524e != 2) {
                if (iM2524e == 3) {
                    C0676s.m4653l("unexpected");
                    return null;
                }
                if (iM2524e == 4) {
                    if (j < C0356jn.f5113j.get(this)) {
                        c0589pq.m3666b();
                    }
                    return new C0509nq(m2538o());
                }
                if (iM2524e == 5) {
                    c0589pq.m3666b();
                }
            } else {
                if (zM2540r) {
                    c0589pq.m2945i();
                    return new C0509nq(m2538o());
                }
                gc3 gc3Var = aa3Var instanceof gc3 ? (gc3) aa3Var : null;
                if (gc3Var != null) {
                    gc3Var.mo1829a(c0589pq, i2 + i);
                }
                m2533i((c0589pq.f6198c * j2) + ((long) i2));
            }
        }
    }

    @Override // p000.C0356jn, p000.ho2
    /* JADX INFO: renamed from: a */
    public final Object mo2224a(t00 t00Var, Object obj) throws Throwable {
        if (m4016F(obj, true) instanceof C0509nq) {
            throw m2538o();
        }
        return a83.f116a;
    }

    @Override // p000.C0356jn, p000.ho2
    /* JADX INFO: renamed from: s */
    public final Object mo2225s(Object obj) {
        return m4016F(obj, false);
    }

    @Override // p000.C0356jn
    /* JADX INFO: renamed from: u */
    public final boolean mo2542u() {
        return this.f8642r == EnumC0283hn.f4085i;
    }
}
