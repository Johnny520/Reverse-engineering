package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: po */
/* JADX INFO: loaded from: classes.dex */
public final class C0604po extends qb0 {

    /* JADX INFO: renamed from: k */
    public static final int[] f3919k = new int[2];

    /* JADX INFO: renamed from: m */
    public static void m2125m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
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
    @Override // p000.InterfaceC0297hg
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1357a(p000.InterfaceC0297hg r24) {
        /*
            Method dump skipped, instruction units count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0604po.mo1357a(hg):void");
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: d */
    public final void mo1363d() {
        C0592pc c0592pc;
        C0592pc c0592pc2;
        C0592pc c0592pc3;
        C0592pc c0592pc4;
        C0592pc c0592pc5 = this.f4053b;
        boolean z = c0592pc5.f3850a;
        C0707sg c0707sg = this.f4056e;
        if (z) {
            c0707sg.mo1597d(c0592pc5.m2100l());
        }
        boolean z2 = c0707sg.f2630j;
        ArrayList arrayList = c0707sg.f2631k;
        ArrayList arrayList2 = c0707sg.f2632l;
        C0373jg c0373jg = this.f4060i;
        C0373jg c0373jg2 = this.f4059h;
        if (!z2) {
            C0592pc c0592pc6 = this.f4053b;
            int i = c0592pc6.f3855c0[0];
            this.f4055d = i;
            if (i != 3) {
                if (i == 4 && (((c0592pc4 = c0592pc6.f3832I) != null && c0592pc4.f3855c0[0] == 1) || c0592pc4.f3855c0[0] == 4)) {
                    int iM2100l = c0592pc4.m2100l();
                    C0604po c0604po = c0592pc4.f3856d;
                    int iM661c = (iM2100l - this.f4053b.f3876x.m661c()) - this.f4053b.f3878z.m661c();
                    qb0.m2158b(c0373jg2, c0604po.f4059h, this.f4053b.f3876x.m661c());
                    qb0.m2158b(c0373jg, c0604po.f4060i, -this.f4053b.f3878z.m661c());
                    c0707sg.mo1597d(iM661c);
                    return;
                }
                if (i == 1) {
                    c0707sg.mo1597d(c0592pc6.m2100l());
                }
            }
        } else if (this.f4055d == 4 && (((c0592pc2 = (c0592pc = this.f4053b).f3832I) != null && c0592pc2.f3855c0[0] == 1) || c0592pc2.f3855c0[0] == 4)) {
            qb0.m2158b(c0373jg2, c0592pc2.f3856d.f4059h, c0592pc.f3876x.m661c());
            qb0.m2158b(c0373jg, c0592pc2.f3856d.f4060i, -this.f4053b.f3878z.m661c());
            return;
        }
        if (c0707sg.f2630j) {
            C0592pc c0592pc7 = this.f4053b;
            if (c0592pc7.f3850a) {
                C0099cc[] c0099ccArr = c0592pc7.f3829F;
                C0099cc c0099cc = c0099ccArr[0];
                C0099cc c0099cc2 = c0099cc.f947d;
                if (c0099cc2 != null && c0099ccArr[1].f947d != null) {
                    if (c0592pc7.m2105q()) {
                        c0373jg2.f2626f = this.f4053b.f3829F[0].m661c();
                        c0373jg.f2626f = -this.f4053b.f3829F[1].m661c();
                        return;
                    }
                    C0373jg c0373jgM2159h = qb0.m2159h(this.f4053b.f3829F[0]);
                    if (c0373jgM2159h != null) {
                        qb0.m2158b(c0373jg2, c0373jgM2159h, this.f4053b.f3829F[0].m661c());
                    }
                    C0373jg c0373jgM2159h2 = qb0.m2159h(this.f4053b.f3829F[1]);
                    if (c0373jgM2159h2 != null) {
                        qb0.m2158b(c0373jg, c0373jgM2159h2, -this.f4053b.f3829F[1].m661c());
                    }
                    c0373jg2.f2622b = true;
                    c0373jg.f2622b = true;
                    return;
                }
                if (c0099cc2 != null) {
                    C0373jg c0373jgM2159h3 = qb0.m2159h(c0099cc);
                    if (c0373jgM2159h3 != null) {
                        qb0.m2158b(c0373jg2, c0373jgM2159h3, this.f4053b.f3829F[0].m661c());
                        qb0.m2158b(c0373jg, c0373jg2, c0707sg.f2627g);
                        return;
                    }
                    return;
                }
                C0099cc c0099cc3 = c0099ccArr[1];
                if (c0099cc3.f947d != null) {
                    C0373jg c0373jgM2159h4 = qb0.m2159h(c0099cc3);
                    if (c0373jgM2159h4 != null) {
                        qb0.m2158b(c0373jg, c0373jgM2159h4, -this.f4053b.f3829F[1].m661c());
                        qb0.m2158b(c0373jg2, c0373jg, -c0707sg.f2627g);
                        return;
                    }
                    return;
                }
                if ((c0592pc7 instanceof AbstractC0566oo) || c0592pc7.f3832I == null || c0592pc7.mo1294g(7).f947d != null) {
                    return;
                }
                C0592pc c0592pc8 = this.f4053b;
                qb0.m2158b(c0373jg2, c0592pc8.f3832I.f3856d.f4059h, c0592pc8.m2101m());
                qb0.m2158b(c0373jg, c0373jg2, c0707sg.f2627g);
                return;
            }
        }
        if (this.f4055d == 3) {
            C0592pc c0592pc9 = this.f4053b;
            int i2 = c0592pc9.f3862j;
            m90 m90Var = c0592pc9.f3857e;
            if (i2 == 2) {
                C0592pc c0592pc10 = c0592pc9.f3832I;
                if (c0592pc10 != null) {
                    C0707sg c0707sg2 = c0592pc10.f3857e.f4056e;
                    arrayList2.add(c0707sg2);
                    c0707sg2.f2631k.add(c0707sg);
                    c0707sg.f2622b = true;
                    arrayList.add(c0373jg2);
                    arrayList.add(c0373jg);
                }
            } else if (i2 == 3) {
                if (c0592pc9.f3863k == 3) {
                    c0373jg2.f2621a = this;
                    c0373jg.f2621a = this;
                    m90Var.f4059h.f2621a = this;
                    m90Var.f4060i.f2621a = this;
                    c0707sg.f2621a = this;
                    if (c0592pc9.m2106r()) {
                        arrayList2.add(this.f4053b.f3857e.f4056e);
                        this.f4053b.f3857e.f4056e.f2631k.add(c0707sg);
                        m90 m90Var2 = this.f4053b.f3857e;
                        m90Var2.f4056e.f2621a = this;
                        arrayList2.add(m90Var2.f4059h);
                        arrayList2.add(this.f4053b.f3857e.f4060i);
                        this.f4053b.f3857e.f4059h.f2631k.add(c0707sg);
                        this.f4053b.f3857e.f4060i.f2631k.add(c0707sg);
                    } else if (this.f4053b.m2105q()) {
                        this.f4053b.f3857e.f4056e.f2632l.add(c0707sg);
                        arrayList.add(this.f4053b.f3857e.f4056e);
                    } else {
                        this.f4053b.f3857e.f4056e.f2632l.add(c0707sg);
                    }
                } else {
                    C0707sg c0707sg3 = m90Var.f4056e;
                    arrayList2.add(c0707sg3);
                    c0707sg3.f2631k.add(c0707sg);
                    this.f4053b.f3857e.f4059h.f2631k.add(c0707sg);
                    this.f4053b.f3857e.f4060i.f2631k.add(c0707sg);
                    c0707sg.f2622b = true;
                    arrayList.add(c0373jg2);
                    arrayList.add(c0373jg);
                    c0373jg2.f2632l.add(c0707sg);
                    c0373jg.f2632l.add(c0707sg);
                }
            }
        }
        C0592pc c0592pc11 = this.f4053b;
        C0099cc[] c0099ccArr2 = c0592pc11.f3829F;
        C0099cc c0099cc4 = c0099ccArr2[0];
        C0099cc c0099cc5 = c0099cc4.f947d;
        if (c0099cc5 != null && c0099ccArr2[1].f947d != null) {
            if (c0592pc11.m2105q()) {
                c0373jg2.f2626f = this.f4053b.f3829F[0].m661c();
                c0373jg.f2626f = -this.f4053b.f3829F[1].m661c();
                return;
            }
            C0373jg c0373jgM2159h5 = qb0.m2159h(this.f4053b.f3829F[0]);
            C0373jg c0373jgM2159h6 = qb0.m2159h(this.f4053b.f3829F[1]);
            c0373jgM2159h5.m1595b(this);
            c0373jgM2159h6.m1595b(this);
            this.f4061j = 4;
            return;
        }
        if (c0099cc5 != null) {
            C0373jg c0373jgM2159h7 = qb0.m2159h(c0099cc4);
            if (c0373jgM2159h7 != null) {
                qb0.m2158b(c0373jg2, c0373jgM2159h7, this.f4053b.f3829F[0].m661c());
                m2161c(c0373jg, c0373jg2, 1, c0707sg);
                return;
            }
            return;
        }
        C0099cc c0099cc6 = c0099ccArr2[1];
        if (c0099cc6.f947d != null) {
            C0373jg c0373jgM2159h8 = qb0.m2159h(c0099cc6);
            if (c0373jgM2159h8 != null) {
                qb0.m2158b(c0373jg, c0373jgM2159h8, -this.f4053b.f3829F[1].m661c());
                m2161c(c0373jg2, c0373jg, -1, c0707sg);
                return;
            }
            return;
        }
        if ((c0592pc11 instanceof AbstractC0566oo) || (c0592pc3 = c0592pc11.f3832I) == null) {
            return;
        }
        qb0.m2158b(c0373jg2, c0592pc3.f3856d.f4059h, c0592pc11.m2101m());
        m2161c(c0373jg, c0373jg2, 1, c0707sg);
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: e */
    public final void mo1364e() {
        C0373jg c0373jg = this.f4059h;
        if (c0373jg.f2630j) {
            this.f4053b.f3837N = c0373jg.f2627g;
        }
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: f */
    public final void mo1365f() {
        this.f4054c = null;
        this.f4059h.m1596c();
        this.f4060i.m1596c();
        this.f4056e.m1596c();
        this.f4058g = false;
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: k */
    public final boolean mo1366k() {
        return this.f4055d != 3 || this.f4053b.f3862j == 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m2126n() {
        this.f4058g = false;
        C0373jg c0373jg = this.f4059h;
        c0373jg.m1596c();
        c0373jg.f2630j = false;
        C0373jg c0373jg2 = this.f4060i;
        c0373jg2.m1596c();
        c0373jg2.f2630j = false;
        this.f4056e.f2630j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4053b.f3846W;
    }
}
