package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rj0 {

    /* JADX INFO: renamed from: a */
    public static final ch0 f5425a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ch0 ch0Var = jk0.f2910a;
        f5425a = new ch0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m3510a(oe0 oe0Var, int i, int i2) {
        if (!(oe0Var instanceof AbstractC0731sm)) {
            m3511b(oe0Var, i & oe0Var.f4531f, i2);
            return;
        }
        AbstractC0731sm abstractC0731sm = (AbstractC0731sm) oe0Var;
        int i3 = abstractC0731sm.f5781r;
        m3511b(oe0Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (oe0 oe0Var2 = abstractC0731sm.f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
            m3510a(oe0Var2, i4, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: oe0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m3511b(oe0 oe0Var, int i, int i2) {
        if (i2 != 0 || oe0Var.mo548l0()) {
            if ((i & 2) != 0 && (oe0Var instanceof r50)) {
                v50.m4407m((r50) oe0Var);
                if (i2 == 2) {
                    pf1.m3037O(oe0Var, 2).m3279T0();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                pf1.m3039Q(oe0Var).m269E();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                pf1.m3039Q(oe0Var).m285W(false);
            }
            if ((i & 256) != 0 && (oe0Var instanceof InterfaceC0529nx)) {
                if (i2 == 1) {
                    b60 b60VarM3039Q = pf1.m3039Q(oe0Var);
                    b60VarM3039Q.m292c0(b60VarM3039Q.f403Q + 1);
                } else if (i2 == 2) {
                    pf1.m3039Q(oe0Var).m292c0(r0.f403Q - 1);
                }
                if (i2 != 2) {
                    b60 b60VarM3039Q2 = pf1.m3039Q(oe0Var);
                    if (b60VarM3039Q2.f403Q != 0 && !b60VarM3039Q2.m309p() && !b60VarM3039Q2.m311r() && !b60VarM3039Q2.f402P) {
                        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = (ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60VarM3039Q2);
                        C0111d c0111d = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6942V.f6197e;
                        c0111d.getClass();
                        if (b60VarM3039Q2.f403Q > 0) {
                            ((sh0) c0111d.f919e).m4072b(b60VarM3039Q2);
                            b60VarM3039Q2.f402P = true;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC0875w3.m4846C(null);
                    }
                }
            }
            if ((i & 4) != 0 && (oe0Var instanceof InterfaceC0775tq)) {
                AbstractC0398kl.m1932r((InterfaceC0775tq) oe0Var);
            }
            if ((i & 8) != 0 && (oe0Var instanceof vz0)) {
                pf1.m3039Q(oe0Var).f422u = true;
            }
            if ((i & 64) != 0 && (oe0Var instanceof hp0)) {
                f60 f60Var = pf1.m3039Q((hp0) oe0Var).f396J;
                f60Var.f1607p.f7105s = true;
                ec0 ec0Var = f60Var.f1608q;
                if (ec0Var != null) {
                    ec0Var.f1393y = true;
                }
            }
            if ((i & 2048) != 0 && (oe0Var instanceof C0795u9)) {
                ne0 ne0Var = ((C0795u9) oe0Var).f6169r;
                w10.m4824b("applyFocusProperties called on wrong node");
                ne0Var.getClass();
                C0921xc.m5123d();
                return;
            }
            if ((i & 4096) == 0 || !(oe0Var instanceof C0795u9)) {
                return;
            }
            C0795u9 c0795u9 = (C0795u9) oe0Var;
            C0816uu c0816uu = ((C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(c0795u9)).getFocusOwner()).f7999d;
            if (c0816uu.f6310d.m1890a(c0795u9)) {
                c0816uu.m4355a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m3512c(oe0 oe0Var) {
        if (!oe0Var.f4542q) {
            w10.m4824b("autoInvalidateUpdatedNode called on unattached node");
        }
        m3510a(oe0Var, -1, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final int m3513d(oe0 oe0Var) {
        int i = oe0Var.f4531f;
        if (i != 0) {
            return i;
        }
        Class<?> cls = oe0Var.getClass();
        ch0 ch0Var = f5425a;
        int iM534d = ch0Var.m534d(cls);
        if (iM534d >= 0) {
            return ch0Var.f812c[iM534d];
        }
        int i2 = oe0Var instanceof r50 ? 3 : 1;
        if (oe0Var instanceof InterfaceC0775tq) {
            i2 |= 4;
        }
        if (oe0Var instanceof vz0) {
            i2 |= 8;
        }
        if (oe0Var instanceof qr0) {
            i2 |= 16;
        }
        if (oe0Var instanceof re0) {
            i2 |= 32;
        }
        if (oe0Var instanceof hp0) {
            i2 |= 64;
        }
        if (oe0Var instanceof gl0) {
            i2 |= 128;
        } else if (oe0Var instanceof g50) {
            i2 |= 4194432;
        }
        if (oe0Var instanceof InterfaceC0529nx) {
            i2 |= 256;
        }
        if (oe0Var instanceof C0149dv) {
            i2 |= 1024;
        }
        boolean z = oe0Var instanceof C0795u9;
        if (z) {
            i2 |= 2048;
        }
        if (z) {
            i2 |= 4096;
        }
        if (oe0Var instanceof a50) {
            i2 |= 8192;
        }
        if (oe0Var instanceof C0341j3) {
            i2 |= 16384;
        }
        if (oe0Var instanceof InterfaceC1005zi) {
            i2 |= 32768;
        }
        if (oe0Var instanceof h91) {
            i2 |= 262144;
        }
        if (oe0Var instanceof InterfaceC0123db) {
            i2 |= 524288;
        }
        if (oe0Var instanceof q10) {
            i2 |= 2097152;
        }
        if (oe0Var instanceof e70) {
            i2 |= 8388608;
        }
        ch0Var.m537g(i2, cls);
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m3514e(oe0 oe0Var) {
        if (!(oe0Var instanceof AbstractC0731sm)) {
            return m3513d(oe0Var);
        }
        AbstractC0731sm abstractC0731sm = (AbstractC0731sm) oe0Var;
        int iM3514e = abstractC0731sm.f5781r;
        for (oe0 oe0Var2 = abstractC0731sm.f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
            iM3514e |= m3514e(oe0Var2);
        }
        return iM3514e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final boolean m3515f(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
