package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class vb0 implements InterfaceC0333ig {

    /* JADX INFO: renamed from: a */
    public int f4926a;

    /* JADX INFO: renamed from: b */
    public C0925yc f4927b;

    /* JADX INFO: renamed from: c */
    public q10 f4928c;

    /* JADX INFO: renamed from: d */
    public int f4929d;

    /* JADX INFO: renamed from: e */
    public final C0780ug f4930e = new C0780ug(this);

    /* JADX INFO: renamed from: f */
    public int f4931f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f4932g = false;

    /* JADX INFO: renamed from: h */
    public final C0410kg f4933h = new C0410kg(this);

    /* JADX INFO: renamed from: i */
    public final C0410kg f4934i = new C0410kg(this);

    /* JADX INFO: renamed from: j */
    public int f4935j = 1;

    public vb0(C0925yc c0925yc) {
        this.f4927b = c0925yc;
    }

    /* JADX INFO: renamed from: b */
    public static void m2555b(C0410kg c0410kg, C0410kg c0410kg2, int i) {
        c0410kg.f2838l.add(c0410kg2);
        c0410kg.f2832f = i;
        c0410kg2.f2837k.add(c0410kg);
    }

    /* JADX INFO: renamed from: h */
    public static C0410kg m2556h(C0443lc c0443lc) {
        C0443lc c0443lc2 = c0443lc.f2993d;
        if (c0443lc2 == null) {
            return null;
        }
        C0925yc c0925yc = c0443lc2.f2991b;
        C0751to c0751to = c0925yc.f5403d;
        r90 r90Var = c0925yc.f5404e;
        int iM1158u = g40.m1158u(c0443lc2.f2992c);
        if (iM1158u == 1) {
            return c0751to.f4933h;
        }
        if (iM1158u == 2) {
            return r90Var.f4933h;
        }
        if (iM1158u == 3) {
            return c0751to.f4934i;
        }
        if (iM1158u == 4) {
            return r90Var.f4934i;
        }
        if (iM1158u != 5) {
            return null;
        }
        return r90Var.f4087k;
    }

    /* JADX INFO: renamed from: i */
    public static C0410kg m2557i(C0443lc c0443lc, int i) {
        C0443lc c0443lc2 = c0443lc.f2993d;
        if (c0443lc2 == null) {
            return null;
        }
        C0925yc c0925yc = c0443lc2.f2991b;
        vb0 vb0Var = i == 0 ? c0925yc.f5403d : c0925yc.f5404e;
        int iM1158u = g40.m1158u(c0443lc2.f2992c);
        if (iM1158u == 1 || iM1158u == 2) {
            return vb0Var.f4933h;
        }
        if (iM1158u == 3 || iM1158u == 4) {
            return vb0Var.f4934i;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2558c(C0410kg c0410kg, C0410kg c0410kg2, int i, C0780ug c0780ug) {
        c0410kg.f2838l.add(c0410kg2);
        c0410kg.f2838l.add(this.f4930e);
        c0410kg.f2834h = i;
        c0410kg.f2835i = c0780ug;
        c0410kg2.f2837k.add(c0410kg);
        c0780ug.f2837k.add(c0410kg);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1213d();

    /* JADX INFO: renamed from: e */
    public abstract void mo1214e();

    /* JADX INFO: renamed from: f */
    public abstract void mo1215f();

    /* JADX INFO: renamed from: g */
    public final int m2559g(int i, int i2) {
        if (i2 == 0) {
            C0925yc c0925yc = this.f4927b;
            int i3 = c0925yc.f5413n;
            int iMax = Math.max(c0925yc.f5412m, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C0925yc c0925yc2 = this.f4927b;
            int i4 = c0925yc2.f5416q;
            int iMax2 = Math.max(c0925yc2.f5415p, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public long mo1216j() {
        if (this.f4930e.f2836j) {
            return r0.f2833g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo1217k();

    /* JADX INFO: renamed from: l */
    public final void m2560l(C0443lc c0443lc, C0443lc c0443lc2, int i) {
        C0410kg c0410kgM2556h = m2556h(c0443lc);
        C0410kg c0410kgM2556h2 = m2556h(c0443lc2);
        if (c0410kgM2556h.f2836j && c0410kgM2556h2.f2836j) {
            int iM1753c = c0443lc.m1753c() + c0410kgM2556h.f2833g;
            int iM1753c2 = c0410kgM2556h2.f2833g - c0443lc2.m1753c();
            int i2 = iM1753c2 - iM1753c;
            C0780ug c0780ug = this.f4930e;
            if (!c0780ug.f2836j && this.f4929d == 3) {
                int i3 = this.f4926a;
                if (i3 == 0) {
                    c0780ug.mo1684d(m2559g(i2, i));
                } else if (i3 == 1) {
                    c0780ug.mo1684d(Math.min(m2559g(c0780ug.f4826m, i), i2));
                } else if (i3 == 2) {
                    C0925yc c0925yc = this.f4927b;
                    C0925yc c0925yc2 = c0925yc.f5379I;
                    if (c0925yc2 != null) {
                        if ((i == 0 ? c0925yc2.f5403d : c0925yc2.f5404e).f4930e.f2836j) {
                            c0780ug.mo1684d(m2559g((int) ((r6.f2833g * (i == 0 ? c0925yc.f5414o : c0925yc.f5417r)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0925yc c0925yc3 = this.f4927b;
                    vb0 vb0Var = c0925yc3.f5403d;
                    r90 r90Var = c0925yc3.f5404e;
                    if (vb0Var.f4929d != 3 || vb0Var.f4926a != 3 || r90Var.f4929d != 3 || r90Var.f4926a != 3) {
                        if (i == 0) {
                            vb0Var = r90Var;
                        }
                        if (vb0Var.f4930e.f2836j) {
                            float f = c0925yc3.f5382L;
                            c0780ug.mo1684d(i == 1 ? (int) ((r6.f2833g / f) + 0.5f) : (int) ((f * r6.f2833g) + 0.5f));
                        }
                    }
                }
            }
            if (c0780ug.f2836j) {
                int i4 = c0780ug.f2833g;
                C0410kg c0410kg = this.f4934i;
                C0410kg c0410kg2 = this.f4933h;
                if (i4 == i2) {
                    c0410kg2.mo1684d(iM1753c);
                    c0410kg.mo1684d(iM1753c2);
                    return;
                }
                C0925yc c0925yc4 = this.f4927b;
                float f2 = i == 0 ? c0925yc4.f5389S : c0925yc4.f5390T;
                if (c0410kgM2556h == c0410kgM2556h2) {
                    iM1753c = c0410kgM2556h.f2833g;
                    iM1753c2 = c0410kgM2556h2.f2833g;
                    f2 = 0.5f;
                }
                c0410kg2.mo1684d((int) ((((iM1753c2 - iM1753c) - i4) * f2) + iM1753c + 0.5f));
                c0410kg.mo1684d(c0410kg2.f2833g + c0780ug.f2833g);
            }
        }
    }
}
