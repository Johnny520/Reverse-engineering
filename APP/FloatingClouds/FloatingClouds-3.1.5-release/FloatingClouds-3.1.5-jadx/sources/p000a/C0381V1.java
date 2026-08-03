package p000a;

import p000a.C0240N3;

/* JADX INFO: renamed from: a.V1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0381V1 extends C0573f8 {

    /* JADX INFO: renamed from: g0 */
    public int f1438g0 = 0;

    /* JADX INFO: renamed from: h0 */
    public boolean f1439h0 = true;

    /* JADX INFO: renamed from: i0 */
    public int f1440i0 = 0;

    @Override // p000a.C0240N3
    /* JADX INFO: renamed from: a */
    public final void mo357a(C0029B9 c0029b9) {
        boolean z;
        int i;
        C0222M3[] c0222m3Arr = this.f789G;
        C0222M3 c0222m3 = this.f837y;
        c0222m3Arr[0] = c0222m3;
        C0222M3 c0222m32 = this.f838z;
        int i2 = 2;
        c0222m3Arr[2] = c0222m32;
        C0222M3 c0222m33 = this.f783A;
        c0222m3Arr[1] = c0222m33;
        C0222M3 c0222m34 = this.f784B;
        c0222m3Arr[3] = c0222m34;
        for (C0222M3 c0222m35 : c0222m3Arr) {
            c0222m35.f750g = c0029b9.m79j(c0222m35);
        }
        int i3 = this.f1438g0;
        if (i3 < 0 || i3 >= 4) {
            return;
        }
        C0222M3 c0222m36 = c0222m3Arr[i3];
        for (int i4 = 0; i4 < this.f2135f0; i4++) {
            C0240N3 c0240n3 = this.f2134e0[i4];
            if (this.f1439h0 || c0240n3.mo638b()) {
                int i5 = this.f1438g0;
                C0240N3.a aVar = C0240N3.a.f841c;
                if (((i5 == 0 || i5 == 1) && c0240n3.f792J[0] == aVar && c0240n3.f837y.f747d != null && c0240n3.f783A.f747d != null) || ((i5 == 2 || i5 == 3) && c0240n3.f792J[1] == aVar && c0240n3.f838z.f747d != null && c0240n3.f784B.f747d != null)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = c0222m3.m602e() || c0222m33.m602e();
        boolean z3 = c0222m32.m602e() || c0222m34.m602e();
        int i6 = (z || !(((i = this.f1438g0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3))))) ? 4 : 5;
        int i7 = 0;
        while (i7 < this.f2135f0) {
            C0240N3 c0240n32 = this.f2134e0[i7];
            if (this.f1439h0 || c0240n32.mo638b()) {
                C0693le c0693leM79j = c0029b9.m79j(c0240n32.f789G[this.f1438g0]);
                int i8 = this.f1438g0;
                C0222M3 c0222m37 = c0240n32.f789G[i8];
                c0222m37.f750g = c0693leM79j;
                C0222M3 c0222m38 = c0222m37.f747d;
                int i9 = (c0222m38 == null || c0222m38.f745b != this) ? 0 : c0222m37.f748e;
                if (i8 == 0 || i8 == i2) {
                    C0693le c0693le = c0222m36.f750g;
                    int i10 = this.f1440i0 - i9;
                    C0184K1 c0184k1M80k = c0029b9.m80k();
                    C0693le c0693leM81l = c0029b9.m81l();
                    c0693leM81l.f2583d = 0;
                    c0184k1M80k.m496d(c0693le, c0693leM79j, c0693leM81l, i10);
                    c0029b9.m72c(c0184k1M80k);
                } else {
                    C0693le c0693le2 = c0222m36.f750g;
                    int i11 = this.f1440i0 + i9;
                    C0184K1 c0184k1M80k2 = c0029b9.m80k();
                    C0693le c0693leM81l2 = c0029b9.m81l();
                    c0693leM81l2.f2583d = 0;
                    c0184k1M80k2.m495c(c0693le2, c0693leM79j, c0693leM81l2, i11);
                    c0029b9.m72c(c0184k1M80k2);
                }
                c0029b9.m74e(c0222m36.f750g, c0693leM79j, this.f1440i0 + i9, i6);
            }
            i7++;
            i2 = 2;
        }
        int i12 = this.f1438g0;
        if (i12 == 0) {
            c0029b9.m74e(c0222m33.f750g, c0222m3.f750g, 0, 8);
            c0029b9.m74e(c0222m3.f750g, this.f793K.f783A.f750g, 0, 4);
            c0029b9.m74e(c0222m3.f750g, this.f793K.f837y.f750g, 0, 0);
            return;
        }
        if (i12 == 1) {
            c0029b9.m74e(c0222m3.f750g, c0222m33.f750g, 0, 8);
            c0029b9.m74e(c0222m3.f750g, this.f793K.f837y.f750g, 0, 4);
            c0029b9.m74e(c0222m3.f750g, this.f793K.f783A.f750g, 0, 0);
        } else if (i12 == 2) {
            c0029b9.m74e(c0222m34.f750g, c0222m32.f750g, 0, 8);
            c0029b9.m74e(c0222m32.f750g, this.f793K.f784B.f750g, 0, 4);
            c0029b9.m74e(c0222m32.f750g, this.f793K.f838z.f750g, 0, 0);
        } else if (i12 == 3) {
            c0029b9.m74e(c0222m32.f750g, c0222m34.f750g, 0, 8);
            c0029b9.m74e(c0222m32.f750g, this.f793K.f838z.f750g, 0, 4);
            c0029b9.m74e(c0222m32.f750g, this.f793K.f784B.f750g, 0, 0);
        }
    }

    @Override // p000a.C0240N3
    /* JADX INFO: renamed from: b */
    public final boolean mo638b() {
        return true;
    }

    @Override // p000a.C0240N3
    public final String toString() {
        String strM2228h = C0944z.m2228h(new StringBuilder("[Barrier] "), this.f807Y, " {");
        for (int i = 0; i < this.f2135f0; i++) {
            C0240N3 c0240n3 = this.f2134e0[i];
            if (i > 0) {
                strM2228h = C0944z.m2226f(strM2228h, ", ");
            }
            strM2228h = strM2228h + c0240n3.f807Y;
        }
        return C0944z.m2226f(strM2228h, "}");
    }
}
