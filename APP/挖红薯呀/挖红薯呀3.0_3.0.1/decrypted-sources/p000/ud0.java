package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ud0 {

    /* JADX INFO: renamed from: a */
    public final b60 f6193a;

    /* JADX INFO: renamed from: c */
    public boolean f6195c;

    /* JADX INFO: renamed from: d */
    public boolean f6196d;

    /* JADX INFO: renamed from: i */
    public C0617pj f6201i;

    /* JADX INFO: renamed from: b */
    public final C0541o8 f6194b = new C0541o8(3);

    /* JADX INFO: renamed from: e */
    public final C0111d f6197e = new C0111d(14);

    /* JADX INFO: renamed from: f */
    public final sh0 f6198f = new sh0(new b60[16]);

    /* JADX INFO: renamed from: g */
    public final long f6199g = 1;

    /* JADX INFO: renamed from: h */
    public final sh0 f6200h = new sh0(new td0[16]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ud0(b60 b60Var) {
        this.f6193a = b60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m4299b(b60 b60Var, C0617pj c0617pj) {
        boolean zM839m0;
        b60 b60Var2 = b60Var.f413l;
        f60 f60Var = b60Var.f396J;
        if (b60Var2 == null) {
            return false;
        }
        if (c0617pj == null) {
            ec0 ec0Var = f60Var.f1608q;
            C0617pj c0617pj2 = ec0Var != null ? ec0Var.f1384p : null;
            if (c0617pj2 != null && b60Var2 != null) {
                ec0Var.getClass();
                zM839m0 = ec0Var.m839m0(c0617pj2.f4912a);
            }
        } else if (b60Var2 != null) {
            ec0 ec0Var2 = f60Var.f1608q;
            ec0Var2.getClass();
            zM839m0 = ec0Var2.m839m0(c0617pj.f4912a);
        } else {
            zM839m0 = false;
        }
        b60 b60VarM315v = b60Var.m315v();
        if (zM839m0 && b60VarM315v != null) {
            if (b60VarM315v.f413l == null) {
                b60.m262X(b60VarM315v, false, 3);
                return zM839m0;
            }
            if (b60Var.m313t() == z50.f7800d) {
                b60.m261V(b60VarM315v, false, 3);
                return zM839m0;
            }
            if (b60Var.m313t() == z50.f7801e) {
                b60VarM315v.m284U(false);
            }
        }
        return zM839m0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m4300c(b60 b60Var, C0617pj c0617pj) {
        boolean zM280P = c0617pj != null ? b60Var.m280P(c0617pj) : b60.m260Q(b60Var);
        b60 b60VarM315v = b60Var.m315v();
        if (zM280P && b60VarM315v != null) {
            if (b60Var.m312s() == z50.f7800d) {
                b60.m262X(b60VarM315v, false, 3);
                return zM280P;
            }
            if (b60Var.m312s() == z50.f7801e) {
                b60VarM315v.m285W(false);
            }
        }
        return zM280P;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m4301h(b60 b60Var) {
        ec0 ec0Var;
        c60 c60Var;
        if (b60Var.f396J.f1596e) {
            return (b60Var.m313t() == z50.f7802f && ((ec0Var = b60Var.f396J.f1608q) == null || (c60Var = ec0Var.f1388t) == null || !c60Var.m495e())) ? false : true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m4302i(b60 b60Var) {
        if (!b60Var.m311r()) {
            return false;
        }
        do {
            if (b60Var.m312s() == z50.f7802f && !b60Var.f396J.f1607p.f7112z.m495e()) {
                b60 b60VarM315v = b60Var.m315v();
                if ((b60VarM315v != null ? b60VarM315v.f396J.f1595d : null) != x50.f7264d) {
                    return false;
                }
            }
            b60Var = b60Var.m315v();
            if (b60Var == null) {
                return false;
            }
        } while (!b60Var.m273I());
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: b60 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4303a(boolean z) {
        Object[] objArr;
        C0111d c0111d = this.f6197e;
        if (z) {
            sh0 sh0Var = (sh0) c0111d.f919e;
            b60 b60Var = this.f6193a;
            if (b60Var.f403Q > 0) {
                sh0Var.m4077g();
                sh0Var.m4072b(b60Var);
                b60Var.f402P = true;
            }
        }
        sh0 sh0Var2 = (sh0) c0111d.f919e;
        int i = sh0Var2.f5770f;
        if (i != 0) {
            Arrays.sort(sh0Var2.f5768d, 0, i, C0186ev.f1531d);
            int i2 = sh0Var2.f5770f;
            b60[] b60VarArr = (b60[]) c0111d.f920f;
            if (b60VarArr != null) {
                int length = b60VarArr.length;
                objArr = b60VarArr;
                if (length < i2) {
                    objArr = new b60[Math.max(16, i2)];
                }
            }
            c0111d.f920f = null;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = sh0Var2.f5768d[i3];
            }
            sh0Var2.m4077g();
            for (int i4 = i2 - 1; -1 < i4; i4--) {
                b60 b60Var2 = objArr[i4];
                b60Var2.getClass();
                if (b60Var2.f402P) {
                    C0111d.m607l(b60Var2);
                }
                objArr[i4] = 0;
            }
            c0111d.f920f = objArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4304d() {
        sh0 sh0Var = this.f6200h;
        int i = sh0Var.f5770f;
        if (i != 0) {
            Object[] objArr = sh0Var.f5768d;
            for (int i2 = 0; i2 < i; i2++) {
                td0 td0Var = (td0) objArr[i2];
                if (td0Var.f5987a.m272H()) {
                    boolean z = td0Var.f5988b;
                    b60 b60Var = td0Var.f5987a;
                    boolean z2 = td0Var.f5989c;
                    if (z) {
                        b60.m261V(b60Var, z2, 2);
                    } else {
                        b60.m262X(b60Var, z2, 2);
                    }
                }
            }
            sh0Var.m4077g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4305e(b60 b60Var) {
        sh0 sh0VarM319z = b60Var.m319z();
        Object[] objArr = sh0VarM319z.f5768d;
        int i = sh0VarM319z.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            b60 b60Var2 = (b60) objArr[i2];
            if (p30.m3002l(b60Var2.m274J(), Boolean.TRUE) && !b60Var2.f404R) {
                if (this.f6194b.m2798b(b60Var2)) {
                    b60Var2.m275K();
                }
                m4305e(b60Var2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4306f(b60 b60Var, boolean z) {
        if (!this.f6195c) {
            w10.m4824b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? b60Var.f396J.f1596e : b60Var.m311r()) {
            w10.m4823a("node not yet measured");
        }
        m4307g(b60Var, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4307g(b60 b60Var, boolean z) {
        ec0 ec0Var;
        c60 c60Var;
        sh0 sh0VarM319z = b60Var.m319z();
        Object[] objArr = sh0VarM319z.f5768d;
        int i = sh0VarM319z.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            b60 b60Var2 = (b60) objArr[i2];
            z50 z50Var = z50.f7800d;
            if ((!z && (b60Var2.m312s() == z50Var || b60Var2.f396J.f1607p.f7112z.m495e())) || (z && (b60Var2.m313t() == z50Var || ((ec0Var = b60Var2.f396J.f1608q) != null && (c60Var = ec0Var.f1388t) != null && c60Var.m495e())))) {
                boolean zM1217p = g60.m1217p(b60Var2);
                f60 f60Var = b60Var2.f396J;
                if (zM1217p && !z) {
                    if (f60Var.f1596e && this.f6194b.m2798b(b60Var2)) {
                        m4311m(b60Var2, true, false);
                    } else {
                        m4306f(b60Var2, true);
                    }
                }
                if (z ? f60Var.f1596e : b60Var2.m311r()) {
                    m4311m(b60Var2, z, false);
                }
                if (!(z ? f60Var.f1596e : b60Var2.m311r())) {
                    m4307g(b60Var2, z);
                }
            }
        }
        if (z ? b60Var.f396J.f1596e : b60Var.m311r()) {
            m4311m(b60Var, z, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:119:0x0153 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:123:0x014d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:90:0x0144 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:94:0x0151 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [oe0] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [oe0] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [sh0] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [sh0] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX INFO: renamed from: j */
    public final boolean m4308j(InterfaceC0298hw interfaceC0298hw) {
        boolean z;
        oe0 oe0Var;
        ?? M3050f;
        boolean z2;
        b60 b60Var;
        boolean z3;
        C0541o8 c0541o8 = this.f6194b;
        b60 b60Var2 = this.f6193a;
        if (!b60Var2.m272H()) {
            w10.m4823a("performMeasureAndLayout called with unattached root");
        }
        if (!b60Var2.m273I()) {
            w10.m4823a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f6195c) {
            w10.m4823a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.f6201i != null) {
            this.f6195c = true;
            this.f6196d = true;
            try {
                boolean zM2805j = c0541o8.m2805j();
                C0910x1 c0910x1 = (C0910x1) c0541o8.f4480a;
                if (zM2805j) {
                    z = false;
                    while (true) {
                        C0910x1 c0910x12 = (C0910x1) c0541o8.f4482c;
                        C0910x1 c0910x13 = (C0910x1) c0541o8.f4481b;
                        if (!((h31) c0910x1.f7232e).isEmpty()) {
                            b60Var = (b60) ((h31) c0910x1.f7232e).first();
                            c0910x1.m5078r(b60Var);
                            z3 = b60Var.f413l != null;
                            z2 = false;
                        } else if (!((h31) c0910x13.f7232e).isEmpty()) {
                            b60Var = (b60) ((h31) c0910x13.f7232e).first();
                            c0910x13.m5078r(b60Var);
                            z3 = b60Var.f413l != null;
                            z2 = true;
                        } else {
                            if (((h31) c0910x12.f7232e).isEmpty()) {
                                break;
                            }
                            b60 b60Var3 = (b60) ((h31) c0910x12.f7232e).first();
                            c0910x12.m5078r(b60Var3);
                            z2 = true;
                            b60Var = b60Var3;
                            z3 = false;
                        }
                        boolean zM4311m = m4311m(b60Var, z3, z2);
                        if (!z2) {
                            if (b60Var.f396J.f1597f) {
                                c0541o8.m2797a(b60Var, w30.f6994e);
                            }
                            if (b60Var.m309p()) {
                                c0541o8.m2797a(b60Var, w30.f6996g);
                            }
                        }
                        if (b60Var == b60Var2 && zM4311m) {
                            z = true;
                        }
                    }
                    if (interfaceC0298hw != null) {
                        interfaceC0298hw.invoke();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        sh0 sh0Var = this.f6198f;
        Object[] objArr = sh0Var.f5768d;
        int i = sh0Var.f5770f;
        int i2 = 0;
        while (i2 < i) {
            mj0 mj0Var = ((b60) objArr[i2]).f395I;
            c20 c20Var = mj0Var.f3995c;
            boolean zM3515f = rj0.m3515f(4194304);
            if (zM3515f) {
                oe0Var = c20Var.f643T;
            } else {
                oe0Var = c20Var.f643T.f4533h;
                if (oe0Var == null) {
                }
                i2++;
                z4 = false;
            }
            gv0 gv0Var = qj0.f5161P;
            oe0 oe0VarM3269I0 = c20Var.m3269I0(zM3515f);
            while (oe0VarM3269I0 != null && (oe0VarM3269I0.f4532g & 4194304) != 0) {
                if ((oe0VarM3269I0.f4531f & 4194304) != 0) {
                    ?? r12 = oe0VarM3269I0;
                    ?? sh0Var2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof g50) {
                            ((g50) r12).mo730j(mj0Var.f3995c);
                        } else {
                            if ((r12.f4531f & 4194304) != 0 && (r12 instanceof AbstractC0731sm)) {
                                oe0 oe0Var2 = ((AbstractC0731sm) r12).f5782s;
                                ?? r15 = z4;
                                M3050f = r12;
                                sh0Var2 = sh0Var2;
                                while (oe0Var2 != null) {
                                    if ((oe0Var2.f4531f & 4194304) != 0) {
                                        r15++;
                                        sh0Var2 = sh0Var2;
                                        if (r15 == 1) {
                                            M3050f = oe0Var2;
                                        } else {
                                            if (sh0Var2 == 0) {
                                                sh0Var2 = new sh0(new oe0[16]);
                                            }
                                            if (M3050f != 0) {
                                                sh0Var2.m4072b(M3050f);
                                                M3050f = 0;
                                            }
                                            sh0Var2.m4072b(oe0Var2);
                                        }
                                    }
                                    oe0Var2 = oe0Var2.f4534i;
                                    M3050f = M3050f;
                                    sh0Var2 = sh0Var2;
                                    r15 = r15;
                                }
                                if (r15 == 1) {
                                }
                            }
                            z4 = false;
                            r12 = M3050f;
                            sh0Var2 = sh0Var2;
                        }
                        M3050f = pf1.m3050f(sh0Var2);
                        z4 = false;
                        r12 = M3050f;
                        sh0Var2 = sh0Var2;
                    }
                }
                if (oe0VarM3269I0 != oe0Var) {
                    oe0VarM3269I0 = oe0VarM3269I0.f4534i;
                    z4 = false;
                }
            }
            i2++;
            z4 = false;
        }
        sh0Var.m4077g();
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:100:0x012a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:101:0x00e6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:103:0x00e6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:106:0x0124 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:75:0x011b */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [oe0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [oe0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: k */
    public final void m4309k(b60 b60Var, long j) {
        oe0 oe0Var;
        if (b60Var.f404R) {
            return;
        }
        b60 b60Var2 = this.f6193a;
        if (b60Var == b60Var2) {
            w10.m4823a("measureAndLayout called on root");
        }
        if (!b60Var2.m272H()) {
            w10.m4823a("performMeasureAndLayout called with unattached root");
        }
        if (!b60Var2.m273I()) {
            w10.m4823a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f6195c) {
            w10.m4823a("performMeasureAndLayout called during measure layout");
        }
        if (this.f6201i != null) {
            this.f6195c = true;
            this.f6196d = false;
            try {
                C0541o8 c0541o8 = this.f6194b;
                ((C0910x1) c0541o8.f4480a).m5078r(b60Var);
                ((C0910x1) c0541o8.f4481b).m5078r(b60Var);
                ((C0910x1) c0541o8.f4482c).m5078r(b60Var);
                if ((m4299b(b60Var, new C0617pj(j)) || b60Var.f396J.f1597f) && p30.m3002l(b60Var.m274J(), Boolean.TRUE)) {
                    b60Var.m275K();
                }
                m4305e(b60Var);
                m4300c(b60Var, new C0617pj(j));
                if (b60Var.m309p() && b60Var.m273I()) {
                    b60Var.m283T();
                    C0111d c0111d = this.f6197e;
                    c0111d.getClass();
                    if (b60Var.f403Q > 0) {
                        ((sh0) c0111d.f919e).m4072b(b60Var);
                        b60Var.f402P = true;
                    }
                }
                m4304d();
            } finally {
            }
        }
        sh0 sh0Var = this.f6198f;
        Object[] objArr = sh0Var.f5768d;
        int i = sh0Var.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            mj0 mj0Var = ((b60) objArr[i2]).f395I;
            c20 c20Var = mj0Var.f3995c;
            boolean zM3515f = rj0.m3515f(4194304);
            if (zM3515f) {
                oe0Var = c20Var.f643T;
            } else {
                oe0Var = c20Var.f643T.f4533h;
                if (oe0Var == null) {
                }
            }
            gv0 gv0Var = qj0.f5161P;
            for (oe0 oe0VarM3269I0 = c20Var.m3269I0(zM3515f); oe0VarM3269I0 != null && (oe0VarM3269I0.f4532g & 4194304) != 0; oe0VarM3269I0 = oe0VarM3269I0.f4534i) {
                if ((oe0VarM3269I0.f4531f & 4194304) != 0) {
                    ?? M3050f = oe0VarM3269I0;
                    ?? sh0Var2 = 0;
                    while (M3050f != 0) {
                        if (M3050f instanceof g50) {
                            ((g50) M3050f).mo730j(mj0Var.f3995c);
                        } else if ((M3050f.f4531f & 4194304) != 0 && (M3050f instanceof AbstractC0731sm)) {
                            oe0 oe0Var2 = ((AbstractC0731sm) M3050f).f5782s;
                            int i3 = 0;
                            M3050f = M3050f;
                            sh0Var2 = sh0Var2;
                            while (oe0Var2 != null) {
                                if ((oe0Var2.f4531f & 4194304) != 0) {
                                    i3++;
                                    sh0Var2 = sh0Var2;
                                    if (i3 == 1) {
                                        M3050f = oe0Var2;
                                    } else {
                                        if (sh0Var2 == 0) {
                                            sh0Var2 = new sh0(new oe0[16]);
                                        }
                                        if (M3050f != 0) {
                                            sh0Var2.m4072b(M3050f);
                                            M3050f = 0;
                                        }
                                        sh0Var2.m4072b(oe0Var2);
                                    }
                                }
                                oe0Var2 = oe0Var2.f4534i;
                                M3050f = M3050f;
                                sh0Var2 = sh0Var2;
                            }
                            if (i3 == 1) {
                            }
                        }
                        M3050f = pf1.m3050f(sh0Var2);
                    }
                }
                if (oe0VarM3269I0 != oe0Var) {
                }
            }
        }
        sh0Var.m4077g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: l */
    public final void m4310l() {
        C0541o8 c0541o8 = this.f6194b;
        if (c0541o8.m2805j()) {
            b60 b60Var = this.f6193a;
            if (!b60Var.m272H()) {
                w10.m4823a("performMeasureAndLayout called with unattached root");
            }
            if (!b60Var.m273I()) {
                w10.m4823a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f6195c) {
                w10.m4823a("performMeasureAndLayout called during measure layout");
            }
            if (this.f6201i != null) {
                this.f6195c = true;
                this.f6196d = false;
                try {
                    if (!((h31) ((C0910x1) c0541o8.f4482c).f7232e).isEmpty() && !((h31) ((C0910x1) c0541o8.f4480a).f7232e).isEmpty()) {
                        if (b60Var.f413l != null) {
                            m4313o(b60Var, true);
                        } else {
                            m4312n(b60Var);
                        }
                    }
                    m4313o(b60Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.f6195c = false;
                        this.f6196d = false;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final boolean m4311m(b60 b60Var, boolean z, boolean z2) {
        C0617pj c0617pj;
        boolean zM4299b;
        wq0 placementScope;
        c20 c20Var;
        b60 b60VarM315v;
        ec0 ec0Var;
        c60 c60Var;
        boolean z3 = b60Var.f404R;
        f60 f60Var = b60Var.f396J;
        if (z3 || (!b60Var.m273I() && !f60Var.f1607p.f7108v && !m4302i(b60Var) && !p30.m3002l(b60Var.m274J(), Boolean.TRUE) && !m4301h(b60Var) && !f60Var.f1607p.f7112z.m495e() && ((ec0Var = f60Var.f1608q) == null || (c60Var = ec0Var.f1388t) == null || !c60Var.m495e()))) {
            return false;
        }
        b60 b60Var2 = this.f6193a;
        if (b60Var == b60Var2) {
            c0617pj = this.f6201i;
            c0617pj.getClass();
        } else {
            c0617pj = null;
        }
        if (z) {
            zM4299b = f60Var.f1596e ? m4299b(b60Var, c0617pj) : false;
            if (z2 && ((zM4299b || f60Var.f1597f) && p30.m3002l(b60Var.m274J(), Boolean.TRUE))) {
                b60Var.m275K();
            }
        } else {
            boolean zM4300c = b60Var.m311r() ? m4300c(b60Var, c0617pj) : false;
            if (z2 && b60Var.m309p() && (b60Var == b60Var2 || ((b60VarM315v = b60Var.m315v()) != null && b60VarM315v.m273I() && f60Var.f1607p.f7108v))) {
                if (b60Var == b60Var2) {
                    if (b60Var.f392F == z50.f7802f) {
                        b60Var.m297f();
                    }
                    b60 b60VarM315v2 = b60Var.m315v();
                    if (b60VarM315v2 == null || (c20Var = b60VarM315v2.f395I.f3995c) == null || (placementScope = c20Var.f7598o) == null) {
                        placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var)).getPlacementScope();
                    }
                    wq0.m5017k(placementScope, f60Var.f1607p, 0, 0);
                } else {
                    b60Var.m283T();
                }
                C0111d c0111d = this.f6197e;
                c0111d.getClass();
                if (b60Var.f403Q > 0) {
                    ((sh0) c0111d.f919e).m4072b(b60Var);
                    b60Var.f402P = true;
                }
            }
            zM4299b = zM4300c;
        }
        m4304d();
        return zM4299b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m4312n(b60 b60Var) {
        sh0 sh0VarM319z = b60Var.m319z();
        Object[] objArr = sh0VarM319z.f5768d;
        int i = sh0VarM319z.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            b60 b60Var2 = (b60) objArr[i2];
            if (b60Var2.m312s() == z50.f7800d || b60Var2.f396J.f1607p.f7112z.m495e()) {
                if (g60.m1217p(b60Var2)) {
                    m4313o(b60Var2, true);
                } else {
                    m4312n(b60Var2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m4313o(b60 b60Var, boolean z) {
        C0617pj c0617pj;
        if (b60Var.f404R) {
            return;
        }
        if (b60Var == this.f6193a) {
            c0617pj = this.f6201i;
            c0617pj.getClass();
        } else {
            c0617pj = null;
        }
        if (z) {
            m4299b(b60Var, c0617pj);
        } else {
            m4300c(b60Var, c0617pj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final boolean m4314p(b60 b60Var, boolean z) {
        int iOrdinal = b60Var.f396J.f1595d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f6200h.m4072b(new td0(b60Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    C0921xc.m5129j();
                    return false;
                }
                if (!b60Var.m311r() || z) {
                    b60Var.f396J.f1607p.f7109w = true;
                    if (!b60Var.f404R && (b60Var.m273I() || m4302i(b60Var))) {
                        b60 b60VarM315v = b60Var.m315v();
                        if (b60VarM315v == null || !b60VarM315v.m311r()) {
                            this.f6194b.m2797a(b60Var, w30.f6995f);
                        }
                        if (!this.f6196d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m4315q(long j) {
        C0617pj c0617pj = this.f6201i;
        if (c0617pj == null ? false : C0617pj.m3131b(c0617pj.f4912a, j)) {
            return;
        }
        if (this.f6195c) {
            w10.m4823a("updateRootConstraints called while measuring");
        }
        this.f6201i = new C0617pj(j);
        b60 b60Var = this.f6193a;
        b60 b60Var2 = b60Var.f413l;
        f60 f60Var = b60Var.f396J;
        if (b60Var2 != null) {
            f60Var.f1596e = true;
        }
        f60Var.f1607p.f7109w = true;
        this.f6194b.m2797a(b60Var, b60Var2 != null ? w30.f6993d : w30.f6995f);
    }
}
