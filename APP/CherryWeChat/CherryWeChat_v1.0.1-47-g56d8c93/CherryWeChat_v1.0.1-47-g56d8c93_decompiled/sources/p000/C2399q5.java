package p000;

/* JADX INFO: renamed from: q5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2399q5 extends AbstractC2592uk {

    /* JADX INFO: renamed from: s0 */
    public int f8407s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f8408t0;

    /* JADX INFO: renamed from: u0 */
    public int f8409u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f8410v0;

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: A */
    public final boolean mo4334A() {
        return this.f8410v0;
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: B */
    public final boolean mo4335B() {
        return this.f8410v0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m4835T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f8966r0;
            if (i4 >= i) {
                break;
            }
            C2454rb c2454rb = this.f8965q0[i4];
            if ((this.f8408t0 || c2454rb.mo4339c()) && ((((i2 = this.f8407s0) == 0 || i2 == 1) && !c2454rb.mo4334A()) || (((i3 = this.f8407s0) == 2 || i3 == 3) && !c2454rb.mo4335B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f8966r0; i5++) {
            C2454rb c2454rb2 = this.f8965q0[i5];
            if (this.f8408t0 || c2454rb2.mo4339c()) {
                if (!z2) {
                    int i6 = this.f8407s0;
                    if (i6 == 0) {
                        iMax = c2454rb2.mo4340i(2).m2383d();
                    } else if (i6 == 1) {
                        iMax = c2454rb2.mo4340i(4).m2383d();
                    } else if (i6 == 2) {
                        iMax = c2454rb2.mo4340i(3).m2383d();
                    } else if (i6 == 3) {
                        iMax = c2454rb2.mo4340i(5).m2383d();
                    }
                    z2 = true;
                }
                int i7 = this.f8407s0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c2454rb2.mo4340i(2).m2383d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c2454rb2.mo4340i(4).m2383d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c2454rb2.mo4340i(3).m2383d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c2454rb2.mo4340i(5).m2383d());
                }
            }
        }
        int i8 = iMax + this.f8409u0;
        int i9 = this.f8407s0;
        if (i9 == 0 || i9 == 1) {
            m4919J(i8, i8);
        } else {
            m4920K(i8, i8);
        }
        this.f8410v0 = true;
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final int m4836U() {
        int i = this.f8407s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: b */
    public final void mo813b(C2244mo c2244mo, boolean z) {
        boolean z2;
        int i;
        int i2;
        C1259cb[] c1259cbArr = this.f8596Q;
        C1259cb c1259cb = this.f8588I;
        c1259cbArr[0] = c1259cb;
        int i3 = 2;
        C1259cb c1259cb2 = this.f8589J;
        c1259cbArr[2] = c1259cb2;
        C1259cb c1259cb3 = this.f8590K;
        c1259cbArr[1] = c1259cb3;
        C1259cb c1259cb4 = this.f8591L;
        c1259cbArr[3] = c1259cb4;
        for (C1259cb c1259cb5 : c1259cbArr) {
            c1259cb5.f4273i = c2244mo.m4572k(c1259cb5);
        }
        int i4 = this.f8407s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C1259cb c1259cb6 = c1259cbArr[i4];
        if (!this.f8410v0) {
            m4835T();
        }
        if (this.f8410v0) {
            this.f8410v0 = false;
            int i5 = this.f8407s0;
            if (i5 == 0 || i5 == 1) {
                c2244mo.m4565d(c1259cb.f4273i, this.f8604Y);
                c2244mo.m4565d(c1259cb3.f4273i, this.f8604Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c2244mo.m4565d(c1259cb2.f4273i, this.f8605Z);
                    c2244mo.m4565d(c1259cb4.f4273i, this.f8605Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f8966r0; i6++) {
            C2454rb c2454rb = this.f8965q0[i6];
            if ((this.f8408t0 || c2454rb.mo4339c()) && ((((i2 = this.f8407s0) == 0 || i2 == 1) && c2454rb.f8637p0[0] == 3 && c2454rb.f8588I.f4270f != null && c2454rb.f8590K.f4270f != null) || ((i2 == 2 || i2 == 3) && c2454rb.f8637p0[1] == 3 && c2454rb.f8589J.f4270f != null && c2454rb.f8591L.f4270f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = c1259cb.m2386g() || c1259cb3.m2386g();
        boolean z4 = c1259cb2.m2386g() || c1259cb4.m2386g();
        int i7 = !(!z2 && (((i = this.f8407s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f8966r0) {
            C2454rb c2454rb2 = this.f8965q0[i8];
            if (this.f8408t0 || c2454rb2.mo4339c()) {
                C0256Fy c0256FyM4572k = c2244mo.m4572k(c2454rb2.f8596Q[this.f8407s0]);
                C1259cb[] c1259cbArr2 = c2454rb2.f8596Q;
                int i9 = this.f8407s0;
                C1259cb c1259cb7 = c1259cbArr2[i9];
                c1259cb7.f4273i = c0256FyM4572k;
                C1259cb c1259cb8 = c1259cb7.f4270f;
                int i10 = (c1259cb8 == null || c1259cb8.f4268d != this) ? 0 : c1259cb7.f4271g;
                if (i9 == 0 || i9 == i3) {
                    C0256Fy c0256Fy = c1259cb6.f4273i;
                    int i11 = this.f8409u0 - i10;
                    C0564N4 c0564n4M4573l = c2244mo.m4573l();
                    C0256Fy c0256FyM4574m = c2244mo.m4574m();
                    c0256FyM4574m.f832d = 0;
                    c0564n4M4573l.m1105c(c0256Fy, c0256FyM4572k, c0256FyM4574m, i11);
                    c2244mo.m4564c(c0564n4M4573l);
                } else {
                    C0256Fy c0256Fy2 = c1259cb6.f4273i;
                    int i12 = this.f8409u0 + i10;
                    C0564N4 c0564n4M4573l2 = c2244mo.m4573l();
                    C0256Fy c0256FyM4574m2 = c2244mo.m4574m();
                    c0256FyM4574m2.f832d = 0;
                    c0564n4M4573l2.m1104b(c0256Fy2, c0256FyM4572k, c0256FyM4574m2, i12);
                    c2244mo.m4564c(c0564n4M4573l2);
                }
                c2244mo.m4566e(c1259cb6.f4273i, c0256FyM4572k, this.f8409u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f8407s0;
        if (i13 == 0) {
            c2244mo.m4566e(c1259cb3.f4273i, c1259cb.f4273i, 0, 8);
            c2244mo.m4566e(c1259cb.f4273i, this.f8599T.f8590K.f4273i, 0, 4);
            c2244mo.m4566e(c1259cb.f4273i, this.f8599T.f8588I.f4273i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c2244mo.m4566e(c1259cb.f4273i, c1259cb3.f4273i, 0, 8);
            c2244mo.m4566e(c1259cb.f4273i, this.f8599T.f8588I.f4273i, 0, 4);
            c2244mo.m4566e(c1259cb.f4273i, this.f8599T.f8590K.f4273i, 0, 0);
        } else if (i13 == 2) {
            c2244mo.m4566e(c1259cb4.f4273i, c1259cb2.f4273i, 0, 8);
            c2244mo.m4566e(c1259cb2.f4273i, this.f8599T.f8591L.f4273i, 0, 4);
            c2244mo.m4566e(c1259cb2.f4273i, this.f8599T.f8589J.f4273i, 0, 0);
        } else if (i13 == 3) {
            c2244mo.m4566e(c1259cb2.f4273i, c1259cb4.f4273i, 0, 8);
            c2244mo.m4566e(c1259cb2.f4273i, this.f8599T.f8589J.f4273i, 0, 4);
            c2244mo.m4566e(c1259cb2.f4273i, this.f8599T.f8591L.f4273i, 0, 0);
        }
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: c */
    public final boolean mo4339c() {
        return true;
    }

    @Override // p000.C2454rb
    public final String toString() {
        String strM410h = AbstractC0213Ey.m410h(new StringBuilder("[Barrier] "), this.f8621h0, " {");
        for (int i = 0; i < this.f8966r0; i++) {
            C2454rb c2454rb = this.f8965q0[i];
            if (i > 0) {
                strM410h = AbstractC0213Ey.m407e(strM410h, ", ");
            }
            strM410h = strM410h + c2454rb.f8621h0;
        }
        return AbstractC0213Ey.m407e(strM410h, "}");
    }
}
