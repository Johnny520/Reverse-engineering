package p000;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kf1 {

    /* JADX INFO: renamed from: a */
    public final r61 f5490a;

    /* JADX INFO: renamed from: c */
    public boolean f5492c;

    /* JADX INFO: renamed from: d */
    public boolean f5493d;

    /* JADX INFO: renamed from: i */
    public C0221fz f5498i;

    /* JADX INFO: renamed from: b */
    public final C0043b5 f5491b = new C0043b5(7);

    /* JADX INFO: renamed from: e */
    public final dq1 f5494e = new dq1(2);

    /* JADX INFO: renamed from: f */
    public final zk1 f5495f = new zk1(new r61[16]);

    /* JADX INFO: renamed from: g */
    public final long f5496g = 1;

    /* JADX INFO: renamed from: h */
    public final zk1 f5497h = new zk1(new jf1[16]);

    public kf1(r61 r61Var) {
        this.f5490a = r61Var;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m2647a(kf1 kf1Var, r61 r61Var, boolean z) {
        C0221fz c0221fz;
        rz1 placementScope;
        qz0 qz0Var;
        r61 r61VarM4389u;
        r61 r61Var2 = kf1Var.f5490a;
        boolean z2 = r61Var.f9383X;
        v61 v61Var = r61Var.f9373N;
        if (!z2 && m2652k(r61Var)) {
            if (r61Var == r61Var2) {
                c0221fz = kf1Var.f5498i;
                c0221fz.getClass();
            } else {
                c0221fz = null;
            }
            if (z) {
                zM2648c = v61Var.f11784e ? m2648c(r61Var, c0221fz) : false;
                if ((zM2648c || v61Var.f11785f) && t11.m5086l(r61Var.m4352J(), Boolean.TRUE)) {
                    r61Var.m4353K();
                }
            } else {
                boolean zM2649d = r61Var.m4385q() ? m2649d(r61Var, c0221fz) : false;
                if (r61Var.m4384p() && (r61Var == r61Var2 || ((r61VarM4389u = r61Var.m4389u()) != null && r61VarM4389u.m4351I() && v61Var.f11795p.f6631z))) {
                    if (r61Var == r61Var2) {
                        if (r61Var.f9369J == p61.f7987j) {
                            r61Var.m4374f();
                        }
                        r61 r61VarM4389u2 = r61Var.m4389u();
                        if (r61VarM4389u2 == null || (qz0Var = (qz0) r61VarM4389u2.f9372M.f12033d) == null || (placementScope = qz0Var.f5469s) == null) {
                            placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61Var)).getPlacementScope();
                        }
                        rz1.m4641i(placementScope, v61Var.f11795p, 0, 0);
                    } else {
                        r61Var.m4360R();
                    }
                    dq1 dq1Var = kf1Var.f5494e;
                    dq1Var.getClass();
                    if (r61Var.f9382W > 0) {
                        ((zk1) dq1Var.f2147i).m6423b(r61Var);
                        r61Var.f9381V = true;
                    }
                }
                zM2648c = zM2649d;
            }
            kf1Var.m2654e();
        }
        return zM2648c;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2648c(r61 r61Var, C0221fz c0221fz) {
        boolean zM4146v0;
        r61 r61Var2 = r61Var.f9391o;
        v61 v61Var = r61Var.f9373N;
        if (r61Var2 == null) {
            return false;
        }
        if (c0221fz == null) {
            qd1 qd1Var = v61Var.f11796q;
            C0221fz c0221fz2 = qd1Var != null ? qd1Var.f8914t : null;
            if (c0221fz2 != null && r61Var2 != null) {
                qd1Var.getClass();
                zM4146v0 = qd1Var.m4146v0(c0221fz2.f3199a);
            }
        } else if (r61Var2 != null) {
            qd1 qd1Var2 = v61Var.f11796q;
            qd1Var2.getClass();
            zM4146v0 = qd1Var2.m4146v0(c0221fz.f3199a);
        } else {
            zM4146v0 = false;
        }
        r61 r61VarM4389u = r61Var.m4389u();
        if (zM4146v0 && r61VarM4389u != null) {
            if (r61VarM4389u.f9391o == null) {
                r61.m4341V(r61VarM4389u, false, 3);
                return zM4146v0;
            }
            if (r61Var.m4387s() == p61.f7985h) {
                r61.m4340T(r61VarM4389u, false, 3);
                return zM4146v0;
            }
            if (r61Var.m4387s() == p61.f7986i) {
                r61VarM4389u.m4361S(false);
            }
        }
        return zM4146v0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2649d(r61 r61Var, C0221fz c0221fz) {
        boolean zM3082t0;
        p61 p61Var = p61.f7987j;
        if (c0221fz != null) {
            if (r61Var.f9369J == p61Var) {
                r61Var.m4372e();
            }
            zM3082t0 = r61Var.f9373N.f11795p.m3082t0(c0221fz.f3199a);
        } else {
            mf1 mf1Var = r61Var.f9373N.f11795p;
            C0221fz c0221fz2 = mf1Var.f6622q ? new C0221fz(mf1Var.f10441k) : null;
            if (c0221fz2 != null) {
                if (r61Var.f9369J == p61Var) {
                    r61Var.m4372e();
                }
                zM3082t0 = r61Var.f9373N.f11795p.m3082t0(c0221fz2.f3199a);
            } else {
                r61Var.getClass();
                zM3082t0 = false;
            }
        }
        r61 r61VarM4389u = r61Var.m4389u();
        if (zM3082t0 && r61VarM4389u != null) {
            if (r61Var.m4386r() == p61.f7985h) {
                r61.m4341V(r61VarM4389u, false, 3);
                return zM3082t0;
            }
            if (r61Var.m4386r() == p61.f7986i) {
                r61VarM4389u.m4362U(false);
            }
        }
        return zM3082t0;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2650i(r61 r61Var) {
        qd1 qd1Var;
        s61 s61Var;
        if (r61Var.f9373N.f11784e) {
            return (r61Var.m4387s() == p61.f7987j && ((qd1Var = r61Var.f9373N.f11796q) == null || (s61Var = qd1Var.f8918x) == null || !s61Var.m4742e())) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2651j(r61 r61Var) {
        if (!r61Var.m4385q()) {
            return false;
        }
        do {
            if (r61Var.m4386r() == p61.f7987j && !r61Var.f9373N.f11795p.f6604D.m4742e()) {
                r61 r61VarM4389u = r61Var.m4389u();
                if ((r61VarM4389u != null ? r61VarM4389u.f9373N.f11783d : null) != n61.f7018h) {
                    return false;
                }
            }
            r61Var = r61Var.m4389u();
            if (r61Var == null) {
                return false;
            }
        } while (!r61Var.m4351I());
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2652k(r61 r61Var) {
        qd1 qd1Var;
        s61 s61Var;
        v61 v61Var = r61Var.f9373N;
        return r61Var.m4351I() || v61Var.f11795p.f6631z || m2651j(r61Var) || t11.m5086l(r61Var.m4352J(), Boolean.TRUE) || m2650i(r61Var) || v61Var.f11795p.f6604D.m4742e() || !((qd1Var = v61Var.f11796q) == null || (s61Var = qd1Var.f8918x) == null || !s61Var.m4742e());
    }

    /* JADX INFO: renamed from: b */
    public final void m2653b(boolean z) {
        dq1 dq1Var = this.f5494e;
        if (z) {
            zk1 zk1Var = (zk1) dq1Var.f2147i;
            r61 r61Var = this.f5490a;
            if (r61Var.f9382W > 0) {
                zk1Var.m6428g();
                zk1Var.m6423b(r61Var);
                r61Var.f9381V = true;
            }
        }
        if (((zk1) dq1Var.f2147i).f13936j != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                dq1Var.m1113z();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2654e() {
        zk1 zk1Var = this.f5497h;
        int i = zk1Var.f13936j;
        if (i != 0) {
            Object[] objArr = zk1Var.f13934h;
            for (int i2 = 0; i2 < i; i2++) {
                jf1 jf1Var = (jf1) objArr[i2];
                if (jf1Var.f5013a.m4350H()) {
                    boolean z = jf1Var.f5014b;
                    r61 r61Var = jf1Var.f5013a;
                    boolean z2 = jf1Var.f5015c;
                    if (z) {
                        r61.m4340T(r61Var, z2, 2);
                    } else {
                        r61.m4341V(r61Var, z2, 2);
                    }
                }
            }
            zk1Var.m6428g();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2655f(r61 r61Var) {
        zk1 zk1VarM4393y = r61Var.m4393y();
        Object[] objArr = zk1VarM4393y.f13934h;
        int i = zk1VarM4393y.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            r61 r61Var2 = (r61) objArr[i2];
            if (t11.m5086l(r61Var2.m4352J(), Boolean.TRUE) && !r61Var2.f9383X) {
                if (this.f5491b.m426m(r61Var2)) {
                    r61Var2.m4353K();
                }
                m2655f(r61Var2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2656g(r61 r61Var, boolean z) {
        if (!this.f5492c) {
            kz0.m2764b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? r61Var.f9373N.f11784e : r61Var.m4385q()) {
            kz0.m2763a("node not yet measured");
        }
        m2657h(r61Var, z);
    }

    /* JADX INFO: renamed from: h */
    public final void m2657h(r61 r61Var, boolean z) {
        qd1 qd1Var;
        s61 s61Var;
        zk1 zk1VarM4393y = r61Var.m4393y();
        Object[] objArr = zk1VarM4393y.f13934h;
        int i = zk1VarM4393y.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            r61 r61Var2 = (r61) objArr[i2];
            p61 p61Var = p61.f7985h;
            if ((!z && (r61Var2.m4386r() == p61Var || r61Var2.f9373N.f11795p.f6604D.m4742e())) || (z && (r61Var2.m4387s() == p61Var || ((qd1Var = r61Var2.f9373N.f11796q) != null && (s61Var = qd1Var.f8918x) != null && s61Var.m4742e())))) {
                boolean zM1651z = fg1.m1651z(r61Var2);
                v61 v61Var = r61Var2.f9373N;
                if (zM1651z && !z) {
                    if (v61Var.f11784e && this.f5491b.m426m(r61Var2)) {
                        m2661o(r61Var2, true);
                    } else {
                        m2656g(r61Var2, true);
                    }
                }
                if (z ? v61Var.f11784e : r61Var2.m4385q()) {
                    m2661o(r61Var2, z);
                }
                if (!(z ? v61Var.f11784e : r61Var2.m4385q())) {
                    m2657h(r61Var2, z);
                }
            }
        }
        if (z ? r61Var.f9373N.f11784e : r61Var.m4385q()) {
            m2661o(r61Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [th1] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [th1] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [zk1] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [zk1] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX INFO: renamed from: l */
    public final boolean m2658l(C0683s6 c0683s6) {
        boolean z;
        th1 th1Var;
        ?? M4952m;
        boolean z2;
        r61 r61Var;
        boolean z3;
        boolean zM2661o;
        C0043b5 c0043b5 = this.f5491b;
        r61 r61Var2 = this.f5490a;
        if (!r61Var2.m4350H()) {
            kz0.m2763a("performMeasureAndLayout called with unattached root");
        }
        if (!r61Var2.m4351I()) {
            kz0.m2763a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f5492c) {
            kz0.m2763a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.f5498i != null) {
            this.f5492c = true;
            this.f5493d = true;
            try {
                boolean zM436w = c0043b5.m436w();
                C0485n4 c0485n4 = (C0485n4) c0043b5.f562i;
                if (zM436w) {
                    z = false;
                    while (true) {
                        C0485n4 c0485n42 = (C0485n4) c0043b5.f564k;
                        C0485n4 c0485n43 = (C0485n4) c0043b5.f563j;
                        if (!((gt2) c0485n4.f6983i).isEmpty()) {
                            r61Var = (r61) ((gt2) c0485n4.f6983i).first();
                            c0485n4.m3245x(r61Var);
                            z3 = r61Var.f9391o != null;
                            z2 = false;
                        } else if (!((gt2) c0485n43.f6983i).isEmpty()) {
                            r61Var = (r61) ((gt2) c0485n43.f6983i).first();
                            c0485n43.m3245x(r61Var);
                            z3 = r61Var.f9391o != null;
                            z2 = true;
                        } else {
                            if (((gt2) c0485n42.f6983i).isEmpty()) {
                                break;
                            }
                            r61 r61Var3 = (r61) ((gt2) c0485n42.f6983i).first();
                            c0485n42.m3245x(r61Var3);
                            z2 = true;
                            r61Var = r61Var3;
                            z3 = false;
                        }
                        if (z2) {
                            zM2661o = m2647a(this, r61Var, z3);
                        } else {
                            zM2661o = m2661o(r61Var, z3);
                            if (r61Var.f9373N.f11785f) {
                                c0043b5.m423j(r61Var, a21.f37i);
                            }
                            if (r61Var.m4384p()) {
                                c0043b5.m423j(r61Var, a21.f39k);
                            }
                        }
                        if (r61Var == r61Var2 && zM2661o) {
                            z = true;
                        }
                    }
                    if (c0683s6 != null) {
                        c0683s6.mo6a();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        zk1 zk1Var = this.f5495f;
        Object[] objArr = zk1Var.f13934h;
        int i = zk1Var.f13936j;
        int i2 = 0;
        while (i2 < i) {
            vn1 vn1Var = ((r61) objArr[i2]).f9372M;
            qz0 qz0Var = (qz0) vn1Var.f12033d;
            boolean zM244g = ao1.m244g(4194304);
            if (zM244g) {
                th1Var = qz0Var.f9293Y;
            } else {
                th1Var = qz0Var.f9293Y.f10761l;
                if (th1Var == null) {
                }
                i2++;
                z4 = false;
            }
            ca2 ca2Var = zn1.f13961T;
            th1 th1VarM6453U0 = qz0Var.m6453U0(zM244g);
            while (th1VarM6453U0 != null && (th1VarM6453U0.f10760k & 4194304) != 0) {
                if ((th1VarM6453U0.f10759j & 4194304) != 0) {
                    ?? r12 = th1VarM6453U0;
                    ?? zk1Var2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof a61) {
                            ((a61) r12).mo100q((qz0) vn1Var.f12033d);
                        } else {
                            if ((r12.f10759j & 4194304) != 0 && (r12 instanceof u60)) {
                                th1 th1Var2 = ((u60) r12).f11116w;
                                ?? r15 = z4;
                                M4952m = r12;
                                zk1Var2 = zk1Var2;
                                while (th1Var2 != null) {
                                    if ((th1Var2.f10759j & 4194304) != 0) {
                                        r15++;
                                        zk1Var2 = zk1Var2;
                                        if (r15 == 1) {
                                            M4952m = th1Var2;
                                        } else {
                                            if (zk1Var2 == 0) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (M4952m != 0) {
                                                zk1Var2.m6423b(M4952m);
                                                M4952m = 0;
                                            }
                                            zk1Var2.m6423b(th1Var2);
                                        }
                                    }
                                    th1Var2 = th1Var2.f10762m;
                                    M4952m = M4952m;
                                    zk1Var2 = zk1Var2;
                                    r15 = r15;
                                }
                                if (r15 == 1) {
                                }
                            }
                            z4 = false;
                            r12 = M4952m;
                            zk1Var2 = zk1Var2;
                        }
                        M4952m = sp0.m4952m(zk1Var2);
                        z4 = false;
                        r12 = M4952m;
                        zk1Var2 = zk1Var2;
                    }
                }
                if (th1VarM6453U0 != th1Var) {
                    th1VarM6453U0 = th1VarM6453U0.f10762m;
                    z4 = false;
                }
            }
            i2++;
            z4 = false;
        }
        zk1Var.m6428g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [th1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [th1] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX INFO: renamed from: m */
    public final void m2659m(r61 r61Var, long j) {
        th1 th1Var;
        boolean z = r61Var.f9383X;
        v61 v61Var = r61Var.f9373N;
        if (z) {
            return;
        }
        r61 r61Var2 = this.f5490a;
        if (r61Var == r61Var2) {
            kz0.m2763a("measureAndLayout called on root");
        }
        if (!r61Var2.m4350H()) {
            kz0.m2763a("performMeasureAndLayout called with unattached root");
        }
        if (!r61Var2.m4351I()) {
            kz0.m2763a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f5492c) {
            kz0.m2763a("performMeasureAndLayout called during measure layout");
        }
        if (this.f5498i != null) {
            this.f5492c = true;
            this.f5493d = false;
            try {
                C0043b5 c0043b5 = this.f5491b;
                ((C0485n4) c0043b5.f562i).m3245x(r61Var);
                ((C0485n4) c0043b5.f563j).m3245x(r61Var);
                ((C0485n4) c0043b5.f564k).m3245x(r61Var);
                if (m2648c(r61Var, new C0221fz(j)) || v61Var.f11785f) {
                    if (t11.m5086l(r61Var.m4352J(), Boolean.TRUE)) {
                        r61Var.m4353K();
                    }
                }
                m2655f(r61Var);
                if (r61Var.f9369J == p61.f7987j) {
                    r61Var.m4372e();
                }
                boolean zM3082t0 = v61Var.f11795p.m3082t0(j);
                r61 r61VarM4389u = r61Var.m4389u();
                if (zM3082t0 && r61VarM4389u != null) {
                    if (r61Var.m4386r() == p61.f7985h) {
                        r61.m4341V(r61VarM4389u, false, 3);
                    } else if (r61Var.m4386r() == p61.f7986i) {
                        r61VarM4389u.m4362U(false);
                    }
                }
                if (r61Var.m4384p() && r61Var.m4351I()) {
                    r61Var.m4360R();
                    dq1 dq1Var = this.f5494e;
                    dq1Var.getClass();
                    if (r61Var.f9382W > 0) {
                        ((zk1) dq1Var.f2147i).m6423b(r61Var);
                        r61Var.f9381V = true;
                    }
                }
                m2654e();
            } finally {
            }
        }
        zk1 zk1Var = this.f5495f;
        Object[] objArr = zk1Var.f13934h;
        int i = zk1Var.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            vn1 vn1Var = ((r61) objArr[i2]).f9372M;
            qz0 qz0Var = (qz0) vn1Var.f12033d;
            boolean zM244g = ao1.m244g(4194304);
            if (zM244g) {
                th1Var = qz0Var.f9293Y;
            } else {
                th1Var = qz0Var.f9293Y.f10761l;
                if (th1Var == null) {
                }
            }
            ca2 ca2Var = zn1.f13961T;
            for (th1 th1VarM6453U0 = qz0Var.m6453U0(zM244g); th1VarM6453U0 != null && (th1VarM6453U0.f10760k & 4194304) != 0; th1VarM6453U0 = th1VarM6453U0.f10762m) {
                if ((th1VarM6453U0.f10759j & 4194304) != 0) {
                    ?? M4952m = th1VarM6453U0;
                    ?? zk1Var2 = 0;
                    while (M4952m != 0) {
                        if (M4952m instanceof a61) {
                            ((a61) M4952m).mo100q((qz0) vn1Var.f12033d);
                        } else if ((M4952m.f10759j & 4194304) != 0 && (M4952m instanceof u60)) {
                            th1 th1Var2 = ((u60) M4952m).f11116w;
                            int i3 = 0;
                            M4952m = M4952m;
                            zk1Var2 = zk1Var2;
                            while (th1Var2 != null) {
                                if ((th1Var2.f10759j & 4194304) != 0) {
                                    i3++;
                                    zk1Var2 = zk1Var2;
                                    if (i3 == 1) {
                                        M4952m = th1Var2;
                                    } else {
                                        if (zk1Var2 == 0) {
                                            zk1Var2 = new zk1(new th1[16]);
                                        }
                                        if (M4952m != 0) {
                                            zk1Var2.m6423b(M4952m);
                                            M4952m = 0;
                                        }
                                        zk1Var2.m6423b(th1Var2);
                                    }
                                }
                                th1Var2 = th1Var2.f10762m;
                                M4952m = M4952m;
                                zk1Var2 = zk1Var2;
                            }
                            if (i3 == 1) {
                            }
                        }
                        M4952m = sp0.m4952m(zk1Var2);
                    }
                }
                if (th1VarM6453U0 != th1Var) {
                }
            }
        }
        zk1Var.m6428g();
    }

    /* JADX INFO: renamed from: n */
    public final void m2660n() {
        C0043b5 c0043b5 = this.f5491b;
        if (c0043b5.m436w()) {
            r61 r61Var = this.f5490a;
            if (!r61Var.m4350H()) {
                kz0.m2763a("performMeasureAndLayout called with unattached root");
            }
            if (!r61Var.m4351I()) {
                kz0.m2763a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f5492c) {
                kz0.m2763a("performMeasureAndLayout called during measure layout");
            }
            if (this.f5498i != null) {
                this.f5492c = true;
                this.f5493d = false;
                try {
                    if ((((gt2) ((C0485n4) c0043b5.f564k).f6983i).isEmpty() || ((gt2) ((C0485n4) c0043b5.f562i).f6983i).isEmpty()) ? false : true) {
                        if (r61Var.f9391o != null) {
                            m2663q(r61Var, true);
                        } else {
                            m2662p(r61Var);
                        }
                    }
                    m2663q(r61Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.f5492c = false;
                        this.f5493d = false;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2661o(r61 r61Var, boolean z) {
        C0221fz c0221fz;
        boolean zM2649d = false;
        if (!r61Var.f9383X && m2652k(r61Var)) {
            if (r61Var == this.f5490a) {
                c0221fz = this.f5498i;
                c0221fz.getClass();
            } else {
                c0221fz = null;
            }
            if (z) {
                if (r61Var.f9373N.f11784e) {
                    zM2649d = m2648c(r61Var, c0221fz);
                }
            } else if (r61Var.m4385q()) {
                zM2649d = m2649d(r61Var, c0221fz);
            }
            m2654e();
        }
        return zM2649d;
    }

    /* JADX INFO: renamed from: p */
    public final void m2662p(r61 r61Var) {
        zk1 zk1VarM4393y = r61Var.m4393y();
        Object[] objArr = zk1VarM4393y.f13934h;
        int i = zk1VarM4393y.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            r61 r61Var2 = (r61) objArr[i2];
            if (r61Var2.m4386r() == p61.f7985h || r61Var2.f9373N.f11795p.f6604D.m4742e()) {
                if (fg1.m1651z(r61Var2)) {
                    m2663q(r61Var2, true);
                } else {
                    m2662p(r61Var2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2663q(r61 r61Var, boolean z) {
        C0221fz c0221fz;
        if (r61Var.f9383X) {
            return;
        }
        if (r61Var == this.f5490a) {
            c0221fz = this.f5498i;
            c0221fz.getClass();
        } else {
            c0221fz = null;
        }
        if (z) {
            m2648c(r61Var, c0221fz);
        } else {
            m2649d(r61Var, c0221fz);
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2664r(r61 r61Var, boolean z) {
        int iOrdinal = r61Var.f9373N.f11783d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f5497h.m6423b(new jf1(r61Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    c80.m675s();
                    return false;
                }
                if (!r61Var.m4385q() || z) {
                    r61Var.f9373N.f11795p.f6601A = true;
                    if (!r61Var.f9383X && (r61Var.m4351I() || m2651j(r61Var))) {
                        r61 r61VarM4389u = r61Var.m4389u();
                        if (r61VarM4389u == null || !r61VarM4389u.m4385q()) {
                            this.f5491b.m423j(r61Var, a21.f38j);
                        }
                        if (!this.f5493d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m2665s(long j) {
        C0221fz c0221fz = this.f5498i;
        if (c0221fz == null ? false : C0221fz.m1757b(c0221fz.f3199a, j)) {
            return;
        }
        if (this.f5492c) {
            kz0.m2763a("updateRootConstraints called while measuring");
        }
        this.f5498i = new C0221fz(j);
        r61 r61Var = this.f5490a;
        r61 r61Var2 = r61Var.f9391o;
        v61 v61Var = r61Var.f9373N;
        if (r61Var2 != null) {
            v61Var.f11784e = true;
        }
        v61Var.f11795p.f6601A = true;
        this.f5491b.m423j(r61Var, r61Var2 != null ? a21.f36h : a21.f38j);
    }
}
