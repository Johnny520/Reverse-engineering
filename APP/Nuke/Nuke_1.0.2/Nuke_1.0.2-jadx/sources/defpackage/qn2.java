package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qn2 {
    public final th1 a;
    public final boolean b;
    public final r61 c;
    public final ln2 d;
    public qn2 e;
    public final int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qn2(th1 th1Var, boolean z, r61 r61Var, ln2 ln2Var) {
        this.a = th1Var;
        this.b = z;
        this.c = r61Var;
        this.d = ln2Var;
        this.f = r61Var.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ List j(int i, qn2 qn2Var) {
        return qn2Var.i((i & 1) != 0 ? !qn2Var.b : false, (i & 2) == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x005a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0077 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x0069 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x0023 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x0023 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0063 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [th1] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [th1] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final o62 a(zn1 zn1Var) {
        ?? M;
        qn2 qn2VarL = l();
        if (qn2VarL == null) {
            return o62.e;
        }
        th1 th1Var = (th1) qn2VarL.c.M.g;
        if ((th1Var.k & 8) != 0) {
            loop0: while (th1Var != null) {
                if ((th1Var.j & 8) != 0) {
                    M = th1Var;
                    ?? zk1Var = 0;
                    while (M != 0) {
                        if (M instanceof on2) {
                            if (((on2) M).i()) {
                                break loop0;
                            }
                        } else if ((M.j & 8) != 0 && (M instanceof u60)) {
                            th1 th1Var2 = ((u60) M).w;
                            int i = 0;
                            M = M;
                            zk1Var = zk1Var;
                            while (th1Var2 != null) {
                                if ((th1Var2.j & 8) != 0) {
                                    i++;
                                    zk1Var = zk1Var;
                                    if (i == 1) {
                                        M = th1Var2;
                                    } else {
                                        if (zk1Var == 0) {
                                            zk1Var = new zk1(new th1[16]);
                                        }
                                        if (M != 0) {
                                            zk1Var.b(M);
                                            M = 0;
                                        }
                                        zk1Var.b(th1Var2);
                                    }
                                }
                                th1Var2 = th1Var2.m;
                                M = M;
                                zk1Var = zk1Var;
                            }
                            if (i == 1) {
                            }
                        }
                        M = sp0.m(zk1Var);
                    }
                }
                if ((th1Var.k & 8) == 0) {
                    break;
                }
                th1Var = th1Var.m;
            }
            M = 0;
        } else {
            M = 0;
        }
        on2 on2Var = (on2) M;
        zn1 zn1VarZ = on2Var != null ? sp0.Z(on2Var, 8) : null;
        return zn1VarZ == null ? qn2VarL.a(zn1Var) : zn1VarZ.J(zn1Var, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final qn2 b(va2 va2Var, in0 in0Var) {
        ln2 ln2Var = new ln2();
        ln2Var.j = false;
        ln2Var.k = false;
        in0Var.j(ln2Var);
        qn2 qn2Var = new qn2(new pn2(in0Var), false, new r61(this.f + (va2Var != null ? 1000000000 : 2000000000), true), ln2Var);
        qn2Var.e = this;
        return qn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(r61 r61Var, ArrayList arrayList) {
        zk1 zk1VarX = r61Var.x();
        Object[] objArr = zk1VarX.h;
        int i = zk1VarX.j;
        for (int i2 = 0; i2 < i; i2++) {
            r61 r61Var2 = (r61) objArr[i2];
            if (r61Var2.H() && !r61Var2.X) {
                if (r61Var2.M.m(8)) {
                    arrayList.add(rp0.N(r61Var2, this.b));
                } else {
                    c(r61Var2, arrayList);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final zn1 d() {
        if (!o()) {
            on2 on2VarF = f();
            return on2VarF != null ? sp0.Z(on2VarF, 8) : (qz0) this.c.M.d;
        }
        qn2 qn2VarL = l();
        if (qn2VarL != null) {
            return qn2VarL.d();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            qn2 qn2Var = (qn2) arrayList.get(size2);
            if (qn2Var.p()) {
                arrayList2.add(qn2Var);
            } else if (!qn2Var.d.k) {
                qn2Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:101:0x00f3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:102:0x0086 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:106:0x00e5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:108:0x009f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:110:0x009f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:0x00df */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:73:0x00d6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:88:0x007d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:93:0x0024 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [th1] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [th1] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final on2 f() {
        ?? M;
        boolean z;
        boolean z2 = this.d.j;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        r61 r61Var = this.c;
        if (z2) {
            th1 th1Var = (th1) r61Var.M.g;
            if ((th1Var.k & 8) != 0) {
                M = 0;
                while (th1Var != null) {
                    if ((th1Var.j & 8) != 0) {
                        th1 th1VarM = th1Var;
                        zk1 zk1Var = null;
                        while (th1VarM != null) {
                            if (th1VarM instanceof on2) {
                                on2 on2Var = (on2) th1VarM;
                                ?? r0 = M;
                                if (on2Var.i()) {
                                    r0 = M;
                                    if (on2Var.o0()) {
                                        return on2Var;
                                    }
                                    if (M == 0) {
                                        r0 = on2Var;
                                    }
                                }
                                z = false;
                                M = r0;
                            } else {
                                z = true;
                                M = M;
                            }
                            if (z && (th1VarM.j & 8) != 0 && (th1VarM instanceof u60)) {
                                int i = 0;
                                for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                    if ((th1Var2.j & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            th1VarM = th1Var2;
                                        } else {
                                            if (zk1Var == null) {
                                                zk1Var = new zk1(new th1[16]);
                                            }
                                            if (th1VarM != null) {
                                                zk1Var.b(th1VarM);
                                                th1VarM = null;
                                            }
                                            zk1Var.b(th1Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            th1VarM = sp0.m(zk1Var);
                        }
                    }
                    if ((th1Var.k & 8) == 0) {
                        break;
                    }
                    th1Var = th1Var.m;
                    M = M;
                }
                r4 = M;
            }
        } else {
            th1 th1Var3 = (th1) r61Var.M.g;
            if ((th1Var3.k & 8) != 0) {
                loop3: while (th1Var3 != null) {
                    if ((th1Var3.j & 8) != 0) {
                        M = th1Var3;
                        ?? zk1Var2 = 0;
                        while (M != 0) {
                            if (M instanceof on2) {
                                if (((on2) M).i()) {
                                    r4 = M;
                                }
                            } else if ((M.j & 8) != 0 && (M instanceof u60)) {
                                th1 th1Var4 = ((u60) M).w;
                                int i2 = 0;
                                M = M;
                                zk1Var2 = zk1Var2;
                                while (th1Var4 != null) {
                                    if ((th1Var4.j & 8) != 0) {
                                        i2++;
                                        zk1Var2 = zk1Var2;
                                        if (i2 == 1) {
                                            M = th1Var4;
                                        } else {
                                            if (zk1Var2 == 0) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (M != 0) {
                                                zk1Var2.b(M);
                                                M = 0;
                                            }
                                            zk1Var2.b(th1Var4);
                                        }
                                    }
                                    th1Var4 = th1Var4.m;
                                    M = M;
                                    zk1Var2 = zk1Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M = sp0.m(zk1Var2);
                        }
                    }
                    if ((th1Var3.k & 8) == 0) {
                        break;
                    }
                    th1Var3 = th1Var3.m;
                }
            }
        }
        return (on2) r4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o62 g() {
        zn1 zn1VarD = d();
        if (zn1VarD != null) {
            if (!zn1VarD.S0().u) {
                zn1VarD = null;
            }
            if (zn1VarD != null) {
                return s11.J(zn1VarD).J(zn1VarD, true);
            }
        }
        return o62.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o62 h() {
        zn1 zn1VarD = d();
        if (zn1VarD != null) {
            if (!zn1VarD.S0().u) {
                zn1VarD = null;
            }
            if (zn1VarD != null) {
                return s11.w(zn1VarD, true);
            }
        }
        return o62.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List i(boolean z, boolean z2) {
        if (!z && this.d.k) {
            return be0.h;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return s(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ln2 k() {
        boolean zP = p();
        ln2 ln2Var = this.d;
        if (!zP) {
            return ln2Var;
        }
        ln2 ln2VarB = ln2Var.b();
        r(new ArrayList(), ln2VarB);
        return ln2VarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final qn2 l() {
        r61 r61VarU;
        qn2 qn2Var = this.e;
        if (qn2Var != null) {
            return qn2Var;
        }
        r61 r61Var = this.c;
        boolean z = this.b;
        if (z) {
            r61VarU = r61Var.u();
            while (r61VarU != null) {
                ln2 ln2VarW = r61VarU.w();
                if (ln2VarW != null && ln2VarW.j) {
                    break;
                }
                r61VarU = r61VarU.u();
            }
            r61VarU = null;
        } else {
            r61VarU = null;
        }
        if (r61VarU == null) {
            r61 r61VarU2 = r61Var.u();
            while (true) {
                if (r61VarU2 == null) {
                    r61VarU = null;
                    break;
                }
                if (r61VarU2.M.m(8)) {
                    r61VarU = r61VarU2;
                    break;
                }
                r61VarU2 = r61VarU2.u();
            }
        }
        if (r61VarU == null) {
            return null;
        }
        return rp0.N(r61VarU, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o62 m() {
        Object objF = f();
        if (objF == null) {
            return ((qz0) this.c.M.d).o1();
        }
        th1 th1Var = ((th1) objF).h;
        Object objG = this.d.h.g(kn2.b);
        if (objG == null) {
            objG = null;
        }
        return qp0.v(th1Var, objG != null, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ln2 n() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean o() {
        return this.e != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p() {
        return this.b && this.d.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean q() {
        if (o() || !j(4, this).isEmpty()) {
            return false;
        }
        r61 r61VarU = this.c.u();
        while (true) {
            if (r61VarU == null) {
                r61VarU = null;
                break;
            }
            ln2 ln2VarW = r61VarU.w();
            if (ln2VarW != null && ln2VarW.j) {
                break;
            }
            r61VarU = r61VarU.u();
        }
        return r61VarU == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(ArrayList arrayList, ln2 ln2Var) {
        if (this.d.k) {
            return;
        }
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            qn2 qn2Var = (qn2) arrayList.get(size2);
            if (!qn2Var.p()) {
                ln2Var.d(qn2Var.d);
                qn2Var.r(arrayList, ln2Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List s(ArrayList arrayList, boolean z) {
        if (o()) {
            return be0.h;
        }
        c(this.c, arrayList);
        if (z) {
            ln2 ln2Var = this.d;
            rk1 rk1Var = ln2Var.h;
            Object objG = rk1Var.g(vn2.z);
            if (objG == null) {
                objG = null;
            }
            va2 va2Var = (va2) objG;
            if (va2Var != null && ln2Var.j && !arrayList.isEmpty()) {
                arrayList.add(b(va2Var, new oq0(23, va2Var)));
            }
            yn2 yn2Var = vn2.a;
            if (rk1Var.c(yn2Var) && !arrayList.isEmpty() && ln2Var.j) {
                Object objG2 = rk1Var.g(yn2Var);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) du.q0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new v5(18, str)));
                }
            }
        }
        return arrayList;
    }
}
