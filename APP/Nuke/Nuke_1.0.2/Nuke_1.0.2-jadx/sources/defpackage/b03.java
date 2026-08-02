package defpackage;

import android.content.ClipDescription;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b03 {
    public final er2 A;
    public boolean B;
    public final w73 a;
    public t91 d;
    public xm0 g;
    public rt h;
    public j20 i;
    public p02 j;
    public bs0 k;
    public gl0 l;
    public final nx1 m;
    public final nx1 n;
    public long o;
    public f13 p;
    public long q;
    public final nx1 r;
    public final nx1 s;
    public int t;
    public k03 u;
    public er2 v;
    public f13 w;
    public final nx1 x;
    public final dq1 y;
    public final zz2 z;
    public us1 b = l93.a;
    public in0 c = new nx0(15);
    public final nx1 e = op0.u(new k03((String) null, 0, 7));
    public wb3 f = gd3.P;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b03(w73 w73Var) {
        this.a = w73Var;
        Boolean bool = Boolean.TRUE;
        this.m = op0.u(bool);
        this.n = op0.u(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = op0.u(null);
        this.s = op0.u(null);
        this.t = -1;
        this.u = new k03((String) null, 0L, 7);
        this.x = op0.u(Boolean.FALSE);
        dq1 dq1Var = new dq1(16);
        dq1Var.j = w23.h;
        this.y = dq1Var;
        this.z = new zz2(this);
        this.A = new er2(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ow1 a(b03 b03Var) {
        String str;
        f13 f13Var;
        sd sdVarM = b03Var.m();
        if (sdVarM == null || (str = sdVarM.i) == null || (f13Var = b03Var.w) == null) {
            return null;
        }
        long j = f13Var.a;
        return new ow1(str, new f13(fg1.i(b03Var.b.p((int) (j >> 32)), b03Var.b.p((int) (j & 4294967295L)))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(b03 b03Var, f13 f13Var) {
        sd sdVarM;
        String str;
        j20 j20Var;
        if (f13Var == null) {
            return;
        }
        long j = f13Var.a;
        p02 p02Var = b03Var.j;
        if (p02Var == null || (sdVarM = b03Var.m()) == null || (str = sdVarM.i) == null) {
            return;
        }
        us1 us1Var = b03Var.b;
        long jI = fg1.i(us1Var.p((int) (j >> 32)), us1Var.p((int) (j & 4294967295L)));
        if (str.length() <= 0 || f13.c(jI) || (j20Var = b03Var.i) == null) {
            return;
        }
        p7.A(j20Var, null, new e00(p02Var, str, jI, f13Var, b03Var, us1Var, null), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long c(b03 b03Var, k03 k03Var, long j, boolean z, boolean z2, vm2 vm2Var, boolean z3, cs0 cs0Var) {
        z03 z03VarD;
        long j2;
        int i;
        long j3;
        long j4;
        sd sdVar;
        tm2 tm2Var;
        boolean z4;
        boolean z5;
        bs0 bs0Var;
        t91 t91Var = b03Var.d;
        if (t91Var == null || (z03VarD = t91Var.d()) == null) {
            return f13.b;
        }
        us1 us1Var = b03Var.b;
        long j5 = k03Var.b;
        sd sdVar2 = k03Var.a;
        int i2 = f13.c;
        long jI = fg1.i(us1Var.p((int) (j5 >> 32)), b03Var.b.p((int) (j5 & 4294967295L)));
        int iB = z03VarD.b(j, false);
        int i3 = (z2 || z) ? iB : (int) (jI >> 32);
        if (!z2 || z) {
            j2 = 4294967295L;
            i = iB;
        } else {
            j2 = 4294967295L;
            i = (int) (jI & 4294967295L);
        }
        er2 er2Var = b03Var.v;
        int i4 = -1;
        if (z || er2Var == null) {
            j3 = j2;
        } else {
            j3 = j2;
            int i5 = b03Var.t;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        y03 y03Var = z03VarD.a;
        if (z) {
            tm2Var = null;
            sdVar = sdVar2;
            j4 = j5;
        } else {
            j4 = j5;
            int i6 = (int) (jI >> 32);
            sdVar = sdVar2;
            int i7 = (int) (jI & j3);
            tm2Var = new tm2(new sm2(ci0.L(y03Var, i6), i6, 1L), new sm2(ci0.L(y03Var, i7), i7, 1L), f13.g(jI));
        }
        er2 er2Var2 = new er2(z2, tm2Var, new bo0(i3, i, i4, y03Var));
        if (tm2Var != null && er2Var != null && z2 == er2Var.i) {
            bo0 bo0Var = (bo0) er2Var.k;
            if (i3 == bo0Var.b && i == bo0Var.c) {
                return j4;
            }
        }
        b03Var.v = er2Var2;
        b03Var.t = iB;
        tm2 tm2VarC = vm2Var.c(er2Var2);
        long jI2 = fg1.i(b03Var.b.n(tm2VarC.a.b), b03Var.b.n(tm2VarC.b.b));
        long j6 = j4;
        if (f13.b(jI2, j6)) {
            return j6;
        }
        boolean z6 = f13.g(jI2) != f13.g(j6) && f13.b(fg1.i((int) (jI2 & j3), (int) (jI2 >> 32)), j6);
        boolean z7 = f13.c(jI2) && f13.c(j6);
        if (z3 && sdVar.i.length() > 0 && !z6 && !z7 && cs0Var != null && (bs0Var = b03Var.k) != null) {
            ((b02) bs0Var).a(cs0Var.a);
        }
        b03Var.c.j(e(sdVar, jI2));
        b03Var.w = new f13(jI2);
        if (!z3) {
            b03Var.t(!f13.c(jI2));
        }
        t91 t91Var2 = b03Var.d;
        if (t91Var2 != null) {
            t91Var2.q.setValue(Boolean.valueOf(z3));
        }
        t91 t91Var3 = b03Var.d;
        if (t91Var3 != null) {
            t91Var3.m.setValue(Boolean.valueOf(!f13.c(jI2) && s11.O(b03Var, true)));
        }
        t91 t91Var4 = b03Var.d;
        if (t91Var4 != null) {
            if (f13.c(jI2)) {
                z4 = false;
            } else {
                z4 = false;
                if (s11.O(b03Var, false)) {
                    z5 = true;
                }
                t91Var4.n.setValue(Boolean.valueOf(z5));
            }
            z5 = z4;
            t91Var4.n.setValue(Boolean.valueOf(z5));
        } else {
            z4 = false;
        }
        t91 t91Var5 = b03Var.d;
        if (t91Var5 != null) {
            t91Var5.o.setValue(Boolean.valueOf((f13.c(jI2) && s11.O(b03Var, true)) ? true : z4));
        }
        return jI2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static k03 e(sd sdVar, long j) {
        return new k03(sdVar, j, (f13) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final zt2 d(boolean z) {
        j20 j20Var = this.i;
        if (j20Var != null) {
            return p7.A(j20Var, null, new tp1(this, z, (t00) null), 1);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        j20 j20Var = this.i;
        if (j20Var != null) {
            p7.A(j20Var, null, new uz2(this, null, 1), 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(rs1 rs1Var) {
        if (!f13.c(n().b)) {
            t91 t91Var = this.d;
            z03 z03VarD = t91Var != null ? t91Var.d() : null;
            int iE = (rs1Var == null || z03VarD == null) ? f13.e(n().b) : this.b.n(z03VarD.b(rs1Var.a, true));
            k03 k03VarA = k03.a(n(), null, fg1.i(iE, iE), 5);
            this.c.j(k03VarA);
            this.w = new f13(k03VarA.b);
        }
        q((rs1Var == null || n().a.i.length() <= 0) ? tr0.h : tr0.j);
        t(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(boolean z) {
        gl0 gl0Var;
        t91 t91Var = this.d;
        if (t91Var != null && !t91Var.b() && (gl0Var = this.l) != null) {
            gl0.a(gl0Var);
        }
        this.u = n();
        t(z);
        q(tr0.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final rs1 i() {
        return (rs1) this.s.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean k() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long l(boolean z) {
        z03 z03VarD;
        long j;
        t91 t91Var = this.d;
        if (t91Var == null || (z03VarD = t91Var.d()) == null) {
            return 9205357640488583168L;
        }
        y03 y03Var = z03VarD.a;
        lj1 lj1Var = y03Var.b;
        sd sdVarM = m();
        if (sdVarM == null) {
            return 9205357640488583168L;
        }
        if (!t11.l(sdVarM.i, y03Var.a.a.i)) {
            return 9205357640488583168L;
        }
        k03 k03VarN = n();
        if (z) {
            long j2 = k03VarN.b;
            int i = f13.c;
            j = j2 >> 32;
        } else {
            long j3 = k03VarN.b;
            int i2 = f13.c;
            j = j3 & 4294967295L;
        }
        int iP = this.b.p((int) j);
        boolean zG = f13.g(n().b);
        long j4 = y03Var.c;
        int iD = lj1Var.d(iP);
        if (iD >= lj1Var.f) {
            return 9205357640488583168L;
        }
        boolean z2 = y03Var.a(((!z || zG) && (z || !zG)) ? Math.max(iP + (-1), 0) : iP) == y03Var.g(iP);
        lj1Var.k(iP);
        int length = ((sd) lj1Var.a.a).i.length();
        ArrayList arrayList = lj1Var.h;
        rw1 rw1Var = (rw1) arrayList.get(iP == length ? eu.L(arrayList) : eu.G(iP, arrayList));
        t9 t9Var = rw1Var.a;
        int iD2 = rw1Var.d(iP);
        w03 w03Var = t9Var.d;
        return (((long) Float.floatToRawIntBits(ci0.C(lj1Var.b(iD), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(ci0.C(z2 ? w03Var.i(iD2, false) : w03Var.j(iD2, false), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final sd m() {
        t91 t91Var = this.d;
        if (t91Var != null) {
            return t91Var.a.a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final k03 n() {
        return (k03) this.e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o() {
        zt2 zt2Var;
        fz2 fz2Var = (fz2) this.y.i;
        if (fz2Var == null || (zt2Var = fz2Var.B) == null) {
            return;
        }
        zt2Var.c(null);
        fz2Var.B = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p() {
        j20 j20Var = this.i;
        if (j20Var != null) {
            p7.A(j20Var, null, new uz2(this, null, 2), 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(tr0 tr0Var) {
        t91 t91Var = this.d;
        if (t91Var != null) {
            if (t91Var.a() == tr0Var) {
                t91Var = null;
            }
            if (t91Var != null) {
                t91Var.k.setValue(tr0Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (((java.lang.Boolean) r4.q.getValue()).booleanValue() == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        zy2 zy2Var;
        vr2 vr2VarB = tl.B();
        t00 t00Var = null;
        in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
        vr2 vr2VarK = tl.K(vr2VarB);
        try {
            if (k()) {
                t91 t91Var = this.d;
                if (t91Var != null) {
                }
                tl.U(vr2VarB, vr2VarK, in0VarE);
                dq1 dq1Var = this.y;
                if (((w23) dq1Var.j) == w23.h) {
                    nz0.c("ToolbarRequester is not initialized.");
                }
                fz2 fz2Var = (fz2) dq1Var.i;
                if (fz2Var == null || !fz2Var.u) {
                    return;
                }
                zt2 zt2Var = fz2Var.B;
                if ((zt2Var == null || !zt2Var.b()) && (zy2Var = (zy2) p40.p(fz2Var, az2.b)) != null) {
                    fz2Var.B = p7.A(fz2Var.A0(), null, new b2(fz2Var, zy2Var, t00Var, 23), 1);
                }
            }
        } finally {
            tl.U(vr2VarB, vr2VarK, in0VarE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(u00 u00Var) {
        a03 a03Var;
        if (u00Var instanceof a03) {
            a03Var = (a03) u00Var;
            int i = a03Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                a03Var.n = i - Integer.MIN_VALUE;
            } else {
                a03Var = new a03(this, u00Var);
            }
        }
        Object objValueOf = a03Var.l;
        int i2 = a03Var.n;
        if (i2 == 0) {
            fg1.T(objValueOf);
            rt rtVar = this.h;
            if (rtVar != null) {
                a03Var.k = this;
                a03Var.n = 1;
                ClipDescription primaryClipDescription = ((i6) rtVar).a.a().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                Object obj = k20.h;
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return a83.a;
        }
        if (i2 != 1) {
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = a03Var.k;
        fg1.T(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.x.setValue(bool);
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(boolean z) {
        t91 t91Var = this.d;
        if (t91Var != null) {
            t91Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            r();
        } else {
            o();
        }
    }
}
