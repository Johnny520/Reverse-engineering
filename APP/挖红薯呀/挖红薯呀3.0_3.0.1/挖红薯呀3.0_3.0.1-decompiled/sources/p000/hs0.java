package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class hs0 implements InterfaceC0968ym {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0968ym f2355d;

    /* JADX INFO: renamed from: e */
    public boolean f2356e;

    /* JADX INFO: renamed from: f */
    public boolean f2357f;

    /* JADX INFO: renamed from: g */
    public final di0 f2358g = new di0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hs0(InterfaceC0968ym interfaceC0968ym) {
        this.f2355d = interfaceC0968ym;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: F */
    public final int mo641F(float f) {
        return this.f2355d.mo641F(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: M */
    public final long mo644M(long j) {
        return this.f2355d.mo644M(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: P */
    public final float mo645P(long j) {
        return this.f2355d.mo645P(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: Z */
    public final long mo647Z(float f) {
        return this.f2355d.mo647Z(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1500a() {
        this.f2356e = true;
        di0 di0Var = this.f2358g;
        if (di0Var.m711d()) {
            di0Var.m714g(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return this.f2355d.mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1501d(AbstractC0358jk abstractC0358jk) {
        fs0 fs0Var;
        if (abstractC0358jk instanceof fs0) {
            fs0Var = (fs0) abstractC0358jk;
            int i = fs0Var.f1802i;
            if ((i & Integer.MIN_VALUE) != 0) {
                fs0Var.f1802i = i - Integer.MIN_VALUE;
            } else {
                fs0Var = new fs0(this, abstractC0358jk);
            }
        }
        Object obj = fs0Var.f1800g;
        int i2 = fs0Var.f1802i;
        if (i2 == 0) {
            w60.m4891M(obj);
            fs0Var.f1802i = 1;
            Object objM712e = this.f2358g.m712e(fs0Var);
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (objM712e == enumC1007zk) {
                return enumC1007zk;
            }
        } else {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(obj);
        }
        this.f2356e = false;
        this.f2357f = false;
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1502e(AbstractC0358jk abstractC0358jk) {
        gs0 gs0Var;
        if (abstractC0358jk instanceof gs0) {
            gs0Var = (gs0) abstractC0358jk;
            int i = gs0Var.f2045i;
            if ((i & Integer.MIN_VALUE) != 0) {
                gs0Var.f2045i = i - Integer.MIN_VALUE;
            } else {
                gs0Var = new gs0(this, abstractC0358jk);
            }
        }
        Object obj = gs0Var.f2043g;
        int i2 = gs0Var.f2045i;
        di0 di0Var = this.f2358g;
        if (i2 == 0) {
            w60.m4891M(obj);
            if (!this.f2356e && !this.f2357f) {
                gs0Var.f2045i = 1;
                Object objM712e = di0Var.m712e(gs0Var);
                EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                if (objM712e == enumC1007zk) {
                    return enumC1007zk;
                }
            }
            return Boolean.valueOf(this.f2356e);
        }
        if (i2 != 1) {
            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w60.m4891M(obj);
        di0Var.m714g(null);
        return Boolean.valueOf(this.f2356e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: f0 */
    public final float mo652f0(int i) {
        return this.f2355d.mo652f0(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return this.f2355d.mo49h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: i0 */
    public final float mo653i0(float f) {
        return this.f2355d.mo653i0(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: o */
    public final long mo187o(float f) {
        return this.f2355d.mo187o(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: p */
    public final float mo654p(float f) {
        return this.f2355d.mo654p(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: y */
    public final float mo188y(long j) {
        return this.f2355d.mo188y(j);
    }
}
