package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q40 implements InterfaceC0162ed {

    /* JADX INFO: renamed from: a */
    public final kj1 f8723a;

    /* JADX INFO: renamed from: b */
    public final n43 f8724b;

    /* JADX INFO: renamed from: c */
    public final Object f8725c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0494nd f8726d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0494nd f8727e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0494nd f8728f;

    /* JADX INFO: renamed from: g */
    public final Object f8729g;

    /* JADX INFO: renamed from: h */
    public final long f8730h;

    public q40(r40 r40Var, n43 n43Var, Object obj, AbstractC0494nd abstractC0494nd) {
        kj1 kj1Var = new kj1(16, r40Var.f9349a);
        this.f8723a = kj1Var;
        this.f8724b = n43Var;
        this.f8725c = obj;
        AbstractC0494nd abstractC0494nd2 = (AbstractC0494nd) n43Var.f7004a.mo5j(obj);
        this.f8726d = abstractC0494nd2;
        this.f8727e = t11.m5092r(abstractC0494nd);
        in0 in0Var = n43Var.f7005b;
        if (((AbstractC0494nd) kj1Var.f5597l) == null) {
            kj1Var.f5597l = abstractC0494nd2.mo2479c();
        }
        AbstractC0494nd abstractC0494nd3 = (AbstractC0494nd) kj1Var.f5597l;
        if (abstractC0494nd3 == null) {
            t11.m5067S("targetVector");
            throw null;
        }
        int iMo2478b = abstractC0494nd3.mo2478b();
        int i = 0;
        while (true) {
            AbstractC0494nd abstractC0494nd4 = (AbstractC0494nd) kj1Var.f5597l;
            if (i >= iMo2478b) {
                if (abstractC0494nd4 == null) {
                    t11.m5067S("targetVector");
                    throw null;
                }
                this.f8729g = in0Var.mo5j(abstractC0494nd4);
                kj1 kj1Var2 = this.f8723a;
                AbstractC0494nd abstractC0494nd5 = this.f8726d;
                if (((AbstractC0494nd) kj1Var2.f5596k) == null) {
                    kj1Var2.f5596k = abstractC0494nd5.mo2479c();
                }
                AbstractC0494nd abstractC0494nd6 = (AbstractC0494nd) kj1Var2.f5596k;
                if (abstractC0494nd6 == null) {
                    t11.m5067S("velocityVector");
                    throw null;
                }
                int iMo2478b2 = abstractC0494nd6.mo2478b();
                long jMax = 0;
                for (int i2 = 0; i2 < iMo2478b2; i2++) {
                    hh1 hh1Var = (hh1) kj1Var2.f5594i;
                    abstractC0494nd5.getClass();
                    jMax = Math.max(jMax, ((long) (Math.exp(((oj0) hh1Var.f4019i).m3570b(abstractC0494nd.mo2477a(i2)) / (((double) pj0.f8372a) - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.f8730h = jMax;
                AbstractC0494nd abstractC0494ndM5092r = t11.m5092r(this.f8723a.m2697A(jMax, this.f8726d, abstractC0494nd));
                this.f8728f = abstractC0494ndM5092r;
                int iMo2478b3 = abstractC0494ndM5092r.mo2478b();
                for (int i3 = 0; i3 < iMo2478b3; i3++) {
                    AbstractC0494nd abstractC0494nd7 = this.f8728f;
                    float fMo2477a = abstractC0494nd7.mo2477a(i3);
                    this.f8723a.getClass();
                    this.f8723a.getClass();
                    abstractC0494nd7.mo2481e(ci0.m778C(fMo2477a, -0.0f, 0.0f), i3);
                }
                return;
            }
            if (abstractC0494nd4 == null) {
                t11.m5067S("targetVector");
                throw null;
            }
            hh1 hh1Var2 = (hh1) kj1Var.f5594i;
            float fMo2477a2 = abstractC0494nd2.mo2477a(i);
            float fMo2477a3 = abstractC0494nd.mo2477a(i);
            oj0 oj0Var = (oj0) hh1Var2.f4019i;
            double dM3570b = oj0Var.m3570b(fMo2477a3);
            double d = pj0.f8372a;
            int i4 = i;
            abstractC0494nd4.mo2481e((Math.signum(fMo2477a3) * ((float) (Math.exp((d / (d - 1.0d)) * dM3570b) * ((double) (oj0Var.f7692a * oj0Var.f7693b))))) + fMo2477a2, i4);
            i = i4 + 1;
        }
    }

    @Override // p000.InterfaceC0162ed
    /* JADX INFO: renamed from: a */
    public final boolean mo914a() {
        return false;
    }

    @Override // p000.InterfaceC0162ed
    /* JADX INFO: renamed from: b */
    public final Object mo915b(long j) {
        if (m1335g(j)) {
            return this.f8729g;
        }
        in0 in0Var = this.f8724b.f7005b;
        kj1 kj1Var = this.f8723a;
        AbstractC0494nd abstractC0494nd = (AbstractC0494nd) kj1Var.f5595j;
        AbstractC0494nd abstractC0494nd2 = this.f8726d;
        if (abstractC0494nd == null) {
            kj1Var.f5595j = abstractC0494nd2.mo2479c();
        }
        AbstractC0494nd abstractC0494nd3 = (AbstractC0494nd) kj1Var.f5595j;
        if (abstractC0494nd3 == null) {
            t11.m5067S("valueVector");
            throw null;
        }
        int iMo2478b = abstractC0494nd3.mo2478b();
        int i = 0;
        while (true) {
            AbstractC0494nd abstractC0494nd4 = (AbstractC0494nd) kj1Var.f5595j;
            if (i >= iMo2478b) {
                if (abstractC0494nd4 != null) {
                    return in0Var.mo5j(abstractC0494nd4);
                }
                t11.m5067S("valueVector");
                throw null;
            }
            if (abstractC0494nd4 == null) {
                t11.m5067S("valueVector");
                throw null;
            }
            hh1 hh1Var = (hh1) kj1Var.f5594i;
            float fMo2477a = abstractC0494nd2.mo2477a(i);
            long j2 = j / 1000000;
            nj0 nj0VarM3569a = ((oj0) hh1Var.f4019i).m3569a(this.f8727e.mo2477a(i));
            long j3 = nj0VarM3569a.f7181c;
            abstractC0494nd4.mo2481e((Math.signum(nj0VarM3569a.f7179a) * nj0VarM3569a.f7180b * AbstractC0875x8.m6045a(j3 > 0 ? j2 / j3 : 1.0f).f12391a) + fMo2477a, i);
            i++;
        }
    }

    @Override // p000.InterfaceC0162ed
    /* JADX INFO: renamed from: c */
    public final long mo916c() {
        return this.f8730h;
    }

    @Override // p000.InterfaceC0162ed
    /* JADX INFO: renamed from: d */
    public final n43 mo917d() {
        return this.f8724b;
    }

    @Override // p000.InterfaceC0162ed
    /* JADX INFO: renamed from: e */
    public final Object mo918e() {
        return this.f8729g;
    }

    @Override // p000.InterfaceC0162ed
    /* JADX INFO: renamed from: f */
    public final AbstractC0494nd mo919f(long j) {
        if (m1335g(j)) {
            return this.f8728f;
        }
        return this.f8723a.m2697A(j, this.f8726d, this.f8727e);
    }
}
