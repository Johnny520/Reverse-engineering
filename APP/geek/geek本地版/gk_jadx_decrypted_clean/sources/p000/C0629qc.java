package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: qc */
/* JADX INFO: loaded from: classes.dex */
public final class C0629qc extends C0592pc {

    /* JADX INFO: renamed from: d0 */
    public ArrayList f4062d0 = new ArrayList();

    /* JADX INFO: renamed from: e0 */
    public final C0659r5 f4063e0 = new C0659r5(this);

    /* JADX INFO: renamed from: f0 */
    public final C0333ig f4064f0;

    /* JADX INFO: renamed from: g0 */
    public C0293hc f4065g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f4066h0;

    /* JADX INFO: renamed from: i0 */
    public final C0041ar f4067i0;

    /* JADX INFO: renamed from: j0 */
    public int f4068j0;

    /* JADX INFO: renamed from: k0 */
    public int f4069k0;

    /* JADX INFO: renamed from: l0 */
    public int f4070l0;

    /* JADX INFO: renamed from: m0 */
    public int f4071m0;

    /* JADX INFO: renamed from: n0 */
    public C0773u8[] f4072n0;

    /* JADX INFO: renamed from: o0 */
    public C0773u8[] f4073o0;

    /* JADX INFO: renamed from: p0 */
    public int f4074p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f4075q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f4076r0;

    public C0629qc() {
        C0333ig c0333ig = new C0333ig();
        c0333ig.f2424b = true;
        c0333ig.f2425c = true;
        c0333ig.f2427e = new ArrayList();
        new ArrayList();
        c0333ig.f2428f = null;
        c0333ig.f2429g = new C0401k7();
        c0333ig.f2430h = new ArrayList();
        c0333ig.f2423a = this;
        c0333ig.f2426d = this;
        this.f4064f0 = c0333ig;
        this.f4065g0 = null;
        this.f4066h0 = false;
        this.f4067i0 = new C0041ar();
        this.f4070l0 = 0;
        this.f4071m0 = 0;
        this.f4072n0 = new C0773u8[4];
        this.f4073o0 = new C0773u8[4];
        this.f4074p0 = 263;
        this.f4075q0 = false;
        this.f4076r0 = false;
    }

