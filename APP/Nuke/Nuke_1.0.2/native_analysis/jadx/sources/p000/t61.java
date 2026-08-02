package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t61 implements nc0 {

    /* JADX INFO: renamed from: h */
    public final C0702sp f10581h = new C0702sp();

    /* JADX INFO: renamed from: i */
    public mc0 f10582i;

    @Override // p000.e70
    /* JADX INFO: renamed from: A */
    public final float mo689A(float f) {
        return this.f10581h.mo693b() * f;
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: E */
    public final C0043b5 mo3274E() {
        return this.f10581h.f10257i;
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: G */
    public final void mo3275G(C0915y9 c0915y9, AbstractC0024an abstractC0024an, float f, op0 op0Var, int i) {
        this.f10581h.mo3275G(c0915y9, abstractC0024an, f, op0Var, i);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: K */
    public final float mo690K(long j) {
        return this.f10581h.mo690K(j);
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: R */
    public final void mo3276R(C0122d9 c0122d9, long j, long j2, long j3, float f, C0095cl c0095cl, int i) {
        this.f10581h.mo3276R(c0122d9, j, j2, j3, f, c0095cl, i);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: T */
    public final int mo692T(float f) {
        return this.f10581h.mo692T(f);
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: Y */
    public final void mo3277Y(long j, long j2, long j3, float f, int i) {
        this.f10581h.mo3277Y(j, j2, j3, f, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m5125a() {
        C0702sp c0702sp = this.f10581h;
        InterfaceC0627qp interfaceC0627qpM430q = c0702sp.f10257i.m430q();
        t60 t60Var = this.f10582i;
        if (t60Var == null) {
            throw vi0.m5686e("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        th1 th1Var = (th1) t60Var;
        th1 th1VarM4952m = th1Var.f10757h.f10762m;
        if (th1VarM4952m == null || (th1VarM4952m.f10760k & 4) == 0) {
            th1VarM4952m = null;
        } else {
            while (th1VarM4952m != null) {
                int i = th1VarM4952m.f10759j;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    th1VarM4952m = th1VarM4952m.f10762m;
                }
            }
            th1VarM4952m = null;
        }
        if (th1VarM4952m == null) {
            zn1 zn1VarM4927Z = sp0.m4927Z(t60Var, 4);
            if (zn1VarM4927Z.mo2843S0() == th1Var.f10757h) {
                zn1VarM4927Z = zn1VarM4927Z.f13986w;
                zn1VarM4927Z.getClass();
            }
            zn1VarM4927Z.mo2844h1(interfaceC0627qpM430q, (pq0) c0702sp.f10257i.f563j);
            return;
        }
        zk1 zk1Var = null;
        while (th1VarM4952m != null) {
            if (th1VarM4952m instanceof mc0) {
                mc0 mc0Var = (mc0) th1VarM4952m;
                pq0 pq0Var = (pq0) c0702sp.f10257i.f563j;
                zn1 zn1VarM4927Z2 = sp0.m4927Z(mc0Var, 4);
                long jM4715q0 = s11.m4715q0(zn1VarM4927Z2.f10440j);
                r61 r61Var = zn1VarM4927Z2.f13985v;
                r61Var.getClass();
                ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61Var)).getSharedDrawScope().m5126c(interfaceC0627qpM430q, jM4715q0, zn1VarM4927Z2, mc0Var, pq0Var);
            } else if ((th1VarM4952m.f10759j & 4) != 0 && (th1VarM4952m instanceof u60)) {
                int i2 = 0;
                for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                    if ((th1Var2.f10759j & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
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
                if (i2 == 1) {
                }
            }
            th1VarM4952m = sp0.m4952m(zk1Var);
        }
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: a0 */
    public final long mo3278a0() {
        return this.f10581h.mo3278a0();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        return this.f10581h.mo693b();
    }

    /* JADX INFO: renamed from: c */
    public final void m5126c(InterfaceC0627qp interfaceC0627qp, long j, zn1 zn1Var, mc0 mc0Var, pq0 pq0Var) {
        mc0 mc0Var2 = this.f10582i;
        this.f10582i = mc0Var;
        d61 d61Var = zn1Var.f13985v.f9366G;
        C0702sp c0702sp = this.f10581h;
        C0043b5 c0043b5 = c0702sp.f10257i;
        C0664rp c0664rp = ((C0702sp) c0043b5.f564k).f10256h;
        e70 e70Var = c0664rp.f9665a;
        d61 d61Var2 = c0664rp.f9666b;
        InterfaceC0627qp interfaceC0627qpM430q = c0043b5.m430q();
        C0043b5 c0043b52 = c0702sp.f10257i;
        long jM434u = c0043b52.m434u();
        pq0 pq0Var2 = (pq0) c0043b52.f563j;
        c0043b52.m412C(zn1Var);
        c0043b52.m413D(d61Var);
        c0043b52.m411B(interfaceC0627qp);
        c0043b52.m414E(j);
        c0043b52.f563j = pq0Var;
        interfaceC0627qp.mo1522l();
        try {
            mc0Var.mo1851P(this);
            interfaceC0627qp.mo1520i();
            c0043b52.m412C(e70Var);
            c0043b52.m413D(d61Var2);
            c0043b52.m411B(interfaceC0627qpM430q);
            c0043b52.m414E(jM434u);
            c0043b52.f563j = pq0Var2;
            this.f10582i = mc0Var2;
        } catch (Throwable th) {
            interfaceC0627qp.mo1520i();
            c0043b52.m412C(e70Var);
            c0043b52.m413D(d61Var2);
            c0043b52.m411B(interfaceC0627qpM430q);
            c0043b52.m414E(jM434u);
            c0043b52.f563j = pq0Var2;
            throw th;
        }
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: c0 */
    public final void mo3279c0(long j, long j2, long j3, op0 op0Var, int i) {
        this.f10581h.mo3279c0(j, j2, j3, op0Var, i);
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: d */
    public final long mo3280d() {
        return this.f10581h.mo3280d();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: d0 */
    public final long mo694d0(long j) {
        return this.f10581h.mo694d0(j);
    }

    @Override // p000.nc0
    public final d61 getLayoutDirection() {
        return this.f10581h.f10256h.f9666b;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: h0 */
    public final float mo695h0(long j) {
        return this.f10581h.mo695h0(j);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        return this.f10581h.mo697m();
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: o */
    public final void mo3281o(long j, float f, long j2, op0 op0Var) {
        this.f10581h.mo3281o(j, f, j2, op0Var);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: p0 */
    public final long mo698p0(float f) {
        return this.f10581h.mo698p0(f);
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: t */
    public final void mo3282t(C0915y9 c0915y9, long j, op0 op0Var) {
        this.f10581h.mo3282t(c0915y9, j, op0Var);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: u0 */
    public final float mo700u0(int i) {
        return this.f10581h.mo700u0(i);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: x */
    public final long mo701x(float f) {
        return this.f10581h.mo701x(f);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: x0 */
    public final float mo702x0(float f) {
        return f / this.f10581h.mo693b();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: y */
    public final long mo703y(long j) {
        return this.f10581h.mo703y(j);
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: z */
    public final void mo3283z(AbstractC0024an abstractC0024an, long j, long j2, long j3, float f, op0 op0Var) {
        this.f10581h.mo3283z(abstractC0024an, j, j2, j3, f, op0Var);
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: z0 */
    public final void mo3284z0(long j, float f, float f2, long j2, long j3, op0 op0Var) {
        this.f10581h.mo3284z0(j, f, f2, j2, j3, op0Var);
    }
}
