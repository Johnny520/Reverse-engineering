package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kf1 {
    public final r61 a;
    public boolean c;
    public boolean d;
    public fz i;
    public final b5 b = new b5(7);
    public final dq1 e = new dq1(2);
    public final zk1 f = new zk1(new r61[16]);
    public final long g = 1;
    public final zk1 h = new zk1(new jf1[16]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kf1(r61 r61Var) {
        this.a = r61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(kf1 kf1Var, r61 r61Var, boolean z) {
        fz fzVar;
        rz1 placementScope;
        qz0 qz0Var;
        r61 r61VarU;
        r61 r61Var2 = kf1Var.a;
        boolean z2 = r61Var.X;
        v61 v61Var = r61Var.N;
        if (!z2 && k(r61Var)) {
            if (r61Var == r61Var2) {
                fzVar = kf1Var.i;
                fzVar.getClass();
            } else {
                fzVar = null;
            }
            if (z) {
                zC = v61Var.e ? c(r61Var, fzVar) : false;
                if ((zC || v61Var.f) && t11.l(r61Var.J(), Boolean.TRUE)) {
                    r61Var.K();
                }
            } else {
                boolean zD = r61Var.q() ? d(r61Var, fzVar) : false;
                if (r61Var.p() && (r61Var == r61Var2 || ((r61VarU = r61Var.u()) != null && r61VarU.I() && v61Var.p.z))) {
                    if (r61Var == r61Var2) {
                        if (r61Var.J == p61.j) {
                            r61Var.f();
                        }
                        r61 r61VarU2 = r61Var.u();
                        if (r61VarU2 == null || (qz0Var = (qz0) r61VarU2.M.d) == null || (placementScope = qz0Var.s) == null) {
                            placementScope = ((b7) u61.a(r61Var)).getPlacementScope();
                        }
                        rz1.i(placementScope, v61Var.p, 0, 0);
                    } else {
                        r61Var.R();
                    }
                    dq1 dq1Var = kf1Var.e;
                    dq1Var.getClass();
                    if (r61Var.W > 0) {
                        ((zk1) dq1Var.i).b(r61Var);
                        r61Var.V = true;
                    }
                }
                zC = zD;
            }
            kf1Var.e();
        }
        return zC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(r61 r61Var, fz fzVar) {
        boolean zV0;
        r61 r61Var2 = r61Var.o;
        v61 v61Var = r61Var.N;
        if (r61Var2 == null) {
            return false;
        }
        if (fzVar == null) {
            qd1 qd1Var = v61Var.q;
            fz fzVar2 = qd1Var != null ? qd1Var.t : null;
            if (fzVar2 != null && r61Var2 != null) {
                qd1Var.getClass();
                zV0 = qd1Var.v0(fzVar2.a);
            }
        } else if (r61Var2 != null) {
            qd1 qd1Var2 = v61Var.q;
            qd1Var2.getClass();
            zV0 = qd1Var2.v0(fzVar.a);
        } else {
            zV0 = false;
        }
        r61 r61VarU = r61Var.u();
        if (zV0 && r61VarU != null) {
            if (r61VarU.o == null) {
                r61.V(r61VarU, false, 3);
                return zV0;
            }
            if (r61Var.s() == p61.h) {
                r61.T(r61VarU, false, 3);
                return zV0;
            }
            if (r61Var.s() == p61.i) {
                r61VarU.S(false);
            }
        }
        return zV0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean d(r61 r61Var, fz fzVar) {
        boolean zT0;
        p61 p61Var = p61.j;
        if (fzVar != null) {
            if (r61Var.J == p61Var) {
                r61Var.e();
            }
            zT0 = r61Var.N.p.t0(fzVar.a);
        } else {
            mf1 mf1Var = r61Var.N.p;
            fz fzVar2 = mf1Var.q ? new fz(mf1Var.k) : null;
            if (fzVar2 != null) {
                if (r61Var.J == p61Var) {
                    r61Var.e();
                }
                zT0 = r61Var.N.p.t0(fzVar2.a);
            } else {
                r61Var.getClass();
                zT0 = false;
            }
        }
        r61 r61VarU = r61Var.u();
        if (zT0 && r61VarU != null) {
            if (r61Var.r() == p61.h) {
                r61.V(r61VarU, false, 3);
                return zT0;
            }
            if (r61Var.r() == p61.i) {
                r61VarU.U(false);
            }
        }
        return zT0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean i(r61 r61Var) {
        qd1 qd1Var;
        s61 s61Var;
        if (r61Var.N.e) {
            return (r61Var.s() == p61.j && ((qd1Var = r61Var.N.q) == null || (s61Var = qd1Var.x) == null || !s61Var.e())) ? false : true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean j(r61 r61Var) {
        if (!r61Var.q()) {
            return false;
        }
        do {
            if (r61Var.r() == p61.j && !r61Var.N.p.D.e()) {
                r61 r61VarU = r61Var.u();
                if ((r61VarU != null ? r61VarU.N.d : null) != n61.h) {
                    return false;
                }
            }
            r61Var = r61Var.u();
            if (r61Var == null) {
                return false;
            }
        } while (!r61Var.I());
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean k(r61 r61Var) {
        qd1 qd1Var;
        s61 s61Var;
        v61 v61Var = r61Var.N;
        return r61Var.I() || v61Var.p.z || j(r61Var) || t11.l(r61Var.J(), Boolean.TRUE) || i(r61Var) || v61Var.p.D.e() || !((qd1Var = v61Var.q) == null || (s61Var = qd1Var.x) == null || !s61Var.e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(boolean z) {
        dq1 dq1Var = this.e;
        if (z) {
            zk1 zk1Var = (zk1) dq1Var.i;
            r61 r61Var = this.a;
            if (r61Var.W > 0) {
                zk1Var.g();
                zk1Var.b(r61Var);
                r61Var.V = true;
            }
        }
        if (((zk1) dq1Var.i).j != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                dq1Var.z();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        zk1 zk1Var = this.h;
        int i = zk1Var.j;
        if (i != 0) {
            Object[] objArr = zk1Var.h;
            for (int i2 = 0; i2 < i; i2++) {
                jf1 jf1Var = (jf1) objArr[i2];
                if (jf1Var.a.H()) {
                    boolean z = jf1Var.b;
                    r61 r61Var = jf1Var.a;
                    boolean z2 = jf1Var.c;
                    if (z) {
                        r61.T(r61Var, z2, 2);
                    } else {
                        r61.V(r61Var, z2, 2);
                    }
                }
            }
            zk1Var.g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(r61 r61Var) {
        zk1 zk1VarY = r61Var.y();
        Object[] objArr = zk1VarY.h;
        int i = zk1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            r61 r61Var2 = (r61) objArr[i2];
            if (t11.l(r61Var2.J(), Boolean.TRUE) && !r61Var2.X) {
                if (this.b.m(r61Var2)) {
                    r61Var2.K();
                }
                f(r61Var2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(r61 r61Var, boolean z) {
        if (!this.c) {
            kz0.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? r61Var.N.e : r61Var.q()) {
            kz0.a("node not yet measured");
        }
        h(r61Var, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(r61 r61Var, boolean z) {
        qd1 qd1Var;
        s61 s61Var;
        zk1 zk1VarY = r61Var.y();
        Object[] objArr = zk1VarY.h;
        int i = zk1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            r61 r61Var2 = (r61) objArr[i2];
            p61 p61Var = p61.h;
            if ((!z && (r61Var2.r() == p61Var || r61Var2.N.p.D.e())) || (z && (r61Var2.s() == p61Var || ((qd1Var = r61Var2.N.q) != null && (s61Var = qd1Var.x) != null && s61Var.e())))) {
                boolean z2 = fg1.z(r61Var2);
                v61 v61Var = r61Var2.N;
                if (z2 && !z) {
                    if (v61Var.e && this.b.m(r61Var2)) {
                        o(r61Var2, true);
                    } else {
                        g(r61Var2, true);
                    }
                }
                if (z ? v61Var.e : r61Var2.q()) {
                    o(r61Var2, z);
                }
                if (!(z ? v61Var.e : r61Var2.q())) {
                    h(r61Var2, z);
                }
            }
        }
        if (z ? r61Var.N.e : r61Var.q()) {
            o(r61Var, z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:119:0x015c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:123:0x0156 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:90:0x014d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:94:0x015a */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [th1] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [th1] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [zk1] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [zk1] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean l(s6 s6Var) {
        boolean z;
        th1 th1Var;
        ?? M;
        boolean z2;
        r61 r61Var;
        boolean z3;
        boolean zO;
        b5 b5Var = this.b;
        r61 r61Var2 = this.a;
        if (!r61Var2.H()) {
            kz0.a("performMeasureAndLayout called with unattached root");
        }
        if (!r61Var2.I()) {
            kz0.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            kz0.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean zW = b5Var.w();
                n4 n4Var = (n4) b5Var.i;
                if (zW) {
                    z = false;
                    while (true) {
                        n4 n4Var2 = (n4) b5Var.k;
                        n4 n4Var3 = (n4) b5Var.j;
                        if (!((gt2) n4Var.i).isEmpty()) {
                            r61Var = (r61) ((gt2) n4Var.i).first();
                            n4Var.x(r61Var);
                            z3 = r61Var.o != null;
                            z2 = false;
                        } else if (!((gt2) n4Var3.i).isEmpty()) {
                            r61Var = (r61) ((gt2) n4Var3.i).first();
                            n4Var3.x(r61Var);
                            z3 = r61Var.o != null;
                            z2 = true;
                        } else {
                            if (((gt2) n4Var2.i).isEmpty()) {
                                break;
                            }
                            r61 r61Var3 = (r61) ((gt2) n4Var2.i).first();
                            n4Var2.x(r61Var3);
                            z2 = true;
                            r61Var = r61Var3;
                            z3 = false;
                        }
                        if (z2) {
                            zO = a(this, r61Var, z3);
                        } else {
                            zO = o(r61Var, z3);
                            if (r61Var.N.f) {
                                b5Var.j(r61Var, a21.i);
                            }
                            if (r61Var.p()) {
                                b5Var.j(r61Var, a21.k);
                            }
                        }
                        if (r61Var == r61Var2 && zO) {
                            z = true;
                        }
                    }
                    if (s6Var != null) {
                        s6Var.a();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        zk1 zk1Var = this.f;
        Object[] objArr = zk1Var.h;
        int i = zk1Var.j;
        int i2 = 0;
        while (i2 < i) {
            vn1 vn1Var = ((r61) objArr[i2]).M;
            qz0 qz0Var = (qz0) vn1Var.d;
            boolean zG = ao1.g(4194304);
            if (zG) {
                th1Var = qz0Var.Y;
            } else {
                th1Var = qz0Var.Y.l;
                if (th1Var == null) {
                }
                i2++;
                z4 = false;
            }
            ca2 ca2Var = zn1.T;
            th1 th1VarU0 = qz0Var.U0(zG);
            while (th1VarU0 != null && (th1VarU0.k & 4194304) != 0) {
                if ((th1VarU0.j & 4194304) != 0) {
                    ?? r12 = th1VarU0;
                    ?? zk1Var2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof a61) {
                            ((a61) r12).q((qz0) vn1Var.d);
                        } else {
                            if ((r12.j & 4194304) != 0 && (r12 instanceof u60)) {
                                th1 th1Var2 = ((u60) r12).w;
                                ?? r15 = z4;
                                M = r12;
                                zk1Var2 = zk1Var2;
                                while (th1Var2 != null) {
                                    if ((th1Var2.j & 4194304) != 0) {
                                        r15++;
                                        zk1Var2 = zk1Var2;
                                        if (r15 == 1) {
                                            M = th1Var2;
                                        } else {
                                            if (zk1Var2 == 0) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (M != 0) {
                                                zk1Var2.b(M);
                                                M = 0;
                                            }
                                            zk1Var2.b(th1Var2);
                                        }
                                    }
                                    th1Var2 = th1Var2.m;
                                    M = M;
                                    zk1Var2 = zk1Var2;
                                    r15 = r15;
                                }
                                if (r15 == 1) {
                                }
                            }
                            z4 = false;
                            r12 = M;
                            zk1Var2 = zk1Var2;
                        }
                        M = sp0.m(zk1Var2);
                        z4 = false;
                        r12 = M;
                        zk1Var2 = zk1Var2;
                    }
                }
                if (th1VarU0 != th1Var) {
                    th1VarU0 = th1VarU0.m;
                    z4 = false;
                }
            }
            i2++;
            z4 = false;
        }
        zk1Var.g();
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:111:0x0155 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:114:0x010f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:116:0x010f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:119:0x014f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:88:0x0146 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [th1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [th1] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final void m(r61 r61Var, long j) {
        th1 th1Var;
        boolean z = r61Var.X;
        v61 v61Var = r61Var.N;
        if (z) {
            return;
        }
        r61 r61Var2 = this.a;
        if (r61Var == r61Var2) {
            kz0.a("measureAndLayout called on root");
        }
        if (!r61Var2.H()) {
            kz0.a("performMeasureAndLayout called with unattached root");
        }
        if (!r61Var2.I()) {
            kz0.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            kz0.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                b5 b5Var = this.b;
                ((n4) b5Var.i).x(r61Var);
                ((n4) b5Var.j).x(r61Var);
                ((n4) b5Var.k).x(r61Var);
                if (c(r61Var, new fz(j)) || v61Var.f) {
                    if (t11.l(r61Var.J(), Boolean.TRUE)) {
                        r61Var.K();
                    }
                }
                f(r61Var);
                if (r61Var.J == p61.j) {
                    r61Var.e();
                }
                boolean zT0 = v61Var.p.t0(j);
                r61 r61VarU = r61Var.u();
                if (zT0 && r61VarU != null) {
                    if (r61Var.r() == p61.h) {
                        r61.V(r61VarU, false, 3);
                    } else if (r61Var.r() == p61.i) {
                        r61VarU.U(false);
                    }
                }
                if (r61Var.p() && r61Var.I()) {
                    r61Var.R();
                    dq1 dq1Var = this.e;
                    dq1Var.getClass();
                    if (r61Var.W > 0) {
                        ((zk1) dq1Var.i).b(r61Var);
                        r61Var.V = true;
                    }
                }
                e();
            } finally {
            }
        }
        zk1 zk1Var = this.f;
        Object[] objArr = zk1Var.h;
        int i = zk1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            vn1 vn1Var = ((r61) objArr[i2]).M;
            qz0 qz0Var = (qz0) vn1Var.d;
            boolean zG = ao1.g(4194304);
            if (zG) {
                th1Var = qz0Var.Y;
            } else {
                th1Var = qz0Var.Y.l;
                if (th1Var == null) {
                }
            }
            ca2 ca2Var = zn1.T;
            for (th1 th1VarU0 = qz0Var.U0(zG); th1VarU0 != null && (th1VarU0.k & 4194304) != 0; th1VarU0 = th1VarU0.m) {
                if ((th1VarU0.j & 4194304) != 0) {
                    ?? M = th1VarU0;
                    ?? zk1Var2 = 0;
                    while (M != 0) {
                        if (M instanceof a61) {
                            ((a61) M).q((qz0) vn1Var.d);
                        } else if ((M.j & 4194304) != 0 && (M instanceof u60)) {
                            th1 th1Var2 = ((u60) M).w;
                            int i3 = 0;
                            M = M;
                            zk1Var2 = zk1Var2;
                            while (th1Var2 != null) {
                                if ((th1Var2.j & 4194304) != 0) {
                                    i3++;
                                    zk1Var2 = zk1Var2;
                                    if (i3 == 1) {
                                        M = th1Var2;
                                    } else {
                                        if (zk1Var2 == 0) {
                                            zk1Var2 = new zk1(new th1[16]);
                                        }
                                        if (M != 0) {
                                            zk1Var2.b(M);
                                            M = 0;
                                        }
                                        zk1Var2.b(th1Var2);
                                    }
                                }
                                th1Var2 = th1Var2.m;
                                M = M;
                                zk1Var2 = zk1Var2;
                            }
                            if (i3 == 1) {
                            }
                        }
                        M = sp0.m(zk1Var2);
                    }
                }
                if (th1VarU0 != th1Var) {
                }
            }
        }
        zk1Var.g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void n() {
        b5 b5Var = this.b;
        if (b5Var.w()) {
            r61 r61Var = this.a;
            if (!r61Var.H()) {
                kz0.a("performMeasureAndLayout called with unattached root");
            }
            if (!r61Var.I()) {
                kz0.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                kz0.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if ((((gt2) ((n4) b5Var.k).i).isEmpty() || ((gt2) ((n4) b5Var.i).i).isEmpty()) ? false : true) {
                        if (r61Var.o != null) {
                            q(r61Var, true);
                        } else {
                            p(r61Var);
                        }
                    }
                    q(r61Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean o(r61 r61Var, boolean z) {
        fz fzVar;
        boolean zD = false;
        if (!r61Var.X && k(r61Var)) {
            if (r61Var == this.a) {
                fzVar = this.i;
                fzVar.getClass();
            } else {
                fzVar = null;
            }
            if (z) {
                if (r61Var.N.e) {
                    zD = c(r61Var, fzVar);
                }
            } else if (r61Var.q()) {
                zD = d(r61Var, fzVar);
            }
            e();
        }
        return zD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(r61 r61Var) {
        zk1 zk1VarY = r61Var.y();
        Object[] objArr = zk1VarY.h;
        int i = zk1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            r61 r61Var2 = (r61) objArr[i2];
            if (r61Var2.r() == p61.h || r61Var2.N.p.D.e()) {
                if (fg1.z(r61Var2)) {
                    q(r61Var2, true);
                } else {
                    p(r61Var2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(r61 r61Var, boolean z) {
        fz fzVar;
        if (r61Var.X) {
            return;
        }
        if (r61Var == this.a) {
            fzVar = this.i;
            fzVar.getClass();
        } else {
            fzVar = null;
        }
        if (z) {
            c(r61Var, fzVar);
        } else {
            d(r61Var, fzVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean r(r61 r61Var, boolean z) {
        int iOrdinal = r61Var.N.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.b(new jf1(r61Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    c80.s();
                    return false;
                }
                if (!r61Var.q() || z) {
                    r61Var.N.p.A = true;
                    if (!r61Var.X && (r61Var.I() || j(r61Var))) {
                        r61 r61VarU = r61Var.u();
                        if (r61VarU == null || !r61VarU.q()) {
                            this.b.j(r61Var, a21.j);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(long j) {
        fz fzVar = this.i;
        if (fzVar == null ? false : fz.b(fzVar.a, j)) {
            return;
        }
        if (this.c) {
            kz0.a("updateRootConstraints called while measuring");
        }
        this.i = new fz(j);
        r61 r61Var = this.a;
        r61 r61Var2 = r61Var.o;
        v61 v61Var = r61Var.N;
        if (r61Var2 != null) {
            v61Var.e = true;
        }
        v61Var.p.A = true;
        this.b.j(r61Var, r61Var2 != null ? a21.h : a21.j);
    }
}
