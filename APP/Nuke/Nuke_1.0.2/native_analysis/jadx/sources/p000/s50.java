package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s50 implements if1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9907h;

    /* JADX INFO: renamed from: i */
    public final if1 f9908i;

    /* JADX INFO: renamed from: j */
    public final Enum f9909j;

    /* JADX INFO: renamed from: k */
    public final Enum f9910k;

    public /* synthetic */ s50(if1 if1Var, Enum r2, Enum r3, int i) {
        this.f9907h = i;
        this.f9908i = if1Var;
        this.f9909j = r2;
        this.f9910k = r3;
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: N */
    public final int mo2337N(int i) {
        switch (this.f9907h) {
        }
        return this.f9908i.mo2337N(i);
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: W */
    public final int mo2338W(int i) {
        switch (this.f9907h) {
        }
        return this.f9908i.mo2338W(i);
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: X */
    public final int mo2339X(int i) {
        switch (this.f9907h) {
        }
        return this.f9908i.mo2339X(i);
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: e */
    public final sz1 mo2340e(long j) {
        int i = this.f9907h;
        Enum r1 = this.f9909j;
        Enum r2 = this.f9910k;
        if1 if1Var = this.f9908i;
        switch (i) {
            case 0:
                q11 q11Var = (q11) r2;
                n11 n11Var = (n11) r1;
                n11 n11Var2 = n11.f6966i;
                if (q11Var == q11.f8687h) {
                    return new jj0(n11Var == n11Var2 ? if1Var.mo2338W(C0221fz.m1762g(j)) : if1Var.mo2337N(C0221fz.m1762g(j)), C0221fz.m1758c(j) ? C0221fz.m1762g(j) : 32767, 0);
                }
                return new jj0(C0221fz.m1759d(j) ? C0221fz.m1763h(j) : 32767, n11Var == n11Var2 ? if1Var.mo2341f(C0221fz.m1763h(j)) : if1Var.mo2339X(C0221fz.m1763h(j)), 0);
            case 1:
                sf1 sf1Var = (sf1) r2;
                rf1 rf1Var = (rf1) r1;
                rf1 rf1Var2 = rf1.f9542i;
                if (sf1Var == sf1.f10102h) {
                    return new jj0(rf1Var == rf1Var2 ? if1Var.mo2338W(C0221fz.m1762g(j)) : if1Var.mo2337N(C0221fz.m1762g(j)), C0221fz.m1758c(j) ? C0221fz.m1762g(j) : 32767, 1);
                }
                return new jj0(C0221fz.m1759d(j) ? C0221fz.m1763h(j) : 32767, rf1Var == rf1Var2 ? if1Var.mo2341f(C0221fz.m1763h(j)) : if1Var.mo2339X(C0221fz.m1763h(j)), 1);
            default:
                do1 do1Var = (do1) r2;
                co1 co1Var = (co1) r1;
                co1 co1Var2 = co1.f1638i;
                if (do1Var == do1.f2128h) {
                    return new jj0(co1Var == co1Var2 ? if1Var.mo2338W(C0221fz.m1762g(j)) : if1Var.mo2337N(C0221fz.m1762g(j)), C0221fz.m1758c(j) ? C0221fz.m1762g(j) : 32767, 2);
                }
                return new jj0(C0221fz.m1759d(j) ? C0221fz.m1763h(j) : 32767, co1Var == co1Var2 ? if1Var.mo2341f(C0221fz.m1763h(j)) : if1Var.mo2339X(C0221fz.m1763h(j)), 2);
        }
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: f */
    public final int mo2341f(int i) {
        switch (this.f9907h) {
        }
        return this.f9908i.mo2341f(i);
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: i */
    public final Object mo2342i() {
        switch (this.f9907h) {
        }
        return this.f9908i.mo2342i();
    }
}
