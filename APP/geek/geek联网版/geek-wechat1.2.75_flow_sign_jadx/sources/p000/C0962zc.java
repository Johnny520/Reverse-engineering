package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: zc */
/* JADX INFO: loaded from: classes.dex */
public final class C0962zc extends C0925yc {

    /* JADX INFO: renamed from: d0 */
    public ArrayList f5565d0 = new ArrayList();

    /* JADX INFO: renamed from: e0 */
    public final C0658r5 f5566e0 = new C0658r5(this);

    /* JADX INFO: renamed from: f0 */
    public final C0373jg f5567f0;

    /* JADX INFO: renamed from: g0 */
    public C0628qc f5568g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f5569h0;

    /* JADX INFO: renamed from: i0 */
    public final C0197er f5570i0;

    /* JADX INFO: renamed from: j0 */
    public int f5571j0;

    /* JADX INFO: renamed from: k0 */
    public int f5572k0;

    /* JADX INFO: renamed from: l0 */
    public int f5573l0;

    /* JADX INFO: renamed from: m0 */
    public int f5574m0;

    /* JADX INFO: renamed from: n0 */
    public C0216f9[] f5575n0;

    /* JADX INFO: renamed from: o0 */
    public C0216f9[] f5576o0;

    /* JADX INFO: renamed from: p0 */
    public int f5577p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f5578q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f5579r0;

    public C0962zc() {
        C0373jg c0373jg = new C0373jg();
        c0373jg.f2715b = true;
        c0373jg.f2716c = true;
        c0373jg.f2718e = new ArrayList();
        new ArrayList();
        c0373jg.f2719f = null;
        c0373jg.f2720g = new C0771u7();
        c0373jg.f2721h = new ArrayList();
        c0373jg.f2714a = this;
        c0373jg.f2717d = this;
        this.f5567f0 = c0373jg;
        this.f5568g0 = null;
        this.f5569h0 = false;
        this.f5570i0 = new C0197er();
        this.f5573l0 = 0;
        this.f5574m0 = 0;
        this.f5575n0 = new C0216f9[4];
        this.f5576o0 = new C0216f9[4];
        this.f5577p0 = 263;
        this.f5578q0 = false;
        this.f5579r0 = false;
    }

