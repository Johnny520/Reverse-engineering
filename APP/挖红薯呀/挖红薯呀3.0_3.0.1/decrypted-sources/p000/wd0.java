package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class wd0 extends xq0 implements sd0, InterfaceC0749t2, cg0 {

    /* JADX INFO: renamed from: C */
    public boolean f7084C;

    /* JADX INFO: renamed from: G */
    public float f7088G;

    /* JADX INFO: renamed from: H */
    public boolean f7089H;

    /* JADX INFO: renamed from: I */
    public InterfaceC0742sw f7090I;

    /* JADX INFO: renamed from: K */
    public float f7092K;

    /* JADX INFO: renamed from: M */
    public boolean f7094M;

    /* JADX INFO: renamed from: i */
    public final f60 f7095i;

    /* JADX INFO: renamed from: j */
    public boolean f7096j;

    /* JADX INFO: renamed from: m */
    public boolean f7099m;

    /* JADX INFO: renamed from: n */
    public boolean f7100n;

    /* JADX INFO: renamed from: q */
    public InterfaceC0742sw f7103q;

    /* JADX INFO: renamed from: r */
    public float f7104r;

    /* JADX INFO: renamed from: t */
    public Object f7106t;

    /* JADX INFO: renamed from: u */
    public boolean f7107u;

    /* JADX INFO: renamed from: v */
    public boolean f7108v;

    /* JADX INFO: renamed from: w */
    public boolean f7109w;

    /* JADX INFO: renamed from: x */
    public boolean f7110x;

    /* JADX INFO: renamed from: y */
    public boolean f7111y;

    /* JADX INFO: renamed from: k */
    public int f7097k = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l */
    public int f7098l = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: o */
    public z50 f7101o = z50.f7802f;

    /* JADX INFO: renamed from: p */
    public long f7102p = 0;

    /* JADX INFO: renamed from: s */
    public boolean f7105s = true;

    /* JADX INFO: renamed from: z */
    public final c60 f7112z = new c60(this, 0);

    /* JADX INFO: renamed from: A */
    public final sh0 f7082A = new sh0(new wd0[16]);

    /* JADX INFO: renamed from: B */
    public boolean f7083B = true;

    /* JADX INFO: renamed from: D */
    public long f7085D = AbstractC0654qj.m3255b(0, 0, 15);

    /* JADX INFO: renamed from: E */
    public final vd0 f7086E = new vd0(this, 1);

    /* JADX INFO: renamed from: F */
    public final vd0 f7087F = new vd0(this, 0);

    /* JADX INFO: renamed from: J */
    public long f7091J = 0;

    /* JADX INFO: renamed from: L */
    public final vd0 f7093L = new vd0(this, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wd0(f60 f60Var) {
        this.f7095i = f60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: I */
    public final int mo181I(int i) {
        f60 f60Var = this.f7095i;
        if (!g60.m1217p(f60Var.f1592a)) {
            m5007g0();
            return f60Var.m1032a().mo181I(i);
        }
        ec0 ec0Var = f60Var.f1608q;
        ec0Var.getClass();
        return ec0Var.mo181I(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    /* JADX INFO: renamed from: L */
    public final int mo828L() {
        return this.f7098l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    /* JADX INFO: renamed from: N */
    public final void mo829N() {
        b60.m262X(this.f7095i.f1592a, false, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: O */
    public final int mo182O(int i) {
        f60 f60Var = this.f7095i;
        if (!g60.m1217p(f60Var.f1592a)) {
            m5007g0();
            return f60Var.m1032a().mo182O(i);
        }
        ec0 ec0Var = f60Var.f1608q;
        ec0Var.getClass();
        return ec0Var.mo182O(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: R */
    public final int mo183R(int i) {
        f60 f60Var = this.f7095i;
        if (!g60.m1217p(f60Var.f1592a)) {
            m5007g0();
            return f60Var.m1032a().mo183R(i);
        }
        ec0 ec0Var = f60Var.f1608q;
        ec0Var.getClass();
        return ec0Var.mo183R(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xq0
    /* JADX INFO: renamed from: S */
    public final int mo5001S() {
        return this.f7095i.m1032a().mo5001S();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xq0
    /* JADX INFO: renamed from: U */
    public final int mo5002U() {
        return this.f7095i.m1032a().mo5002U();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xq0
    /* JADX INFO: renamed from: X */
    public final void mo47X(long j, float f, InterfaceC0742sw interfaceC0742sw) {
        wq0 placementScope;
        f60 f60Var = this.f7095i;
        b60 b60Var = f60Var.f1592a;
        b60 b60Var2 = f60Var.f1592a;
        try {
            this.f7108v = true;
            if (!w20.m4833a(j, this.f7102p) || this.f7094M) {
                if (f60Var.f1602k || f60Var.f1601j || this.f7094M) {
                    this.f7110x = true;
                    this.f7094M = false;
                }
                m5006e0();
            }
            ec0 ec0Var = f60Var.f1608q;
            if (ec0Var != null) {
                f60 f60Var2 = ec0Var.f1377i;
                if (ec0Var.f1387s == cc0.f784f && !g60.m1217p(f60Var2.f1592a)) {
                    f60Var2.f1594c = true;
                }
            }
            ec0 ec0Var2 = f60Var.f1608q;
            if (ec0Var2 != null && ec0Var2.m831b0()) {
                qj0 qj0Var = f60Var.m1032a().f5182t;
                if (qj0Var == null || (placementScope = qj0Var.f7598o) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var2)).getPlacementScope();
                }
                ec0 ec0Var3 = f60Var.f1608q;
                ec0Var3.getClass();
                b60 b60VarM315v = b60Var2.m315v();
                if (b60VarM315v != null) {
                    b60VarM315v.f396J.f1599h = 0;
                }
                ec0Var3.f1380l = Integer.MAX_VALUE;
                wq0.m5015i(placementScope, ec0Var3, (int) (j >> 32), (int) (4294967295L & j));
            }
            ec0 ec0Var4 = f60Var.f1608q;
            if (ec0Var4 != null && !ec0Var4.f1382n) {
                w10.m4824b("Error: Placement happened before lookahead.");
            }
            m5009l0(j, f, interfaceC0742sw);
        } catch (Throwable th) {
            b60Var.m288a0(th);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    /* JADX INFO: renamed from: a */
    public final c60 mo830a() {
        return this.f7112z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public final List m5003b0() {
        f60 f60Var = this.f7095i;
        f60Var.f1592a.m302h0();
        boolean z = this.f7083B;
        sh0 sh0Var = this.f7082A;
        if (!z) {
            return sh0Var.m4076f();
        }
        b60 b60Var = f60Var.f1592a;
        sh0 sh0VarM319z = b60Var.m319z();
        Object[] objArr = sh0VarM319z.f5768d;
        int i = sh0VarM319z.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            b60 b60Var2 = (b60) objArr[i2];
            if (sh0Var.f5770f <= i2) {
                sh0Var.m4072b(b60Var2.f396J.f1607p);
            } else {
                wd0 wd0Var = b60Var2.f396J.f1607p;
                Object[] objArr2 = sh0Var.f5768d;
                Object obj = objArr2[i2];
                objArr2[i2] = wd0Var;
            }
        }
        sh0Var.m4082l(((ph0) b60Var.m307n()).f4858d.f5770f, sh0Var.f5770f);
        this.f7083B = false;
        return sh0Var.m4076f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final void m5004c0() {
        boolean z = this.f7107u;
        this.f7107u = true;
        f60 f60Var = this.f7095i;
        b60 b60Var = f60Var.f1592a;
        mj0 mj0Var = b60Var.f395I;
        if (!z) {
            mj0Var.f3995c.m3278S0();
            ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var)).getRectManager().m4352f(f60Var.f1592a, true);
            if (b60Var.m311r()) {
                b60.m262X(b60Var, true, 6);
            } else if (b60Var.f396J.f1596e) {
                b60.m261V(b60Var, true, 6);
            }
        }
        qj0 qj0Var = mj0Var.f3995c.f5181s;
        for (qj0 qj0Var2 = mj0Var.f3996d; !p30.m3002l(qj0Var2, qj0Var) && qj0Var2 != null; qj0Var2 = qj0Var2.f5181s) {
            if (qj0Var2.f5178N) {
                qj0Var2.m3273N0();
            }
        }
        sh0 sh0VarM319z = b60Var.m319z();
        Object[] objArr = sh0VarM319z.f5768d;
        int i = sh0VarM319z.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            b60 b60Var2 = (b60) objArr[i2];
            if (b60Var2.m316w() != Integer.MAX_VALUE) {
                b60Var2.f396J.f1607p.m5004c0();
                b60.m263Y(b60Var2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final void m5005d0() {
        if (this.f7107u) {
            this.f7107u = false;
            f60 f60Var = this.f7095i;
            b60 b60Var = f60Var.f1592a;
            b60 b60Var2 = f60Var.f1592a;
            ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var)).getRectManager().m4353h(b60Var2);
            mj0 mj0Var = b60Var2.f395I;
            qj0 qj0Var = mj0Var.f3995c.f5181s;
            for (qj0 qj0Var2 = mj0Var.f3996d; !p30.m3002l(qj0Var2, qj0Var) && qj0Var2 != null; qj0Var2 = qj0Var2.f5181s) {
                qj0Var2.m3280U0();
                qj0Var2.m3284Z0();
            }
            sh0 sh0VarM319z = b60Var2.m319z();
            Object[] objArr = sh0VarM319z.f5768d;
            int i = sh0VarM319z.f5770f;
            for (int i2 = 0; i2 < i; i2++) {
                ((b60) objArr[i2]).f396J.f1607p.m5005d0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: e */
    public final xq0 mo184e(long j) {
        z50 z50Var;
        f60 f60Var = this.f7095i;
        b60 b60Var = f60Var.f1592a;
        b60 b60Var2 = f60Var.f1592a;
        z50 z50Var2 = b60Var.f392F;
        z50 z50Var3 = z50.f7802f;
        if (z50Var2 == z50Var3) {
            b60Var.m295e();
        }
        if (g60.m1217p(b60Var2)) {
            ec0 ec0Var = f60Var.f1608q;
            ec0Var.getClass();
            ec0Var.f1381m = z50Var3;
            ec0Var.mo184e(j);
        }
        b60 b60VarM315v = b60Var2.m315v();
        if (b60VarM315v != null) {
            f60 f60Var2 = b60VarM315v.f396J;
            if (this.f7101o != z50Var3 && !b60Var2.f394H) {
                w10.m4824b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = f60Var2.f1595d.ordinal();
            if (iOrdinal == 0) {
                z50Var = z50.f7800d;
            } else {
                if (iOrdinal != 2) {
                    C0921xc.m5133n(f60Var2.f1595d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                z50Var = z50.f7801e;
            }
            this.f7101o = z50Var;
        } else {
            this.f7101o = z50Var3;
        }
        m5010m0(j);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public final void m5006e0() {
        f60 f60Var = this.f7095i;
        if (f60Var.f1603l > 0) {
            sh0 sh0VarM319z = f60Var.f1592a.m319z();
            Object[] objArr = sh0VarM319z.f5768d;
            int i = sh0VarM319z.f5770f;
            for (int i2 = 0; i2 < i; i2++) {
                b60 b60Var = (b60) objArr[i2];
                f60 f60Var2 = b60Var.f396J;
                boolean z = f60Var2.f1601j;
                wd0 wd0Var = f60Var2.f1607p;
                if ((z || f60Var2.f1602k) && !wd0Var.f7110x) {
                    b60Var.m285W(false);
                }
                wd0Var.m5006e0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: f */
    public final int mo185f(int i) {
        f60 f60Var = this.f7095i;
        if (!g60.m1217p(f60Var.f1592a)) {
            m5007g0();
            return f60Var.m1032a().mo185f(i);
        }
        ec0 ec0Var = f60Var.f1608q;
        ec0Var.getClass();
        return ec0Var.mo185f(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public final void m5007g0() {
        f60 f60Var = this.f7095i;
        b60.m262X(f60Var.f1592a, false, 7);
        b60 b60Var = f60Var.f1592a;
        b60 b60VarM315v = b60Var.m315v();
        if (b60VarM315v == null || b60Var.f392F != z50.f7802f) {
            return;
        }
        int iOrdinal = b60VarM315v.f396J.f1595d.ordinal();
        b60Var.f392F = iOrdinal != 0 ? iOrdinal != 2 ? b60VarM315v.f392F : z50.f7801e : z50.f7800d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xq0, p000.sd0
    /* JADX INFO: renamed from: j */
    public final Object mo50j() {
        return this.f7106t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final void m5008k0() {
        this.f7089H = true;
        f60 f60Var = this.f7095i;
        b60 b60VarM315v = f60Var.f1592a.m315v();
        float f = mo840r().f5168D;
        b60 b60Var = f60Var.f1592a;
        mj0 mj0Var = b60Var.f395I;
        qj0 qj0Var = mj0Var.f3996d;
        c20 c20Var = mj0Var.f3995c;
        while (qj0Var != c20Var) {
            qj0Var.getClass();
            t50 t50Var = (t50) qj0Var;
            f += t50Var.f5168D;
            qj0Var = t50Var.f5181s;
        }
        if (f != this.f7088G) {
            this.f7088G = f;
            if (b60VarM315v != null) {
                b60VarM315v.m279O();
            }
            if (b60VarM315v != null) {
                b60VarM315v.m267C();
            }
        }
        if (!mo840r().f7597n) {
            boolean z = this.f7107u;
            if (!z || this.f7112z.m494d()) {
                m5004c0();
            }
            if (z) {
                b60Var.f395I.f3995c.m3278S0();
            } else {
                if (b60VarM315v != null) {
                    b60VarM315v.m267C();
                }
                if (this.f7096j && b60VarM315v != null) {
                    b60VarM315v.m285W(false);
                }
            }
        }
        if (b60VarM315v != null) {
            f60 f60Var2 = b60VarM315v.f396J;
            if (!this.f7096j && f60Var2.f1595d == x50.f7266f) {
                if (this.f7098l != Integer.MAX_VALUE) {
                    w10.m4824b("Place was called on a node which was placed already");
                }
                int i = f60Var2.f1600i;
                this.f7098l = i;
                f60Var2.f1600i = i + 1;
            }
        } else {
            this.f7098l = 0;
        }
        mo842u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    /* JADX INFO: renamed from: l */
    public final void mo837l(C0711s2 c0711s2) {
        sh0 sh0VarM319z = this.f7095i.f1592a.m319z();
        Object[] objArr = sh0VarM319z.f5768d;
        int i = sh0VarM319z.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            c0711s2.invoke(((b60) objArr[i2]).f396J.f1607p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public final void m5009l0(long j, float f, InterfaceC0742sw interfaceC0742sw) {
        f60 f60Var = this.f7095i;
        b60 b60Var = f60Var.f1592a;
        b60 b60Var2 = f60Var.f1592a;
        if (b60Var.f404R) {
            w10.m4823a("place is called on a deactivated node");
        }
        f60Var.f1595d = x50.f7266f;
        this.f7102p = j;
        this.f7104r = f;
        this.f7103q = interfaceC0742sw;
        this.f7089H = false;
        dn0 dn0VarM789a = e60.m789a(b60Var2);
        if (this.f7110x || !this.f7107u) {
            this.f7112z.f711e = false;
            f60Var.m1037f(false);
            this.f7090I = interfaceC0742sw;
            this.f7091J = j;
            this.f7092K = f;
            fn0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0VarM789a).getSnapshotObserver();
            snapshotObserver.f1778a.m777b(b60Var2, snapshotObserver.f1783f, this.f7093L);
        } else {
            qj0 qj0VarM1032a = f60Var.m1032a();
            qj0VarM1032a.m3282X0(w20.m4835c(j, qj0VarM1032a.f7404h), f, interfaceC0742sw);
            m5008k0();
        }
        f60Var.f1595d = x50.f7268h;
        if (f60Var.m1032a().f7597n && (f60Var.f1602k || f60Var.f1601j)) {
            requestLayout();
        }
        this.f7100n = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final boolean m5010m0(long j) {
        f60 f60Var = this.f7095i;
        b60 b60Var = f60Var.f1592a;
        b60 b60Var2 = f60Var.f1592a;
        try {
            if (b60Var.f404R) {
                w10.m4823a("measure is called on a deactivated node");
            }
            dn0 dn0VarM789a = e60.m789a(b60Var2);
            b60 b60VarM315v = b60Var2.m315v();
            boolean z = true;
            b60Var2.f394H = b60Var2.f394H || (b60VarM315v != null && b60VarM315v.f394H);
            if (!b60Var2.m311r() && C0617pj.m3131b(this.f7403g, j)) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0VarM789a).m4853k(b60Var2, false);
                b60Var2.m286Z();
                return false;
            }
            this.f7112z.f710d = false;
            sh0 sh0VarM319z = b60Var2.m319z();
            Object[] objArr = sh0VarM319z.f5768d;
            int i = sh0VarM319z.f5770f;
            for (int i2 = 0; i2 < i; i2++) {
                ((b60) objArr[i2]).f396J.f1607p.f7112z.getClass();
            }
            this.f7099m = true;
            long j2 = f60Var.m1032a().f7402f;
            m5146a0(j);
            x50 x50Var = f60Var.f1595d;
            x50 x50Var2 = x50.f7268h;
            if (x50Var != x50Var2) {
                w10.m4824b("layout state is not idle before measure starts");
            }
            this.f7085D = j;
            x50 x50Var3 = x50.f7264d;
            f60Var.f1595d = x50Var3;
            this.f7109w = false;
            fn0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var2)).getSnapshotObserver();
            snapshotObserver.f1778a.m777b(b60Var2, snapshotObserver.f1780c, this.f7086E);
            if (f60Var.f1595d == x50Var3) {
                this.f7110x = true;
                this.f7111y = true;
                f60Var.f1595d = x50Var2;
            }
            if (d30.m628a(f60Var.m1032a().f7402f, j2) && f60Var.m1032a().f7400d == this.f7400d && f60Var.m1032a().f7401e == this.f7401e) {
                z = false;
            }
            m5145Y((((long) f60Var.m1032a().f7401e) & 4294967295L) | (((long) f60Var.m1032a().f7400d) << 32));
            return z;
        } catch (Throwable th) {
            b60Var.m288a0(th);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.cg0
    /* JADX INFO: renamed from: n */
    public final void mo530n(boolean z) {
        f60 f60Var = this.f7095i;
        if (z != f60Var.m1032a().f7595l) {
            f60Var.m1032a().f7595l = z;
            this.f7094M = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    /* JADX INFO: renamed from: r */
    public final c20 mo840r() {
        return this.f7095i.f1592a.f395I.f3995c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    public final void requestLayout() {
        this.f7095i.f1592a.m285W(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    /* JADX INFO: renamed from: s */
    public final InterfaceC0749t2 mo841s() {
        f60 f60Var;
        b60 b60VarM315v = this.f7095i.f1592a.m315v();
        if (b60VarM315v == null || (f60Var = b60VarM315v.f396J) == null) {
            return null;
        }
        return f60Var.f1607p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    /* JADX INFO: renamed from: u */
    public final void mo842u() {
        this.f7084C = true;
        c60 c60Var = this.f7112z;
        c60Var.m498h();
        boolean z = this.f7110x;
        f60 f60Var = this.f7095i;
        if (z) {
            sh0 sh0VarM319z = f60Var.f1592a.m319z();
            Object[] objArr = sh0VarM319z.f5768d;
            int i = sh0VarM319z.f5770f;
            for (int i2 = 0; i2 < i; i2++) {
                b60 b60Var = (b60) objArr[i2];
                if (b60Var.m311r() && b60Var.m312s() == z50.f7800d && b60.m260Q(b60Var)) {
                    b60.m262X(f60Var.f1592a, false, 7);
                }
            }
        }
        if (this.f7111y || (!mo840r().f7597n && this.f7110x)) {
            this.f7110x = false;
            x50 x50Var = f60Var.f1595d;
            f60Var.f1595d = x50.f7266f;
            f60Var.m1038g(false);
            b60 b60Var2 = f60Var.f1592a;
            fn0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var2)).getSnapshotObserver();
            snapshotObserver.f1778a.m777b(b60Var2, snapshotObserver.f1782e, this.f7087F);
            f60Var.f1595d = x50Var;
            this.f7111y = false;
        }
        if (c60Var.f708b && c60Var.m495e()) {
            c60Var.m497g();
        }
        this.f7084C = false;
    }
}
