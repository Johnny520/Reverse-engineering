package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: er */
/* JADX INFO: loaded from: classes.dex */
public final class C0197er {

    /* JADX INFO: renamed from: o */
    public static int f1614o = 1000;

    /* JADX INFO: renamed from: p */
    public static boolean f1615p = true;

    /* JADX INFO: renamed from: b */
    public final C0354iy f1617b;

    /* JADX INFO: renamed from: e */
    public C0585p6[] f1620e;

    /* JADX INFO: renamed from: k */
    public final C0402k8 f1626k;

    /* JADX INFO: renamed from: n */
    public C0585p6 f1629n;

    /* JADX INFO: renamed from: a */
    public int f1616a = 0;

    /* JADX INFO: renamed from: c */
    public int f1618c = 32;

    /* JADX INFO: renamed from: d */
    public int f1619d = 32;

    /* JADX INFO: renamed from: f */
    public boolean f1621f = false;

    /* JADX INFO: renamed from: g */
    public boolean[] f1622g = new boolean[32];

    /* JADX INFO: renamed from: h */
    public int f1623h = 1;

    /* JADX INFO: renamed from: i */
    public int f1624i = 0;

    /* JADX INFO: renamed from: j */
    public int f1625j = 32;

    /* JADX INFO: renamed from: l */
    public h40[] f1627l = new h40[f1614o];

    /* JADX INFO: renamed from: m */
    public int f1628m = 0;

