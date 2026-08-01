package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class f91 extends l21 {

    /* JADX INFO: renamed from: e */
    public final l21 f1634e;

    /* JADX INFO: renamed from: f */
    public final boolean f1635f;

    /* JADX INFO: renamed from: g */
    public final boolean f1636g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0742sw f1637h;

    /* JADX INFO: renamed from: i */
    public final long f1638i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f91(l21 l21Var, InterfaceC0742sw interfaceC0742sw, boolean z, boolean z2) {
        InterfaceC0742sw interfaceC0742swMo809e;
        super(0L, q21.f5028h);
        sx0 sx0Var = t21.f5891a;
        this.f1634e = l21Var;
        this.f1635f = z;
        this.f1636g = z2;
        this.f1637h = t21.m4173k(interfaceC0742sw, (l21Var == null || (interfaceC0742swMo809e = l21Var.mo809e()) == null) ? t21.f5900j.f4265e : interfaceC0742swMo809e, z);
        this.f1638i = u50.m4266g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: c */
    public final void mo807c() {
        l21 l21Var;
        this.f3331c = true;
        if (!this.f1636g || (l21Var = this.f1634e) == null) {
            return;
        }
        l21Var.mo807c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: d */
    public final q21 mo808d() {
        return m1071v().mo808d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: e */
    public final InterfaceC0742sw mo809e() {
        return this.f1637h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: f */
    public final boolean mo810f() {
        return m1071v().mo810f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: g */
    public final long mo811g() {
        return m1071v().mo811g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: i */
    public final InterfaceC0742sw mo813i() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: k */
    public final void mo814k() {
        w60.m4892N();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: l */
    public final void mo815l() {
        w60.m4892N();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: m */
    public final void mo816m() {
        m1071v().mo816m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: n */
    public final void mo817n(d41 d41Var) {
        m1071v().mo817n(d41Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: u */
    public final l21 mo821u(InterfaceC0742sw interfaceC0742sw) {
        InterfaceC0742sw interfaceC0742swM4173k = t21.m4173k(interfaceC0742sw, this.f1637h, true);
        return !this.f1635f ? t21.m4169g(m1071v().mo821u(null), interfaceC0742swM4173k, true) : m1071v().mo821u(interfaceC0742swM4173k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final l21 m1071v() {
        l21 l21Var = this.f1634e;
        return l21Var == null ? t21.f5900j : l21Var;
    }
}
