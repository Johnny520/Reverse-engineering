package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pl0 extends th1 implements gy, a61, os1, wh1, t60 {
    public final boolean v;
    public final mn0 w;
    public boolean x;
    public boolean y;
    public final int z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pl0(int i, mn0 mn0Var, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        mn0Var = (i2 & 4) != 0 ? null : mn0Var;
        this.v = z;
        this.w = mn0Var;
        this.z = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        int iOrdinal = R0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                yk0 focusOwner = ((b7) sp0.f0(this)).getFocusOwner();
                pl0 pl0VarA0 = rp0.a0(this);
                if (pl0VarA0 == null || !pl0VarA0.v) {
                    return;
                }
                bl0 bl0Var = (bl0) focusOwner;
                bl0Var.a.F();
                bl0Var.d.a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                c80.s();
                return;
            }
        }
        bl0 bl0Var2 = (bl0) ((b7) sp0.f0(this)).getFocusOwner();
        bl0Var2.b(8, true, false);
        if (this.v) {
            bl0Var2.a.F();
        }
        bl0Var2.d.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void G0() {
        if (R0().a()) {
            ((bl0) ((b7) sp0.f0(this)).getFocusOwner()).b(8, true, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.os1
    public final void L() {
        S0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean M0(int i) {
        int iOrdinal = qp0.K(this, i).ordinal();
        if (iOrdinal == 0) {
            return qp0.L(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        c80.s();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:0x0090 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x009f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x0053 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x0053 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x0099 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [th1] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [th1] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [zk1] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [zk1] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void N0(kl0 kl0Var, kl0 kl0Var2) {
        vn1 vn1Var;
        mn0 mn0Var;
        bl0 bl0Var = (bl0) ((b7) sp0.f0(this)).getFocusOwner();
        pl0 pl0VarF = bl0Var.f();
        if (!kl0Var.equals(kl0Var2) && (mn0Var = this.w) != null) {
            mn0Var.g(kl0Var, kl0Var2);
        }
        th1 th1Var = this.h;
        if (!th1Var.u) {
            kz0.b("visitAncestors called on an unattached node");
        }
        th1 th1Var2 = this.h;
        r61 r61VarC0 = sp0.c0(this);
        while (r61VarC0 != null) {
            if ((((th1) r61VarC0.M.g).k & 5120) != 0) {
                while (th1Var2 != null) {
                    int i = th1Var2.j;
                    if ((i & 5120) != 0) {
                        if (th1Var2 != th1Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? M = th1Var2;
                            ?? zk1Var = 0;
                            while (M != 0) {
                                if (M instanceof pk0) {
                                    pk0 pk0Var = (pk0) M;
                                    if (pl0VarF == bl0Var.f()) {
                                        pk0Var.Z(kl0Var2);
                                    }
                                } else if ((M.j & 4096) != 0 && (M instanceof u60)) {
                                    th1 th1Var3 = ((u60) M).w;
                                    int i2 = 0;
                                    M = M;
                                    zk1Var = zk1Var;
                                    while (th1Var3 != null) {
                                        if ((th1Var3.j & 4096) != 0) {
                                            i2++;
                                            zk1Var = zk1Var;
                                            if (i2 == 1) {
                                                M = th1Var3;
                                            } else {
                                                if (zk1Var == 0) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (M != 0) {
                                                    zk1Var.b(M);
                                                    M = 0;
                                                }
                                                zk1Var.b(th1Var3);
                                            }
                                        }
                                        th1Var3 = th1Var3.m;
                                        M = M;
                                        zk1Var = zk1Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M = sp0.m(zk1Var);
                            }
                        }
                    }
                    th1Var2 = th1Var2.l;
                }
            }
            r61VarC0 = r61VarC0.u();
            th1Var2 = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x00bb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x00ca */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x0086 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x0086 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:86:0x00c4 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [th1] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [th1] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [zk1] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [zk1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final el0 O0() {
        boolean z;
        vn1 vn1Var;
        el0 el0Var = new el0();
        el0Var.a = true;
        gl0 gl0Var = gl0.b;
        el0Var.b = gl0Var;
        el0Var.c = gl0Var;
        el0Var.d = gl0Var;
        el0Var.e = gl0Var;
        el0Var.f = gl0Var;
        el0Var.g = gl0Var;
        el0Var.h = gl0Var;
        el0Var.i = gl0Var;
        el0Var.j = v6.L;
        el0Var.k = v6.M;
        el0Var.l = gd3.w;
        int i = this.z;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((uz0) ((wz0) ((vz0) p40.p(this, ly.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                s.l("Unknown Focusability");
                return null;
            }
            z = false;
        }
        el0Var.a = z;
        th1 th1Var = this.h;
        if (!th1Var.u) {
            kz0.b("visitAncestors called on an unattached node");
        }
        th1 th1Var2 = this.h;
        r61 r61VarC0 = sp0.c0(this);
        loop0: while (r61VarC0 != null) {
            if ((((th1) r61VarC0.M.g).k & 3072) != 0) {
                while (th1Var2 != null) {
                    int i2 = th1Var2.j;
                    if ((i2 & 3072) != 0) {
                        if (th1Var2 != th1Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? zk1Var = 0;
                            ?? M = th1Var2;
                            while (M != 0) {
                                if (M instanceof fl0) {
                                    ((fl0) M).W(el0Var);
                                } else if ((M.j & 2048) != 0 && (M instanceof u60)) {
                                    th1 th1Var3 = ((u60) M).w;
                                    int i3 = 0;
                                    M = M;
                                    zk1Var = zk1Var;
                                    while (th1Var3 != null) {
                                        if ((th1Var3.j & 2048) != 0) {
                                            i3++;
                                            zk1Var = zk1Var;
                                            if (i3 == 1) {
                                                M = th1Var3;
                                            } else {
                                                if (zk1Var == 0) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (M != 0) {
                                                    zk1Var.b(M);
                                                    M = 0;
                                                }
                                                zk1Var.b(th1Var3);
                                            }
                                        }
                                        th1Var3 = th1Var3.m;
                                        M = M;
                                        zk1Var = zk1Var;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                M = sp0.m(zk1Var);
                            }
                        }
                    }
                    th1Var2 = th1Var2.l;
                }
            }
            r61VarC0 = r61VarC0.u();
            th1Var2 = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
        }
        return el0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o62 P0(c61 c61Var) {
        o62 o62Var = O0().l;
        return o62Var != gd3.w ? c61Var == null ? o62Var : o62Var.i(c61Var.D(sp0.b0(this), 0L)) : c61Var != null ? c61Var.J(sp0.b0(this), false) : eu.q(0L, s11.q0(sp0.b0(this).j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final t71 Q0() {
        vn1 vn1Var;
        Object obj;
        if (!this.h.u) {
            kz0.b("visitAncestors called on an unattached node");
        }
        th1 th1Var = this.h.l;
        r61 r61VarC0 = sp0.c0(this);
        while (true) {
            if (r61VarC0 == null) {
                break;
            }
            if ((((th1) r61VarC0.M.g).k & 8388640) != 0) {
                while (th1Var != null) {
                    int i = th1Var.j;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(th1Var instanceof t71)) {
                                if (th1Var instanceof u60) {
                                    th1Var = null;
                                    for (th1 th1Var2 = ((u60) th1Var).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                        if (th1Var2 instanceof t71) {
                                            th1Var = th1Var2;
                                        }
                                    }
                                } else {
                                    th1Var = null;
                                }
                            }
                            t71 t71Var = (t71) th1Var;
                            if (t71Var != null) {
                                return t71Var;
                            }
                        } else if ((i & 32) != 0) {
                            if (th1Var instanceof wh1) {
                                obj = th1Var;
                            } else if (th1Var instanceof u60) {
                                obj = null;
                                for (th1 th1Var3 = ((u60) th1Var).w; th1Var3 != null; th1Var3 = th1Var3.m) {
                                    if (th1Var3 instanceof wh1) {
                                        obj = th1Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            wh1 wh1Var = (wh1) obj;
                            if (wh1Var != null) {
                                wh1Var.j();
                            }
                        }
                    }
                    th1Var = th1Var.l;
                }
            }
            r61VarC0 = r61VarC0.u();
            th1Var = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final kl0 R0() {
        pl0 pl0VarF;
        vn1 vn1Var;
        boolean z = this.u;
        kl0 kl0Var = kl0.j;
        if (!z || (pl0VarF = ((bl0) ((b7) sp0.f0(this)).getFocusOwner()).f()) == null) {
            return kl0Var;
        }
        if (this == pl0VarF) {
            return kl0.h;
        }
        if (pl0VarF.u) {
            if (!pl0VarF.h.u) {
                kz0.b("visitAncestors called on an unattached node");
            }
            th1 th1Var = pl0VarF.h.l;
            r61 r61VarC0 = sp0.c0(pl0VarF);
            while (r61VarC0 != null) {
                if ((((th1) r61VarC0.M.g).k & 1024) != 0) {
                    while (th1Var != null) {
                        if ((th1Var.j & 1024) != 0) {
                            th1 th1VarM = th1Var;
                            zk1 zk1Var = null;
                            while (th1VarM != null) {
                                if (th1VarM instanceof pl0) {
                                    if (this == ((pl0) th1VarM)) {
                                        return kl0.i;
                                    }
                                } else if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                    int i = 0;
                                    for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                        if ((th1Var2.j & 1024) != 0) {
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
                        th1Var = th1Var.l;
                    }
                }
                r61VarC0 = r61VarC0.u();
                th1Var = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
            }
        }
        return kl0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void S0() {
        int iOrdinal = R0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                c80.s();
                return;
            }
        }
        o72 o72Var = new o72();
        s11.S(this, new t6(5, o72Var, this));
        Object obj = o72Var.i;
        if (obj == null) {
            t11.S("focusProperties");
            throw null;
        }
        if (((dl0) obj).c()) {
            return;
        }
        ((bl0) ((b7) sp0.f0(this)).getFocusOwner()).b(8, true, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean T0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return O0().a ? M0(i) : dd3.f(this, i, new y6(i, 4));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.a61
    public final void q(c61 c61Var) {
    }
}