    /* JADX INFO: renamed from: B */
    public final void m2833B(C0925yc c0925yc, int i) {
        if (i == 0) {
            int i2 = this.f5573l0 + 1;
            C0216f9[] c0216f9Arr = this.f5576o0;
            if (i2 >= c0216f9Arr.length) {
                this.f5576o0 = (C0216f9[]) Arrays.copyOf(c0216f9Arr, c0216f9Arr.length * 2);
            }
            C0216f9[] c0216f9Arr2 = this.f5576o0;
            int i3 = this.f5573l0;
            c0216f9Arr2[i3] = new C0216f9(c0925yc, 0, this.f5569h0);
            this.f5573l0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f5574m0 + 1;
            C0216f9[] c0216f9Arr3 = this.f5575n0;
            if (i4 >= c0216f9Arr3.length) {
                this.f5575n0 = (C0216f9[]) Arrays.copyOf(c0216f9Arr3, c0216f9Arr3.length * 2);
            }
            C0216f9[] c0216f9Arr4 = this.f5575n0;
            int i5 = this.f5574m0;
            c0216f9Arr4[i5] = new C0216f9(c0925yc, 1, this.f5569h0);
            this.f5574m0 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m2834C(C0197er c0197er) {
        int i;
        int i2;
        mo1703a(c0197er);
        int size = this.f5565d0.size();
        char c = 0;
        int i3 = 0;
        boolean z = false;
        while (true) {
            i = 1;
            if (i3 >= size) {
                break;
            }
            C0925yc c0925yc = (C0925yc) this.f5565d0.get(i3);
            boolean[] zArr = c0925yc.f5378H;
            zArr[0] = false;
            zArr[1] = false;
            if (c0925yc instanceof C0549o7) {
                z = true;
            }
            i3++;
        }
        if (z) {
            for (int i4 = 0; i4 < size; i4++) {
                C0925yc c0925yc2 = (C0925yc) this.f5565d0.get(i4);
                if (c0925yc2 instanceof C0549o7) {
                    C0549o7 c0549o7 = (C0549o7) c0925yc2;
                    for (int i5 = 0; i5 < c0549o7.f4357e0; i5++) {
                        C0925yc c0925yc3 = c0549o7.f4356d0[i5];
                        int i6 = c0549o7.f3408f0;
                        if (i6 == 0 || i6 == 1) {
                            c0925yc3.f5378H[0] = true;
                        } else if (i6 == 2 || i6 == 3) {
                            c0925yc3.f5378H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            C0925yc c0925yc4 = (C0925yc) this.f5565d0.get(i7);
            c0925yc4.getClass();
            if ((c0925yc4 instanceof C0747tk) || (c0925yc4 instanceof C0418ko)) {
                c0925yc4.mo1703a(c0197er);
            }
        }
        int i8 = 0;
        while (i8 < size) {
            C0925yc c0925yc5 = (C0925yc) this.f5565d0.get(i8);
            if (c0925yc5 instanceof C0962zc) {
                int[] iArr = c0925yc5.f5402c0;
                int i9 = iArr[c];
                int i10 = iArr[i];
                if (i9 == 2) {
                    c0925yc5.m2760w(i);
                }
                if (i10 == 2) {
                    c0925yc5.m2761x(i);
                }
                c0925yc5.mo1703a(c0197er);
                if (i9 == 2) {
                    c0925yc5.m2760w(i9);
                }
                if (i10 == 2) {
                    c0925yc5.m2761x(i10);
                }
                i2 = i;
            } else {
                c0925yc5.f5407h = -1;
                C0443lc c0443lc = c0925yc5.f5372B;
                int[] iArr2 = c0925yc5.f5402c0;
                C0443lc c0443lc2 = c0925yc5.f5371A;
                C0443lc c0443lc3 = c0925yc5.f5424y;
                C0443lc c0443lc4 = c0925yc5.f5425z;
                C0443lc c0443lc5 = c0925yc5.f5423x;
                c0925yc5.f5408i = -1;
                int[] iArr3 = this.f5402c0;
                i2 = i;
                if (iArr3[c] != 2 && iArr2[c] == 4) {
                    int i11 = c0443lc5.f2994e;
                    int iM2749l = m2749l() - c0443lc4.f2994e;
                    c0443lc5.f2996g = c0197er.m1010j(c0443lc5);
                    c0443lc4.f2996g = c0197er.m1010j(c0443lc4);
                    c0197er.m1004d(c0443lc5.f2996g, i11);
                    c0197er.m1004d(c0443lc4.f2996g, iM2749l);
                    c0925yc5.f5407h = 2;
                    c0925yc5.f5384N = i11;
                    int i12 = iM2749l - i11;
                    c0925yc5.f5380J = i12;
                    int i13 = c0925yc5.f5387Q;
                    if (i12 < i13) {
                        c0925yc5.f5380J = i13;
                    }
                }
                if (iArr3[i2] != 2 && iArr2[i2] == 4) {
                    int i14 = c0443lc3.f2994e;
                    int iM2746i = m2746i() - c0443lc2.f2994e;
                    c0443lc3.f2996g = c0197er.m1010j(c0443lc3);
                    c0443lc2.f2996g = c0197er.m1010j(c0443lc2);
                    c0197er.m1004d(c0443lc3.f2996g, i14);
                    c0197er.m1004d(c0443lc2.f2996g, iM2746i);
                    if (c0925yc5.f5386P > 0 || c0925yc5.f5392V == 8) {
                        h40 h40VarM1010j = c0197er.m1010j(c0443lc);
                        c0443lc.f2996g = h40VarM1010j;
                        c0197er.m1004d(h40VarM1010j, c0925yc5.f5386P + i14);
                    }
                    c0925yc5.f5408i = 2;
                    c0925yc5.f5385O = i14;
                    int i15 = iM2746i - i14;
                    c0925yc5.f5381K = i15;
                    int i16 = c0925yc5.f5388R;
                    if (i15 < i16) {
                        c0925yc5.f5381K = i16;
                    }
                }
                if (!(c0925yc5 instanceof C0747tk) && !(c0925yc5 instanceof C0418ko)) {
                    c0925yc5.mo1703a(c0197er);
                }
            }
            i8++;
            i = i2;
            c = 0;
        }
        int i17 = i;
        if (this.f5573l0 > 0) {
            g80.m1186a(this, c0197er, 0);
        }
        if (this.f5574m0 > 0) {
            g80.m1186a(this, c0197er, i17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final boolean m2835D(int i, boolean z) {
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        C0373jg c0373jg = this.f5567f0;
        ArrayList arrayList = c0373jg.f2718e;
        C0962zc c0962zc = c0373jg.f2714a;
        int i4 = 0;
        int iM2745h = c0962zc.m2745h(0);
        int[] iArr = c0962zc.f5402c0;
        r90 r90Var = c0962zc.f5404e;
        C0751to c0751to = c0962zc.f5403d;
        int iM2745h2 = c0962zc.m2745h(1);
        int iM2750m = c0962zc.m2750m();
        int iM2751n = c0962zc.m2751n();
        if (z && (iM2745h == 2 || iM2745h2 == 2)) {
            int size = arrayList.size();
            while (true) {
                if (i4 >= size) {
                    z4 = z;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                vb0 vb0Var = (vb0) obj;
                if (vb0Var.f4931f == i && !vb0Var.mo1217k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && iM2745h == 2) {
                    c0962zc.m2760w(1);
                    c0962zc.m2762y(c0373jg.m1607d(c0962zc, 0));
                    c0751to.f4930e.mo1684d(c0962zc.m2749l());
                }
            } else if (z4 && iM2745h2 == 2) {
                c0962zc.m2761x(1);
                c0962zc.m2759v(c0373jg.m1607d(c0962zc, 1));
                r90Var.f4930e.mo1684d(c0962zc.m2746i());
            }
        }
        if (i == 0) {
            i2 = 0;
            int i5 = iArr[0];
            if (i5 == 1 || i5 == 4) {
                int iM2749l = c0962zc.m2749l() + iM2750m;
                c0751to.f4934i.mo1684d(iM2749l);
                c0751to.f4930e.mo1684d(iM2749l - iM2750m);
                z2 = true;
                i3 = 1;
            } else {
                z2 = true;
                i3 = i2;
            }
        } else {
            z2 = true;
            i2 = 0;
            int i6 = iArr[1];
            if (i6 == 1 || i6 == 4) {
                int iM2746i = c0962zc.m2746i() + iM2751n;
                r90Var.f4934i.mo1684d(iM2746i);
                r90Var.f4930e.mo1684d(iM2746i - iM2751n);
                i3 = 1;
            } else {
                i3 = i2;
            }
        }
        c0373jg.m1610g();
        int size2 = arrayList.size();
        int i7 = i2;
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            vb0 vb0Var2 = (vb0) obj2;
            if (vb0Var2.f4931f == i && (vb0Var2.f4927b != c0962zc || vb0Var2.f4932g)) {
                vb0Var2.mo1214e();
            }
        }
        int size3 = arrayList.size();
        int i8 = i2;
        while (i8 < size3) {
            Object obj3 = arrayList.get(i8);
            i8++;
            vb0 vb0Var3 = (vb0) obj3;
            if (vb0Var3.f4931f == i && (i3 != 0 || vb0Var3.f4927b != c0962zc)) {
                if (!vb0Var3.f4933h.f2836j || !vb0Var3.f4934i.f2836j || (!(vb0Var3 instanceof C0253g9) && !vb0Var3.f4930e.f2836j)) {
                    z3 = i2;
                    break;
                }
            }
        }
        z3 = z2;
        c0962zc.m2760w(iM2745h);
        c0962zc.m2761x(iM2745h2);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2836E() {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0962zc.m2836E():void");
    }

    @Override // p000.C0925yc
    /* JADX INFO: renamed from: s */
    public final void mo2756s() {
        this.f5570i0.m1017r();
        this.f5571j0 = 0;
        this.f5572k0 = 0;
        this.f5565d0.clear();
        super.mo2756s();
    }

    @Override // p000.C0925yc
    /* JADX INFO: renamed from: u */
    public final void mo2758u(C0402k8 c0402k8) {
        super.mo2758u(c0402k8);
        int size = this.f5565d0.size();
        for (int i = 0; i < size; i++) {
            ((C0925yc) this.f5565d0.get(i)).mo2758u(c0402k8);
        }
    }

    @Override // p000.C0925yc
    /* JADX INFO: renamed from: z */
    public final void mo2763z(boolean z, boolean z2) {
        super.mo2763z(z, z2);
        int size = this.f5565d0.size();
        for (int i = 0; i < size; i++) {
            ((C0925yc) this.f5565d0.get(i)).mo2763z(z, z2);
        }
    }
}
