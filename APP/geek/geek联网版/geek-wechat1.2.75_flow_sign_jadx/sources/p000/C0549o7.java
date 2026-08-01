package p000;

/* JADX INFO: renamed from: o7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0549o7 extends AbstractC0714so {

    /* JADX INFO: renamed from: f0 */
    public int f3408f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f3409g0;

    /* JADX INFO: renamed from: h0 */
    public int f3410h0;

    @Override // p000.C0925yc
    /* JADX INFO: renamed from: a */
    public final void mo1703a(C0197er c0197er) {
        boolean z;
        int i;
        int i2;
        C0443lc[] c0443lcArr = this.f5376F;
        C0443lc c0443lc = this.f5423x;
        c0443lcArr[0] = c0443lc;
        int i3 = 2;
        C0443lc c0443lc2 = this.f5424y;
        c0443lcArr[2] = c0443lc2;
        C0443lc c0443lc3 = this.f5425z;
        c0443lcArr[1] = c0443lc3;
        C0443lc c0443lc4 = this.f5371A;
        c0443lcArr[3] = c0443lc4;
        for (C0443lc c0443lc5 : c0443lcArr) {
            c0443lc5.f2996g = c0197er.m1010j(c0443lc5);
        }
        int i4 = this.f3408f0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0443lc c0443lc6 = c0443lcArr[i4];
        for (int i5 = 0; i5 < this.f4357e0; i5++) {
            C0925yc c0925yc = this.f4356d0[i5];
            if ((this.f3409g0 || c0925yc.mo1704b()) && ((((i2 = this.f3408f0) == 0 || i2 == 1) && c0925yc.f5402c0[0] == 3 && c0925yc.f5423x.f2993d != null && c0925yc.f5425z.f2993d != null) || ((i2 == 2 || i2 == 3) && c0925yc.f5402c0[1] == 3 && c0925yc.f5424y.f2993d != null && c0925yc.f5371A.f2993d != null))) {
                z = true;
                break;
            }
        }
        z = false;
        boolean z2 = c0443lc.m1755e() || c0443lc3.m1755e();
        boolean z3 = c0443lc2.m1755e() || c0443lc4.m1755e();
        int i6 = !(!z && (((i = this.f3408f0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3))))) ? 4 : 5;
        int i7 = 0;
        while (i7 < this.f4357e0) {
            C0925yc c0925yc2 = this.f4356d0[i7];
            if (this.f3409g0 || c0925yc2.mo1704b()) {
                h40 h40VarM1010j = c0197er.m1010j(c0925yc2.f5376F[this.f3408f0]);
                C0443lc[] c0443lcArr2 = c0925yc2.f5376F;
                int i8 = this.f3408f0;
                C0443lc c0443lc7 = c0443lcArr2[i8];
                c0443lc7.f2996g = h40VarM1010j;
                C0443lc c0443lc8 = c0443lc7.f2993d;
                int i9 = (c0443lc8 == null || c0443lc8.f2991b != this) ? 0 : c0443lc7.f2994e;
                if (i8 == 0 || i8 == i3) {
                    h40 h40Var = c0443lc6.f2996g;
                    int i10 = this.f3410h0 - i9;
                    C0585p6 c0585p6M1011k = c0197er.m1011k();
                    h40 h40VarM1012l = c0197er.m1012l();
                    h40VarM1012l.f2103d = 0;
                    c0585p6M1011k.m2068c(h40Var, h40VarM1010j, h40VarM1012l, i10);
                    c0197er.m1003c(c0585p6M1011k);
                } else {
                    h40 h40Var2 = c0443lc6.f2996g;
                    int i11 = this.f3410h0 + i9;
                    C0585p6 c0585p6M1011k2 = c0197er.m1011k();
                    h40 h40VarM1012l2 = c0197er.m1012l();
                    h40VarM1012l2.f2103d = 0;
                    c0585p6M1011k2.m2067b(h40Var2, h40VarM1010j, h40VarM1012l2, i11);
                    c0197er.m1003c(c0585p6M1011k2);
                }
                c0197er.m1005e(c0443lc6.f2996g, h40VarM1010j, this.f3410h0 + i9, i6);
            }
            i7++;
            i3 = 2;
        }
        int i12 = this.f3408f0;
        if (i12 == 0) {
            c0197er.m1005e(c0443lc3.f2996g, c0443lc.f2996g, 0, 8);
            c0197er.m1005e(c0443lc.f2996g, this.f5379I.f5425z.f2996g, 0, 4);
            c0197er.m1005e(c0443lc.f2996g, this.f5379I.f5423x.f2996g, 0, 0);
            return;
        }
        if (i12 == 1) {
            c0197er.m1005e(c0443lc.f2996g, c0443lc3.f2996g, 0, 8);
            c0197er.m1005e(c0443lc.f2996g, this.f5379I.f5423x.f2996g, 0, 4);
            c0197er.m1005e(c0443lc.f2996g, this.f5379I.f5425z.f2996g, 0, 0);
        } else if (i12 == 2) {
            c0197er.m1005e(c0443lc4.f2996g, c0443lc2.f2996g, 0, 8);
            c0197er.m1005e(c0443lc2.f2996g, this.f5379I.f5371A.f2996g, 0, 4);
            c0197er.m1005e(c0443lc2.f2996g, this.f5379I.f5424y.f2996g, 0, 0);
        } else if (i12 == 3) {
            c0197er.m1005e(c0443lc2.f2996g, c0443lc4.f2996g, 0, 8);
            c0197er.m1005e(c0443lc2.f2996g, this.f5379I.f5424y.f2996g, 0, 4);
            c0197er.m1005e(c0443lc2.f2996g, this.f5379I.f5371A.f2996g, 0, 0);
        }
    }

    @Override // p000.C0925yc
    /* JADX INFO: renamed from: b */
    public final boolean mo1704b() {
        return true;
    }

    @Override // p000.C0925yc
    public final String toString() {
        String strM1149l = g40.m1149l(new StringBuilder("[Barrier] "), this.f5393W, " {");
        for (int i = 0; i < this.f4357e0; i++) {
            C0925yc c0925yc = this.f4356d0[i];
            if (i > 0) {
                strM1149l = g40.m1146i(strM1149l, ", ");
            }
            strM1149l = strM1149l + c0925yc.f5393W;
        }
        return g40.m1146i(strM1149l, "}");
    }
}
