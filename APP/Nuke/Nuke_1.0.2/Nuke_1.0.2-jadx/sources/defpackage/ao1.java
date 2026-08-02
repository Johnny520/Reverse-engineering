package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ao1 {
    public static final gk1 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        gk1 gk1Var = hs1.a;
        a = new gk1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(th1 th1Var, int i, int i2) {
        if (!(th1Var instanceof u60)) {
            b(th1Var, i & th1Var.j, i2);
            return;
        }
        u60 u60Var = (u60) th1Var;
        int i3 = u60Var.v;
        b(th1Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (th1 th1Var2 = u60Var.w; th1Var2 != null; th1Var2 = th1Var2.m) {
            a(th1Var2, i4, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: fl0 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: th1 */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(th1 th1Var, int i, int i2) {
        if (i2 != 0 || th1Var.B0()) {
            if ((i & 2) != 0 && (th1Var instanceof j61)) {
                gf1.A((j61) th1Var);
                if (i2 == 2) {
                    sp0.Z(th1Var, 2).e1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                sp0.c0(th1Var).E();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                sp0.c0(th1Var).U(false);
            }
            if ((i & 256) != 0 && (th1Var instanceof dq0)) {
                if (i2 == 1) {
                    r61 r61VarC0 = sp0.c0(th1Var);
                    r61VarC0.a0(r61VarC0.W + 1);
                } else if (i2 == 2) {
                    sp0.c0(th1Var).a0(r0.W - 1);
                }
                if (i2 != 2) {
                    r61 r61VarC02 = sp0.c0(th1Var);
                    if (r61VarC02.W != 0 && !r61VarC02.p() && !r61VarC02.q() && !r61VarC02.V) {
                        b7 b7Var = (b7) u61.a(r61VarC02);
                        dq1 dq1Var = b7Var.g0.e;
                        dq1Var.getClass();
                        if (r61VarC02.W > 0) {
                            ((zk1) dq1Var.i).b(r61VarC02);
                            r61VarC02.V = true;
                        }
                        b7Var.G(null);
                    }
                }
            }
            if ((i & 4) != 0 && (th1Var instanceof mc0)) {
                ci0.M((mc0) th1Var);
            }
            if ((i & 8) != 0 && (th1Var instanceof on2)) {
                sp0.c0(th1Var).y = true;
            }
            if ((i & 64) != 0 && (th1Var instanceof ox1)) {
                v61 v61Var = sp0.c0((ox1) th1Var).N;
                v61Var.p.w = true;
                qd1 qd1Var = v61Var.q;
                if (qd1Var != null) {
                    qd1Var.C = true;
                }
            }
            if ((i & 2048) != 0 && (th1Var instanceof fl0)) {
                fl0 fl0Var = (fl0) th1Var;
                gp.b = null;
                fl0Var.W(gp.a);
                if (gp.b != null) {
                    th1 th1Var2 = (th1) fl0Var;
                    if (!th1Var2.h.u) {
                        kz0.b("visitChildren called on an unattached node");
                    }
                    zk1 zk1Var = new zk1(new th1[16]);
                    th1 th1Var3 = th1Var2.h;
                    th1 th1Var4 = th1Var3.m;
                    if (th1Var4 == null) {
                        sp0.k(zk1Var, th1Var3);
                    } else {
                        zk1Var.b(th1Var4);
                    }
                    while (true) {
                        int i3 = zk1Var.j;
                        if (i3 == 0) {
                            break;
                        }
                        th1 th1VarM = (th1) zk1Var.k(i3 - 1);
                        if ((th1VarM.k & 1024) == 0) {
                            sp0.k(zk1Var, th1VarM);
                        } else {
                            while (true) {
                                if (th1VarM == null) {
                                    break;
                                }
                                if ((th1VarM.j & 1024) != 0) {
                                    zk1 zk1Var2 = null;
                                    while (th1VarM != null) {
                                        if (th1VarM instanceof pl0) {
                                            pl0 pl0Var = (pl0) th1VarM;
                                            wk0 wk0Var = ((bl0) ((b7) sp0.f0(pl0Var)).getFocusOwner()).d;
                                            if (wk0Var.c.a(pl0Var)) {
                                                wk0Var.a();
                                            }
                                        } else if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                            int i4 = 0;
                                            for (th1 th1Var5 = ((u60) th1VarM).w; th1Var5 != null; th1Var5 = th1Var5.m) {
                                                if ((th1Var5.j & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        th1VarM = th1Var5;
                                                    } else {
                                                        if (zk1Var2 == null) {
                                                            zk1Var2 = new zk1(new th1[16]);
                                                        }
                                                        if (th1VarM != null) {
                                                            zk1Var2.b(th1VarM);
                                                            th1VarM = null;
                                                        }
                                                        zk1Var2.b(th1Var5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        th1VarM = sp0.m(zk1Var2);
                                    }
                                } else {
                                    th1VarM = th1VarM.m;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (th1Var instanceof pk0)) {
                pk0 pk0Var = (pk0) th1Var;
                wk0 wk0Var2 = ((bl0) ((b7) sp0.f0(pk0Var)).getFocusOwner()).d;
                if (wk0Var2.d.a(pk0Var)) {
                    wk0Var2.a();
                }
            }
            if ((i & 2097152) != 0 && (th1Var instanceof wy0) && i2 == 2) {
                ((wy0) th1Var).C();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(th1 th1Var) {
        if (!th1Var.u) {
            kz0.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(th1Var, -1, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int d(sh1 sh1Var) {
        int i = sh1Var instanceof h61 ? 3 : 1;
        if (sh1Var instanceof lc0) {
            i |= 4;
        }
        if (sh1Var instanceof mn2) {
            i |= 8;
        }
        if (sh1Var instanceof u12) {
            i |= 16;
        }
        return sh1Var instanceof jm ? 524288 | i : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int e(th1 th1Var) {
        int i = th1Var.j;
        if (i != 0) {
            return i;
        }
        Class<?> cls = th1Var.getClass();
        gk1 gk1Var = a;
        int iD = gk1Var.d(cls);
        if (iD >= 0) {
            return gk1Var.c[iD];
        }
        int i2 = th1Var instanceof j61 ? 3 : 1;
        if (th1Var instanceof mc0) {
            i2 |= 4;
        }
        if (th1Var instanceof on2) {
            i2 |= 8;
        }
        if (th1Var instanceof r12) {
            i2 |= 16;
        }
        if (th1Var instanceof wh1) {
            i2 |= 32;
        }
        if (th1Var instanceof ox1) {
            i2 |= 64;
        }
        if (th1Var instanceof a61) {
            i2 |= 4194432;
        } else if (th1Var instanceof qf1) {
            i2 |= 128;
        }
        if (th1Var instanceof dq0) {
            i2 |= 256;
        }
        if (th1Var instanceof pl0) {
            i2 |= 1024;
        }
        if (th1Var instanceof fl0) {
            i2 |= 2048;
        }
        if (th1Var instanceof pk0) {
            i2 |= 4096;
        }
        if (th1Var instanceof g51) {
            i2 |= 8192;
        }
        if (th1Var instanceof o6) {
            i2 |= 16384;
        }
        if (th1Var instanceof gy) {
            i2 |= AIChatConfig.MaxOutputTokens;
        }
        if (th1Var instanceof d43) {
            i2 |= 262144;
        }
        if (th1Var instanceof jm) {
            i2 |= 524288;
        }
        if (th1Var instanceof wy0) {
            i2 |= 2097152;
        }
        if (th1Var instanceof t71) {
            i2 |= 8388608;
        }
        gk1Var.g(i2, cls);
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int f(th1 th1Var) {
        if (!(th1Var instanceof u60)) {
            return e(th1Var);
        }
        u60 u60Var = (u60) th1Var;
        int iF = u60Var.v;
        for (th1 th1Var2 = u60Var.w; th1Var2 != null; th1Var2 = th1Var2.m) {
            iF |= f(th1Var2);
        }
        return iF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
