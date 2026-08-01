package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class c20 extends qj0 {

    /* JADX INFO: renamed from: V */
    public static final C0877w5 f642V;

    /* JADX INFO: renamed from: T */
    public final d61 f643T;

    /* JADX INFO: renamed from: U */
    public b20 f644U;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0877w5 c0877w5M2767g = o30.m2767g();
        c0877w5M2767g.m4871e(C0207ff.f1704d);
        c0877w5M2767g.f7002a.setStrokeWidth(1.0f);
        c0877w5M2767g.m4876j(1);
        f642V = c0877w5M2767g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c20(b60 b60Var) {
        super(b60Var);
        d61 d61Var = new d61();
        d61Var.f4532g = 0;
        this.f643T = d61Var;
        d61Var.f4536k = this;
        this.f644U = b60Var.f413l != null ? new b20(this) : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qj0
    /* JADX INFO: renamed from: B0 */
    public final void mo434B0() {
        if (this.f644U == null) {
            this.f644U = new b20(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qj0
    /* JADX INFO: renamed from: E0 */
    public final ac0 mo435E0() {
        return this.f644U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qj0
    /* JADX INFO: renamed from: G0 */
    public final oe0 mo436G0() {
        return this.f643T;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: I */
    public final int mo181I(int i) {
        C0111d c0111dM314u = this.f5180r.m314u();
        xd0 xd0VarM616m = c0111dM314u.m616m();
        b60 b60Var = (b60) c0111dM314u.f919e;
        return xd0VarM616m.mo1226j(b60Var.f395I.f3996d, b60Var.m306m(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:101:0x00dd */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:104:0x0121 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x0118 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:97:0x0127 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:99:0x00dd */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [oe0] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [oe0] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [sh0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // p000.qj0
    /* JADX INFO: renamed from: M0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo437M0(C0675r3 c0675r3, long j, C0632py c0632py, int i, boolean z) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        b60 b60Var;
        long j2 = j;
        C0632py c0632py2 = c0632py;
        int i3 = c0675r3.f5286d;
        b60 b60Var2 = this.f5180r;
        switch (i3) {
            case 28:
                z2 = true;
                break;
            default:
                sz0 sz0VarM317x = b60Var2.m317x();
                z2 = !(sz0VarM317x != null && sz0VarM317x.f5880g);
                break;
        }
        if (z2) {
            if (m3289e1(j2)) {
                i2 = i;
                z3 = z;
                z4 = true;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(m3293y0(j2, m3267F0())) & Integer.MAX_VALUE) < 2139095040) {
                    z4 = true;
                    z3 = false;
                }
            }
            if (z4) {
                return;
            }
            int i4 = c0632py2.f4986f;
            sh0 sh0VarM318y = b60Var2.m318y();
            Object[] objArr = sh0VarM318y.f5768d;
            int i5 = sh0VarM318y.f5770f - 1;
            while (i5 >= 0) {
                b60 b60Var3 = (b60) objArr[i5];
                if (b60Var3.m273I()) {
                    switch (c0675r3.f5286d) {
                        case 28:
                            b60Var3.m265A(j2, c0632py2, i2, z3);
                            b60Var = b60Var3;
                            break;
                        default:
                            mj0 mj0Var = b60Var3.f395I;
                            mj0Var.f3996d.m3272L0(qj0.f5164S, mj0Var.f3996d.m3266D0(j2), c0632py2, 1, z3);
                            c0632py2 = c0632py;
                            b60Var = b60Var3;
                            break;
                    }
                    long jM3163a = c0632py2.m3163a();
                    if (p30.m2965A(jM3163a) < 0.0f && p30.m2977M(jM3163a) && !p30.m2976L(jM3163a)) {
                        qj0 qj0Var = b60Var.f395I.f3996d;
                        qj0Var.getClass();
                        oe0 oe0VarM3269I0 = qj0Var.m3269I0(rj0.m3515f(16));
                        if (oe0VarM3269I0 != null && oe0VarM3269I0.f4542q) {
                            if (!oe0VarM3269I0.f4529d.f4542q) {
                                w10.m4824b("visitLocalDescendants called on an unattached node");
                            }
                            oe0 oe0Var = oe0VarM3269I0.f4529d;
                            if ((oe0Var.f4532g & 16) != 0) {
                                while (oe0Var != null) {
                                    if ((oe0Var.f4531f & 16) != 0) {
                                        ?? M3050f = oe0Var;
                                        ?? sh0Var = 0;
                                        while (M3050f != 0) {
                                            if (M3050f instanceof qr0) {
                                                if (((qr0) M3050f).mo3325L()) {
                                                    c0632py2.f4986f = c0632py2.f4984d.f1109b - 1;
                                                }
                                            } else if ((M3050f.f4531f & 16) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                                oe0 oe0Var2 = ((AbstractC0731sm) M3050f).f5782s;
                                                int i6 = 0;
                                                M3050f = M3050f;
                                                sh0Var = sh0Var;
                                                while (oe0Var2 != null) {
                                                    if ((oe0Var2.f4531f & 16) != 0) {
                                                        i6++;
                                                        sh0Var = sh0Var;
                                                        if (i6 == 1) {
                                                            M3050f = oe0Var2;
                                                        } else {
                                                            if (sh0Var == 0) {
                                                                sh0Var = new sh0(new oe0[16]);
                                                            }
                                                            if (M3050f != 0) {
                                                                sh0Var.m4072b(M3050f);
                                                                M3050f = 0;
                                                            }
                                                            sh0Var.m4072b(oe0Var2);
                                                        }
                                                    }
                                                    oe0Var2 = oe0Var2.f4534i;
                                                    M3050f = M3050f;
                                                    sh0Var = sh0Var;
                                                }
                                                if (i6 == 1) {
                                                }
                                            }
                                            M3050f = pf1.m3050f(sh0Var);
                                        }
                                    }
                                    oe0Var = oe0Var.f4534i;
                                }
                            }
                        }
                        c0632py2.f4986f = i4;
                        return;
                    }
                }
                i5--;
                j2 = j;
                i2 = i;
            }
            c0632py2.f4986f = i4;
            return;
        }
        i2 = i;
        z3 = z;
        z4 = false;
        if (z4) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: O */
    public final int mo182O(int i) {
        C0111d c0111dM314u = this.f5180r.m314u();
        xd0 xd0VarM616m = c0111dM314u.m616m();
        b60 b60Var = (b60) c0111dM314u.f919e;
        return xd0VarM616m.mo1224c(b60Var.f395I.f3996d, b60Var.m306m(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: R */
    public final int mo183R(int i) {
        C0111d c0111dM314u = this.f5180r.m314u();
        xd0 xd0VarM616m = c0111dM314u.m616m();
        b60 b60Var = (b60) c0111dM314u.f919e;
        return xd0VarM616m.mo1225h(b60Var.f395I.f3996d, b60Var.m306m(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qj0
    /* JADX INFO: renamed from: W0 */
    public final void mo438W0(InterfaceC0051bd interfaceC0051bd, C0868vx c0868vx) {
        b60 b60Var = this.f5180r;
        dn0 dn0VarM789a = e60.m789a(b60Var);
        sh0 sh0VarM318y = b60Var.m318y();
        Object[] objArr = sh0VarM318y.f5768d;
        int i = sh0VarM318y.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            b60 b60Var2 = (b60) objArr[i2];
            if (b60Var2.m273I()) {
                b60Var2.m303i(interfaceC0051bd, c0868vx);
            }
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0VarM789a).getShowLayoutBounds()) {
            long j = this.f7402f;
            interfaceC0051bd.mo247m(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f642V);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xq0
    /* JADX INFO: renamed from: X */
    public final void mo47X(long j, float f, InterfaceC0742sw interfaceC0742sw) {
        m3282X0(j, f, interfaceC0742sw);
        if (this.f7596m) {
            return;
        }
        this.f5180r.f396J.f1607p.m5008k0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: c0 */
    public final int mo234c0(AbstractC0535o2 abstractC0535o2) {
        b20 b20Var = this.f644U;
        if (b20Var != null) {
            return b20Var.mo234c0(abstractC0535o2);
        }
        wd0 wd0Var = this.f5180r.f396J.f1607p;
        x50 x50Var = wd0Var.f7095i.f1595d;
        c60 c60Var = wd0Var.f7112z;
        if (x50Var == x50.f7264d) {
            c60Var.f710d = true;
            if (c60Var.f708b) {
                wd0Var.f7110x = true;
                wd0Var.f7111y = true;
            }
        } else {
            c60Var.f711e = true;
        }
        c20 c20VarMo840r = wd0Var.mo840r();
        boolean z = c20VarMo840r.f7597n;
        c20VarMo840r.f7597n = true;
        wd0Var.mo842u();
        c20VarMo840r.f7597n = z;
        Integer num = (Integer) c60Var.f713g.get(abstractC0535o2);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: e */
    public final xq0 mo184e(long j) {
        m5146a0(j);
        b60 b60Var = this.f5180r;
        sh0 sh0VarM319z = b60Var.m319z();
        Object[] objArr = sh0VarM319z.f5768d;
        int i = sh0VarM319z.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            ((b60) objArr[i2]).f396J.f1607p.f7101o = z50.f7802f;
        }
        m3285a1(b60Var.f427z.mo213g(this, b60Var.m306m(), j));
        m3277R0();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: f */
    public final int mo185f(int i) {
        C0111d c0111dM314u = this.f5180r.m314u();
        xd0 xd0VarM616m = c0111dM314u.m616m();
        b60 b60Var = (b60) c0111dM314u.f919e;
        return xd0VarM616m.mo1223b(b60Var.f395I.f3996d, b60Var.m306m(), i);
    }
}
