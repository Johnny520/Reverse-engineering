package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class r51 implements InterfaceC0968ym, InterfaceC0322ik {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ s51 f5297d;

    /* JADX INFO: renamed from: e */
    public final C0884wc f5298e;

    /* JADX INFO: renamed from: f */
    public C0884wc f5299f;

    /* JADX INFO: renamed from: g */
    public jr0 f5300g = jr0.f2934e;

    /* JADX INFO: renamed from: h */
    public final C0220fs f5301h = C0220fs.f1799d;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ s51 f5302i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r51(s51 s51Var, C0884wc c0884wc) {
        this.f5302i = s51Var;
        this.f5297d = s51Var;
        this.f5298e = c0884wc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: F */
    public final int mo641F(float f) {
        return this.f5297d.mo641F(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: M */
    public final long mo644M(long j) {
        return this.f5297d.mo644M(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: P */
    public final float mo645P(long j) {
        return this.f5297d.mo645P(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: Z */
    public final long mo647Z(float f) {
        return this.f5297d.mo647Z(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m3387a(jr0 jr0Var, AbstractC0955y9 abstractC0955y9) {
        C0884wc c0884wc = new C0884wc(1, rd0.m3497z(abstractC0955y9));
        c0884wc.m4992v();
        this.f5300g = jr0Var;
        this.f5299f = c0884wc;
        return c0884wc.m4990t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return this.f5297d.mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final long m3388d() {
        s51 s51Var = this.f5302i;
        s51Var.getClass();
        long jMo644M = s51Var.mo644M(pf1.m3039Q(s51Var).f390D.mo2692e());
        long j = s51Var.f5645A;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo644M >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo644M & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: e */
    public final InterfaceC0618pk mo540e() {
        return this.f5301h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final nc1 m3389f() {
        s51 s51Var = this.f5302i;
        s51Var.getClass();
        return pf1.m3039Q(s51Var).f390D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: f0 */
    public final float mo652f0(int i) {
        return this.f5297d.mo652f0(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return this.f5297d.mo49h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: i */
    public final void mo541i(Object obj) {
        s51 s51Var = this.f5302i;
        synchronized (s51Var.f5652x) {
            s51Var.f5651w.m4080j(this);
        }
        this.f5298e.mo541i(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: i0 */
    public final float mo653i0(float f) {
        return f / this.f5297d.mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3390l(long j, InterfaceC0904ww interfaceC0904ww, AbstractC0358jk abstractC0358jk) {
        p51 p51Var;
        Throwable th;
        r31 r31Var;
        C0884wc c0884wc;
        if (abstractC0358jk instanceof p51) {
            p51Var = (p51) abstractC0358jk;
            int i = p51Var.f4764j;
            if ((i & Integer.MIN_VALUE) != 0) {
                p51Var.f4764j = i - Integer.MIN_VALUE;
            } else {
                p51Var = new p51(this, abstractC0358jk);
            }
        }
        Object objInvoke = p51Var.f4762h;
        int i2 = p51Var.f4764j;
        if (i2 != 0) {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r31Var = p51Var.f4761g;
            try {
                w60.m4891M(objInvoke);
                r31Var.mo478a(C0759tc.f5981e);
                return objInvoke;
            } catch (Throwable th2) {
                th = th2;
                r31Var.mo478a(C0759tc.f5981e);
                throw th;
            }
        }
        w60.m4891M(objInvoke);
        if (j <= 0 && (c0884wc = this.f5299f) != null) {
            c0884wc.mo541i(new bv0(new kr0(j)));
        }
        r31 r31VarM1547w = AbstractC0307i4.m1547w(this.f5302i.m2879k0(), null, new bz0(j, this, null), 3);
        try {
            p51Var.f4761g = r31VarM1547w;
            p51Var.f4764j = 1;
            objInvoke = interfaceC0904ww.invoke(this, p51Var);
            Object obj = EnumC1007zk.f7916d;
            if (objInvoke == obj) {
                return obj;
            }
            r31Var = r31VarM1547w;
            r31Var.mo478a(C0759tc.f5981e);
            return objInvoke;
        } catch (Throwable th3) {
            th = th3;
            r31Var = r31VarM1547w;
            r31Var.mo478a(C0759tc.f5981e);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3391n(long j, InterfaceC0904ww interfaceC0904ww, AbstractC0955y9 abstractC0955y9) {
        q51 q51Var;
        if (abstractC0955y9 instanceof q51) {
            q51Var = (q51) abstractC0955y9;
            int i = q51Var.f5043i;
            if ((i & Integer.MIN_VALUE) != 0) {
                q51Var.f5043i = i - Integer.MIN_VALUE;
            } else {
                q51Var = new q51(this, abstractC0955y9);
            }
        }
        Object obj = q51Var.f5041g;
        int i2 = q51Var.f5043i;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    w60.m4891M(obj);
                    return obj;
                }
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(obj);
            q51Var.f5043i = 1;
            Object objM3390l = m3390l(j, interfaceC0904ww, q51Var);
            Object obj2 = EnumC1007zk.f7916d;
            return objM3390l == obj2 ? obj2 : objM3390l;
        } catch (kr0 unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: o */
    public final long mo187o(float f) {
        return this.f5297d.mo187o(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: p */
    public final float mo654p(float f) {
        return this.f5297d.mo48b() * f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: y */
    public final float mo188y(long j) {
        return this.f5297d.mo188y(j);
    }
}
