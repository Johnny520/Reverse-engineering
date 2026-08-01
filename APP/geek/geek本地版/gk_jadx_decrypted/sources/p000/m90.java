package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m90 extends qb0 {

    /* JADX INFO: renamed from: k */
    public C0373jg f3159k;

    /* JADX INFO: renamed from: l */
    public C0364j7 f3160l;

    @Override // p000.InterfaceC0297hg
    /* JADX INFO: renamed from: a */
    public final void mo1357a(InterfaceC0297hg interfaceC0297hg) {
        float f;
        float f2;
        float f3;
        int i;
        if (z30.m2775t(this.f4061j) == 3) {
            C0592pc c0592pc = this.f4053b;
            m2164l(c0592pc.f3877y, c0592pc.f3824A, 1);
            return;
        }
        C0707sg c0707sg = this.f4056e;
        if (c0707sg.f2623c && !c0707sg.f2630j && this.f4055d == 3) {
            C0592pc c0592pc2 = this.f4053b;
            int i2 = c0592pc2.f3863k;
            if (i2 == 2) {
                C0592pc c0592pc3 = c0592pc2.f3832I;
                if (c0592pc3 != null) {
                    if (c0592pc3.f3857e.f4056e.f2630j) {
                        c0707sg.mo1597d((int) ((r5.f2627g * c0592pc2.f3870r) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0707sg c0707sg2 = c0592pc2.f3856d.f4056e;
                if (c0707sg2.f2630j) {
                    int i3 = c0592pc2.f3836M;
                    if (i3 == -1) {
                        f = c0707sg2.f2627g;
                        f2 = c0592pc2.f3835L;
                    } else if (i3 == 0) {
                        f3 = c0707sg2.f2627g * c0592pc2.f3835L;
                        i = (int) (f3 + 0.5f);
                        c0707sg.mo1597d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0707sg.mo1597d(i);
                    } else {
                        f = c0707sg2.f2627g;
                        f2 = c0592pc2.f3835L;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c0707sg.mo1597d(i);
                }
            }
        }
        C0373jg c0373jg = this.f4059h;
        boolean z = c0373jg.f2623c;
        ArrayList arrayList = c0373jg.f2632l;
        if (z) {
            C0373jg c0373jg2 = this.f4060i;
            boolean z2 = c0373jg2.f2623c;
            ArrayList arrayList2 = c0373jg2.f2632l;
            if (z2) {
                if (c0373jg.f2630j && c0373jg2.f2630j && c0707sg.f2630j) {
                    return;
                }
                if (!c0707sg.f2630j && this.f4055d == 3) {
                    C0592pc c0592pc4 = this.f4053b;
                    if (c0592pc4.f3862j == 0 && !c0592pc4.m2106r()) {
                        C0373jg c0373jg3 = (C0373jg) arrayList.get(0);
                        C0373jg c0373jg4 = (C0373jg) arrayList2.get(0);
                        int i4 = c0373jg3.f2627g + c0373jg.f2626f;
                        int i5 = c0373jg4.f2627g + c0373jg2.f2626f;
                        c0373jg.mo1597d(i4);
                        c0373jg2.mo1597d(i5);
                        c0707sg.mo1597d(i5 - i4);
                        return;
                    }
                }
                if (!c0707sg.f2630j && this.f4055d == 3 && this.f4052a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C0373jg c0373jg5 = (C0373jg) arrayList.get(0);
                    int i6 = (((C0373jg) arrayList2.get(0)).f2627g + c0373jg2.f2626f) - (c0373jg5.f2627g + c0373jg.f2626f);
                    int i7 = c0707sg.f4436m;
                    if (i6 < i7) {
                        c0707sg.mo1597d(i6);
                    } else {
                        c0707sg.mo1597d(i7);
                    }
                }
                if (c0707sg.f2630j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C0373jg c0373jg6 = (C0373jg) arrayList.get(0);
                    C0373jg c0373jg7 = (C0373jg) arrayList2.get(0);
                    int i8 = c0373jg6.f2627g;
                    int i9 = c0373jg.f2626f + i8;
                    int i10 = c0373jg7.f2627g;
                    int i11 = c0373jg2.f2626f + i10;
                    float f4 = this.f4053b.f3843T;
                    if (c0373jg6 == c0373jg7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0373jg.mo1597d((int) ((((i10 - i8) - c0707sg.f2627g) * f4) + i8 + 0.5f));
                    c0373jg2.mo1597d(c0373jg.f2627g + c0707sg.f2627g);
                }
            }
        }
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: d */
    public final void mo1363d() {
        C0592pc c0592pc;
        C0592pc c0592pc2;
        C0592pc c0592pc3;
        C0592pc c0592pc4;
        C0373jg c0373jg = this.f3159k;
        C0592pc c0592pc5 = this.f4053b;
        boolean z = c0592pc5.f3850a;
        C0707sg c0707sg = this.f4056e;
        if (z) {
            c0707sg.mo1597d(c0592pc5.m2097i());
        }
        boolean z2 = c0707sg.f2630j;
        ArrayList arrayList = c0707sg.f2631k;
        ArrayList arrayList2 = c0707sg.f2632l;
        C0373jg c0373jg2 = this.f4060i;
        C0373jg c0373jg3 = this.f4059h;
        if (!z2) {
            C0592pc c0592pc6 = this.f4053b;
            this.f4055d = c0592pc6.f3855c0[1];
            if (c0592pc6.f3875w) {
                this.f3160l = new C0364j7(this);
            }
            int i = this.f4055d;
            if (i != 3) {
                if (i == 4 && (c0592pc4 = this.f4053b.f3832I) != null) {
                    m90 m90Var = c0592pc4.f3857e;
                    if (c0592pc4.f3855c0[1] == 1) {
                        int iM2097i = (c0592pc4.m2097i() - this.f4053b.f3877y.m661c()) - this.f4053b.f3824A.m661c();
                        qb0.m2158b(c0373jg3, m90Var.f4059h, this.f4053b.f3877y.m661c());
                        qb0.m2158b(c0373jg2, m90Var.f4060i, -this.f4053b.f3824A.m661c());
                        c0707sg.mo1597d(iM2097i);
                        return;
                    }
                }
                if (i == 1) {
                    c0707sg.mo1597d(this.f4053b.m2097i());
                }
            }
        } else if (this.f4055d == 4 && (c0592pc2 = (c0592pc = this.f4053b).f3832I) != null) {
            m90 m90Var2 = c0592pc2.f3857e;
            if (c0592pc2.f3855c0[1] == 1) {
                qb0.m2158b(c0373jg3, m90Var2.f4059h, c0592pc.f3877y.m661c());
                qb0.m2158b(c0373jg2, m90Var2.f4060i, -this.f4053b.f3824A.m661c());
                return;
            }
        }
        boolean z3 = c0707sg.f2630j;
        if (z3) {
            C0592pc c0592pc7 = this.f4053b;
            if (c0592pc7.f3850a) {
                C0099cc[] c0099ccArr = c0592pc7.f3829F;
                C0099cc c0099cc = c0099ccArr[2];
                C0099cc c0099cc2 = c0099cc.f947d;
                if (c0099cc2 != null && c0099ccArr[3].f947d != null) {
                    if (c0592pc7.m2106r()) {
                        c0373jg3.f2626f = this.f4053b.f3829F[2].m661c();
                        c0373jg2.f2626f = -this.f4053b.f3829F[3].m661c();
                    } else {
                        C0373jg c0373jgM2159h = qb0.m2159h(this.f4053b.f3829F[2]);
                        if (c0373jgM2159h != null) {
                            qb0.m2158b(c0373jg3, c0373jgM2159h, this.f4053b.f3829F[2].m661c());
                        }
                        C0373jg c0373jgM2159h2 = qb0.m2159h(this.f4053b.f3829F[3]);
                        if (c0373jgM2159h2 != null) {
                            qb0.m2158b(c0373jg2, c0373jgM2159h2, -this.f4053b.f3829F[3].m661c());
                        }
                        c0373jg3.f2622b = true;
                        c0373jg2.f2622b = true;
                    }
                    C0592pc c0592pc8 = this.f4053b;
                    if (c0592pc8.f3875w) {
                        qb0.m2158b(c0373jg, c0373jg3, c0592pc8.f3839P);
                        return;
                    }
                    return;
                }
                if (c0099cc2 != null) {
                    C0373jg c0373jgM2159h3 = qb0.m2159h(c0099cc);
                    if (c0373jgM2159h3 != null) {
                        qb0.m2158b(c0373jg3, c0373jgM2159h3, this.f4053b.f3829F[2].m661c());
                        qb0.m2158b(c0373jg2, c0373jg3, c0707sg.f2627g);
                        C0592pc c0592pc9 = this.f4053b;
                        if (c0592pc9.f3875w) {
                            qb0.m2158b(c0373jg, c0373jg3, c0592pc9.f3839P);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0099cc c0099cc3 = c0099ccArr[3];
                if (c0099cc3.f947d != null) {
                    C0373jg c0373jgM2159h4 = qb0.m2159h(c0099cc3);
                    if (c0373jgM2159h4 != null) {
                        qb0.m2158b(c0373jg2, c0373jgM2159h4, -this.f4053b.f3829F[3].m661c());
                        qb0.m2158b(c0373jg3, c0373jg2, -c0707sg.f2627g);
                    }
                    C0592pc c0592pc10 = this.f4053b;
                    if (c0592pc10.f3875w) {
                        qb0.m2158b(c0373jg, c0373jg3, c0592pc10.f3839P);
                        return;
                    }
                    return;
                }
                C0099cc c0099cc4 = c0099ccArr[4];
                if (c0099cc4.f947d != null) {
                    C0373jg c0373jgM2159h5 = qb0.m2159h(c0099cc4);
                    if (c0373jgM2159h5 != null) {
                        qb0.m2158b(c0373jg, c0373jgM2159h5, 0);
                        qb0.m2158b(c0373jg3, c0373jg, -this.f4053b.f3839P);
                        qb0.m2158b(c0373jg2, c0373jg3, c0707sg.f2627g);
                        return;
                    }
                    return;
                }
                if ((c0592pc7 instanceof AbstractC0566oo) || c0592pc7.f3832I == null || c0592pc7.mo1294g(7).f947d != null) {
                    return;
                }
                C0592pc c0592pc11 = this.f4053b;
                qb0.m2158b(c0373jg3, c0592pc11.f3832I.f3857e.f4059h, c0592pc11.m2102n());
                qb0.m2158b(c0373jg2, c0373jg3, c0707sg.f2627g);
                C0592pc c0592pc12 = this.f4053b;
                if (c0592pc12.f3875w) {
                    qb0.m2158b(c0373jg, c0373jg3, c0592pc12.f3839P);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f4055d != 3) {
            c0707sg.m1595b(this);
        } else {
            C0592pc c0592pc13 = this.f4053b;
            int i2 = c0592pc13.f3863k;
            if (i2 == 2) {
                C0592pc c0592pc14 = c0592pc13.f3832I;
                if (c0592pc14 != null) {
                    C0707sg c0707sg2 = c0592pc14.f3857e.f4056e;
                    arrayList2.add(c0707sg2);
                    c0707sg2.f2631k.add(c0707sg);
                    c0707sg.f2622b = true;
                    arrayList.add(c0373jg3);
                    arrayList.add(c0373jg2);
                }
            } else if (i2 == 3 && !c0592pc13.m2106r()) {
                C0592pc c0592pc15 = this.f4053b;
                if (c0592pc15.f3862j != 3) {
                    C0707sg c0707sg3 = c0592pc15.f3856d.f4056e;
                    arrayList2.add(c0707sg3);
                    c0707sg3.f2631k.add(c0707sg);
                    c0707sg.f2622b = true;
                    arrayList.add(c0373jg3);
                    arrayList.add(c0373jg2);
                }
            }
        }
        C0592pc c0592pc16 = this.f4053b;
        C0099cc[] c0099ccArr2 = c0592pc16.f3829F;
        C0099cc c0099cc5 = c0099ccArr2[2];
        C0099cc c0099cc6 = c0099cc5.f947d;
        if (c0099cc6 != null && c0099ccArr2[3].f947d != null) {
            if (c0592pc16.m2106r()) {
                c0373jg3.f2626f = this.f4053b.f3829F[2].m661c();
                c0373jg2.f2626f = -this.f4053b.f3829F[3].m661c();
            } else {
                C0373jg c0373jgM2159h6 = qb0.m2159h(this.f4053b.f3829F[2]);
                C0373jg c0373jgM2159h7 = qb0.m2159h(this.f4053b.f3829F[3]);
                c0373jgM2159h6.m1595b(this);
                c0373jgM2159h7.m1595b(this);
                this.f4061j = 4;
            }
            if (this.f4053b.f3875w) {
                m2161c(c0373jg, c0373jg3, 1, this.f3160l);
            }
        } else if (c0099cc6 != null) {
            C0373jg c0373jgM2159h8 = qb0.m2159h(c0099cc5);
            if (c0373jgM2159h8 != null) {
                qb0.m2158b(c0373jg3, c0373jgM2159h8, this.f4053b.f3829F[2].m661c());
                m2161c(c0373jg2, c0373jg3, 1, c0707sg);
                if (this.f4053b.f3875w) {
                    m2161c(c0373jg, c0373jg3, 1, this.f3160l);
                }
                if (this.f4055d == 3) {
                    C0592pc c0592pc17 = this.f4053b;
                    if (c0592pc17.f3835L > 0.0f) {
                        C0604po c0604po = c0592pc17.f3856d;
                        if (c0604po.f4055d == 3) {
                            c0604po.f4056e.f2631k.add(c0707sg);
                            arrayList2.add(this.f4053b.f3856d.f4056e);
                            c0707sg.f2621a = this;
                        }
                    }
                }
            }
        } else {
            C0099cc c0099cc7 = c0099ccArr2[3];
            if (c0099cc7.f947d != null) {
                C0373jg c0373jgM2159h9 = qb0.m2159h(c0099cc7);
                if (c0373jgM2159h9 != null) {
                    qb0.m2158b(c0373jg2, c0373jgM2159h9, -this.f4053b.f3829F[3].m661c());
                    m2161c(c0373jg3, c0373jg2, -1, c0707sg);
                    if (this.f4053b.f3875w) {
                        m2161c(c0373jg, c0373jg3, 1, this.f3160l);
                    }
                }
            } else {
                C0099cc c0099cc8 = c0099ccArr2[4];
                if (c0099cc8.f947d != null) {
                    C0373jg c0373jgM2159h10 = qb0.m2159h(c0099cc8);
                    if (c0373jgM2159h10 != null) {
                        qb0.m2158b(c0373jg, c0373jgM2159h10, 0);
                        m2161c(c0373jg3, c0373jg, -1, this.f3160l);
                        m2161c(c0373jg2, c0373jg3, 1, c0707sg);
                    }
                } else if (!(c0592pc16 instanceof AbstractC0566oo) && (c0592pc3 = c0592pc16.f3832I) != null) {
                    qb0.m2158b(c0373jg3, c0592pc3.f3857e.f4059h, c0592pc16.m2102n());
                    m2161c(c0373jg2, c0373jg3, 1, c0707sg);
                    if (this.f4053b.f3875w) {
                        m2161c(c0373jg, c0373jg3, 1, this.f3160l);
                    }
                    if (this.f4055d == 3) {
                        C0592pc c0592pc18 = this.f4053b;
                        if (c0592pc18.f3835L > 0.0f) {
                            C0604po c0604po2 = c0592pc18.f3856d;
                            if (c0604po2.f4055d == 3) {
                                c0604po2.f4056e.f2631k.add(c0707sg);
                                arrayList2.add(this.f4053b.f3856d.f4056e);
                                c0707sg.f2621a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c0707sg.f2623c = true;
        }
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: e */
    public final void mo1364e() {
        C0373jg c0373jg = this.f4059h;
        if (c0373jg.f2630j) {
            this.f4053b.f3838O = c0373jg.f2627g;
        }
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: f */
    public final void mo1365f() {
        this.f4054c = null;
        this.f4059h.m1596c();
        this.f4060i.m1596c();
        this.f3159k.m1596c();
        this.f4056e.m1596c();
        this.f4058g = false;
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: k */
    public final boolean mo1366k() {
        return this.f4055d != 3 || this.f4053b.f3863k == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m1800m() {
        this.f4058g = false;
        C0373jg c0373jg = this.f4059h;
        c0373jg.m1596c();
        c0373jg.f2630j = false;
        C0373jg c0373jg2 = this.f4060i;
        c0373jg2.m1596c();
        c0373jg2.f2630j = false;
        C0373jg c0373jg3 = this.f3159k;
        c0373jg3.m1596c();
        c0373jg3.f2630j = false;
        this.f4056e.f2630j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4053b.f3846W;
    }
}
