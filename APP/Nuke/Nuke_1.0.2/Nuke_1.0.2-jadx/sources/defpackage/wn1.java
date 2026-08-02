package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wn1 implements xn1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0036 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0045 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x0002 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x0002 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x003f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [th1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [th1] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [th1] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.xn1
    public final boolean b(th1 th1Var) {
        ?? zk1Var = 0;
        while (true) {
            int i = 0;
            if (th1Var == 0) {
                return false;
            }
            if (th1Var instanceof r12) {
                ((r12) th1Var).t0();
            } else if ((th1Var.j & 16) != 0 && (th1Var instanceof u60)) {
                th1 th1Var2 = ((u60) th1Var).w;
                zk1Var = zk1Var;
                th1Var = th1Var;
                while (th1Var2 != null) {
                    if ((th1Var2.j & 16) != 0) {
                        i++;
                        zk1Var = zk1Var;
                        if (i == 1) {
                            th1Var = th1Var2;
                        } else {
                            if (zk1Var == 0) {
                                zk1Var = new zk1(new th1[16]);
                            }
                            if (th1Var != 0) {
                                zk1Var.b(th1Var);
                                th1Var = 0;
                            }
                            zk1Var.b(th1Var2);
                        }
                    }
                    th1Var2 = th1Var2.m;
                    zk1Var = zk1Var;
                    th1Var = th1Var;
                }
                if (i == 1) {
                }
            }
            th1Var = sp0.m(zk1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xn1
    public final int d() {
        return 16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xn1
    public final void l(r61 r61Var, long j, xs0 xs0Var, int i, boolean z) {
        r61Var.z(j, xs0Var, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x0074 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x0038 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x0038 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x007d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [th1] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [th1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.xn1
    public final boolean o(xs0 xs0Var, r61 r61Var) {
        zn1 zn1Var = (zn1) r61Var.M.e;
        zn1Var.getClass();
        th1 th1VarU0 = zn1Var.U0(ao1.g(16));
        if (th1VarU0 != null && th1VarU0.u) {
            if (!th1VarU0.h.u) {
                kz0.b("visitLocalDescendants called on an unattached node");
            }
            th1 th1Var = th1VarU0.h;
            if ((th1Var.k & 16) != 0) {
                while (th1Var != null) {
                    if ((th1Var.j & 16) != 0) {
                        ?? M = th1Var;
                        ?? zk1Var = 0;
                        while (M != 0) {
                            if (M instanceof r12) {
                                if (((r12) M).b0()) {
                                    xs0Var.j = xs0Var.h.b - 1;
                                    return true;
                                }
                            } else if ((M.j & 16) != 0 && (M instanceof u60)) {
                                th1 th1Var2 = ((u60) M).w;
                                int i = 0;
                                M = M;
                                zk1Var = zk1Var;
                                while (th1Var2 != null) {
                                    if ((th1Var2.j & 16) != 0) {
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
                    th1Var = th1Var.m;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xn1
    public final boolean r(r61 r61Var) {
        return true;
    }
}
