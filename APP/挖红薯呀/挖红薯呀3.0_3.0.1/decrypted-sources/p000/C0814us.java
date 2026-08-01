package p000;

/* JADX INFO: renamed from: us */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0814us extends oe0 implements r50 {

    /* JADX INFO: renamed from: A */
    public final C0711s2 f6286A;

    /* JADX INFO: renamed from: r */
    public b91 f6287r;

    /* JADX INFO: renamed from: s */
    public w81 f6288s;

    /* JADX INFO: renamed from: t */
    public w81 f6289t;

    /* JADX INFO: renamed from: u */
    public C0863vs f6290u;

    /* JADX INFO: renamed from: v */
    public C0367jt f6291v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0298hw f6292w;

    /* JADX INFO: renamed from: x */
    public C0589os f6293x;

    /* JADX INFO: renamed from: y */
    public long f6294y = -9223372034707292160L;

    /* JADX INFO: renamed from: z */
    public C0276ha f6295z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0814us(b91 b91Var, w81 w81Var, w81 w81Var2, C0863vs c0863vs, C0367jt c0367jt, InterfaceC0298hw interfaceC0298hw, C0589os c0589os) {
        this.f6287r = b91Var;
        this.f6288s = w81Var;
        this.f6289t = w81Var2;
        this.f6290u = c0863vs;
        this.f6291v = c0367jt;
        this.f6292w = interfaceC0298hw;
        this.f6293x = c0589os;
        AbstractC0654qj.m3255b(0, 0, 15);
        this.f6286A = new C0711s2(10, this);
        new b71(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: G */
    public final int mo2086G(yb0 yb0Var, sd0 sd0Var, int i) {
        return sd0Var.mo181I(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        if (this.f6287r.m328c() == this.f6287r.f462d.getValue()) {
            this.f6295z = null;
        } else if (this.f6295z == null) {
            C0276ha c0276haM4344w0 = m4344w0();
            if (c0276haM4344w0 == null) {
                c0276haM4344w0 = C0496n2.f4145e;
            }
            this.f6295z = c0276haM4344w0;
        }
        boolean zMo53m = zd0Var.mo53m();
        C0330is c0330is = C0330is.f2614d;
        if (zMo53m) {
            xq0 xq0VarMo184e = sd0Var.mo184e(j);
            long j2 = (((long) xq0VarMo184e.f7400d) << 32) | (((long) xq0VarMo184e.f7401e) & 4294967295L);
            this.f6294y = j2;
            return zd0Var.mo1279Q((int) (j2 >> 32), (int) (j2 & 4294967295L), c0330is, new C0306i3(xq0VarMo184e, 2));
        }
        if (!((Boolean) this.f6292w.invoke()).booleanValue()) {
            xq0 xq0VarMo184e2 = sd0Var.mo184e(j);
            return zd0Var.mo1279Q(xq0VarMo184e2.f7400d, xq0VarMo184e2.f7401e, c0330is, new C0306i3(xq0VarMo184e2, 3));
        }
        C0589os c0589os = this.f6293x;
        w81 w81Var = c0589os.f4617a;
        b91 b91Var = c0589os.f4618b;
        C0863vs c0863vs = c0589os.f4619c;
        C0367jt c0367jt = c0589os.f4620d;
        int i = 0;
        int i2 = 1;
        v81 v81VarM4925a = w81Var != null ? w81Var.m4925a(new C0626ps(c0863vs, c0367jt, 0), new C0626ps(c0863vs, c0367jt, 1)) : null;
        b91Var.m328c();
        C0697rp c0697rp = new C0697rp(v81VarM4925a, null, null, 1);
        xq0 xq0VarMo184e3 = sd0Var.mo184e(j);
        long j3 = (((long) xq0VarMo184e3.f7400d) << 32) | (((long) xq0VarMo184e3.f7401e) & 4294967295L);
        long j4 = !d30.m628a(this.f6294y, -9223372034707292160L) ? this.f6294y : j3;
        w81 w81Var2 = this.f6288s;
        v81 v81VarM4925a2 = w81Var2 != null ? w81Var2.m4925a(this.f6286A, new C0777ts(this, j4, i)) : null;
        if (v81VarM4925a2 != null) {
            j3 = ((d30) v81VarM4925a2.getValue()).f953a;
        }
        long jM3257d = AbstractC0654qj.m3257d(j, j3);
        w81 w81Var3 = this.f6289t;
        long j5 = w81Var3 != null ? ((w20) w81Var3.m4925a(C0601p3.f4721o, new C0777ts(this, j4, i2)).getValue()).f6904a : 0L;
        C0276ha c0276ha = this.f6295z;
        return zd0Var.mo1279Q((int) (jM3257d >> 32), (int) (jM3257d & 4294967295L), c0330is, new C0737ss(xq0VarMo184e3, w20.m4835c(c0276ha != null ? c0276ha.m1284a(j4, jM3257d, k50.f3015d) : 0L, 0L), j5, c0697rp));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: d */
    public final int mo2087d(yb0 yb0Var, sd0 sd0Var, int i) {
        return sd0Var.mo182O(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: i */
    public final int mo2088i(yb0 yb0Var, sd0 sd0Var, int i) {
        return sd0Var.mo185f(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: o0 */
    public final void mo656o0() {
        this.f6294y = -9223372034707292160L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: s */
    public final int mo2089s(yb0 yb0Var, sd0 sd0Var, int i) {
        return sd0Var.mo183R(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public final C0276ha m4344w0() {
        if (this.f6287r.m331f().m5104a(EnumC0485ms.f4026d, EnumC0485ms.f4027e)) {
            C0388kd c0388kd = this.f6290u.f6810a.f762a;
            if (c0388kd != null) {
                return c0388kd.f3079a;
            }
            C0388kd c0388kd2 = this.f6291v.f2940a.f762a;
            if (c0388kd2 != null) {
                return c0388kd2.f3079a;
            }
            return null;
        }
        C0388kd c0388kd3 = this.f6291v.f2940a.f762a;
        if (c0388kd3 != null) {
            return c0388kd3.f3079a;
        }
        C0388kd c0388kd4 = this.f6290u.f6810a.f762a;
        if (c0388kd4 != null) {
            return c0388kd4.f3079a;
        }
        return null;
    }
}
