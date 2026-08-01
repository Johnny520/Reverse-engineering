package p000;

/* JADX INFO: loaded from: classes.dex */
public final class t80 extends d20 {

    /* JADX INFO: renamed from: e */
    public final ThreadLocal f4420e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public t80(InterfaceC0295he interfaceC0295he, t50 t50Var) {
        u80 u80Var = u80.f4667a;
        super(interfaceC0295he.mo447b(u80Var) == null ? interfaceC0295he.mo450i(u80Var) : interfaceC0295he, t50Var);
        this.f4420e = new ThreadLocal();
        InterfaceC0295he interfaceC0295he2 = t50Var.f4415b;
        AbstractC0493mp.m1854d(interfaceC0295he2);
        if (interfaceC0295he2.mo447b(C0893xh.f5246b) instanceof AbstractC0445le) {
            return;
        }
        Object objM1242a0 = AbstractC0259gf.m1242a0(interfaceC0295he, null);
        AbstractC0259gf.m1234R(interfaceC0295he, objM1242a0);
        m2404L(interfaceC0295he, objM1242a0);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m2403K() {
        boolean z = this.threadLocalIsSet && this.f4420e.get() == null;
        this.f4420e.remove();
        return !z;
    }

    /* JADX INFO: renamed from: L */
    public final void m2404L(InterfaceC0295he interfaceC0295he, Object obj) {
        this.threadLocalIsSet = true;
        this.f4420e.set(new C0723sx(interfaceC0295he, obj));
    }

    @Override // p000.d20, p000.C0040aq
    /* JADX INFO: renamed from: l */
    public final void mo453l(Object obj) {
        if (this.threadLocalIsSet) {
            C0723sx c0723sx = (C0723sx) this.f4420e.get();
            if (c0723sx != null) {
                AbstractC0259gf.m1234R((InterfaceC0295he) c0723sx.f4373a, c0723sx.f4374b);
            }
            this.f4420e.remove();
        }
        Object objM1176G = g80.m1176G(obj);
        t50 t50Var = this.f1292d;
        InterfaceC0295he interfaceC0295he = t50Var.f4415b;
        AbstractC0493mp.m1854d(interfaceC0295he);
        Object objM1242a0 = AbstractC0259gf.m1242a0(interfaceC0295he, null);
        t80 t80VarM1243b0 = objM1242a0 != AbstractC0259gf.f1979x ? AbstractC0259gf.m1243b0(t50Var, interfaceC0295he, objM1242a0) : null;
        try {
            this.f1292d.mo1118f(objM1176G);
            if (t80VarM1243b0 == null || t80VarM1243b0.m2403K()) {
                AbstractC0259gf.m1234R(interfaceC0295he, objM1242a0);
            }
        } catch (Throwable th) {
            if (t80VarM1243b0 == null || t80VarM1243b0.m2403K()) {
                AbstractC0259gf.m1234R(interfaceC0295he, objM1242a0);
            }
            throw th;
        }
    }
}
