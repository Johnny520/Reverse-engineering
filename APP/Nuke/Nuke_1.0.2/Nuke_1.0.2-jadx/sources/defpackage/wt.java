package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wt {
    public final vg1 a;
    public final ArrayList b = new ArrayList();
    public v51 c;
    public boolean d;
    public final yb1 e;
    public final ArrayList f;
    public final ArrayList g;
    public final kt2 h;
    public final ArrayList i;
    public final wu2 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wt(e80 e80Var) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = new ArrayList();
        this.h = kt2.a;
        new ArrayList();
        this.i = new ArrayList();
        this.j = wu2.j;
        vg1 vg1Var = e80Var.a;
        this.a = vg1Var;
        if ((e80Var.b & 8) != 0) {
            this.e = null;
        } else {
            yb1 yb1Var = new yb1(this, vg1Var.a);
            this.e = yb1Var;
            arrayList.add(yb1Var);
        }
        a63[] a63VarArr = vg1Var.d.a;
        for (a63 a63Var : a63VarArr) {
            this.f.add(new yb1(this, a63Var));
        }
        v51 v51Var = new v51();
        this.c = v51Var;
        b(v51Var);
        this.c.c = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(yb1 yb1Var, a63 a63Var) {
        if (yb1Var.b.equals(a63Var)) {
            return;
        }
        StringBuilder sb = new StringBuilder("requested ");
        sb.append(a63Var);
        a63 a63Var2 = yb1Var.b;
        sb.append(" but was ");
        sb.append(a63Var2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(i01 i01Var, v51 v51Var) {
        v51 v51Var2 = this.c;
        if (v51Var2 == null || !v51Var2.c) {
            s.l("no current label");
            return;
        }
        v51Var2.a.add(i01Var);
        int i = i01Var.h.e;
        if (i == 1) {
            if (v51Var == null) {
                return;
            }
            s.g("unexpected branch: ", v51Var);
            return;
        }
        if (i == 2) {
            if (v51Var == null) {
                this.c = null;
                return;
            } else {
                s.g("unexpected branch: ", v51Var);
                return;
            }
        }
        if (i == 3) {
            if (v51Var == null) {
                s.j("branch == null");
                return;
            } else {
                this.c.e = v51Var;
                this.c = null;
                return;
            }
        }
        if (i == 4) {
            if (v51Var == null) {
                s.j("branch == null");
                return;
            }
            List list = Collections.EMPTY_LIST;
            v51 v51Var3 = new v51();
            b(v51Var3);
            v51 v51Var4 = this.c;
            v51Var4.e = v51Var3;
            v51Var4.f = v51Var;
            v51Var4.d = list;
            this.c = v51Var3;
            v51Var3.c = true;
            return;
        }
        if (i != 6) {
            throw new IllegalArgumentException();
        }
        if (v51Var != null) {
            s.g("unexpected branch: ", v51Var);
            return;
        }
        ArrayList arrayList = new ArrayList(this.i);
        v51 v51Var5 = new v51();
        b(v51Var5);
        v51 v51Var6 = this.c;
        v51Var6.e = v51Var5;
        v51Var6.f = null;
        v51Var6.d = arrayList;
        this.c = v51Var5;
        v51Var5.c = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(v51 v51Var) {
        wt wtVar = v51Var.b;
        if (wtVar == this) {
            return;
        }
        if (wtVar != null) {
            s.j("Cannot adopt label; it belongs to another Code");
        } else {
            v51Var.b = this;
            this.b.add(v51Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r6 == 7) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(yb1 yb1Var, yb1 yb1Var2) {
        za2 za2Var;
        o43 o43Var = yb1Var2.b.b;
        int i = o43Var.i;
        if (i == 9) {
            a(new j23(cb2.L1, this.h, s72.h(yb1Var2.a()), this.j, yb1Var.b.c), null);
            j(yb1Var, true);
            return;
        }
        o43 o43Var2 = yb1Var.b.b;
        if (i != 6) {
            za2 za2Var2 = cb2.a;
            int iD = o43Var2.d();
            int iD2 = o43Var.d();
            if (iD2 != 4) {
                if (iD2 != 5) {
                    if (iD2 == 6) {
                        if (iD == 4) {
                            za2Var = cb2.U0;
                        } else if (iD == 5) {
                            za2Var = cb2.R0;
                        } else if (iD == 7) {
                            za2Var = cb2.O0;
                        }
                    }
                    if (iD == 4) {
                        za2Var = cb2.V0;
                    } else if (iD == 5) {
                        za2Var = cb2.S0;
                    } else if (iD == 6) {
                        za2Var = cb2.L0;
                    }
                }
                if (iD == 4) {
                    za2Var = cb2.W0;
                } else if (iD == 6) {
                    za2Var = cb2.M0;
                } else if (iD == 7) {
                    za2Var = cb2.P0;
                }
            }
            if (iD == 5) {
                za2Var = cb2.T0;
            } else {
                if (iD != 6) {
                    if (iD == 7) {
                        za2Var = cb2.Q0;
                    }
                    s.g("bad types: ", wu2.i(o43Var2, o43Var));
                    return;
                }
                za2Var = cb2.N0;
            }
        } else {
            int i2 = o43Var2.i;
            if (i2 == 2) {
                za2Var = cb2.X0;
            } else if (i2 == 3) {
                za2Var = cb2.Y0;
            } else if (i2 == 8) {
                za2Var = cb2.Z0;
            }
        }
        a(new xz1(za2Var, this.h, yb1Var.a(), s72.h(yb1Var2.a())), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final yb1 e(int i, a63 a63Var) {
        if (this.e != null) {
            i++;
        }
        yb1 yb1Var = (yb1) this.f.get(i);
        d(yb1Var, a63Var);
        return yb1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        za2 za2Var;
        if (this.d) {
            throw new AssertionError();
        }
        this.d = true;
        int iE = 0;
        for (yb1 yb1Var : this.g) {
            yb1Var.c = iE;
            a63 a63Var = yb1Var.b;
            yb1Var.d = r72.e(iE, a63Var.b);
            iE += a63Var.b.e();
        }
        ArrayList arrayList = new ArrayList();
        int iE2 = iE;
        for (yb1 yb1Var2 : this.f) {
            g30 g30VarJ = g30.j(iE2 - iE);
            yb1Var2.c = iE2;
            a63 a63Var2 = yb1Var2.b;
            yb1Var2.d = r72.e(iE2, a63Var2.b);
            iE2 += a63Var2.b.e();
            o43 o43Var = a63Var2.b;
            za2 za2Var2 = cb2.a;
            int iD = o43Var.d();
            if (iD == 4) {
                za2Var = cb2.j;
            } else if (iD == 5) {
                za2Var = cb2.i;
            } else if (iD == 6) {
                za2Var = cb2.g;
            } else if (iD == 7) {
                za2Var = cb2.h;
            } else {
                if (iD != 9) {
                    cb2.a(o43Var);
                    throw null;
                }
                za2Var = cb2.k;
            }
            arrayList.add(new wz1(za2Var, this.h, yb1Var2.a(), s72.j, g30VarJ));
        }
        ((v51) this.b.get(0)).a.addAll(0, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(za2 za2Var, vg1 vg1Var, yb1 yb1Var, yb1 yb1Var2, yb1... yb1VarArr) {
        int i = yb1Var2 != null ? 1 : 0;
        s72 s72Var = new s72(yb1VarArr.length + i);
        if (yb1Var2 != null) {
            s72Var.f(0, yb1Var2.a());
        }
        for (int i2 = 0; i2 < yb1VarArr.length; i2++) {
            s72Var.f(i2 + i, yb1VarArr[i2].a());
        }
        a(new j23(za2Var, this.h, s72Var, this.j, vg1Var.e), null);
        if (yb1Var != null) {
            j(yb1Var, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(vg1 vg1Var, yb1 yb1Var, yb1 yb1Var2, yb1... yb1VarArr) {
        String strA = vg1Var.a(true);
        ConcurrentHashMap concurrentHashMap = d42.l;
        d42 d42VarB = (d42) concurrentHashMap.get(strA);
        if (d42VarB == null) {
            d42VarB = d42.b(strA);
            d42 d42Var = (d42) concurrentHashMap.putIfAbsent(d42VarB.h, d42VarB);
            if (d42Var != null) {
                d42VarB = d42Var;
            }
        }
        za2 za2Var = cb2.a;
        g(new za2(51, d42VarB.c(), wu2.q), vg1Var, yb1Var, yb1Var2, yb1VarArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(yb1 yb1Var, Object obj) {
        za2 za2Var;
        if (obj == null) {
            za2Var = cb2.q;
        } else {
            o43 o43Var = yb1Var.b.b;
            za2 za2Var2 = cb2.a;
            o43Var.getClass();
            if (o43Var == o43.w) {
                za2Var = cb2.q;
            } else {
                int iD = o43Var.d();
                if (iD == 4) {
                    za2Var = cb2.o;
                } else if (iD == 5) {
                    za2Var = cb2.n;
                } else if (iD == 6) {
                    za2Var = cb2.l;
                } else if (iD == 7) {
                    za2Var = cb2.m;
                } else {
                    if (iD != 9) {
                        cb2.a(o43Var);
                        throw null;
                    }
                    za2Var = cb2.p;
                }
            }
        }
        za2 za2Var3 = za2Var;
        int i = za2Var3.e;
        kt2 kt2Var = this.h;
        if (i == 1) {
            a(new wz1(za2Var3, kt2Var, yb1Var.a(), s72.j, qp0.y(obj)), null);
        } else {
            a(new j23(za2Var3, kt2Var, s72.j, this.j, qp0.y(obj)), null);
            j(yb1Var, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(yb1 yb1Var, boolean z) {
        za2 za2Var;
        if (z) {
            o43 o43Var = yb1Var.b.b;
            za2 za2Var2 = cb2.a;
            o43Var.getClass();
            za2Var = new za2(56, o43Var, wu2.j, null);
        } else {
            o43 o43Var2 = yb1Var.b.b;
            za2 za2Var3 = cb2.a;
            o43Var2.getClass();
            za2Var = new za2(55, o43Var2, wu2.j, null);
        }
        a(new xz1(za2Var, this.h, yb1Var.a(), s72.j), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final yb1 k(a63 a63Var) {
        if (this.d) {
            s.l("Cannot allocate locals after adding instructions");
            return null;
        }
        yb1 yb1Var = new yb1(this, a63Var);
        this.g.add(yb1Var);
        return yb1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(yb1 yb1Var) {
        za2 za2Var;
        a63 a63Var = yb1Var.b;
        vg1 vg1Var = this.a;
        if (!a63Var.equals(vg1Var.b)) {
            throw new IllegalArgumentException("declared " + vg1Var.b + " but returned " + a63Var);
        }
        o43 o43Var = a63Var.b;
        za2 za2Var2 = cb2.a;
        int iD = o43Var.d();
        if (iD == 0) {
            za2Var = cb2.a1;
        } else if (iD == 9) {
            za2Var = cb2.f1;
        } else if (iD == 4) {
            za2Var = cb2.e1;
        } else if (iD == 5) {
            za2Var = cb2.d1;
        } else if (iD == 6) {
            za2Var = cb2.b1;
        } else {
            if (iD != 7) {
                cb2.a(o43Var);
                throw null;
            }
            za2Var = cb2.c1;
        }
        a(new xz1(za2Var, this.h, null, s72.h(yb1Var.a())), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        vg1 vg1Var = this.a;
        if (vg1Var.b.equals(a63.l)) {
            a(new xz1(cb2.a1, this.h, null, s72.j), null);
            return;
        }
        throw new IllegalArgumentException("declared " + vg1Var.b + " but returned void");
    }
}
