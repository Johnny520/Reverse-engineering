package p000;

/* JADX INFO: renamed from: gF */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1449gF implements InterfaceC2542td {

    /* JADX INFO: renamed from: a */
    public int f5057a;

    /* JADX INFO: renamed from: b */
    public C2454rb f5058b;

    /* JADX INFO: renamed from: c */
    public C0769Rw f5059c;

    /* JADX INFO: renamed from: d */
    public int f5060d;

    /* JADX INFO: renamed from: e */
    public final C0750Rd f5061e = new C0750Rd(this);

    /* JADX INFO: renamed from: f */
    public int f5062f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f5063g = false;

    /* JADX INFO: renamed from: h */
    public final C2628vd f5064h = new C2628vd(this);

    /* JADX INFO: renamed from: i */
    public final C2628vd f5065i = new C2628vd(this);

    /* JADX INFO: renamed from: j */
    public int f5066j = 1;

    public AbstractC1449gF(C2454rb c2454rb) {
        this.f5058b = c2454rb;
    }

    /* JADX INFO: renamed from: b */
    public static void m2774b(C2628vd c2628vd, C2628vd c2628vd2, int i) {
        c2628vd.f9121l.add(c2628vd2);
        c2628vd.f9115f = i;
        c2628vd2.f9120k.add(c2628vd);
    }

    /* JADX INFO: renamed from: h */
    public static C2628vd m2775h(C1259cb c1259cb) {
        C1259cb c1259cb2 = c1259cb.f4270f;
        if (c1259cb2 == null) {
            return null;
        }
        C2454rb c2454rb = c1259cb2.f4268d;
        int iM424v = AbstractC0213Ey.m424v(c1259cb2.f4269e);
        if (iM424v == 1) {
            return c2454rb.f8612d.f5064h;
        }
        if (iM424v == 2) {
            return c2454rb.f8614e.f5064h;
        }
        if (iM424v == 3) {
            return c2454rb.f8612d.f5065i;
        }
        if (iM424v == 4) {
            return c2454rb.f8614e.f5065i;
        }
        if (iM424v != 5) {
            return null;
        }
        return c2454rb.f8614e.f2621k;
    }

    /* JADX INFO: renamed from: i */
    public static C2628vd m2776i(C1259cb c1259cb, int i) {
        C1259cb c1259cb2 = c1259cb.f4270f;
        if (c1259cb2 == null) {
            return null;
        }
        C2454rb c2454rb = c1259cb2.f4268d;
        AbstractC1449gF abstractC1449gF = i == 0 ? c2454rb.f8612d : c2454rb.f8614e;
        int iM424v = AbstractC0213Ey.m424v(c1259cb2.f4269e);
        if (iM424v == 1 || iM424v == 2) {
            return abstractC1449gF.f5064h;
        }
        if (iM424v == 3 || iM424v == 4) {
            return abstractC1449gF.f5065i;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2777c(C2628vd c2628vd, C2628vd c2628vd2, int i, C0750Rd c0750Rd) {
        c2628vd.f9121l.add(c2628vd2);
        c2628vd.f9121l.add(this.f5061e);
        c2628vd.f9117h = i;
        c2628vd.f9118i = c0750Rd;
        c2628vd2.f9120k.add(c2628vd);
        c0750Rd.f9120k.add(c2628vd);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1547d();

    /* JADX INFO: renamed from: e */
    public abstract void mo1548e();

    /* JADX INFO: renamed from: f */
    public abstract void mo1549f();

    /* JADX INFO: renamed from: g */
    public final int m2778g(int i, int i2) {
        if (i2 == 0) {
            C2454rb c2454rb = this.f5058b;
            int i3 = c2454rb.f8643v;
            int iMax = Math.max(c2454rb.f8642u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C2454rb c2454rb2 = this.f5058b;
            int i4 = c2454rb2.f8646y;
            int iMax2 = Math.max(c2454rb2.f8645x, i);
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
    public long mo2779j() {
        if (this.f5061e.f9119j) {
            return r0.f9116g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo1550k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2780l(C1259cb c1259cb, C1259cb c1259cb2, int i) {
        C2628vd c2628vdM2775h = m2775h(c1259cb);
        C2628vd c2628vdM2775h2 = m2775h(c1259cb2);
        if (c2628vdM2775h.f9119j && c2628vdM2775h2.f9119j) {
            int iM2384e = c1259cb.m2384e() + c2628vdM2775h.f9116g;
            int iM2384e2 = c2628vdM2775h2.f9116g - c1259cb2.m2384e();
            int i2 = iM2384e2 - iM2384e;
            C0750Rd c0750Rd = this.f5061e;
            if (!c0750Rd.f9119j && this.f5060d == 3) {
                int i3 = this.f5057a;
                if (i3 == 0) {
                    c0750Rd.mo1539d(m2778g(i2, i));
                } else if (i3 == 1) {
                    c0750Rd.mo1539d(Math.min(m2778g(c0750Rd.f2386m, i), i2));
                } else if (i3 == 2) {
                    C2454rb c2454rb = this.f5058b;
                    C2454rb c2454rb2 = c2454rb.f8599T;
                    if (c2454rb2 != null) {
                        if ((i == 0 ? c2454rb2.f8612d : c2454rb2.f8614e).f5061e.f9119j) {
                            c0750Rd.mo1539d(m2778g((int) ((r6.f9116g * (i == 0 ? c2454rb.f8644w : c2454rb.f8647z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C2454rb c2454rb3 = this.f5058b;
                    AbstractC1449gF abstractC1449gF = c2454rb3.f8612d;
                    if (abstractC1449gF.f5060d == 3 && abstractC1449gF.f5057a == 3) {
                        C0830TD c0830td = c2454rb3.f8614e;
                        if (c0830td.f5060d != 3 || c0830td.f5057a != 3) {
                        }
                    } else {
                        if (i == 0) {
                            abstractC1449gF = c2454rb3.f8614e;
                        }
                        if (abstractC1449gF.f5061e.f9119j) {
                            float f = c2454rb3.f8602W;
                            c0750Rd.mo1539d(i == 1 ? (int) ((r6.f9116g / f) + 0.5f) : (int) ((f * r6.f9116g) + 0.5f));
                        }
                    }
                }
            }
            if (c0750Rd.f9119j) {
                int i4 = c0750Rd.f9116g;
                C2628vd c2628vd = this.f5065i;
                C2628vd c2628vd2 = this.f5064h;
                if (i4 == i2) {
                    c2628vd2.mo1539d(iM2384e);
                    c2628vd.mo1539d(iM2384e2);
                    return;
                }
                float f2 = i == 0 ? this.f5058b.f8613d0 : this.f5058b.f8615e0;
                if (c2628vdM2775h == c2628vdM2775h2) {
                    iM2384e = c2628vdM2775h.f9116g;
                    iM2384e2 = c2628vdM2775h2.f9116g;
                    f2 = 0.5f;
                }
                c2628vd2.mo1539d((int) ((((iM2384e2 - iM2384e) - i4) * f2) + iM2384e + 0.5f));
                c2628vd.mo1539d(c2628vd2.f9116g + c0750Rd.f9116g);
            }
        }
    }
}
