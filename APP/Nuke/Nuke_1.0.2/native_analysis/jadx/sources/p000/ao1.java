package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ao1 {

    /* JADX INFO: renamed from: a */
    public static final gk1 f314a;

    static {
        gk1 gk1Var = hs1.f4124a;
        f314a = new gk1();
    }

    /* JADX INFO: renamed from: a */
    public static final void m238a(th1 th1Var, int i, int i2) {
        if (!(th1Var instanceof u60)) {
            m239b(th1Var, i & th1Var.f10759j, i2);
            return;
        }
        u60 u60Var = (u60) th1Var;
        int i3 = u60Var.f11115v;
        m239b(th1Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (th1 th1Var2 = u60Var.f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
            m238a(th1Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m239b(th1 th1Var, int i, int i2) {
        if (i2 != 0 || th1Var.mo210B0()) {
            if ((i & 2) != 0 && (th1Var instanceof j61)) {
                gf1.m1853A((j61) th1Var);
                if (i2 == 2) {
                    sp0.m4927Z(th1Var, 2).m6462e1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                sp0.m4933c0(th1Var).m4347E();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                sp0.m4933c0(th1Var).m4362U(false);
            }
            if ((i & 256) != 0 && (th1Var instanceof dq0)) {
                if (i2 == 1) {
                    r61 r61VarM4933c0 = sp0.m4933c0(th1Var);
                    r61VarM4933c0.m4366a0(r61VarM4933c0.f9382W + 1);
                } else if (i2 == 2) {
                    sp0.m4933c0(th1Var).m4366a0(r0.f9382W - 1);
                }
                if (i2 != 2) {
                    r61 r61VarM4933c02 = sp0.m4933c0(th1Var);
                    if (r61VarM4933c02.f9382W != 0 && !r61VarM4933c02.m4384p() && !r61VarM4933c02.m4385q() && !r61VarM4933c02.f9381V) {
                        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = (ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61VarM4933c02);
                        dq1 dq1Var = viewTreeObserverOnGlobalLayoutListenerC0045b7.f675g0.f5494e;
                        dq1Var.getClass();
                        if (r61VarM4933c02.f9382W > 0) {
                            ((zk1) dq1Var.f2147i).m6423b(r61VarM4933c02);
                            r61VarM4933c02.f9381V = true;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC0045b7.m460G(null);
                    }
                }
            }
            if ((i & 4) != 0 && (th1Var instanceof mc0)) {
                ci0.m788M((mc0) th1Var);
            }
            if ((i & 8) != 0 && (th1Var instanceof on2)) {
                sp0.m4933c0(th1Var).f9401y = true;
            }
            if ((i & 64) != 0 && (th1Var instanceof ox1)) {
                v61 v61Var = sp0.m4933c0((ox1) th1Var).f9373N;
                v61Var.f11795p.f6628w = true;
                qd1 qd1Var = v61Var.f11796q;
                if (qd1Var != null) {
                    qd1Var.f8901C = true;
                }
            }
            if ((i & 2048) != 0 && (th1Var instanceof fl0)) {
                fl0 fl0Var = (fl0) th1Var;
                C0248gp.f3645b = null;
                fl0Var.mo1661W(C0248gp.f3644a);
                if (C0248gp.f3645b != null) {
                    th1 th1Var2 = (th1) fl0Var;
                    if (!th1Var2.f10757h.f10770u) {
                        kz0.m2764b("visitChildren called on an unattached node");
                    }
                    zk1 zk1Var = new zk1(new th1[16]);
                    th1 th1Var3 = th1Var2.f10757h;
                    th1 th1Var4 = th1Var3.f10762m;
                    if (th1Var4 == null) {
                        sp0.m4948k(zk1Var, th1Var3);
                    } else {
                        zk1Var.m6423b(th1Var4);
                    }
                    while (true) {
                        int i3 = zk1Var.f13936j;
                        if (i3 == 0) {
                            break;
                        }
                        th1 th1VarM4952m = (th1) zk1Var.m6432k(i3 - 1);
                        if ((th1VarM4952m.f10760k & 1024) == 0) {
                            sp0.m4948k(zk1Var, th1VarM4952m);
                        } else {
                            while (true) {
                                if (th1VarM4952m == null) {
                                    break;
                                }
                                if ((th1VarM4952m.f10759j & 1024) != 0) {
                                    zk1 zk1Var2 = null;
                                    while (th1VarM4952m != null) {
                                        if (th1VarM4952m instanceof pl0) {
                                            pl0 pl0Var = (pl0) th1VarM4952m;
                                            wk0 wk0Var = ((bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(pl0Var)).getFocusOwner()).f927d;
                                            if (wk0Var.f12553c.m4882a(pl0Var)) {
                                                wk0Var.m5940a();
                                            }
                                        } else if ((th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                                            int i4 = 0;
                                            for (th1 th1Var5 = ((u60) th1VarM4952m).f11116w; th1Var5 != null; th1Var5 = th1Var5.f10762m) {
                                                if ((th1Var5.f10759j & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        th1VarM4952m = th1Var5;
                                                    } else {
                                                        if (zk1Var2 == null) {
                                                            zk1Var2 = new zk1(new th1[16]);
                                                        }
                                                        if (th1VarM4952m != null) {
                                                            zk1Var2.m6423b(th1VarM4952m);
                                                            th1VarM4952m = null;
                                                        }
                                                        zk1Var2.m6423b(th1Var5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        th1VarM4952m = sp0.m4952m(zk1Var2);
                                    }
                                } else {
                                    th1VarM4952m = th1VarM4952m.f10762m;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (th1Var instanceof pk0)) {
                pk0 pk0Var = (pk0) th1Var;
                wk0 wk0Var2 = ((bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(pk0Var)).getFocusOwner()).f927d;
                if (wk0Var2.f12554d.m4882a(pk0Var)) {
                    wk0Var2.m5940a();
                }
            }
            if ((i & 2097152) != 0 && (th1Var instanceof wy0) && i2 == 2) {
                ((wy0) th1Var).mo211C();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m240c(th1 th1Var) {
        if (!th1Var.f10770u) {
            kz0.m2764b("autoInvalidateUpdatedNode called on unattached node");
        }
        m238a(th1Var, -1, 0);
    }

    /* JADX INFO: renamed from: d */
    public static final int m241d(sh1 sh1Var) {
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
        return sh1Var instanceof InterfaceC0355jm ? 524288 | i : i;
    }

    /* JADX INFO: renamed from: e */
    public static final int m242e(th1 th1Var) {
        int i = th1Var.f10759j;
        if (i != 0) {
            return i;
        }
        Class<?> cls = th1Var.getClass();
        gk1 gk1Var = f314a;
        int iM1933d = gk1Var.m1933d(cls);
        if (iM1933d >= 0) {
            return gk1Var.f3554c[iM1933d];
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
        if (th1Var instanceof C0530o6) {
            i2 |= 16384;
        }
        if (th1Var instanceof InterfaceC0257gy) {
            i2 |= AIChatConfig.MaxOutputTokens;
        }
        if (th1Var instanceof d43) {
            i2 |= 262144;
        }
        if (th1Var instanceof InterfaceC0355jm) {
            i2 |= 524288;
        }
        if (th1Var instanceof wy0) {
            i2 |= 2097152;
        }
        if (th1Var instanceof t71) {
            i2 |= 8388608;
        }
        gk1Var.m1936g(i2, cls);
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public static final int m243f(th1 th1Var) {
        if (!(th1Var instanceof u60)) {
            return m242e(th1Var);
        }
        u60 u60Var = (u60) th1Var;
        int iM243f = u60Var.f11115v;
        for (th1 th1Var2 = u60Var.f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
            iM243f |= m243f(th1Var2);
        }
        return iM243f;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m244g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
