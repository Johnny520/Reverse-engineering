package p000;

/* JADX INFO: renamed from: jt */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class C0362jt extends yh1 {

    /* JADX INFO: renamed from: a */
    public final bk1 f5198a;

    /* JADX INFO: renamed from: b */
    public final boolean f5199b;

    /* JADX INFO: renamed from: c */
    public final boolean f5200c;

    /* JADX INFO: renamed from: d */
    public final String f5201d;

    /* JADX INFO: renamed from: e */
    public final xm0 f5202e;

    public C0362jt(bk1 bk1Var, boolean z, boolean z2, String str, xm0 xm0Var) {
        this.f5198a = bk1Var;
        this.f5199b = z;
        this.f5200c = z2;
        this.f5201d = str;
        this.f5202e = xm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0362jt.class != obj.getClass()) {
            return false;
        }
        C0362jt c0362jt = (C0362jt) obj;
        return t11.m5086l(this.f5198a, c0362jt.f5198a) && this.f5199b == c0362jt.f5199b && this.f5200c == c0362jt.f5200c && t11.m5086l(this.f5201d, c0362jt.f5201d) && this.f5202e == c0362jt.f5202e;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new C0399kt(this.f5198a, this.f5199b, this.f5200c, this.f5201d, this.f5202e);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo200g(th1 th1Var) {
        boolean z;
        t60 t60Var;
        C0399kt c0399kt = (C0399kt) th1Var;
        ul0 ul0Var = c0399kt.f5746C;
        bk1 bk1Var = c0399kt.f5755L;
        bk1 bk1Var2 = this.f5198a;
        boolean z2 = true;
        if (t11.m5086l(bk1Var, bk1Var2)) {
            z = false;
        } else {
            c0399kt.m2735Q0();
            c0399kt.f5755L = bk1Var2;
            c0399kt.f5761x = bk1Var2;
            z = true;
        }
        boolean z3 = c0399kt.f5762y;
        boolean z4 = this.f5199b;
        if (z3 != z4) {
            c0399kt.f5762y = z4;
            if (z4) {
                c0399kt.mo1847L();
            }
            z = true;
        }
        boolean z5 = c0399kt.f5744A;
        boolean z6 = this.f5200c;
        if (z5 != z6) {
            if (z6) {
                c0399kt.m5468M0(ul0Var);
            } else {
                c0399kt.m5469N0(ul0Var);
                c0399kt.m2735Q0();
            }
            qp0.m4223E(c0399kt);
            c0399kt.f5744A = z6;
        }
        String str = c0399kt.f5763z;
        String str2 = this.f5201d;
        if (!t11.m5086l(str, str2)) {
            c0399kt.f5763z = str2;
            qp0.m4223E(c0399kt);
        }
        c0399kt.f5745B = this.f5202e;
        boolean z7 = c0399kt.f5756M;
        bk1 bk1Var3 = c0399kt.f5755L;
        if (z7 == (bk1Var3 == null)) {
            z2 = z;
        } else {
            boolean z8 = bk1Var3 == null;
            c0399kt.f5756M = z8;
            if (z8 || c0399kt.f5749F != null) {
            }
        }
        if (z2 && ((t60Var = c0399kt.f5749F) != null || !c0399kt.f5756M)) {
            if (t60Var != null) {
                c0399kt.m5469N0(t60Var);
            }
            c0399kt.f5749F = null;
            c0399kt.m2737S0();
        }
        ul0Var.m5510Q0(c0399kt.f5761x);
    }

    public final int hashCode() {
        bk1 bk1Var = this.f5198a;
        int iM2205d = hk1.m2205d(hk1.m2205d((bk1Var != null ? bk1Var.hashCode() : 0) * 961, 31, this.f5199b), 31, this.f5200c);
        String str = this.f5201d;
        return this.f5202e.hashCode() + ((iM2205d + (str != null ? str.hashCode() : 0)) * 961);
    }
}
