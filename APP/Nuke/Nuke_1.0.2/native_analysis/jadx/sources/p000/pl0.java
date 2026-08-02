package p000;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pl0 extends th1 implements InterfaceC0257gy, a61, os1, wh1, t60 {

    /* JADX INFO: renamed from: v */
    public final boolean f8385v;

    /* JADX INFO: renamed from: w */
    public final mn0 f8386w;

    /* JADX INFO: renamed from: x */
    public boolean f8387x;

    /* JADX INFO: renamed from: y */
    public boolean f8388y;

    /* JADX INFO: renamed from: z */
    public final int f8389z;

    public pl0(int i, mn0 mn0Var, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        mn0Var = (i2 & 4) != 0 ? null : mn0Var;
        this.f8385v = z;
        this.f8386w = mn0Var;
        this.f8389z = i;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        int iOrdinal = m3876R0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                yk0 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(this)).getFocusOwner();
                pl0 pl0VarM4540a0 = rp0.m4540a0(this);
                if (pl0VarM4540a0 == null || !pl0VarM4540a0.f8385v) {
                    return;
                }
                bl0 bl0Var = (bl0) focusOwner;
                bl0Var.f924a.m459F();
                bl0Var.f927d.m5940a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                c80.m675s();
                return;
            }
        }
        bl0 bl0Var2 = (bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(this)).getFocusOwner();
        bl0Var2.m557b(8, true, false);
        if (this.f8385v) {
            bl0Var2.f924a.m459F();
        }
        bl0Var2.f927d.m5940a();
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: G0 */
    public final void mo1486G0() {
        if (m3876R0().m2718a()) {
            ((bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(this)).getFocusOwner()).m557b(8, true, true);
        }
    }

    @Override // p000.os1
    /* JADX INFO: renamed from: L */
    public final void mo1847L() {
        m3877S0();
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m3871M0(int i) {
        int iOrdinal = qp0.m4229K(this, i).ordinal();
        if (iOrdinal == 0) {
            return qp0.m4230L(this);
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
        c80.m675s();
        return false;
    }

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
    /* JADX INFO: renamed from: N0 */
    public final void m3872N0(kl0 kl0Var, kl0 kl0Var2) {
        vn1 vn1Var;
        mn0 mn0Var;
        bl0 bl0Var = (bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(this)).getFocusOwner();
        pl0 pl0VarM561f = bl0Var.m561f();
        if (!kl0Var.equals(kl0Var2) && (mn0Var = this.f8386w) != null) {
            mn0Var.mo12g(kl0Var, kl0Var2);
        }
        th1 th1Var = this.f10757h;
        if (!th1Var.f10770u) {
            kz0.m2764b("visitAncestors called on an unattached node");
        }
        th1 th1Var2 = this.f10757h;
        r61 r61VarM4933c0 = sp0.m4933c0(this);
        while (r61VarM4933c0 != null) {
            if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 5120) != 0) {
                while (th1Var2 != null) {
                    int i = th1Var2.f10759j;
                    if ((i & 5120) != 0) {
                        if (th1Var2 != th1Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? M4952m = th1Var2;
                            ?? zk1Var = 0;
                            while (M4952m != 0) {
                                if (M4952m instanceof pk0) {
                                    pk0 pk0Var = (pk0) M4952m;
                                    if (pl0VarM561f == bl0Var.m561f()) {
                                        pk0Var.mo299Z(kl0Var2);
                                    }
                                } else if ((M4952m.f10759j & 4096) != 0 && (M4952m instanceof u60)) {
                                    th1 th1Var3 = ((u60) M4952m).f11116w;
                                    int i2 = 0;
                                    M4952m = M4952m;
                                    zk1Var = zk1Var;
                                    while (th1Var3 != null) {
                                        if ((th1Var3.f10759j & 4096) != 0) {
                                            i2++;
                                            zk1Var = zk1Var;
                                            if (i2 == 1) {
                                                M4952m = th1Var3;
                                            } else {
                                                if (zk1Var == 0) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (M4952m != 0) {
                                                    zk1Var.m6423b(M4952m);
                                                    M4952m = 0;
                                                }
                                                zk1Var.m6423b(th1Var3);
                                            }
                                        }
                                        th1Var3 = th1Var3.f10762m;
                                        M4952m = M4952m;
                                        zk1Var = zk1Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M4952m = sp0.m4952m(zk1Var);
                            }
                        }
                    }
                    th1Var2 = th1Var2.f10761l;
                }
            }
            r61VarM4933c0 = r61VarM4933c0.m4389u();
            th1Var2 = (r61VarM4933c0 == null || (vn1Var = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
        }
    }

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
    /* JADX INFO: renamed from: O0 */
    public final el0 m3873O0() {
        boolean z;
        vn1 vn1Var;
        el0 el0Var = new el0();
        el0Var.f2484a = true;
        gl0 gl0Var = gl0.f3569b;
        el0Var.f2485b = gl0Var;
        el0Var.f2486c = gl0Var;
        el0Var.f2487d = gl0Var;
        el0Var.f2488e = gl0Var;
        el0Var.f2489f = gl0Var;
        el0Var.f2490g = gl0Var;
        el0Var.f2491h = gl0Var;
        el0Var.f2492i = gl0Var;
        el0Var.f2493j = C0799v6.f11759L;
        el0Var.f2494k = C0799v6.f11760M;
        el0Var.f2495l = gd3.f3445w;
        int i = this.f8389z;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((uz0) ((wz0) ((vz0) p40.m3733p(this, AbstractC0441ly.f6387m))).f12740a.getValue()).f11566a == 1);
        } else {
            if (i != 2) {
                C0676s.m4653l("Unknown Focusability");
                return null;
            }
            z = false;
        }
        el0Var.f2484a = z;
        th1 th1Var = this.f10757h;
        if (!th1Var.f10770u) {
            kz0.m2764b("visitAncestors called on an unattached node");
        }
        th1 th1Var2 = this.f10757h;
        r61 r61VarM4933c0 = sp0.m4933c0(this);
        loop0: while (r61VarM4933c0 != null) {
            if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 3072) != 0) {
                while (th1Var2 != null) {
                    int i2 = th1Var2.f10759j;
                    if ((i2 & 3072) != 0) {
                        if (th1Var2 != th1Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? zk1Var = 0;
                            ?? M4952m = th1Var2;
                            while (M4952m != 0) {
                                if (M4952m instanceof fl0) {
                                    ((fl0) M4952m).mo1661W(el0Var);
                                } else if ((M4952m.f10759j & 2048) != 0 && (M4952m instanceof u60)) {
                                    th1 th1Var3 = ((u60) M4952m).f11116w;
                                    int i3 = 0;
                                    M4952m = M4952m;
                                    zk1Var = zk1Var;
                                    while (th1Var3 != null) {
                                        if ((th1Var3.f10759j & 2048) != 0) {
                                            i3++;
                                            zk1Var = zk1Var;
                                            if (i3 == 1) {
                                                M4952m = th1Var3;
                                            } else {
                                                if (zk1Var == 0) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (M4952m != 0) {
                                                    zk1Var.m6423b(M4952m);
                                                    M4952m = 0;
                                                }
                                                zk1Var.m6423b(th1Var3);
                                            }
                                        }
                                        th1Var3 = th1Var3.f10762m;
                                        M4952m = M4952m;
                                        zk1Var = zk1Var;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                M4952m = sp0.m4952m(zk1Var);
                            }
                        }
                    }
                    th1Var2 = th1Var2.f10761l;
                }
            }
            r61VarM4933c0 = r61VarM4933c0.m4389u();
            th1Var2 = (r61VarM4933c0 == null || (vn1Var = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
        }
        return el0Var;
    }

    /* JADX INFO: renamed from: P0 */
    public final o62 m3874P0(c61 c61Var) {
        o62 o62Var = m3873O0().f2495l;
        return o62Var != gd3.f3445w ? c61Var == null ? o62Var : o62Var.m3521i(c61Var.mo642D(sp0.m4931b0(this), 0L)) : c61Var != null ? c61Var.mo644J(sp0.m4931b0(this), false) : AbstractC0179eu.m1467q(0L, s11.m4715q0(sp0.m4931b0(this).f10440j));
    }

    /* JADX INFO: renamed from: Q0 */
    public final t71 m3875Q0() {
        vn1 vn1Var;
        Object obj;
        if (!this.f10757h.f10770u) {
            kz0.m2764b("visitAncestors called on an unattached node");
        }
        th1 th1Var = this.f10757h.f10761l;
        r61 r61VarM4933c0 = sp0.m4933c0(this);
        while (true) {
            if (r61VarM4933c0 == null) {
                break;
            }
            if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 8388640) != 0) {
                while (th1Var != null) {
                    int i = th1Var.f10759j;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(th1Var instanceof t71)) {
                                if (th1Var instanceof u60) {
                                    th1Var = null;
                                    for (th1 th1Var2 = ((u60) th1Var).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
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
                                for (th1 th1Var3 = ((u60) th1Var).f11116w; th1Var3 != null; th1Var3 = th1Var3.f10762m) {
                                    if (th1Var3 instanceof wh1) {
                                        obj = th1Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            wh1 wh1Var = (wh1) obj;
                            if (wh1Var != null) {
                                wh1Var.mo3567j();
                            }
                        }
                    }
                    th1Var = th1Var.f10761l;
                }
            }
            r61VarM4933c0 = r61VarM4933c0.m4389u();
            th1Var = (r61VarM4933c0 == null || (vn1Var = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
        }
        return null;
    }

    /* JADX INFO: renamed from: R0 */
    public final kl0 m3876R0() {
        pl0 pl0VarM561f;
        vn1 vn1Var;
        boolean z = this.f10770u;
        kl0 kl0Var = kl0.f5628j;
        if (!z || (pl0VarM561f = ((bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(this)).getFocusOwner()).m561f()) == null) {
            return kl0Var;
        }
        if (this == pl0VarM561f) {
            return kl0.f5626h;
        }
        if (pl0VarM561f.f10770u) {
            if (!pl0VarM561f.f10757h.f10770u) {
                kz0.m2764b("visitAncestors called on an unattached node");
            }
            th1 th1Var = pl0VarM561f.f10757h.f10761l;
            r61 r61VarM4933c0 = sp0.m4933c0(pl0VarM561f);
            while (r61VarM4933c0 != null) {
                if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 1024) != 0) {
                    while (th1Var != null) {
                        if ((th1Var.f10759j & 1024) != 0) {
                            th1 th1VarM4952m = th1Var;
                            zk1 zk1Var = null;
                            while (th1VarM4952m != null) {
                                if (th1VarM4952m instanceof pl0) {
                                    if (this == ((pl0) th1VarM4952m)) {
                                        return kl0.f5627i;
                                    }
                                } else if ((th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                                    int i = 0;
                                    for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                        if ((th1Var2.f10759j & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                th1VarM4952m = th1Var2;
                                            } else {
                                                if (zk1Var == null) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (th1VarM4952m != null) {
                                                    zk1Var.m6423b(th1VarM4952m);
                                                    th1VarM4952m = null;
                                                }
                                                zk1Var.m6423b(th1Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                th1VarM4952m = sp0.m4952m(zk1Var);
                            }
                        }
                        th1Var = th1Var.f10761l;
                    }
                }
                r61VarM4933c0 = r61VarM4933c0.m4389u();
                th1Var = (r61VarM4933c0 == null || (vn1Var = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
            }
        }
        return kl0Var;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m3877S0() {
        int iOrdinal = m3876R0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                c80.m675s();
                return;
            }
        }
        o72 o72Var = new o72();
        s11.m4674S(this, new C0723t6(5, o72Var, this));
        Object obj = o72Var.f7574i;
        if (obj == null) {
            t11.m5067S("focusProperties");
            throw null;
        }
        if (((dl0) obj).mo1054c()) {
            return;
        }
        ((bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(this)).getFocusOwner()).m557b(8, true, true);
    }

    /* JADX INFO: renamed from: T0 */
    public final boolean m3878T0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return m3873O0().f2484a ? m3871M0(i) : dd3.m998f(this, i, new C0912y6(i, 4));
        } finally {
            Trace.endSection();
        }
    }

    @Override // p000.a61
    /* JADX INFO: renamed from: q */
    public final void mo100q(c61 c61Var) {
    }
}
