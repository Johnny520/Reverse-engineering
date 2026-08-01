package p000;

/* JADX INFO: loaded from: classes.dex */
public final class o80 extends w10 {

    /* JADX INFO: renamed from: e */
    public final ThreadLocal f3512e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public o80(InterfaceC0258ge interfaceC0258ge, m50 m50Var) {
        p80 p80Var = p80.f3683a;
        super(interfaceC0258ge.mo1272b(p80Var) == null ? interfaceC0258ge.mo1275i(p80Var) : interfaceC0258ge, m50Var);
        this.f3512e = new ThreadLocal();
        InterfaceC0258ge interfaceC0258ge2 = m50Var.f3143b;
        AbstractC0346ip.m1500l(interfaceC0258ge2);
        if (interfaceC0258ge2.mo1272b(C0819vh.f4843b) instanceof AbstractC0408ke) {
            return;
        }
        Object objM1176V = AbstractC0222ff.m1176V(interfaceC0258ge, null);
        AbstractC0222ff.m1166L(interfaceC0258ge, objM1176V);
        m2002L(interfaceC0258ge, objM1176V);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m2001K() {
        boolean z = this.threadLocalIsSet && this.f3512e.get() == null;
        this.f3512e.remove();
        return !z;
    }

    /* JADX INFO: renamed from: L */
    public final void m2002L(InterfaceC0258ge interfaceC0258ge, Object obj) {
        this.threadLocalIsSet = true;
        this.f3512e.set(new C0427kx(interfaceC0258ge, obj));
    }

    @Override // p000.w10, p000.C0864wp
    /* JADX INFO: renamed from: l */
    public final void mo2003l(Object obj) {
        if (this.threadLocalIsSet) {
            C0427kx c0427kx = (C0427kx) this.f3512e.get();
            if (c0427kx != null) {
                AbstractC0222ff.m1166L((InterfaceC0258ge) c0427kx.f2976a, c0427kx.f2977b);
            }
            this.f3512e.remove();
        }
        Object objM29A = a80.m29A(obj);
        m50 m50Var = this.f4903d;
        InterfaceC0258ge interfaceC0258ge = m50Var.f3143b;
        AbstractC0346ip.m1500l(interfaceC0258ge);
        Object objM1176V = AbstractC0222ff.m1176V(interfaceC0258ge, null);
        o80 o80VarM1489b0 = objM1176V != AbstractC0222ff.f1957x ? AbstractC0346ip.m1489b0(m50Var, interfaceC0258ge, objM1176V) : null;
        try {
            this.f4903d.mo1241f(objM29A);
            if (o80VarM1489b0 == null || o80VarM1489b0.m2001K()) {
                AbstractC0222ff.m1166L(interfaceC0258ge, objM1176V);
            }
        } catch (Throwable th) {
            if (o80VarM1489b0 == null || o80VarM1489b0.m2001K()) {
                AbstractC0222ff.m1166L(interfaceC0258ge, objM1176V);
            }
            throw th;
        }
    }
}
