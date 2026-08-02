package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class ol2 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final bm2 f7722a;

    /* JADX INFO: renamed from: b */
    public final qv1 f7723b;

    /* JADX INFO: renamed from: c */
    public final boolean f7724c;

    /* JADX INFO: renamed from: d */
    public final n50 f7725d;

    /* JADX INFO: renamed from: e */
    public final bk1 f7726e;

    /* JADX INFO: renamed from: f */
    public final boolean f7727f;

    /* JADX INFO: renamed from: g */
    public final C0685s8 f7728g;

    public ol2(C0685s8 c0685s8, n50 n50Var, bk1 bk1Var, qv1 qv1Var, bm2 bm2Var, boolean z, boolean z2) {
        this.f7722a = bm2Var;
        this.f7723b = qv1Var;
        this.f7724c = z;
        this.f7725d = n50Var;
        this.f7726e = bk1Var;
        this.f7727f = z2;
        this.f7728g = c0685s8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ol2.class != obj.getClass()) {
            return false;
        }
        ol2 ol2Var = (ol2) obj;
        return t11.m5086l(this.f7722a, ol2Var.f7722a) && this.f7723b == ol2Var.f7723b && this.f7724c == ol2Var.f7724c && t11.m5086l(this.f7725d, ol2Var.f7725d) && t11.m5086l(this.f7726e, ol2Var.f7726e) && this.f7727f == ol2Var.f7727f && t11.m5086l(this.f7728g, ol2Var.f7728g);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        pl2 pl2Var = new pl2();
        pl2Var.f8400x = this.f7722a;
        pl2Var.f8401y = this.f7723b;
        pl2Var.f8402z = this.f7724c;
        pl2Var.f8391A = this.f7725d;
        pl2Var.f8392B = this.f7726e;
        pl2Var.f8393C = this.f7727f;
        pl2Var.f8394D = this.f7728g;
        return pl2Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((pl2) th1Var).m3881R0(this.f7728g, this.f7725d, this.f7726e, this.f7723b, this.f7722a, this.f7727f, this.f7724c);
    }

    public final int hashCode() {
        int iM2205d = hk1.m2205d(hk1.m2205d((this.f7723b.hashCode() + (this.f7722a.hashCode() * 31)) * 31, 31, this.f7724c), 31, false);
        n50 n50Var = this.f7725d;
        int iHashCode = (iM2205d + (n50Var != null ? n50Var.hashCode() : 0)) * 31;
        bk1 bk1Var = this.f7726e;
        int iM2205d2 = hk1.m2205d((iHashCode + (bk1Var != null ? bk1Var.hashCode() : 0)) * 961, 31, this.f7727f);
        C0685s8 c0685s8 = this.f7728g;
        return iM2205d2 + (c0685s8 != null ? c0685s8.hashCode() : 0);
    }
}