    public C0197er() {
        this.f1620e = null;
        this.f1620e = new C0585p6[32];
        m1016q();
        C0402k8 c0402k8 = new C0402k8();
        c0402k8.f2794a = new C0048ay();
        c0402k8.f2795b = new C0048ay();
        c0402k8.f2796c = new C0048ay();
        c0402k8.f2797d = new h40[32];
        this.f1626k = c0402k8;
        C0354iy c0354iy = new C0354iy(c0402k8);
        c0354iy.f2613f = new h40[128];
        c0354iy.f2614g = new h40[128];
        c0354iy.f2615h = 0;
        c0354iy.f2616i = new C0315hy(c0354iy);
        this.f1617b = c0354iy;
        if (f1615p) {
            this.f1629n = new C0160dr(c0402k8);
        } else {
            this.f1629n = new C0585p6(c0402k8);
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m1000m(Object obj) {
        h40 h40Var = ((C0443lc) obj).f2996g;
        if (h40Var != null) {
            return (int) (h40Var.f2104e + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final h40 m1001a(int i) {
        h40 h40Var = (h40) ((C0048ay) this.f1626k.f2796c).mo475a();
        if (h40Var == null) {
            h40Var = new h40(i);
            h40Var.f2111l = i;
        } else {
            h40Var.m1353c();
            h40Var.f2111l = i;
        }
        int i2 = this.f1628m;
        int i3 = f1614o;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f1614o = i4;
            this.f1627l = (h40[]) Arrays.copyOf(this.f1627l, i4);
        }
        h40[] h40VarArr = this.f1627l;
        int i5 = this.f1628m;
        this.f1628m = i5 + 1;
        h40VarArr[i5] = h40Var;
        return h40Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m1002b(h40 h40Var, h40 h40Var2, int i, float f, h40 h40Var3, h40 h40Var4, int i2, int i3) {
        C0585p6 c0585p6M1011k = m1011k();
        if (h40Var2 == h40Var3) {
            c0585p6M1011k.f3603d.mo1451i(h40Var, 1.0f);
            c0585p6M1011k.f3603d.mo1451i(h40Var4, 1.0f);
            c0585p6M1011k.f3603d.mo1451i(h40Var2, -2.0f);
        } else if (f == 0.5f) {
            c0585p6M1011k.f3603d.mo1451i(h40Var, 1.0f);
            c0585p6M1011k.f3603d.mo1451i(h40Var2, -1.0f);
            c0585p6M1011k.f3603d.mo1451i(h40Var3, -1.0f);
            c0585p6M1011k.f3603d.mo1451i(h40Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                c0585p6M1011k.f3601b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c0585p6M1011k.f3603d.mo1451i(h40Var, -1.0f);
            c0585p6M1011k.f3603d.mo1451i(h40Var2, 1.0f);
            c0585p6M1011k.f3601b = i;
        } else if (f >= 1.0f) {
            c0585p6M1011k.f3603d.mo1451i(h40Var4, -1.0f);
            c0585p6M1011k.f3603d.mo1451i(h40Var3, 1.0f);
            c0585p6M1011k.f3601b = -i2;
        } else {
            float f2 = 1.0f - f;
            c0585p6M1011k.f3603d.mo1451i(h40Var, f2 * 1.0f);
            c0585p6M1011k.f3603d.mo1451i(h40Var2, f2 * (-1.0f));
            c0585p6M1011k.f3603d.mo1451i(h40Var3, (-1.0f) * f);
            c0585p6M1011k.f3603d.mo1451i(h40Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c0585p6M1011k.f3601b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            c0585p6M1011k.m2066a(this, i3);
        }
        m1003c(c0585p6M1011k);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1003c(p000.C0585p6 r18) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0197er.m1003c(p6):void");
    }

    /* JADX INFO: renamed from: d */
    public final void m1004d(h40 h40Var, int i) {
        int i2 = h40Var.f2102c;
        if (i2 == -1) {
            h40Var.f2104e = i;
            h40Var.f2105f = true;
            int i3 = h40Var.f2109j;
            for (int i4 = 0; i4 < i3; i4++) {
                h40Var.f2108i[i4].m2071g(h40Var, false);
            }
            h40Var.f2109j = 0;
            return;
        }
        if (i2 == -1) {
            C0585p6 c0585p6M1011k = m1011k();
            c0585p6M1011k.f3600a = h40Var;
            float f = i;
            h40Var.f2104e = f;
            c0585p6M1011k.f3601b = f;
            c0585p6M1011k.f3604e = true;
            m1003c(c0585p6M1011k);
            return;
        }
        C0585p6 c0585p6 = this.f1620e[i2];
        if (c0585p6.f3604e) {
            c0585p6.f3601b = i;
            return;
        }
        if (c0585p6.f3603d.mo1453k() == 0) {
            c0585p6.f3604e = true;
            c0585p6.f3601b = i;
            return;
        }
        C0585p6 c0585p6M1011k2 = m1011k();
        if (i < 0) {
            c0585p6M1011k2.f3601b = i * (-1);
            c0585p6M1011k2.f3603d.mo1451i(h40Var, 1.0f);
        } else {
            c0585p6M1011k2.f3601b = i;
            c0585p6M1011k2.f3603d.mo1451i(h40Var, -1.0f);
        }
        m1003c(c0585p6M1011k2);
    }

    /* JADX INFO: renamed from: e */
    public final void m1005e(h40 h40Var, h40 h40Var2, int i, int i2) {
        boolean z = false;
        if (i2 == 8 && h40Var2.f2105f && h40Var.f2102c == -1) {
            h40Var.f2104e = h40Var2.f2104e + i;
            h40Var.f2105f = true;
            int i3 = h40Var.f2109j;
            for (int i4 = 0; i4 < i3; i4++) {
                h40Var.f2108i[i4].m2071g(h40Var, false);
            }
            h40Var.f2109j = 0;
            return;
        }
        C0585p6 c0585p6M1011k = m1011k();
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c0585p6M1011k.f3601b = i;
        }
        if (z) {
            c0585p6M1011k.f3603d.mo1451i(h40Var, 1.0f);
            c0585p6M1011k.f3603d.mo1451i(h40Var2, -1.0f);
        } else {
            c0585p6M1011k.f3603d.mo1451i(h40Var, -1.0f);
            c0585p6M1011k.f3603d.mo1451i(h40Var2, 1.0f);
        }
        if (i2 != 8) {
            c0585p6M1011k.m2066a(this, i2);
        }
        m1003c(c0585p6M1011k);
    }

    /* JADX INFO: renamed from: f */
    public final void m1006f(h40 h40Var, h40 h40Var2, int i, int i2) {
        C0585p6 c0585p6M1011k = m1011k();
        h40 h40VarM1012l = m1012l();
        h40VarM1012l.f2103d = 0;
        c0585p6M1011k.m2067b(h40Var, h40Var2, h40VarM1012l, i);
        if (i2 != 8) {
            c0585p6M1011k.f3603d.mo1451i(m1009i(i2), (int) (c0585p6M1011k.f3603d.mo1444b(h40VarM1012l) * (-1.0f)));
        }
        m1003c(c0585p6M1011k);
    }

    /* JADX INFO: renamed from: g */
    public final void m1007g(h40 h40Var, h40 h40Var2, int i, int i2) {
        C0585p6 c0585p6M1011k = m1011k();
        h40 h40VarM1012l = m1012l();
        h40VarM1012l.f2103d = 0;
        c0585p6M1011k.m2068c(h40Var, h40Var2, h40VarM1012l, i);
        if (i2 != 8) {
            c0585p6M1011k.f3603d.mo1451i(m1009i(i2), (int) (c0585p6M1011k.f3603d.mo1444b(h40VarM1012l) * (-1.0f)));
        }
        m1003c(c0585p6M1011k);
    }

    /* JADX INFO: renamed from: h */
    public final void m1008h(C0585p6 c0585p6) {
        boolean z = f1615p;
        C0402k8 c0402k8 = this.f1626k;
        if (z) {
            C0585p6 c0585p62 = this.f1620e[this.f1624i];
            if (c0585p62 != null) {
                ((C0048ay) c0402k8.f2794a).m476b(c0585p62);
            }
        } else {
            C0585p6 c0585p63 = this.f1620e[this.f1624i];
            if (c0585p63 != null) {
                ((C0048ay) c0402k8.f2795b).m476b(c0585p63);
            }
        }
        C0585p6[] c0585p6Arr = this.f1620e;
        int i = this.f1624i;
        c0585p6Arr[i] = c0585p6;
        h40 h40Var = c0585p6.f3600a;
        h40Var.f2102c = i;
        this.f1624i = i + 1;
        h40Var.m1354d(c0585p6);
    }

    /* JADX INFO: renamed from: i */
    public final h40 m1009i(int i) {
        if (this.f1623h + 1 >= this.f1619d) {
            m1013n();
        }
        h40 h40VarM1001a = m1001a(4);
        float[] fArr = h40VarM1001a.f2107h;
        int i2 = this.f1616a + 1;
        this.f1616a = i2;
        this.f1623h++;
        h40VarM1001a.f2101b = i2;
        h40VarM1001a.f2103d = i;
        ((h40[]) this.f1626k.f2797d)[i2] = h40VarM1001a;
        C0354iy c0354iy = this.f1617b;
        c0354iy.f2616i.f2287a = h40VarM1001a;
        Arrays.fill(fArr, 0.0f);
        fArr[h40VarM1001a.f2103d] = 1.0f;
        c0354iy.m1545i(h40VarM1001a);
        return h40VarM1001a;
    }

    /* JADX INFO: renamed from: j */
    public final h40 m1010j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f1623h + 1 >= this.f1619d) {
            m1013n();
        }
        if (!(obj instanceof C0443lc)) {
            return null;
        }
        C0443lc c0443lc = (C0443lc) obj;
        h40 h40Var = c0443lc.f2996g;
        if (h40Var == null) {
            c0443lc.m1759i();
            h40Var = c0443lc.f2996g;
        }
        int i = h40Var.f2101b;
        C0402k8 c0402k8 = this.f1626k;
        if (i != -1 && i <= this.f1616a && ((h40[]) c0402k8.f2797d)[i] != null) {
            return h40Var;
        }
        if (i != -1) {
            h40Var.m1353c();
        }
        int i2 = this.f1616a + 1;
        this.f1616a = i2;
        this.f1623h++;
        h40Var.f2101b = i2;
        h40Var.f2111l = 1;
        ((h40[]) c0402k8.f2797d)[i2] = h40Var;
        return h40Var;
    }

    /* JADX INFO: renamed from: k */
    public final C0585p6 m1011k() {
        boolean z = f1615p;
        C0402k8 c0402k8 = this.f1626k;
        if (z) {
            C0585p6 c0585p6 = (C0585p6) ((C0048ay) c0402k8.f2794a).mo475a();
            if (c0585p6 == null) {
                return new C0160dr(c0402k8);
            }
            c0585p6.f3600a = null;
            c0585p6.f3603d.clear();
            c0585p6.f3601b = 0.0f;
            c0585p6.f3604e = false;
            return c0585p6;
        }
        C0585p6 c0585p62 = (C0585p6) ((C0048ay) c0402k8.f2795b).mo475a();
        if (c0585p62 == null) {
            return new C0585p6(c0402k8);
        }
        c0585p62.f3600a = null;
        c0585p62.f3603d.clear();
        c0585p62.f3601b = 0.0f;
        c0585p62.f3604e = false;
        return c0585p62;
    }

    /* JADX INFO: renamed from: l */
    public final h40 m1012l() {
        if (this.f1623h + 1 >= this.f1619d) {
            m1013n();
        }
        h40 h40VarM1001a = m1001a(3);
        int i = this.f1616a + 1;
        this.f1616a = i;
        this.f1623h++;
        h40VarM1001a.f2101b = i;
        ((h40[]) this.f1626k.f2797d)[i] = h40VarM1001a;
        return h40VarM1001a;
    }

    /* JADX INFO: renamed from: n */
    public final void m1013n() {
        int i = this.f1618c * 2;
        this.f1618c = i;
        this.f1620e = (C0585p6[]) Arrays.copyOf(this.f1620e, i);
        C0402k8 c0402k8 = this.f1626k;
        c0402k8.f2797d = (h40[]) Arrays.copyOf((h40[]) c0402k8.f2797d, this.f1618c);
        int i2 = this.f1618c;
        this.f1622g = new boolean[i2];
        this.f1619d = i2;
        this.f1625j = i2;
    }

    /* JADX INFO: renamed from: o */
    public final void m1014o(C0354iy c0354iy) {
        C0402k8 c0402k8;
        int i = 0;
        while (true) {
            if (i >= this.f1624i) {
                break;
            }
            C0585p6 c0585p6 = this.f1620e[i];
            int i2 = 1;
            if (c0585p6.f3600a.f2111l != 1) {
                float f = 0.0f;
                if (c0585p6.f3601b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            int i8 = this.f1624i;
                            c0402k8 = this.f1626k;
                            if (i6 >= i8) {
                                break;
                            }
                            C0585p6 c0585p62 = this.f1620e[i6];
                            if (c0585p62.f3600a.f2111l != i2 && !c0585p62.f3604e && c0585p62.f3601b < f) {
                                int i9 = i2;
                                while (i9 < this.f1623h) {
                                    h40 h40Var = ((h40[]) c0402k8.f2797d)[i9];
                                    float fMo1444b = c0585p62.f3603d.mo1444b(h40Var);
                                    if (fMo1444b > f) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f3 = h40Var.f2106g[i10] / fMo1444b;
                                            if ((f3 < f2 && i10 == i7) || i10 > i7) {
                                                i7 = i10;
                                                f2 = f3;
                                                i4 = i6;
                                                i5 = i9;
                                            }
                                        }
                                    }
                                    i9++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0585p6 c0585p63 = this.f1620e[i4];
                            c0585p63.f3600a.f2102c = -1;
                            c0585p63.m2070f(((h40[]) c0402k8.f2797d)[i5]);
                            h40 h40Var2 = c0585p63.f3600a;
                            h40Var2.f2102c = i4;
                            h40Var2.m1354d(c0585p63);
                        } else {
                            z = true;
                        }
                        if (i3 > this.f1623h / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        m1015p(c0354iy);
        for (int i11 = 0; i11 < this.f1624i; i11++) {
            C0585p6 c0585p64 = this.f1620e[i11];
            c0585p64.f3600a.f2104e = c0585p64.f3601b;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1015p(C0585p6 c0585p6) {
        for (int i = 0; i < this.f1623h; i++) {
            this.f1622g[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f1623h * 2) {
                return;
            }
            h40 h40Var = c0585p6.f3600a;
            if (h40Var != null) {
                this.f1622g[h40Var.f2101b] = true;
            }
            h40 h40VarMo1543d = c0585p6.mo1543d(this.f1622g);
            if (h40VarMo1543d != null) {
                boolean[] zArr = this.f1622g;
                int i3 = h40VarMo1543d.f2101b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (h40VarMo1543d != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f1624i; i5++) {
                    C0585p6 c0585p62 = this.f1620e[i5];
                    if (c0585p62.f3600a.f2111l != 1 && !c0585p62.f3604e && c0585p62.f3603d.mo1445c(h40VarMo1543d)) {
                        float fMo1444b = c0585p62.f3603d.mo1444b(h40VarMo1543d);
                        if (fMo1444b < 0.0f) {
                            float f2 = (-c0585p62.f3601b) / fMo1444b;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0585p6 c0585p63 = this.f1620e[i4];
                    c0585p63.f3600a.f2102c = -1;
                    c0585p63.m2070f(h40VarMo1543d);
                    h40 h40Var2 = c0585p63.f3600a;
                    h40Var2.f2102c = i4;
                    h40Var2.m1354d(c0585p63);
                }
            } else {
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1016q() {
        boolean z = f1615p;
        C0402k8 c0402k8 = this.f1626k;
        int i = 0;
        if (z) {
            while (true) {
                C0585p6[] c0585p6Arr = this.f1620e;
                if (i >= c0585p6Arr.length) {
                    return;
                }
                C0585p6 c0585p6 = c0585p6Arr[i];
                if (c0585p6 != null) {
                    ((C0048ay) c0402k8.f2794a).m476b(c0585p6);
                }
                this.f1620e[i] = null;
                i++;
            }
        } else {
            while (true) {
                C0585p6[] c0585p6Arr2 = this.f1620e;
                if (i >= c0585p6Arr2.length) {
                    return;
                }
                C0585p6 c0585p62 = c0585p6Arr2[i];
                if (c0585p62 != null) {
                    ((C0048ay) c0402k8.f2795b).m476b(c0585p62);
                }
                this.f1620e[i] = null;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1017r() {
        C0402k8 c0402k8;
        int i = 0;
        while (true) {
            c0402k8 = this.f1626k;
            h40[] h40VarArr = (h40[]) c0402k8.f2797d;
            if (i >= h40VarArr.length) {
                break;
            }
            h40 h40Var = h40VarArr[i];
            if (h40Var != null) {
                h40Var.m1353c();
            }
            i++;
        }
        C0048ay c0048ay = (C0048ay) c0402k8.f2796c;
        h40[] h40VarArr2 = this.f1627l;
        int length = this.f1628m;
        c0048ay.getClass();
        if (length > h40VarArr2.length) {
            length = h40VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            h40 h40Var2 = h40VarArr2[i2];
            int i3 = c0048ay.f648c;
            Object[] objArr = c0048ay.f647b;
            if (i3 < objArr.length) {
                objArr[i3] = h40Var2;
                c0048ay.f648c = i3 + 1;
            }
        }
        this.f1628m = 0;
        Arrays.fill((h40[]) c0402k8.f2797d, (Object) null);
        this.f1616a = 0;
        C0354iy c0354iy = this.f1617b;
        c0354iy.f2615h = 0;
        c0354iy.f3601b = 0.0f;
        this.f1623h = 1;
        for (int i4 = 0; i4 < this.f1624i; i4++) {
            this.f1620e[i4].getClass();
        }
        m1016q();
        this.f1624i = 0;
        if (f1615p) {
            this.f1629n = new C0160dr(c0402k8);
        } else {
            this.f1629n = new C0585p6(c0402k8);
        }
    }
}
