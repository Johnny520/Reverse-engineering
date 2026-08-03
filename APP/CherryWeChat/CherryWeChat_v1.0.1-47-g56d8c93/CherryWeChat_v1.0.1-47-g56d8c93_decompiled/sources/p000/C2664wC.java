package p000;

/* JADX INFO: renamed from: wC */
/* JADX INFO: loaded from: classes.dex */
public final class C2664wC extends C2339ox {

    /* JADX INFO: renamed from: e */
    public final ThreadLocal f9228e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2664wC(InterfaceC0190Eb interfaceC0190Eb, InterfaceC1137ac interfaceC1137ac) {
        C2707xC c2707xC = C2707xC.f9282a;
        super(interfaceC0190Eb, interfaceC1137ac.mo24m(c2707xC) == null ? interfaceC1137ac.mo23l(c2707xC) : interfaceC1137ac);
        this.f9228e = new ThreadLocal();
        if (interfaceC0190Eb.mo263e().mo24m(C1456gf.f5158b) instanceof AbstractC1217bc) {
            return;
        }
        Object objM604E = AbstractC0295Gu.m604E(interfaceC1137ac, null);
        AbstractC0295Gu.m601B(interfaceC1137ac, objM604E);
        m5233R(interfaceC1137ac, objM604E);
    }

    @Override // p000.C2339ox
    /* JADX INFO: renamed from: O */
    public final void mo4745O() {
        m5232Q();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m5231P() {
        boolean z = this.threadLocalIsSet && this.f9228e.get() == null;
        this.f9228e.remove();
        return !z;
    }

    /* JADX INFO: renamed from: Q */
    public final void m5232Q() {
        if (this.threadLocalIsSet) {
            C0208Et c0208Et = (C0208Et) this.f9228e.get();
            if (c0208Et != null) {
                AbstractC0295Gu.m601B((InterfaceC1137ac) c0208Et.f613a, c0208Et.f614b);
            }
            this.f9228e.remove();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m5233R(InterfaceC1137ac interfaceC1137ac, Object obj) {
        this.threadLocalIsSet = true;
        this.f9228e.set(new C0208Et(interfaceC1137ac, obj));
    }

    @Override // p000.C2339ox, p000.C2152km
    /* JADX INFO: renamed from: g */
    public final void mo2729g(Object obj) {
        m5232Q();
        Object objM1472C = AbstractC0714Qj.m1472C(obj);
        InterfaceC0190Eb interfaceC0190Eb = this.f8210d;
        InterfaceC1137ac interfaceC1137acMo263e = interfaceC0190Eb.mo263e();
        Object objM604E = AbstractC0295Gu.m604E(interfaceC1137acMo263e, null);
        C2664wC c2664wCM289w = objM604E != AbstractC0295Gu.f1005j ? AbstractC0148Dc.m289w(interfaceC0190Eb, interfaceC1137acMo263e, objM604E) : null;
        try {
            interfaceC0190Eb.mo264f(objM1472C);
            if (c2664wCM289w == null || c2664wCM289w.m5231P()) {
                AbstractC0295Gu.m601B(interfaceC1137acMo263e, objM604E);
            }
        } catch (Throwable th) {
            if (c2664wCM289w == null || c2664wCM289w.m5231P()) {
                AbstractC0295Gu.m601B(interfaceC1137acMo263e, objM604E);
            }
            throw th;
        }
    }
}
