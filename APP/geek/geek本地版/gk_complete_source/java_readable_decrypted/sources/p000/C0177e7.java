package p000;

/* JADX INFO: renamed from: e7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0177e7 extends AbstractC0566oo {

    /* JADX INFO: renamed from: f0 */
    public int f1742f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f1743g0;

    /* JADX INFO: renamed from: h0 */
    public int f1744h0;

    @Override // p000.C0592pc
    /* JADX INFO: renamed from: a */
    public final void mo996a(C0041ar c0041ar) {
        boolean z;
        int i;
        int i2;
        C0099cc[] c0099ccArr = this.f3829F;
        C0099cc c0099cc = this.f3876x;
        c0099ccArr[0] = c0099cc;
        int i3 = 2;
        C0099cc c0099cc2 = this.f3877y;
        c0099ccArr[2] = c0099cc2;
        C0099cc c0099cc3 = this.f3878z;
        c0099ccArr[1] = c0099cc3;
        C0099cc c0099cc4 = this.f3824A;
        c0099ccArr[3] = c0099cc4;
        for (C0099cc c0099cc5 : c0099ccArr) {
            c0099cc5.f950g = c0041ar.m462j(c0099cc5);
        }
        int i4 = this.f1742f0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0099cc c0099cc6 = c0099ccArr[i4];
        for (int i5 = 0; i5 < this.f3572e0; i5++) {
            C0592pc c0592pc = this.f3571d0[i5];
            if ((this.f1743g0 || c0592pc.mo997b()) && ((((i2 = this.f1742f0) == 0 || i2 == 1) && c0592pc.f3855c0[0] == 3 && c0592pc.f3876x.f947d != null && c0592pc.f3878z.f947d != null) || ((i2 == 2 || i2 == 3) && c0592pc.f3855c0[1] == 3 && c0592pc.f3877y.f947d != null && c0592pc.f3824A.f947d != null))) {
                z = true;
                break;
            }
        }
        z = false;
        boolean z2 = c0099cc.m663e() || c0099cc3.m663e();
        boolean z3 = c0099cc2.m663e() || c0099cc4.m663e();
        int i6 = !(!z && (((i = this.f1742f0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3))))) ? 4 : 5;
        int i7 = 0;
        while (i7 < this.f3572e0) {
            C0592pc c0592pc2 = this.f3571d0[i7];
            if (this.f1743g0 || c0592pc2.mo997b()) {
                a40 a40VarM462j = c0041ar.m462j(c0592pc2.f3829F[this.f1742f0]);
                C0099cc[] c0099ccArr2 = c0592pc2.f3829F;
                int i8 = this.f1742f0;
                C0099cc c0099cc7 = c0099ccArr2[i8];
                c0099cc7.f950g = a40VarM462j;
                C0099cc c0099cc8 = c0099cc7.f947d;
                int i9 = (c0099cc8 == null || c0099cc8.f945b != this) ? 0 : c0099cc7.f948e;
                if (i8 == 0 || i8 == i3) {
                    a40 a40Var = c0099cc6.f950g;
                    int i10 = this.f1744h0 - i9;
                    C0586p6 c0586p6M463k = c0041ar.m463k();
                    a40 a40VarM464l = c0041ar.m464l();
                    a40VarM464l.f31d = 0;
                    c0586p6M463k.m2039c(a40Var, a40VarM462j, a40VarM464l, i10);
                    c0041ar.m455c(c0586p6M463k);
                } else {
                    a40 a40Var2 = c0099cc6.f950g;
                    int i11 = this.f1744h0 + i9;
                    C0586p6 c0586p6M463k2 = c0041ar.m463k();
                    a40 a40VarM464l2 = c0041ar.m464l();
                    a40VarM464l2.f31d = 0;
                    c0586p6M463k2.m2038b(a40Var2, a40VarM462j, a40VarM464l2, i11);
                    c0041ar.m455c(c0586p6M463k2);
                }
                c0041ar.m457e(c0099cc6.f950g, a40VarM462j, this.f1744h0 + i9, i6);
            }
            i7++;
            i3 = 2;
        }
        int i12 = this.f1742f0;
        if (i12 == 0) {
            c0041ar.m457e(c0099cc3.f950g, c0099cc.f950g, 0, 8);
            c0041ar.m457e(c0099cc.f950g, this.f3832I.f3878z.f950g, 0, 4);
            c0041ar.m457e(c0099cc.f950g, this.f3832I.f3876x.f950g, 0, 0);
            return;
        }
        if (i12 == 1) {
            c0041ar.m457e(c0099cc.f950g, c0099cc3.f950g, 0, 8);
            c0041ar.m457e(c0099cc.f950g, this.f3832I.f3876x.f950g, 0, 4);
            c0041ar.m457e(c0099cc.f950g, this.f3832I.f3878z.f950g, 0, 0);
        } else if (i12 == 2) {
            c0041ar.m457e(c0099cc4.f950g, c0099cc2.f950g, 0, 8);
            c0041ar.m457e(c0099cc2.f950g, this.f3832I.f3824A.f950g, 0, 4);
            c0041ar.m457e(c0099cc2.f950g, this.f3832I.f3877y.f950g, 0, 0);
        } else if (i12 == 3) {
            c0041ar.m457e(c0099cc2.f950g, c0099cc4.f950g, 0, 8);
            c0041ar.m457e(c0099cc2.f950g, this.f3832I.f3877y.f950g, 0, 4);
            c0041ar.m457e(c0099cc2.f950g, this.f3832I.f3824A.f950g, 0, 0);
        }
    }

    @Override // p000.C0592pc
    /* JADX INFO: renamed from: b */
    public final boolean mo997b() {
        return true;
    }

    @Override // p000.C0592pc
    public final String toString() {
        String strM2767l = z30.m2767l(new StringBuilder("[Barrier] "), this.f3846W, " {");
        for (int i = 0; i < this.f3572e0; i++) {
            C0592pc c0592pc = this.f3571d0[i];
            if (i > 0) {
                strM2767l = z30.m2764i(strM2767l, ", ");
            }
            strM2767l = strM2767l + c0592pc.f3846W;
        }
        return z30.m2764i(strM2767l, "}");
    }
}
