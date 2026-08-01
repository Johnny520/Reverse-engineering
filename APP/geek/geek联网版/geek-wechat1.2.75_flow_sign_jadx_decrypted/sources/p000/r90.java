package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r90 extends vb0 {

    /* JADX INFO: renamed from: k */
    public C0410kg f4087k;

    /* JADX INFO: renamed from: l */
    public C0734t7 f4088l;

    @Override // p000.InterfaceC0333ig
    /* JADX INFO: renamed from: a */
    public final void mo1212a(InterfaceC0333ig interfaceC0333ig) {
        float f;
        float f2;
        float f3;
        int i;
        if (g40.m1158u(this.f4935j) == 3) {
            C0925yc c0925yc = this.f4927b;
            m2560l(c0925yc.f5424y, c0925yc.f5371A, 1);
            return;
        }
        C0780ug c0780ug = this.f4930e;
        if (c0780ug.f2829c && !c0780ug.f2836j && this.f4929d == 3) {
            C0925yc c0925yc2 = this.f4927b;
            int i2 = c0925yc2.f5410k;
            if (i2 == 2) {
                C0925yc c0925yc3 = c0925yc2.f5379I;
                if (c0925yc3 != null) {
                    if (c0925yc3.f5404e.f4930e.f2836j) {
                        c0780ug.mo1684d((int) ((r5.f2833g * c0925yc2.f5417r) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0780ug c0780ug2 = c0925yc2.f5403d.f4930e;
                if (c0780ug2.f2836j) {
                    int i3 = c0925yc2.f5383M;
                    if (i3 == -1) {
                        f = c0780ug2.f2833g;
                        f2 = c0925yc2.f5382L;
                    } else if (i3 == 0) {
                        f3 = c0780ug2.f2833g * c0925yc2.f5382L;
                        i = (int) (f3 + 0.5f);
                        c0780ug.mo1684d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0780ug.mo1684d(i);
                    } else {
                        f = c0780ug2.f2833g;
                        f2 = c0925yc2.f5382L;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c0780ug.mo1684d(i);
                }
            }
        }
        C0410kg c0410kg = this.f4933h;
        boolean z = c0410kg.f2829c;
        ArrayList arrayList = c0410kg.f2838l;
        if (z) {
            C0410kg c0410kg2 = this.f4934i;
            boolean z2 = c0410kg2.f2829c;
            ArrayList arrayList2 = c0410kg2.f2838l;
            if (z2) {
                if (c0410kg.f2836j && c0410kg2.f2836j && c0780ug.f2836j) {
                    return;
                }
                if (!c0780ug.f2836j && this.f4929d == 3) {
                    C0925yc c0925yc4 = this.f4927b;
                    if (c0925yc4.f5409j == 0 && !c0925yc4.m2755r()) {
                        C0410kg c0410kg3 = (C0410kg) arrayList.get(0);
                        C0410kg c0410kg4 = (C0410kg) arrayList2.get(0);
                        int i4 = c0410kg3.f2833g + c0410kg.f2832f;
                        int i5 = c0410kg4.f2833g + c0410kg2.f2832f;
                        c0410kg.mo1684d(i4);
                        c0410kg2.mo1684d(i5);
                        c0780ug.mo1684d(i5 - i4);
                        return;
                    }
                }
                if (!c0780ug.f2836j && this.f4929d == 3 && this.f4926a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C0410kg c0410kg5 = (C0410kg) arrayList.get(0);
                    int i6 = (((C0410kg) arrayList2.get(0)).f2833g + c0410kg2.f2832f) - (c0410kg5.f2833g + c0410kg.f2832f);
                    int i7 = c0780ug.f4826m;
                    if (i6 < i7) {
                        c0780ug.mo1684d(i6);
                    } else {
                        c0780ug.mo1684d(i7);
                    }
                }
                if (c0780ug.f2836j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C0410kg c0410kg6 = (C0410kg) arrayList.get(0);
                    C0410kg c0410kg7 = (C0410kg) arrayList2.get(0);
                    int i8 = c0410kg6.f2833g;
                    int i9 = c0410kg.f2832f + i8;
                    int i10 = c0410kg7.f2833g;
                    int i11 = c0410kg2.f2832f + i10;
                    float f4 = this.f4927b.f5390T;
                    if (c0410kg6 == c0410kg7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0410kg.mo1684d((int) ((((i10 - i8) - c0780ug.f2833g) * f4) + i8 + 0.5f));
                    c0410kg2.mo1684d(c0410kg.f2833g + c0780ug.f2833g);
                }
            }
        }
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: d */
    public final void mo1213d() {
        C0925yc c0925yc;
        C0925yc c0925yc2;
        C0925yc c0925yc3;
        C0925yc c0925yc4;
        C0410kg c0410kg = this.f4087k;
        C0925yc c0925yc5 = this.f4927b;
        boolean z = c0925yc5.f5397a;
        C0780ug c0780ug = this.f4930e;
        if (z) {
            c0780ug.mo1684d(c0925yc5.m2746i());
        }
        boolean z2 = c0780ug.f2836j;
        ArrayList arrayList = c0780ug.f2837k;
        ArrayList arrayList2 = c0780ug.f2838l;
        C0410kg c0410kg2 = this.f4934i;
        C0410kg c0410kg3 = this.f4933h;
        if (!z2) {
            C0925yc c0925yc6 = this.f4927b;
            this.f4929d = c0925yc6.f5402c0[1];
            if (c0925yc6.f5422w) {
                this.f4088l = new C0734t7(this);
            }
            int i = this.f4929d;
            if (i != 3) {
                if (i == 4 && (c0925yc4 = this.f4927b.f5379I) != null) {
                    r90 r90Var = c0925yc4.f5404e;
                    if (c0925yc4.f5402c0[1] == 1) {
                        int iM2746i = (c0925yc4.m2746i() - this.f4927b.f5424y.m1753c()) - this.f4927b.f5371A.m1753c();
                        vb0.m2555b(c0410kg3, r90Var.f4933h, this.f4927b.f5424y.m1753c());
                        vb0.m2555b(c0410kg2, r90Var.f4934i, -this.f4927b.f5371A.m1753c());
                        c0780ug.mo1684d(iM2746i);
                        return;
                    }
                }
                if (i == 1) {
                    c0780ug.mo1684d(this.f4927b.m2746i());
                }
            }
        } else if (this.f4929d == 4 && (c0925yc2 = (c0925yc = this.f4927b).f5379I) != null) {
            r90 r90Var2 = c0925yc2.f5404e;
            if (c0925yc2.f5402c0[1] == 1) {
                vb0.m2555b(c0410kg3, r90Var2.f4933h, c0925yc.f5424y.m1753c());
                vb0.m2555b(c0410kg2, r90Var2.f4934i, -this.f4927b.f5371A.m1753c());
                return;
            }
        }
        boolean z3 = c0780ug.f2836j;
        if (z3) {
            C0925yc c0925yc7 = this.f4927b;
            if (c0925yc7.f5397a) {
                C0443lc[] c0443lcArr = c0925yc7.f5376F;
                C0443lc c0443lc = c0443lcArr[2];
                C0443lc c0443lc2 = c0443lc.f2993d;
                if (c0443lc2 != null && c0443lcArr[3].f2993d != null) {
                    if (c0925yc7.m2755r()) {
                        c0410kg3.f2832f = this.f4927b.f5376F[2].m1753c();
                        c0410kg2.f2832f = -this.f4927b.f5376F[3].m1753c();
                    } else {
                        C0410kg c0410kgM2556h = vb0.m2556h(this.f4927b.f5376F[2]);
                        if (c0410kgM2556h != null) {
                            vb0.m2555b(c0410kg3, c0410kgM2556h, this.f4927b.f5376F[2].m1753c());
                        }
                        C0410kg c0410kgM2556h2 = vb0.m2556h(this.f4927b.f5376F[3]);
                        if (c0410kgM2556h2 != null) {
                            vb0.m2555b(c0410kg2, c0410kgM2556h2, -this.f4927b.f5376F[3].m1753c());
                        }
                        c0410kg3.f2828b = true;
                        c0410kg2.f2828b = true;
                    }
                    C0925yc c0925yc8 = this.f4927b;
                    if (c0925yc8.f5422w) {
                        vb0.m2555b(c0410kg, c0410kg3, c0925yc8.f5386P);
                        return;
                    }
                    return;
                }
                if (c0443lc2 != null) {
                    C0410kg c0410kgM2556h3 = vb0.m2556h(c0443lc);
                    if (c0410kgM2556h3 != null) {
                        vb0.m2555b(c0410kg3, c0410kgM2556h3, this.f4927b.f5376F[2].m1753c());
                        vb0.m2555b(c0410kg2, c0410kg3, c0780ug.f2833g);
                        C0925yc c0925yc9 = this.f4927b;
                        if (c0925yc9.f5422w) {
                            vb0.m2555b(c0410kg, c0410kg3, c0925yc9.f5386P);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0443lc c0443lc3 = c0443lcArr[3];
                if (c0443lc3.f2993d != null) {
                    C0410kg c0410kgM2556h4 = vb0.m2556h(c0443lc3);
                    if (c0410kgM2556h4 != null) {
                        vb0.m2555b(c0410kg2, c0410kgM2556h4, -this.f4927b.f5376F[3].m1753c());
                        vb0.m2555b(c0410kg3, c0410kg2, -c0780ug.f2833g);
                    }
                    C0925yc c0925yc10 = this.f4927b;
                    if (c0925yc10.f5422w) {
                        vb0.m2555b(c0410kg, c0410kg3, c0925yc10.f5386P);
                        return;
                    }
                    return;
                }
                C0443lc c0443lc4 = c0443lcArr[4];
                if (c0443lc4.f2993d != null) {
                    C0410kg c0410kgM2556h5 = vb0.m2556h(c0443lc4);
                    if (c0410kgM2556h5 != null) {
                        vb0.m2555b(c0410kg, c0410kgM2556h5, 0);
                        vb0.m2555b(c0410kg3, c0410kg, -this.f4927b.f5386P);
                        vb0.m2555b(c0410kg2, c0410kg3, c0780ug.f2833g);
                        return;
                    }
                    return;
                }
                if ((c0925yc7 instanceof AbstractC0714so) || c0925yc7.f5379I == null || c0925yc7.mo1705g(7).f2993d != null) {
                    return;
                }
                C0925yc c0925yc11 = this.f4927b;
                vb0.m2555b(c0410kg3, c0925yc11.f5379I.f5404e.f4933h, c0925yc11.m2751n());
                vb0.m2555b(c0410kg2, c0410kg3, c0780ug.f2833g);
                C0925yc c0925yc12 = this.f4927b;
                if (c0925yc12.f5422w) {
                    vb0.m2555b(c0410kg, c0410kg3, c0925yc12.f5386P);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f4929d != 3) {
            c0780ug.m1682b(this);
        } else {
            C0925yc c0925yc13 = this.f4927b;
            int i2 = c0925yc13.f5410k;
            if (i2 == 2) {
                C0925yc c0925yc14 = c0925yc13.f5379I;
                if (c0925yc14 != null) {
                    C0780ug c0780ug2 = c0925yc14.f5404e.f4930e;
                    arrayList2.add(c0780ug2);
                    c0780ug2.f2837k.add(c0780ug);
                    c0780ug.f2828b = true;
                    arrayList.add(c0410kg3);
                    arrayList.add(c0410kg2);
                }
            } else if (i2 == 3 && !c0925yc13.m2755r()) {
                C0925yc c0925yc15 = this.f4927b;
                if (c0925yc15.f5409j != 3) {
                    C0780ug c0780ug3 = c0925yc15.f5403d.f4930e;
                    arrayList2.add(c0780ug3);
                    c0780ug3.f2837k.add(c0780ug);
                    c0780ug.f2828b = true;
                    arrayList.add(c0410kg3);
                    arrayList.add(c0410kg2);
                }
            }
        }
        C0925yc c0925yc16 = this.f4927b;
        C0443lc[] c0443lcArr2 = c0925yc16.f5376F;
        C0443lc c0443lc5 = c0443lcArr2[2];
        C0443lc c0443lc6 = c0443lc5.f2993d;
        if (c0443lc6 != null && c0443lcArr2[3].f2993d != null) {
            if (c0925yc16.m2755r()) {
                c0410kg3.f2832f = this.f4927b.f5376F[2].m1753c();
                c0410kg2.f2832f = -this.f4927b.f5376F[3].m1753c();
            } else {
                C0410kg c0410kgM2556h6 = vb0.m2556h(this.f4927b.f5376F[2]);
                C0410kg c0410kgM2556h7 = vb0.m2556h(this.f4927b.f5376F[3]);
                c0410kgM2556h6.m1682b(this);
                c0410kgM2556h7.m1682b(this);
                this.f4935j = 4;
            }
            if (this.f4927b.f5422w) {
                m2558c(c0410kg, c0410kg3, 1, this.f4088l);
            }
        } else if (c0443lc6 != null) {
            C0410kg c0410kgM2556h8 = vb0.m2556h(c0443lc5);
            if (c0410kgM2556h8 != null) {
                vb0.m2555b(c0410kg3, c0410kgM2556h8, this.f4927b.f5376F[2].m1753c());
                m2558c(c0410kg2, c0410kg3, 1, c0780ug);
                if (this.f4927b.f5422w) {
                    m2558c(c0410kg, c0410kg3, 1, this.f4088l);
                }
                if (this.f4929d == 3) {
                    C0925yc c0925yc17 = this.f4927b;
                    if (c0925yc17.f5382L > 0.0f) {
                        C0751to c0751to = c0925yc17.f5403d;
                        if (c0751to.f4929d == 3) {
                            c0751to.f4930e.f2837k.add(c0780ug);
                            arrayList2.add(this.f4927b.f5403d.f4930e);
                            c0780ug.f2827a = this;
                        }
                    }
                }
            }
        } else {
            C0443lc c0443lc7 = c0443lcArr2[3];
            if (c0443lc7.f2993d != null) {
                C0410kg c0410kgM2556h9 = vb0.m2556h(c0443lc7);
                if (c0410kgM2556h9 != null) {
                    vb0.m2555b(c0410kg2, c0410kgM2556h9, -this.f4927b.f5376F[3].m1753c());
                    m2558c(c0410kg3, c0410kg2, -1, c0780ug);
                    if (this.f4927b.f5422w) {
                        m2558c(c0410kg, c0410kg3, 1, this.f4088l);
                    }
                }
            } else {
                C0443lc c0443lc8 = c0443lcArr2[4];
                if (c0443lc8.f2993d != null) {
                    C0410kg c0410kgM2556h10 = vb0.m2556h(c0443lc8);
                    if (c0410kgM2556h10 != null) {
                        vb0.m2555b(c0410kg, c0410kgM2556h10, 0);
                        m2558c(c0410kg3, c0410kg, -1, this.f4088l);
                        m2558c(c0410kg2, c0410kg3, 1, c0780ug);
                    }
                } else if (!(c0925yc16 instanceof AbstractC0714so) && (c0925yc3 = c0925yc16.f5379I) != null) {
                    vb0.m2555b(c0410kg3, c0925yc3.f5404e.f4933h, c0925yc16.m2751n());
                    m2558c(c0410kg2, c0410kg3, 1, c0780ug);
                    if (this.f4927b.f5422w) {
                        m2558c(c0410kg, c0410kg3, 1, this.f4088l);
                    }
                    if (this.f4929d == 3) {
                        C0925yc c0925yc18 = this.f4927b;
                        if (c0925yc18.f5382L > 0.0f) {
                            C0751to c0751to2 = c0925yc18.f5403d;
                            if (c0751to2.f4929d == 3) {
                                c0751to2.f4930e.f2837k.add(c0780ug);
                                arrayList2.add(this.f4927b.f5403d.f4930e);
                                c0780ug.f2827a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c0780ug.f2829c = true;
        }
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: e */
    public final void mo1214e() {
        C0410kg c0410kg = this.f4933h;
        if (c0410kg.f2836j) {
            this.f4927b.f5385O = c0410kg.f2833g;
        }
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: f */
    public final void mo1215f() {
        this.f4928c = null;
        this.f4933h.m1683c();
        this.f4934i.m1683c();
        this.f4087k.m1683c();
        this.f4930e.m1683c();
        this.f4932g = false;
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: k */
    public final boolean mo1217k() {
        return this.f4929d != 3 || this.f4927b.f5410k == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m2265m() {
        this.f4932g = false;
        C0410kg c0410kg = this.f4933h;
        c0410kg.m1683c();
        c0410kg.f2836j = false;
        C0410kg c0410kg2 = this.f4934i;
        c0410kg2.m1683c();
        c0410kg2.f2836j = false;
        C0410kg c0410kg3 = this.f4087k;
        c0410kg3.m1683c();
        c0410kg3.f2836j = false;
        this.f4930e.f2836j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4927b.f5393W;
    }
}
