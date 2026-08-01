package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: to */
/* JADX INFO: loaded from: classes.dex */
public final class C0751to extends vb0 {

    /* JADX INFO: renamed from: k */
    public static final int[] f4569k = new int[2];

    /* JADX INFO: renamed from: m */
    public static void m2418m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // p000.InterfaceC0333ig
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1212a(p000.InterfaceC0333ig r24) {
        /*
            Method dump skipped, instruction units count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0751to.mo1212a(ig):void");
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: d */
    public final void mo1213d() {
        C0925yc c0925yc;
        C0925yc c0925yc2;
        C0925yc c0925yc3;
        C0925yc c0925yc4;
        C0925yc c0925yc5 = this.f4927b;
        boolean z = c0925yc5.f5397a;
        C0780ug c0780ug = this.f4930e;
        if (z) {
            c0780ug.mo1684d(c0925yc5.m2749l());
        }
        boolean z2 = c0780ug.f2836j;
        ArrayList arrayList = c0780ug.f2837k;
        ArrayList arrayList2 = c0780ug.f2838l;
        C0410kg c0410kg = this.f4934i;
        C0410kg c0410kg2 = this.f4933h;
        if (!z2) {
            C0925yc c0925yc6 = this.f4927b;
            int i = c0925yc6.f5402c0[0];
            this.f4929d = i;
            if (i != 3) {
                if (i == 4 && (((c0925yc4 = c0925yc6.f5379I) != null && c0925yc4.f5402c0[0] == 1) || c0925yc4.f5402c0[0] == 4)) {
                    int iM2749l = c0925yc4.m2749l();
                    C0751to c0751to = c0925yc4.f5403d;
                    int iM1753c = (iM2749l - this.f4927b.f5423x.m1753c()) - this.f4927b.f5425z.m1753c();
                    vb0.m2555b(c0410kg2, c0751to.f4933h, this.f4927b.f5423x.m1753c());
                    vb0.m2555b(c0410kg, c0751to.f4934i, -this.f4927b.f5425z.m1753c());
                    c0780ug.mo1684d(iM1753c);
                    return;
                }
                if (i == 1) {
                    c0780ug.mo1684d(c0925yc6.m2749l());
                }
            }
        } else if (this.f4929d == 4 && (((c0925yc2 = (c0925yc = this.f4927b).f5379I) != null && c0925yc2.f5402c0[0] == 1) || c0925yc2.f5402c0[0] == 4)) {
            vb0.m2555b(c0410kg2, c0925yc2.f5403d.f4933h, c0925yc.f5423x.m1753c());
            vb0.m2555b(c0410kg, c0925yc2.f5403d.f4934i, -this.f4927b.f5425z.m1753c());
            return;
        }
        if (c0780ug.f2836j) {
            C0925yc c0925yc7 = this.f4927b;
            if (c0925yc7.f5397a) {
                C0443lc[] c0443lcArr = c0925yc7.f5376F;
                C0443lc c0443lc = c0443lcArr[0];
                C0443lc c0443lc2 = c0443lc.f2993d;
                if (c0443lc2 != null && c0443lcArr[1].f2993d != null) {
                    if (c0925yc7.m2754q()) {
                        c0410kg2.f2832f = this.f4927b.f5376F[0].m1753c();
                        c0410kg.f2832f = -this.f4927b.f5376F[1].m1753c();
                        return;
                    }
                    C0410kg c0410kgM2556h = vb0.m2556h(this.f4927b.f5376F[0]);
                    if (c0410kgM2556h != null) {
                        vb0.m2555b(c0410kg2, c0410kgM2556h, this.f4927b.f5376F[0].m1753c());
                    }
                    C0410kg c0410kgM2556h2 = vb0.m2556h(this.f4927b.f5376F[1]);
                    if (c0410kgM2556h2 != null) {
                        vb0.m2555b(c0410kg, c0410kgM2556h2, -this.f4927b.f5376F[1].m1753c());
                    }
                    c0410kg2.f2828b = true;
                    c0410kg.f2828b = true;
                    return;
                }
                if (c0443lc2 != null) {
                    C0410kg c0410kgM2556h3 = vb0.m2556h(c0443lc);
                    if (c0410kgM2556h3 != null) {
                        vb0.m2555b(c0410kg2, c0410kgM2556h3, this.f4927b.f5376F[0].m1753c());
                        vb0.m2555b(c0410kg, c0410kg2, c0780ug.f2833g);
                        return;
                    }
                    return;
                }
                C0443lc c0443lc3 = c0443lcArr[1];
                if (c0443lc3.f2993d != null) {
                    C0410kg c0410kgM2556h4 = vb0.m2556h(c0443lc3);
                    if (c0410kgM2556h4 != null) {
                        vb0.m2555b(c0410kg, c0410kgM2556h4, -this.f4927b.f5376F[1].m1753c());
                        vb0.m2555b(c0410kg2, c0410kg, -c0780ug.f2833g);
                        return;
                    }
                    return;
                }
                if ((c0925yc7 instanceof AbstractC0714so) || c0925yc7.f5379I == null || c0925yc7.mo1705g(7).f2993d != null) {
                    return;
                }
                C0925yc c0925yc8 = this.f4927b;
                vb0.m2555b(c0410kg2, c0925yc8.f5379I.f5403d.f4933h, c0925yc8.m2750m());
                vb0.m2555b(c0410kg, c0410kg2, c0780ug.f2833g);
                return;
            }
        }
        if (this.f4929d == 3) {
            C0925yc c0925yc9 = this.f4927b;
            int i2 = c0925yc9.f5409j;
            r90 r90Var = c0925yc9.f5404e;
            if (i2 == 2) {
                C0925yc c0925yc10 = c0925yc9.f5379I;
                if (c0925yc10 != null) {
                    C0780ug c0780ug2 = c0925yc10.f5404e.f4930e;
                    arrayList2.add(c0780ug2);
                    c0780ug2.f2837k.add(c0780ug);
                    c0780ug.f2828b = true;
                    arrayList.add(c0410kg2);
                    arrayList.add(c0410kg);
                }
            } else if (i2 == 3) {
                if (c0925yc9.f5410k == 3) {
                    c0410kg2.f2827a = this;
                    c0410kg.f2827a = this;
                    r90Var.f4933h.f2827a = this;
                    r90Var.f4934i.f2827a = this;
                    c0780ug.f2827a = this;
                    if (c0925yc9.m2755r()) {
                        arrayList2.add(this.f4927b.f5404e.f4930e);
                        this.f4927b.f5404e.f4930e.f2837k.add(c0780ug);
                        r90 r90Var2 = this.f4927b.f5404e;
                        r90Var2.f4930e.f2827a = this;
                        arrayList2.add(r90Var2.f4933h);
                        arrayList2.add(this.f4927b.f5404e.f4934i);
                        this.f4927b.f5404e.f4933h.f2837k.add(c0780ug);
                        this.f4927b.f5404e.f4934i.f2837k.add(c0780ug);
                    } else if (this.f4927b.m2754q()) {
                        this.f4927b.f5404e.f4930e.f2838l.add(c0780ug);
                        arrayList.add(this.f4927b.f5404e.f4930e);
                    } else {
                        this.f4927b.f5404e.f4930e.f2838l.add(c0780ug);
                    }
                } else {
                    C0780ug c0780ug3 = r90Var.f4930e;
                    arrayList2.add(c0780ug3);
                    c0780ug3.f2837k.add(c0780ug);
                    this.f4927b.f5404e.f4933h.f2837k.add(c0780ug);
                    this.f4927b.f5404e.f4934i.f2837k.add(c0780ug);
                    c0780ug.f2828b = true;
                    arrayList.add(c0410kg2);
                    arrayList.add(c0410kg);
                    c0410kg2.f2838l.add(c0780ug);
                    c0410kg.f2838l.add(c0780ug);
                }
            }
        }
        C0925yc c0925yc11 = this.f4927b;
        C0443lc[] c0443lcArr2 = c0925yc11.f5376F;
        C0443lc c0443lc4 = c0443lcArr2[0];
        C0443lc c0443lc5 = c0443lc4.f2993d;
        if (c0443lc5 != null && c0443lcArr2[1].f2993d != null) {
            if (c0925yc11.m2754q()) {
                c0410kg2.f2832f = this.f4927b.f5376F[0].m1753c();
                c0410kg.f2832f = -this.f4927b.f5376F[1].m1753c();
                return;
            }
            C0410kg c0410kgM2556h5 = vb0.m2556h(this.f4927b.f5376F[0]);
            C0410kg c0410kgM2556h6 = vb0.m2556h(this.f4927b.f5376F[1]);
            c0410kgM2556h5.m1682b(this);
            c0410kgM2556h6.m1682b(this);
            this.f4935j = 4;
            return;
        }
        if (c0443lc5 != null) {
            C0410kg c0410kgM2556h7 = vb0.m2556h(c0443lc4);
            if (c0410kgM2556h7 != null) {
                vb0.m2555b(c0410kg2, c0410kgM2556h7, this.f4927b.f5376F[0].m1753c());
                m2558c(c0410kg, c0410kg2, 1, c0780ug);
                return;
            }
            return;
        }
        C0443lc c0443lc6 = c0443lcArr2[1];
        if (c0443lc6.f2993d != null) {
            C0410kg c0410kgM2556h8 = vb0.m2556h(c0443lc6);
            if (c0410kgM2556h8 != null) {
                vb0.m2555b(c0410kg, c0410kgM2556h8, -this.f4927b.f5376F[1].m1753c());
                m2558c(c0410kg2, c0410kg, -1, c0780ug);
                return;
            }
            return;
        }
        if ((c0925yc11 instanceof AbstractC0714so) || (c0925yc3 = c0925yc11.f5379I) == null) {
            return;
        }
        vb0.m2555b(c0410kg2, c0925yc3.f5403d.f4933h, c0925yc11.m2750m());
        m2558c(c0410kg, c0410kg2, 1, c0780ug);
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: e */
    public final void mo1214e() {
        C0410kg c0410kg = this.f4933h;
        if (c0410kg.f2836j) {
            this.f4927b.f5384N = c0410kg.f2833g;
        }
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: f */
    public final void mo1215f() {
        this.f4928c = null;
        this.f4933h.m1683c();
        this.f4934i.m1683c();
        this.f4930e.m1683c();
        this.f4932g = false;
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: k */
    public final boolean mo1217k() {
        return this.f4929d != 3 || this.f4927b.f5409j == 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m2419n() {
        this.f4932g = false;
        C0410kg c0410kg = this.f4933h;
        c0410kg.m1683c();
        c0410kg.f2836j = false;
        C0410kg c0410kg2 = this.f4934i;
        c0410kg2.m1683c();
        c0410kg2.f2836j = false;
        this.f4930e.f2836j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4927b.f5393W;
    }
}