    /* JADX INFO: renamed from: B */
    public final void m2165B(C0592pc c0592pc, int i) {
        if (i == 0) {
            int i2 = this.f4070l0 + 1;
            C0773u8[] c0773u8Arr = this.f4073o0;
            if (i2 >= c0773u8Arr.length) {
                this.f4073o0 = (C0773u8[]) Arrays.copyOf(c0773u8Arr, c0773u8Arr.length * 2);
            }
            C0773u8[] c0773u8Arr2 = this.f4073o0;
            int i3 = this.f4070l0;
            c0773u8Arr2[i3] = new C0773u8(c0592pc, 0, this.f4066h0);
            this.f4070l0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f4071m0 + 1;
            C0773u8[] c0773u8Arr3 = this.f4072n0;
            if (i4 >= c0773u8Arr3.length) {
                this.f4072n0 = (C0773u8[]) Arrays.copyOf(c0773u8Arr3, c0773u8Arr3.length * 2);
            }
            C0773u8[] c0773u8Arr4 = this.f4072n0;
            int i5 = this.f4071m0;
            c0773u8Arr4[i5] = new C0773u8(c0592pc, 1, this.f4066h0);
            this.f4071m0 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m2166C(C0041ar c0041ar) {
        int i;
        int i2;
        mo996a(c0041ar);
        int size = this.f4062d0.size();
        char c = 0;
        int i3 = 0;
        boolean z = false;
        while (true) {
            i = 1;
            if (i3 >= size) {
                break;
            }
            C0592pc c0592pc = (C0592pc) this.f4062d0.get(i3);
            boolean[] zArr = c0592pc.f3831H;
            zArr[0] = false;
            zArr[1] = false;
            if (c0592pc instanceof C0177e7) {
                z = true;
            }
            i3++;
        }
        if (z) {
            for (int i4 = 0; i4 < size; i4++) {
                C0592pc c0592pc2 = (C0592pc) this.f4062d0.get(i4);
                if (c0592pc2 instanceof C0177e7) {
                    C0177e7 c0177e7 = (C0177e7) c0592pc2;
                    for (int i5 = 0; i5 < c0177e7.f3572e0; i5++) {
                        C0592pc c0592pc3 = c0177e7.f3571d0[i5];
                        int i6 = c0177e7.f1742f0;
                        if (i6 == 0 || i6 == 1) {
                            c0592pc3.f3831H[0] = true;
                        } else if (i6 == 2 || i6 == 3) {
                            c0592pc3.f3831H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            C0592pc c0592pc4 = (C0592pc) this.f4062d0.get(i7);
            c0592pc4.getClass();
            if ((c0592pc4 instanceof C0674rk) || (c0592pc4 instanceof C0268go)) {
                c0592pc4.mo996a(c0041ar);
            }
        }
        int i8 = 0;
        while (i8 < size) {
            C0592pc c0592pc5 = (C0592pc) this.f4062d0.get(i8);
            if (c0592pc5 instanceof C0629qc) {
                int[] iArr = c0592pc5.f3855c0;
                int i9 = iArr[c];
                int i10 = iArr[i];
                if (i9 == 2) {
                    c0592pc5.m2111w(i);
                }
                if (i10 == 2) {
                    c0592pc5.m2112x(i);
                }
                c0592pc5.mo996a(c0041ar);
                if (i9 == 2) {
                    c0592pc5.m2111w(i9);
                }
                if (i10 == 2) {
                    c0592pc5.m2112x(i10);
                }
                i2 = i;
            } else {
                c0592pc5.f3860h = -1;
                C0099cc c0099cc = c0592pc5.f3825B;
                int[] iArr2 = c0592pc5.f3855c0;
                C0099cc c0099cc2 = c0592pc5.f3824A;
                C0099cc c0099cc3 = c0592pc5.f3877y;
                C0099cc c0099cc4 = c0592pc5.f3878z;
                C0099cc c0099cc5 = c0592pc5.f3876x;
                c0592pc5.f3861i = -1;
                int[] iArr3 = this.f3855c0;
                i2 = i;
                if (iArr3[c] != 2 && iArr2[c] == 4) {
                    int i11 = c0099cc5.f948e;
                    int iM2100l = m2100l() - c0099cc4.f948e;
                    c0099cc5.f950g = c0041ar.m462j(c0099cc5);
                    c0099cc4.f950g = c0041ar.m462j(c0099cc4);
                    c0041ar.m456d(c0099cc5.f950g, i11);
                    c0041ar.m456d(c0099cc4.f950g, iM2100l);
                    c0592pc5.f3860h = 2;
                    c0592pc5.f3837N = i11;
                    int i12 = iM2100l - i11;
                    c0592pc5.f3833J = i12;
                    int i13 = c0592pc5.f3840Q;
                    if (i12 < i13) {
                        c0592pc5.f3833J = i13;
                    }
                }
                if (iArr3[i2] != 2 && iArr2[i2] == 4) {
                    int i14 = c0099cc3.f948e;
                    int iM2097i = m2097i() - c0099cc2.f948e;
                    c0099cc3.f950g = c0041ar.m462j(c0099cc3);
                    c0099cc2.f950g = c0041ar.m462j(c0099cc2);
                    c0041ar.m456d(c0099cc3.f950g, i14);
                    c0041ar.m456d(c0099cc2.f950g, iM2097i);
                    if (c0592pc5.f3839P > 0 || c0592pc5.f3845V == 8) {
                        a40 a40VarM462j = c0041ar.m462j(c0099cc);
                        c0099cc.f950g = a40VarM462j;
                        c0041ar.m456d(a40VarM462j, c0592pc5.f3839P + i14);
                    }
                    c0592pc5.f3861i = 2;
                    c0592pc5.f3838O = i14;
                    int i15 = iM2097i - i14;
                    c0592pc5.f3834K = i15;
                    int i16 = c0592pc5.f3841R;
                    if (i15 < i16) {
                        c0592pc5.f3834K = i16;
                    }
                }
                if (!(c0592pc5 instanceof C0674rk) && !(c0592pc5 instanceof C0268go)) {
                    c0592pc5.mo996a(c0041ar);
                }
            }
            i8++;
            i = i2;
            c = 0;
        }
        int i17 = i;
        if (this.f4070l0 > 0) {
            a80.m37a(this, c0041ar, 0);
        }
        if (this.f4071m0 > 0) {
            a80.m37a(this, c0041ar, i17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final boolean m2167D(int i, boolean z) {
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        C0333ig c0333ig = this.f4064f0;
        ArrayList arrayList = c0333ig.f2427e;
        C0629qc c0629qc = c0333ig.f2423a;
        int i4 = 0;
        int iM2096h = c0629qc.m2096h(0);
        int[] iArr = c0629qc.f3855c0;
        m90 m90Var = c0629qc.f3857e;
        C0604po c0604po = c0629qc.f3856d;
        int iM2096h2 = c0629qc.m2096h(1);
        int iM2101m = c0629qc.m2101m();
        int iM2102n = c0629qc.m2102n();
        if (z && (iM2096h == 2 || iM2096h2 == 2)) {
            int size = arrayList.size();
            while (true) {
                if (i4 >= size) {
                    z4 = z;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                qb0 qb0Var = (qb0) obj;
                if (qb0Var.f4057f == i && !qb0Var.mo1366k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && iM2096h == 2) {
                    c0629qc.m2111w(1);
                    c0629qc.m2113y(c0333ig.m1439d(c0629qc, 0));
                    c0604po.f4056e.mo1597d(c0629qc.m2100l());
                }
            } else if (z4 && iM2096h2 == 2) {
                c0629qc.m2112x(1);
                c0629qc.m2110v(c0333ig.m1439d(c0629qc, 1));
                m90Var.f4056e.mo1597d(c0629qc.m2097i());
            }
        }
        if (i == 0) {
            i2 = 0;
            int i5 = iArr[0];
            if (i5 == 1 || i5 == 4) {
                int iM2100l = c0629qc.m2100l() + iM2101m;
                c0604po.f4060i.mo1597d(iM2100l);
                c0604po.f4056e.mo1597d(iM2100l - iM2101m);
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
                int iM2097i = c0629qc.m2097i() + iM2102n;
                m90Var.f4060i.mo1597d(iM2097i);
                m90Var.f4056e.mo1597d(iM2097i - iM2102n);
                i3 = 1;
            } else {
                i3 = i2;
            }
        }
        c0333ig.m1442g();
        int size2 = arrayList.size();
        int i7 = i2;
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            qb0 qb0Var2 = (qb0) obj2;
            if (qb0Var2.f4057f == i && (qb0Var2.f4053b != c0629qc || qb0Var2.f4058g)) {
                qb0Var2.mo1364e();
            }
        }
        int size3 = arrayList.size();
        int i8 = i2;
        while (i8 < size3) {
            Object obj3 = arrayList.get(i8);
            i8++;
            qb0 qb0Var3 = (qb0) obj3;
            if (qb0Var3.f4057f == i && (i3 != 0 || qb0Var3.f4053b != c0629qc)) {
                if (!qb0Var3.f4059h.f2630j || !qb0Var3.f4060i.f2630j || (!(qb0Var3 instanceof C0810v8) && !qb0Var3.f4056e.f2630j)) {
                    z3 = i2;
                    break;
                }
            }
        }
        z3 = z2;
        c0629qc.m2111w(iM2096h);
        c0629qc.m2112x(iM2096h2);
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
    public final void m2168E() {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0629qc.m2168E():void");
    }

    @Override // p000.C0592pc
    /* JADX INFO: renamed from: s */
    public final void mo2107s() {
        this.f4067i0.m469r();
        this.f4068j0 = 0;
        this.f4069k0 = 0;
        this.f4062d0.clear();
        super.mo2107s();
    }

    @Override // p000.C0592pc
    /* JADX INFO: renamed from: u */
    public final void mo2109u(C0009a8 c0009a8) {
        super.mo2109u(c0009a8);
        int size = this.f4062d0.size();
        for (int i = 0; i < size; i++) {
            ((C0592pc) this.f4062d0.get(i)).mo2109u(c0009a8);
        }
    }

    @Override // p000.C0592pc
    /* JADX INFO: renamed from: z */
    public final void mo2114z(boolean z, boolean z2) {
        super.mo2114z(z, z2);
        int size = this.f4062d0.size();
        for (int i = 0; i < size; i++) {
            ((C0592pc) this.f4062d0.get(i)).mo2114z(z, z2);
        }
    }
}
