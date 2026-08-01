package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class d60 implements InterfaceC0812uq {

    /* JADX INFO: renamed from: d */
    public final C0125dd f976d = new C0125dd();

    /* JADX INFO: renamed from: e */
    public InterfaceC0775tq f977e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0812uq
    /* JADX INFO: renamed from: C */
    public final void mo639C(long j, long j2, long j3, o30 o30Var, int i) {
        this.f976d.mo639C(j, j2, j3, o30Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0812uq
    /* JADX INFO: renamed from: D */
    public final void mo640D(C0752t5 c0752t5, long j, long j2, long j3, float f, C0348ja c0348ja, int i) {
        this.f976d.mo640D(c0752t5, j, j2, j3, f, c0348ja, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: F */
    public final int mo641F(float f) {
        return this.f976d.mo641F(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0812uq
    /* JADX INFO: renamed from: J */
    public final void mo642J(C0118d6 c0118d6, pf1 pf1Var, float f, o30 o30Var, int i) {
        this.f976d.mo642J(c0118d6, pf1Var, f, o30Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0812uq
    /* JADX INFO: renamed from: K */
    public final long mo643K() {
        return this.f976d.mo643K();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: M */
    public final long mo644M(long j) {
        return this.f976d.mo644M(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: P */
    public final float mo645P(long j) {
        return this.f976d.mo645P(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0812uq
    /* JADX INFO: renamed from: T */
    public final void mo646T(long j, long j2, long j3, float f) {
        this.f976d.mo646T(j, j2, j3, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: Z */
    public final long mo647Z(float f) {
        return this.f976d.mo647Z(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m648a() {
        C0125dd c0125dd = this.f976d;
        InterfaceC0051bd interfaceC0051bdM2802f = c0125dd.f1053e.m2802f();
        InterfaceC0694rm interfaceC0694rm = this.f977e;
        if (interfaceC0694rm == null) {
            throw AbstractC0748t1.m4149g("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        oe0 oe0Var = (oe0) interfaceC0694rm;
        oe0 oe0VarM3050f = oe0Var.f4529d.f4534i;
        if (oe0VarM3050f == null || (oe0VarM3050f.f4532g & 4) == 0) {
            oe0VarM3050f = null;
        } else {
            while (oe0VarM3050f != null) {
                int i = oe0VarM3050f.f4531f;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    oe0VarM3050f = oe0VarM3050f.f4534i;
                }
            }
            oe0VarM3050f = null;
        }
        if (oe0VarM3050f == null) {
            qj0 qj0VarM3037O = pf1.m3037O(interfaceC0694rm, 4);
            if (qj0VarM3037O.mo436G0() == oe0Var.f4529d) {
                qj0VarM3037O = qj0VarM3037O.f5181s;
                qj0VarM3037O.getClass();
            }
            qj0VarM3037O.mo438W0(interfaceC0051bdM2802f, (C0868vx) c0125dd.f1053e.f4481b);
            return;
        }
        sh0 sh0Var = null;
        while (oe0VarM3050f != null) {
            if (oe0VarM3050f instanceof InterfaceC0775tq) {
                InterfaceC0775tq interfaceC0775tq = (InterfaceC0775tq) oe0VarM3050f;
                C0868vx c0868vx = (C0868vx) c0125dd.f1053e.f4481b;
                qj0 qj0VarM3037O2 = pf1.m3037O(interfaceC0775tq, 4);
                long jM2759C = o30.m2759C(qj0VarM3037O2.f7402f);
                b60 b60Var = qj0VarM3037O2.f5180r;
                b60Var.getClass();
                ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var)).getSharedDrawScope().m650d(interfaceC0051bdM2802f, jM2759C, qj0VarM3037O2, interfaceC0775tq, c0868vx);
            } else if ((oe0VarM3050f.f4531f & 4) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                int i2 = 0;
                for (oe0 oe0Var2 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
                    if ((oe0Var2.f4531f & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
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
                if (i2 == 1) {
                }
            }
            oe0VarM3050f = pf1.m3050f(sh0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return this.f976d.mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0812uq
    /* JADX INFO: renamed from: c */
    public final long mo649c() {
        return this.f976d.mo649c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m650d(InterfaceC0051bd interfaceC0051bd, long j, qj0 qj0Var, InterfaceC0775tq interfaceC0775tq, C0868vx c0868vx) {
        InterfaceC0775tq interfaceC0775tq2 = this.f977e;
        this.f977e = interfaceC0775tq;
        k50 k50Var = qj0Var.f5180r.f389C;
        C0125dd c0125dd = this.f976d;
        C0541o8 c0541o8 = c0125dd.f1053e;
        C0087cd c0087cd = ((C0125dd) c0541o8.f4482c).f1052d;
        InterfaceC0968ym interfaceC0968ym = c0087cd.f787a;
        k50 k50Var2 = c0087cd.f788b;
        InterfaceC0051bd interfaceC0051bdM2802f = c0541o8.m2802f();
        C0541o8 c0541o82 = c0125dd.f1053e;
        long jM2803h = c0541o82.m2803h();
        C0868vx c0868vx2 = (C0868vx) c0541o82.f4481b;
        c0541o82.m2810o(qj0Var);
        c0541o82.m2811p(k50Var);
        c0541o82.m2809n(interfaceC0051bd);
        c0541o82.m2812q(j);
        c0541o82.f4481b = c0868vx;
        interfaceC0051bd.mo243i();
        try {
            interfaceC0775tq.mo1679B(this);
            interfaceC0051bd.mo241g();
            c0541o82.m2810o(interfaceC0968ym);
            c0541o82.m2811p(k50Var2);
            c0541o82.m2809n(interfaceC0051bdM2802f);
            c0541o82.m2812q(jM2803h);
            c0541o82.f4481b = c0868vx2;
            this.f977e = interfaceC0775tq2;
        } catch (Throwable th) {
            interfaceC0051bd.mo241g();
            c0541o82.m2810o(interfaceC0968ym);
            c0541o82.m2811p(k50Var2);
            c0541o82.m2809n(interfaceC0051bdM2802f);
            c0541o82.m2812q(jM2803h);
            c0541o82.f4481b = c0868vx2;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m651e(C0118d6 c0118d6, long j, o30 o30Var) {
        C0125dd c0125dd = this.f976d;
        c0125dd.f1052d.f789c.mo240f(c0118d6, C0125dd.m681a(c0125dd, j, o30Var, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: f0 */
    public final float mo652f0(int i) {
        return this.f976d.mo652f0(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0812uq
    public final k50 getLayoutDirection() {
        return this.f976d.f1052d.f788b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return this.f976d.mo49h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: i0 */
    public final float mo653i0(float f) {
        return f / this.f976d.mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: o */
    public final long mo187o(float f) {
        return this.f976d.mo187o(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: p */
    public final float mo654p(float f) {
        return this.f976d.mo48b() * f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0812uq
    /* JADX INFO: renamed from: t */
    public final C0541o8 mo655t() {
        return this.f976d.f1053e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: y */
    public final float mo188y(long j) {
        return this.f976d.mo188y(j);
    }
}
