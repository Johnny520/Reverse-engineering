package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r11 extends th1 implements j61 {

    /* JADX INFO: renamed from: v */
    public o11 f9320v;

    /* JADX INFO: renamed from: w */
    public boolean f9321w;

    @Override // p000.j61
    /* JADX INFO: renamed from: D */
    public final int mo2360D(kd1 kd1Var, if1 if1Var, int i) {
        return if1Var.mo2339X(i);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: U */
    public final int mo2361U(kd1 kd1Var, if1 if1Var, int i) {
        return this.f9320v == o11.f7417h ? if1Var.mo2337N(i) : if1Var.mo2338W(i);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        int iMo2337N = this.f9320v == o11.f7417h ? if1Var.mo2337N(C0221fz.m1762g(j)) : if1Var.mo2338W(C0221fz.m1762g(j));
        if (iMo2337N < 0) {
            iMo2337N = 0;
        }
        if (iMo2337N < 0) {
            mz0.m3220a("width must be >= 0");
        }
        long jM2034h = AbstractC0258gz.m2034h(iMo2337N, iMo2337N, 0, Integer.MAX_VALUE);
        if (this.f9321w) {
            jM2034h = AbstractC0258gz.m2031e(j, jM2034h);
        }
        sz1 sz1VarMo2340e = if1Var.mo2340e(jM2034h);
        return pf1Var.mo696j0(sz1VarMo2340e.f10438h, sz1VarMo2340e.f10439i, ce0.f1492h, new C0579pg(sz1VarMo2340e, 3));
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: g */
    public final int mo2362g(kd1 kd1Var, if1 if1Var, int i) {
        return this.f9320v == o11.f7417h ? if1Var.mo2337N(i) : if1Var.mo2338W(i);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: p */
    public final int mo2363p(kd1 kd1Var, if1 if1Var, int i) {
        return if1Var.mo2341f(i);
    }
}
