package p000;

import android.os.Trace;

/* JADX INFO: renamed from: dv */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0149dv extends oe0 implements InterfaceC1005zi, g50, mk0, re0, InterfaceC0694rm {

    /* JADX INFO: renamed from: r */
    public final InterfaceC0904ww f1194r;

    /* JADX INFO: renamed from: s */
    public boolean f1195s;

    /* JADX INFO: renamed from: t */
    public boolean f1196t;

    /* JADX INFO: renamed from: u */
    public final int f1197u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0149dv(int i, InterfaceC0904ww interfaceC0904ww, int i2) {
        this.f1194r = (i2 & 4) != 0 ? null : interfaceC0904ww;
        this.f1197u = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public final e70 m726A0() {
        mj0 mj0Var;
        Object obj;
        if (!this.f4529d.f4542q) {
            w10.m4824b("visitAncestors called on an unattached node");
        }
        oe0 oe0Var = this.f4529d.f4533h;
        b60 b60VarM3039Q = pf1.m3039Q(this);
        while (true) {
            if (b60VarM3039Q == null) {
                break;
            }
            if ((b60VarM3039Q.f395I.f3998f.f4532g & 8388640) != 0) {
                while (oe0Var != null) {
                    int i = oe0Var.f4531f;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(oe0Var instanceof e70)) {
                                if (oe0Var instanceof AbstractC0731sm) {
                                    oe0Var = null;
                                    for (oe0 oe0Var2 = ((AbstractC0731sm) oe0Var).f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
                                        if (oe0Var2 instanceof e70) {
                                            oe0Var = oe0Var2;
                                        }
                                    }
                                } else {
                                    oe0Var = null;
                                }
                            }
                            e70 e70Var = (e70) oe0Var;
                            if (e70Var != null) {
                                return e70Var;
                            }
                        } else if ((i & 32) != 0) {
                            if (oe0Var instanceof re0) {
                                obj = oe0Var;
                            } else if (oe0Var instanceof AbstractC0731sm) {
                                obj = null;
                                for (oe0 oe0Var3 = ((AbstractC0731sm) oe0Var).f5782s; oe0Var3 != null; oe0Var3 = oe0Var3.f4534i) {
                                    if (oe0Var3 instanceof re0) {
                                        obj = oe0Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            re0 re0Var = (re0) obj;
                            if (re0Var != null) {
                                re0Var.mo3502f();
                            }
                        }
                    }
                    oe0Var = oe0Var.f4533h;
                }
            }
            b60VarM3039Q = b60VarM3039Q.m315v();
            oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public final EnumC0106cv m727B0() {
        C0149dv c0149dvM5612f;
        mj0 mj0Var;
        boolean z = this.f4542q;
        EnumC0106cv enumC0106cv = EnumC0106cv.f895f;
        if (!z || (c0149dvM5612f = ((C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(this)).getFocusOwner()).m5612f()) == null) {
            return enumC0106cv;
        }
        if (this == c0149dvM5612f) {
            return EnumC0106cv.f893d;
        }
        if (c0149dvM5612f.f4542q) {
            if (!c0149dvM5612f.f4529d.f4542q) {
                w10.m4824b("visitAncestors called on an unattached node");
            }
            oe0 oe0Var = c0149dvM5612f.f4529d.f4533h;
            b60 b60VarM3039Q = pf1.m3039Q(c0149dvM5612f);
            while (b60VarM3039Q != null) {
                if ((b60VarM3039Q.f395I.f3998f.f4532g & 1024) != 0) {
                    while (oe0Var != null) {
                        if ((oe0Var.f4531f & 1024) != 0) {
                            oe0 oe0VarM3050f = oe0Var;
                            sh0 sh0Var = null;
                            while (oe0VarM3050f != null) {
                                if (oe0VarM3050f instanceof C0149dv) {
                                    if (this == ((C0149dv) oe0VarM3050f)) {
                                        return EnumC0106cv.f894e;
                                    }
                                } else if ((oe0VarM3050f.f4531f & 1024) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                    int i = 0;
                                    for (oe0 oe0Var2 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
                                        if ((oe0Var2.f4531f & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                oe0VarM3050f = oe0Var2;
                                            } else {
                                                if (sh0Var == null) {
                                                    sh0Var = new sh0(new oe0[16]);
                                                }
                                                if (oe0VarM3050f != null) {
                                                    sh0Var.m4072b(oe0VarM3050f);
                                                    oe0VarM3050f = null;
                                                }
                                                sh0Var.m4072b(oe0Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                oe0VarM3050f = pf1.m3050f(sh0Var);
                            }
                        }
                        oe0Var = oe0Var.f4533h;
                    }
                }
                b60VarM3039Q = b60VarM3039Q.m315v();
                oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
            }
        }
        return enumC0106cv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public final void m728C0() {
        int iOrdinal = m727B0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                C0921xc.m5129j();
                return;
            }
        }
        zt0 zt0Var = new zt0();
        r60.m3420v(this, new C0458m3(5, zt0Var, this));
        Object obj = zt0Var.f7995d;
        if (obj == null) {
            p30.m2986V("focusProperties");
            throw null;
        }
        if (((C0032av) obj).f268a) {
            return;
        }
        ((C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(this)).getFocusOwner()).m5608b(8, true, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public final boolean m729D0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return m733y0().f268a ? m731w0() : z60.m5451u(this, i, new b71(i));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: l0 */
    public final boolean mo548l0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: p0 */
    public final void mo657p0() {
        int iOrdinal = m727B0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(this)).getFocusOwner();
                AbstractC0307i4.m1538n(this);
                return;
            } else if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                C0921xc.m5129j();
                return;
            }
        }
        C1017zu c1017zu = (C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(this)).getFocusOwner();
        c1017zu.m5608b(8, true, false);
        c1017zu.f7999d.m4355a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: q0 */
    public final void mo694q0() {
        if (m727B0().m603a()) {
            ((C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(this)).getFocusOwner()).m5608b(8, true, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x022b A[ADDED_TO_REGION, LOOP:9: B:156:0x022b->B:163:0x023d, LOOP_START, PHI: r12
  0x022b: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:155:0x0229, B:163:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024b  */
    /* JADX INFO: renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m731w0() {
        sh0 sh0Var;
        int i;
        mj0 mj0Var;
        char c;
        mj0 mj0Var2;
        int iOrdinal = pf1.m3033I(this).ordinal();
        int i2 = 0;
        if (iOrdinal == 0) {
            C1017zu c1017zu = (C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(this)).getFocusOwner();
            C0149dv c0149dvM5612f = c1017zu.m5612f();
            EnumC0106cv enumC0106cvM727B0 = m727B0();
            if (c0149dvM5612f == this) {
                m732x0(enumC0106cvM727B0, enumC0106cvM727B0);
                return true;
            }
            if (c0149dvM5612f != null || ((C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(this)).getFocusOwner()).f7996a.m4845B()) {
                char c2 = 16;
                if (c0149dvM5612f != null) {
                    sh0Var = new sh0(new C0149dv[16]);
                    if (!c0149dvM5612f.f4529d.f4542q) {
                        w10.m4824b("visitAncestors called on an unattached node");
                    }
                    oe0 oe0Var = c0149dvM5612f.f4529d.f4533h;
                    b60 b60VarM3039Q = pf1.m3039Q(c0149dvM5612f);
                    while (b60VarM3039Q != null) {
                        if ((b60VarM3039Q.f395I.f3998f.f4532g & 1024) != 0) {
                            while (oe0Var != null) {
                                if ((oe0Var.f4531f & 1024) != 0) {
                                    oe0 oe0VarM3050f = oe0Var;
                                    sh0 sh0Var2 = null;
                                    while (oe0VarM3050f != null) {
                                        if (oe0VarM3050f instanceof C0149dv) {
                                            sh0Var.m4072b((C0149dv) oe0VarM3050f);
                                        } else if ((oe0VarM3050f.f4531f & 1024) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                            int i3 = 0;
                                            for (oe0 oe0Var2 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
                                                if ((oe0Var2.f4531f & 1024) != 0) {
                                                    i3++;
                                                    if (i3 == 1) {
                                                        oe0VarM3050f = oe0Var2;
                                                    } else {
                                                        if (sh0Var2 == null) {
                                                            sh0Var2 = new sh0(new oe0[16]);
                                                        }
                                                        if (oe0VarM3050f != null) {
                                                            sh0Var2.m4072b(oe0VarM3050f);
                                                            oe0VarM3050f = null;
                                                        }
                                                        sh0Var2.m4072b(oe0Var2);
                                                    }
                                                }
                                            }
                                            if (i3 == 1) {
                                            }
                                        }
                                        oe0VarM3050f = pf1.m3050f(sh0Var2);
                                    }
                                }
                                oe0Var = oe0Var.f4533h;
                            }
                        }
                        b60VarM3039Q = b60VarM3039Q.m315v();
                        oe0Var = (b60VarM3039Q == null || (mj0Var2 = b60VarM3039Q.f395I) == null) ? null : mj0Var2.f3997e;
                    }
                } else {
                    sh0Var = null;
                }
                Object[] objArr = new C0149dv[16];
                if (!this.f4529d.f4542q) {
                    w10.m4824b("visitAncestors called on an unattached node");
                }
                oe0 oe0Var3 = this.f4529d.f4533h;
                b60 b60VarM3039Q2 = pf1.m3039Q(this);
                int i4 = 0;
                int i5 = 1;
                while (b60VarM3039Q2 != null) {
                    if ((b60VarM3039Q2.f395I.f3998f.f4532g & 1024) != 0) {
                        while (oe0Var3 != null) {
                            if ((oe0Var3.f4531f & 1024) != 0) {
                                oe0 oe0VarM3050f2 = oe0Var3;
                                sh0 sh0Var3 = null;
                                while (oe0VarM3050f2 != null) {
                                    if (oe0VarM3050f2 instanceof C0149dv) {
                                        C0149dv c0149dv = (C0149dv) oe0VarM3050f2;
                                        Boolean boolValueOf = sh0Var != null ? Boolean.valueOf(sh0Var.m4080j(c0149dv)) : null;
                                        if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                            int i6 = i4 + 1;
                                            if (objArr.length < i6) {
                                                int length = objArr.length;
                                                Object[] objArr2 = new Object[Math.max(i6, length * 2)];
                                                System.arraycopy(objArr, i2, objArr2, i2, length);
                                                objArr = objArr2;
                                            }
                                            objArr[i4] = c0149dv;
                                            i4 = i6;
                                        }
                                        if (c0149dv == c0149dvM5612f) {
                                            i5 = i2;
                                        }
                                    } else if ((oe0VarM3050f2.f4531f & 1024) != 0 && (oe0VarM3050f2 instanceof AbstractC0731sm)) {
                                        int i7 = i2;
                                        for (oe0 oe0Var4 = ((AbstractC0731sm) oe0VarM3050f2).f5782s; oe0Var4 != null; oe0Var4 = oe0Var4.f4534i) {
                                            if ((oe0Var4.f4531f & 1024) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    oe0VarM3050f2 = oe0Var4;
                                                } else {
                                                    if (sh0Var3 == null) {
                                                        sh0Var3 = new sh0(new oe0[16]);
                                                    }
                                                    if (oe0VarM3050f2 != null) {
                                                        sh0Var3.m4072b(oe0VarM3050f2);
                                                        oe0VarM3050f2 = null;
                                                    }
                                                    sh0Var3.m4072b(oe0Var4);
                                                }
                                            }
                                        }
                                        c = 16;
                                        if (i7 == 1) {
                                            c2 = 16;
                                            i2 = 0;
                                        } else {
                                            oe0VarM3050f2 = pf1.m3050f(sh0Var3);
                                            c2 = c;
                                            i2 = 0;
                                        }
                                    }
                                    c = 16;
                                    oe0VarM3050f2 = pf1.m3050f(sh0Var3);
                                    c2 = c;
                                    i2 = 0;
                                }
                            }
                            oe0Var3 = oe0Var3.f4533h;
                            c2 = c2;
                            i2 = 0;
                        }
                    }
                    char c3 = c2;
                    b60VarM3039Q2 = b60VarM3039Q2.m315v();
                    oe0Var3 = (b60VarM3039Q2 == null || (mj0Var = b60VarM3039Q2.f395I) == null) ? null : mj0Var.f3997e;
                    c2 = c3;
                    i2 = 0;
                }
                if (i5 == 0 || c0149dvM5612f == null || pf1.m3054n(c0149dvM5612f, false)) {
                    r60.m3420v(this, new C0310i7(1, this));
                    int iOrdinal2 = m727B0().ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == 1) {
                            ((C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(this)).getFocusOwner()).m5614h(this);
                        } else if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                C0921xc.m5129j();
                                return false;
                            }
                            ((C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(this)).getFocusOwner()).m5614h(this);
                        }
                    }
                    EnumC0106cv enumC0106cv = EnumC0106cv.f895f;
                    EnumC0106cv enumC0106cv2 = EnumC0106cv.f893d;
                    if (i5 != 0 && c0149dvM5612f != null) {
                        c0149dvM5612f.m732x0(enumC0106cv2, enumC0106cv);
                    }
                    EnumC0106cv enumC0106cv3 = EnumC0106cv.f894e;
                    if (sh0Var != null) {
                        int i8 = sh0Var.f5770f - 1;
                        Object[] objArr3 = sh0Var.f5768d;
                        if (i8 < objArr3.length) {
                            while (i8 >= 0) {
                                C0149dv c0149dv2 = (C0149dv) objArr3[i8];
                                if (c1017zu.m5612f() != this) {
                                    break;
                                }
                                c0149dv2.m732x0(enumC0106cv3, enumC0106cv);
                                i8--;
                            }
                            i = i4 - 1;
                            if (i >= objArr.length) {
                                while (i >= 0) {
                                    C0149dv c0149dv3 = (C0149dv) objArr[i];
                                    if (c1017zu.m5612f() != this) {
                                        break;
                                    }
                                    c0149dv3.m732x0(c0149dv3 == c0149dvM5612f ? enumC0106cv2 : enumC0106cv, enumC0106cv3);
                                    i--;
                                }
                                if (c1017zu.m5612f() == this) {
                                    m732x0(enumC0106cvM727B0, enumC0106cv2);
                                    if (c1017zu.m5612f() != this) {
                                        break;
                                    }
                                    return true;
                                }
                            } else if (c1017zu.m5612f() == this) {
                            }
                        } else {
                            i = i4 - 1;
                            if (i >= objArr.length) {
                            }
                        }
                    }
                }
                return false;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return true;
            }
            if (iOrdinal != 3) {
                C0921xc.m5129j();
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public final void m732x0(EnumC0106cv enumC0106cv, EnumC0106cv enumC0106cv2) {
        mj0 mj0Var;
        InterfaceC0904ww interfaceC0904ww;
        C1017zu c1017zu = (C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(this)).getFocusOwner();
        C0149dv c0149dvM5612f = c1017zu.m5612f();
        if (!enumC0106cv.equals(enumC0106cv2) && (interfaceC0904ww = this.f1194r) != null) {
            interfaceC0904ww.invoke(enumC0106cv, enumC0106cv2);
        }
        oe0 oe0Var = this.f4529d;
        if (!oe0Var.f4542q) {
            w10.m4824b("visitAncestors called on an unattached node");
        }
        oe0 oe0Var2 = this.f4529d;
        b60 b60VarM3039Q = pf1.m3039Q(this);
        while (b60VarM3039Q != null) {
            if ((b60VarM3039Q.f395I.f3998f.f4532g & 5120) != 0) {
                while (oe0Var2 != null) {
                    int i = oe0Var2.f4531f;
                    if ((i & 5120) != 0) {
                        if (oe0Var2 != oe0Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            oe0 oe0VarM3050f = oe0Var2;
                            sh0 sh0Var = null;
                            while (oe0VarM3050f != null) {
                                if (oe0VarM3050f instanceof C0795u9) {
                                    C0795u9 c0795u9 = (C0795u9) oe0VarM3050f;
                                    if (c0149dvM5612f == c1017zu.m5612f()) {
                                        c0795u9.m4291x0();
                                        throw null;
                                    }
                                } else if ((oe0VarM3050f.f4531f & 4096) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                    int i2 = 0;
                                    for (oe0 oe0Var3 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var3 != null; oe0Var3 = oe0Var3.f4534i) {
                                        if ((oe0Var3.f4531f & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oe0VarM3050f = oe0Var3;
                                            } else {
                                                if (sh0Var == null) {
                                                    sh0Var = new sh0(new oe0[16]);
                                                }
                                                if (oe0VarM3050f != null) {
                                                    sh0Var.m4072b(oe0VarM3050f);
                                                    oe0VarM3050f = null;
                                                }
                                                sh0Var.m4072b(oe0Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                oe0VarM3050f = pf1.m3050f(sh0Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    oe0Var2 = oe0Var2.f4533h;
                }
            }
            b60VarM3039Q = b60VarM3039Q.m315v();
            oe0Var2 = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public final C0032av m733y0() {
        boolean z;
        mj0 mj0Var;
        C0032av c0032av = new C0032av();
        c0032av.f268a = true;
        C0069bv c0069bv = C0069bv.f589b;
        c0032av.f269b = c0069bv;
        c0032av.f270c = c0069bv;
        c0032av.f271d = c0069bv;
        c0032av.f272e = c0069bv;
        c0032av.f273f = c0069bv;
        c0032av.f274g = c0069bv;
        c0032av.f275h = c0069bv;
        c0032av.f276i = c0069bv;
        c0032av.f277j = C0601p3.f4722p;
        c0032av.f278k = C0601p3.f4723q;
        c0032av.f279l = C0496n2.f4126F;
        int i = this.f1197u;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((f20) ((h20) ((g20) pf1.m3058r(this, AbstractC0131dj.f1126m))).f2129a.getValue()).f1570a == 1);
        } else {
            if (i != 2) {
                C0921xc.m5134o("Unknown Focusability");
                return null;
            }
            z = false;
        }
        c0032av.f268a = z;
        oe0 oe0Var = this.f4529d;
        if (!oe0Var.f4542q) {
            w10.m4824b("visitAncestors called on an unattached node");
        }
        oe0 oe0Var2 = this.f4529d;
        b60 b60VarM3039Q = pf1.m3039Q(this);
        loop0: while (b60VarM3039Q != null) {
            if ((b60VarM3039Q.f395I.f3998f.f4532g & 3072) != 0) {
                while (oe0Var2 != null) {
                    int i2 = oe0Var2.f4531f;
                    if ((i2 & 3072) != 0) {
                        if (oe0Var2 != oe0Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            sh0 sh0Var = null;
                            oe0 oe0VarM3050f = oe0Var2;
                            while (oe0VarM3050f != null) {
                                if (oe0VarM3050f instanceof C0795u9) {
                                    ne0 ne0Var = ((C0795u9) oe0VarM3050f).f6169r;
                                    w10.m4824b("applyFocusProperties called on wrong node");
                                    ne0Var.getClass();
                                    C0921xc.m5123d();
                                    return null;
                                }
                                if ((oe0VarM3050f.f4531f & 2048) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                    int i3 = 0;
                                    for (oe0 oe0Var3 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var3 != null; oe0Var3 = oe0Var3.f4534i) {
                                        if ((oe0Var3.f4531f & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                oe0VarM3050f = oe0Var3;
                                            } else {
                                                if (sh0Var == null) {
                                                    sh0Var = new sh0(new oe0[16]);
                                                }
                                                if (oe0VarM3050f != null) {
                                                    sh0Var.m4072b(oe0VarM3050f);
                                                    oe0VarM3050f = null;
                                                }
                                                sh0Var.m4072b(oe0Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                oe0VarM3050f = pf1.m3050f(sh0Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    oe0Var2 = oe0Var2.f4533h;
                }
            }
            b60VarM3039Q = b60VarM3039Q.m315v();
            oe0Var2 = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
        }
        return c0032av;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mk0
    /* JADX INFO: renamed from: z */
    public final void mo734z() {
        m728C0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public final st0 m735z0(i50 i50Var) {
        st0 st0Var = m733y0().f279l;
        return st0Var != C0496n2.f4126F ? i50Var == null ? st0Var : st0Var.m4105e(i50Var.mo340A(pf1.m3038P(this), 0L)) : i50Var != null ? i50Var.mo341B(pf1.m3038P(this), false) : v50.m4398b(0L, o30.m2759C(pf1.m3038P(this).f7402f));
    }

    @Override // p000.g50
    /* JADX INFO: renamed from: j */
    public final void mo730j(i50 i50Var) {
    }
}
