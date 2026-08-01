package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class qb0 implements InterfaceC0297hg {

    /* JADX INFO: renamed from: a */
    public int f4052a;

    /* JADX INFO: renamed from: b */
    public C0592pc f4053b;

    /* JADX INFO: renamed from: c */
    public j10 f4054c;

    /* JADX INFO: renamed from: d */
    public int f4055d;

    /* JADX INFO: renamed from: e */
    public final C0707sg f4056e = new C0707sg(this);

    /* JADX INFO: renamed from: f */
    public int f4057f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f4058g = false;

    /* JADX INFO: renamed from: h */
    public final C0373jg f4059h = new C0373jg(this);

    /* JADX INFO: renamed from: i */
    public final C0373jg f4060i = new C0373jg(this);

    /* JADX INFO: renamed from: j */
    public int f4061j = 1;

    public qb0(C0592pc c0592pc) {
        this.f4053b = c0592pc;
    }

    /* JADX INFO: renamed from: b */
    public static void m2158b(C0373jg c0373jg, C0373jg c0373jg2, int i) {
        c0373jg.f2632l.add(c0373jg2);
        c0373jg.f2626f = i;
        c0373jg2.f2631k.add(c0373jg);
    }

    /* JADX INFO: renamed from: h */
    public static C0373jg m2159h(C0099cc c0099cc) {
        C0099cc c0099cc2 = c0099cc.f947d;
        if (c0099cc2 == null) {
            return null;
        }
        C0592pc c0592pc = c0099cc2.f945b;
        C0604po c0604po = c0592pc.f3856d;
        m90 m90Var = c0592pc.f3857e;
        int iM2775t = z30.m2775t(c0099cc2.f946c);
        if (iM2775t == 1) {
            return c0604po.f4059h;
        }
        if (iM2775t == 2) {
            return m90Var.f4059h;
        }
        if (iM2775t == 3) {
            return c0604po.f4060i;
        }
        if (iM2775t == 4) {
            return m90Var.f4060i;
        }
        if (iM2775t != 5) {
            return null;
        }
        return m90Var.f3159k;
    }

    /* JADX INFO: renamed from: i */
    public static C0373jg m2160i(C0099cc c0099cc, int i) {
        C0099cc c0099cc2 = c0099cc.f947d;
        if (c0099cc2 == null) {
            return null;
        }
        C0592pc c0592pc = c0099cc2.f945b;
        qb0 qb0Var = i == 0 ? c0592pc.f3856d : c0592pc.f3857e;
        int iM2775t = z30.m2775t(c0099cc2.f946c);
        if (iM2775t == 1 || iM2775t == 2) {
            return qb0Var.f4059h;
        }
        if (iM2775t == 3 || iM2775t == 4) {
            return qb0Var.f4060i;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2161c(C0373jg c0373jg, C0373jg c0373jg2, int i, C0707sg c0707sg) {
        c0373jg.f2632l.add(c0373jg2);
        c0373jg.f2632l.add(this.f4056e);
        c0373jg.f2628h = i;
        c0373jg.f2629i = c0707sg;
        c0373jg2.f2631k.add(c0373jg);
        c0707sg.f2631k.add(c0373jg);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1363d();

    /* JADX INFO: renamed from: e */
    public abstract void mo1364e();

    /* JADX INFO: renamed from: f */
    public abstract void mo1365f();

    /* JADX INFO: renamed from: g */
    public final int m2162g(int i, int i2) {
        if (i2 == 0) {
            C0592pc c0592pc = this.f4053b;
            int i3 = c0592pc.f3866n;
            int iMax = Math.max(c0592pc.f3865m, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C0592pc c0592pc2 = this.f4053b;
            int i4 = c0592pc2.f3869q;
            int iMax2 = Math.max(c0592pc2.f3868p, i);
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
    public long mo2163j() {
        if (this.f4056e.f2630j) {
            return r0.f2627g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo1366k();

    /* JADX INFO: renamed from: l */
    public final void m2164l(C0099cc c0099cc, C0099cc c0099cc2, int i) {
        C0373jg c0373jgM2159h = m2159h(c0099cc);
        C0373jg c0373jgM2159h2 = m2159h(c0099cc2);
        if (c0373jgM2159h.f2630j && c0373jgM2159h2.f2630j) {
            int iM661c = c0099cc.m661c() + c0373jgM2159h.f2627g;
            int iM661c2 = c0373jgM2159h2.f2627g - c0099cc2.m661c();
            int i2 = iM661c2 - iM661c;
            C0707sg c0707sg = this.f4056e;
            if (!c0707sg.f2630j && this.f4055d == 3) {
                int i3 = this.f4052a;
                if (i3 == 0) {
                    c0707sg.mo1597d(m2162g(i2, i));
                } else if (i3 == 1) {
                    c0707sg.mo1597d(Math.min(m2162g(c0707sg.f4436m, i), i2));
                } else if (i3 == 2) {
                    C0592pc c0592pc = this.f4053b;
                    C0592pc c0592pc2 = c0592pc.f3832I;
                    if (c0592pc2 != null) {
                        if ((i == 0 ? c0592pc2.f3856d : c0592pc2.f3857e).f4056e.f2630j) {
                            c0707sg.mo1597d(m2162g((int) ((r6.f2627g * (i == 0 ? c0592pc.f3867o : c0592pc.f3870r)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0592pc c0592pc3 = this.f4053b;
                    qb0 qb0Var = c0592pc3.f3856d;
                    m90 m90Var = c0592pc3.f3857e;
                    if (qb0Var.f4055d != 3 || qb0Var.f4052a != 3 || m90Var.f4055d != 3 || m90Var.f4052a != 3) {
                        if (i == 0) {
                            qb0Var = m90Var;
                        }
                        if (qb0Var.f4056e.f2630j) {
                            float f = c0592pc3.f3835L;
                            c0707sg.mo1597d(i == 1 ? (int) ((r6.f2627g / f) + 0.5f) : (int) ((f * r6.f2627g) + 0.5f));
                        }
                    }
                }
            }
            if (c0707sg.f2630j) {
                int i4 = c0707sg.f2627g;
                C0373jg c0373jg = this.f4060i;
                C0373jg c0373jg2 = this.f4059h;
                if (i4 == i2) {
                    c0373jg2.mo1597d(iM661c);
                    c0373jg.mo1597d(iM661c2);
                    return;
                }
                C0592pc c0592pc4 = this.f4053b;
                float f2 = i == 0 ? c0592pc4.f3842S : c0592pc4.f3843T;
                if (c0373jgM2159h == c0373jgM2159h2) {
                    iM661c = c0373jgM2159h.f2627g;
                    iM661c2 = c0373jgM2159h2.f2627g;
                    f2 = 0.5f;
                }
                c0373jg2.mo1597d((int) ((((iM661c2 - iM661c) - i4) * f2) + iM661c + 0.5f));
                c0373jg.mo1597d(c0373jg2.f2627g + c0707sg.f2627g);
            }
        }
    }
}
