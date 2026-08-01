package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ly0 extends oe0 implements r50, vz0 {

    /* JADX INFO: renamed from: r */
    public py0 f3619r;

    /* JADX INFO: renamed from: s */
    public boolean f3620s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: G */
    public final int mo2086G(yb0 yb0Var, sd0 sd0Var, int i) {
        if (this.f3620s) {
            i = Integer.MAX_VALUE;
        }
        return sd0Var.mo181I(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.vz0
    /* JADX INFO: renamed from: S */
    public final void mo757S(f01 f01Var) {
        u40[] u40VarArr = d01.f923a;
        e01 e01Var = b01.f334m;
        u40[] u40VarArr2 = d01.f923a;
        u40 u40Var = u40VarArr2[6];
        f01Var.mo17a(e01Var, Boolean.TRUE);
        final int i = 0;
        final int i2 = 1;
        hy0 hy0Var = new hy0(new InterfaceC0298hw(this) { // from class: ky0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ly0 f3287e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f3287e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int iM720g;
                int i3 = i;
                ly0 ly0Var = this.f3287e;
                switch (i3) {
                    case 0:
                        iM720g = ly0Var.f3619r.f4988a.m720g();
                        break;
                    default:
                        iM720g = ly0Var.f3619r.f4992e.m720g();
                        break;
                }
                return Float.valueOf(iM720g);
            }
        }, new InterfaceC0298hw(this) { // from class: ky0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ly0 f3287e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f3287e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int iM720g;
                int i3 = i2;
                ly0 ly0Var = this.f3287e;
                switch (i3) {
                    case 0:
                        iM720g = ly0Var.f3619r.f4988a.m720g();
                        break;
                    default:
                        iM720g = ly0Var.f3619r.f4992e.m720g();
                        break;
                }
                return Float.valueOf(iM720g);
            }
        });
        if (this.f3620s) {
            e01 e01Var2 = b01.f343v;
            u40 u40Var2 = u40VarArr2[13];
            f01Var.mo17a(e01Var2, hy0Var);
        } else {
            e01 e01Var3 = b01.f342u;
            u40 u40Var3 = u40VarArr2[12];
            f01Var.mo17a(e01Var3, hy0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        s91.m4051p(j, this.f3620s ? um0.f6264d : um0.f6265e);
        xq0 xq0VarMo184e = sd0Var.mo184e(C0617pj.m3130a(j, 0, this.f3620s ? C0617pj.m3137h(j) : Integer.MAX_VALUE, 0, this.f3620s ? Integer.MAX_VALUE : C0617pj.m3136g(j), 5));
        int i = xq0VarMo184e.f7400d;
        int iM3137h = C0617pj.m3137h(j);
        if (i > iM3137h) {
            i = iM3137h;
        }
        int i2 = xq0VarMo184e.f7401e;
        int iM3136g = C0617pj.m3136g(j);
        if (i2 > iM3136g) {
            i2 = iM3136g;
        }
        int i3 = xq0VarMo184e.f7401e - i2;
        int i4 = xq0VarMo184e.f7400d - i;
        if (!this.f3620s) {
            i3 = i4;
        }
        py0 py0Var = this.f3619r;
        dp0 dp0Var = py0Var.f4992e;
        dp0 dp0Var2 = py0Var.f4988a;
        dp0Var.m721h(i3);
        l21 l21VarM4270k = u50.m4270k();
        InterfaceC0742sw interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
        l21 l21VarM4276s = u50.m4276s(l21VarM4270k);
        try {
            if (dp0Var2.m720g() > i3) {
                dp0Var2.m721h(i3);
            }
            u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
            this.f3619r.f4989b.m721h(this.f3620s ? i2 : i);
            this.f3619r.f4990c.m721h(this.f3620s ? xq0VarMo184e.f7401e : xq0VarMo184e.f7400d);
            return zd0Var.mo1279Q(i, i2, C0330is.f2614d, new mc0(i3, 2, this, xq0VarMo184e));
        } catch (Throwable th) {
            u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: d */
    public final int mo2087d(yb0 yb0Var, sd0 sd0Var, int i) {
        if (this.f3620s) {
            i = Integer.MAX_VALUE;
        }
        return sd0Var.mo182O(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: i */
    public final int mo2088i(yb0 yb0Var, sd0 sd0Var, int i) {
        if (!this.f3620s) {
            i = Integer.MAX_VALUE;
        }
        return sd0Var.mo185f(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: s */
    public final int mo2089s(yb0 yb0Var, sd0 sd0Var, int i) {
        if (!this.f3620s) {
            i = Integer.MAX_VALUE;
        }
        return sd0Var.mo183R(i);
    }
}
