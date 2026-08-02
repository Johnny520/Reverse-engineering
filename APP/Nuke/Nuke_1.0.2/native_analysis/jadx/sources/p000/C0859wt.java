package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: wt */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0859wt {

    /* JADX INFO: renamed from: a */
    public final vg1 f12626a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f12627b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public v51 f12628c;

    /* JADX INFO: renamed from: d */
    public boolean f12629d;

    /* JADX INFO: renamed from: e */
    public final yb1 f12630e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f12631f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f12632g;

    /* JADX INFO: renamed from: h */
    public final kt2 f12633h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f12634i;

    /* JADX INFO: renamed from: j */
    public final wu2 f12635j;

    public C0859wt(e80 e80Var) {
        ArrayList arrayList = new ArrayList();
        this.f12631f = arrayList;
        this.f12632g = new ArrayList();
        this.f12633h = kt2.f5768a;
        new ArrayList();
        this.f12634i = new ArrayList();
        this.f12635j = wu2.f12672j;
        vg1 vg1Var = e80Var.f2341a;
        this.f12626a = vg1Var;
        if ((e80Var.f2342b & 8) != 0) {
            this.f12630e = null;
        } else {
            yb1 yb1Var = new yb1(this, vg1Var.f11945a);
            this.f12630e = yb1Var;
            arrayList.add(yb1Var);
        }
        a63[] a63VarArr = vg1Var.f11948d.f2329a;
        for (a63 a63Var : a63VarArr) {
            this.f12631f.add(new yb1(this, a63Var));
        }
        v51 v51Var = new v51();
        this.f12628c = v51Var;
        m5987b(v51Var);
        this.f12628c.f11692c = true;
    }

    /* JADX INFO: renamed from: d */
    public static void m5985d(yb1 yb1Var, a63 a63Var) {
        if (yb1Var.f13391b.equals(a63Var)) {
            return;
        }
        StringBuilder sb = new StringBuilder("requested ");
        sb.append(a63Var);
        a63 a63Var2 = yb1Var.f13391b;
        sb.append(" but was ");
        sb.append(a63Var2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: a */
    public final void m5986a(i01 i01Var, v51 v51Var) {
        v51 v51Var2 = this.f12628c;
        if (v51Var2 == null || !v51Var2.f11692c) {
            C0676s.m4653l("no current label");
            return;
        }
        v51Var2.f11690a.add(i01Var);
        int i = i01Var.f4202h.f13815e;
        if (i == 1) {
            if (v51Var == null) {
                return;
            }
            C0676s.m4648g("unexpected branch: ", v51Var);
            return;
        }
        if (i == 2) {
            if (v51Var == null) {
                this.f12628c = null;
                return;
            } else {
                C0676s.m4648g("unexpected branch: ", v51Var);
                return;
            }
        }
        if (i == 3) {
            if (v51Var == null) {
                C0676s.m4651j("branch == null");
                return;
            } else {
                this.f12628c.f11694e = v51Var;
                this.f12628c = null;
                return;
            }
        }
        if (i == 4) {
            if (v51Var == null) {
                C0676s.m4651j("branch == null");
                return;
            }
            List list = Collections.EMPTY_LIST;
            v51 v51Var3 = new v51();
            m5987b(v51Var3);
            v51 v51Var4 = this.f12628c;
            v51Var4.f11694e = v51Var3;
            v51Var4.f11695f = v51Var;
            v51Var4.f11693d = list;
            this.f12628c = v51Var3;
            v51Var3.f11692c = true;
            return;
        }
        if (i != 6) {
            throw new IllegalArgumentException();
        }
        if (v51Var != null) {
            C0676s.m4648g("unexpected branch: ", v51Var);
            return;
        }
        ArrayList arrayList = new ArrayList(this.f12634i);
        v51 v51Var5 = new v51();
        m5987b(v51Var5);
        v51 v51Var6 = this.f12628c;
        v51Var6.f11694e = v51Var5;
        v51Var6.f11695f = null;
        v51Var6.f11693d = arrayList;
        this.f12628c = v51Var5;
        v51Var5.f11692c = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m5987b(v51 v51Var) {
        C0859wt c0859wt = v51Var.f11691b;
        if (c0859wt == this) {
            return;
        }
        if (c0859wt != null) {
            C0676s.m4651j("Cannot adopt label; it belongs to another Code");
        } else {
            v51Var.f11691b = this;
            this.f12627b.add(v51Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r6 == 7) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5988c(yb1 yb1Var, yb1 yb1Var2) {
        za2 za2Var;
        o43 o43Var = yb1Var2.f13391b.f96b;
        int i = o43Var.f7522i;
        if (i == 9) {
            m5986a(new j23(cb2.f1337L1, this.f12633h, s72.m4746h(yb1Var2.m6248a()), this.f12635j, yb1Var.f13391b.f97c), null);
            m5994j(yb1Var, true);
            return;
        }
        o43 o43Var2 = yb1Var.f13391b.f96b;
        if (i != 6) {
            za2 za2Var2 = cb2.f1380a;
            int iM3506d = o43Var2.m3506d();
            int iM3506d2 = o43Var.m3506d();
            if (iM3506d2 != 4) {
                if (iM3506d2 != 5) {
                    if (iM3506d2 == 6) {
                        if (iM3506d == 4) {
                            za2Var = cb2.f1363U0;
                        } else if (iM3506d == 5) {
                            za2Var = cb2.f1354R0;
                        } else if (iM3506d == 7) {
                            za2Var = cb2.f1345O0;
                        }
                    }
                    if (iM3506d == 4) {
                        za2Var = cb2.f1366V0;
                    } else if (iM3506d == 5) {
                        za2Var = cb2.f1357S0;
                    } else if (iM3506d == 6) {
                        za2Var = cb2.f1336L0;
                    }
                }
                if (iM3506d == 4) {
                    za2Var = cb2.f1369W0;
                } else if (iM3506d == 6) {
                    za2Var = cb2.f1339M0;
                } else if (iM3506d == 7) {
                    za2Var = cb2.f1348P0;
                }
            }
            if (iM3506d == 5) {
                za2Var = cb2.f1360T0;
            } else {
                if (iM3506d != 6) {
                    if (iM3506d == 7) {
                        za2Var = cb2.f1351Q0;
                    }
                    C0676s.m4648g("bad types: ", wu2.m6002i(o43Var2, o43Var));
                    return;
                }
                za2Var = cb2.f1342N0;
            }
        } else {
            int i2 = o43Var2.f7522i;
            if (i2 == 2) {
                za2Var = cb2.f1372X0;
            } else if (i2 == 3) {
                za2Var = cb2.f1375Y0;
            } else if (i2 == 8) {
                za2Var = cb2.f1378Z0;
            }
        }
        m5986a(new xz1(za2Var, this.f12633h, yb1Var.m6248a(), s72.m4746h(yb1Var2.m6248a())), null);
    }

    /* JADX INFO: renamed from: e */
    public final yb1 m5989e(int i, a63 a63Var) {
        if (this.f12630e != null) {
            i++;
        }
        yb1 yb1Var = (yb1) this.f12631f.get(i);
        m5985d(yb1Var, a63Var);
        return yb1Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m5990f() {
        za2 za2Var;
        if (this.f12629d) {
            throw new AssertionError();
        }
        this.f12629d = true;
        int iM3507e = 0;
        for (yb1 yb1Var : this.f12632g) {
            yb1Var.f13392c = iM3507e;
            a63 a63Var = yb1Var.f13391b;
            yb1Var.f13393d = r72.m4399e(iM3507e, a63Var.f96b);
            iM3507e += a63Var.f96b.m3507e();
        }
        ArrayList arrayList = new ArrayList();
        int iM3507e2 = iM3507e;
        for (yb1 yb1Var2 : this.f12631f) {
            g30 g30VarM1791j = g30.m1791j(iM3507e2 - iM3507e);
            yb1Var2.f13392c = iM3507e2;
            a63 a63Var2 = yb1Var2.f13391b;
            yb1Var2.f13393d = r72.m4399e(iM3507e2, a63Var2.f96b);
            iM3507e2 += a63Var2.f96b.m3507e();
            o43 o43Var = a63Var2.f96b;
            za2 za2Var2 = cb2.f1380a;
            int iM3506d = o43Var.m3506d();
            if (iM3506d == 4) {
                za2Var = cb2.f1416j;
            } else if (iM3506d == 5) {
                za2Var = cb2.f1412i;
            } else if (iM3506d == 6) {
                za2Var = cb2.f1404g;
            } else if (iM3506d == 7) {
                za2Var = cb2.f1408h;
            } else {
                if (iM3506d != 9) {
                    cb2.m740a(o43Var);
                    throw null;
                }
                za2Var = cb2.f1420k;
            }
            arrayList.add(new wz1(za2Var, this.f12633h, yb1Var2.m6248a(), s72.f9958j, g30VarM1791j));
        }
        ((v51) this.f12627b.get(0)).f11690a.addAll(0, arrayList);
    }

    /* JADX INFO: renamed from: g */
    public final void m5991g(za2 za2Var, vg1 vg1Var, yb1 yb1Var, yb1 yb1Var2, yb1... yb1VarArr) {
        int i = yb1Var2 != null ? 1 : 0;
        s72 s72Var = new s72(yb1VarArr.length + i);
        if (yb1Var2 != null) {
            s72Var.m2694f(0, yb1Var2.m6248a());
        }
        for (int i2 = 0; i2 < yb1VarArr.length; i2++) {
            s72Var.m2694f(i2 + i, yb1VarArr[i2].m6248a());
        }
        m5986a(new j23(za2Var, this.f12633h, s72Var, this.f12635j, vg1Var.f11949e), null);
        if (yb1Var != null) {
            m5994j(yb1Var, false);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5992h(vg1 vg1Var, yb1 yb1Var, yb1 yb1Var2, yb1... yb1VarArr) {
        String strM5673a = vg1Var.m5673a(true);
        ConcurrentHashMap concurrentHashMap = d42.f1862l;
        d42 d42VarM959b = (d42) concurrentHashMap.get(strM5673a);
        if (d42VarM959b == null) {
            d42VarM959b = d42.m959b(strM5673a);
            d42 d42Var = (d42) concurrentHashMap.putIfAbsent(d42VarM959b.f1863h, d42VarM959b);
            if (d42Var != null) {
                d42VarM959b = d42Var;
            }
        }
        za2 za2Var = cb2.f1380a;
        m5991g(new za2(51, d42VarM959b.m961c(), wu2.f12679q), vg1Var, yb1Var, yb1Var2, yb1VarArr);
    }

    /* JADX INFO: renamed from: i */
    public final void m5993i(yb1 yb1Var, Object obj) {
        za2 za2Var;
        if (obj == null) {
            za2Var = cb2.f1441q;
        } else {
            o43 o43Var = yb1Var.f13391b.f96b;
            za2 za2Var2 = cb2.f1380a;
            o43Var.getClass();
            if (o43Var == o43.f7517w) {
                za2Var = cb2.f1441q;
            } else {
                int iM3506d = o43Var.m3506d();
                if (iM3506d == 4) {
                    za2Var = cb2.f1435o;
                } else if (iM3506d == 5) {
                    za2Var = cb2.f1432n;
                } else if (iM3506d == 6) {
                    za2Var = cb2.f1424l;
                } else if (iM3506d == 7) {
                    za2Var = cb2.f1428m;
                } else {
                    if (iM3506d != 9) {
                        cb2.m740a(o43Var);
                        throw null;
                    }
                    za2Var = cb2.f1438p;
                }
            }
        }
        za2 za2Var3 = za2Var;
        int i = za2Var3.f13815e;
        kt2 kt2Var = this.f12633h;
        if (i == 1) {
            m5986a(new wz1(za2Var3, kt2Var, yb1Var.m6248a(), s72.f9958j, qp0.m4270y(obj)), null);
        } else {
            m5986a(new j23(za2Var3, kt2Var, s72.f9958j, this.f12635j, qp0.m4270y(obj)), null);
            m5994j(yb1Var, true);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5994j(yb1 yb1Var, boolean z) {
        za2 za2Var;
        if (z) {
            o43 o43Var = yb1Var.f13391b.f96b;
            za2 za2Var2 = cb2.f1380a;
            o43Var.getClass();
            za2Var = new za2(56, o43Var, wu2.f12672j, null);
        } else {
            o43 o43Var2 = yb1Var.f13391b.f96b;
            za2 za2Var3 = cb2.f1380a;
            o43Var2.getClass();
            za2Var = new za2(55, o43Var2, wu2.f12672j, null);
        }
        m5986a(new xz1(za2Var, this.f12633h, yb1Var.m6248a(), s72.f9958j), null);
    }

    /* JADX INFO: renamed from: k */
    public final yb1 m5995k(a63 a63Var) {
        if (this.f12629d) {
            C0676s.m4653l("Cannot allocate locals after adding instructions");
            return null;
        }
        yb1 yb1Var = new yb1(this, a63Var);
        this.f12632g.add(yb1Var);
        return yb1Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m5996l(yb1 yb1Var) {
        za2 za2Var;
        a63 a63Var = yb1Var.f13391b;
        vg1 vg1Var = this.f12626a;
        if (!a63Var.equals(vg1Var.f11946b)) {
            throw new IllegalArgumentException("declared " + vg1Var.f11946b + " but returned " + a63Var);
        }
        o43 o43Var = a63Var.f96b;
        za2 za2Var2 = cb2.f1380a;
        int iM3506d = o43Var.m3506d();
        if (iM3506d == 0) {
            za2Var = cb2.f1382a1;
        } else if (iM3506d == 9) {
            za2Var = cb2.f1402f1;
        } else if (iM3506d == 4) {
            za2Var = cb2.f1398e1;
        } else if (iM3506d == 5) {
            za2Var = cb2.f1394d1;
        } else if (iM3506d == 6) {
            za2Var = cb2.f1386b1;
        } else {
            if (iM3506d != 7) {
                cb2.m740a(o43Var);
                throw null;
            }
            za2Var = cb2.f1390c1;
        }
        m5986a(new xz1(za2Var, this.f12633h, null, s72.m4746h(yb1Var.m6248a())), null);
    }

    /* JADX INFO: renamed from: m */
    public final void m5997m() {
        vg1 vg1Var = this.f12626a;
        if (vg1Var.f11946b.equals(a63.f91l)) {
            m5986a(new xz1(cb2.f1382a1, this.f12633h, null, s72.f9958j), null);
            return;
        }
        throw new IllegalArgumentException("declared " + vg1Var.f11946b + " but returned void");
    }
}
