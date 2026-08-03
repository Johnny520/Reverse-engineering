package p000;

/* JADX INFO: renamed from: wC */
/* JADX INFO: loaded from: classes.dex */
public final class C2664wC extends C2339ox {

    /* JADX INFO: renamed from: e */
    public final ThreadLocal f9228e;
    private volatile boolean threadLocalIsSet;

    public C2664wC(InterfaceC0190Eb r3, InterfaceC1137ac r4) {
        C2707xC r0 = C2707xC.f9282a;
        if (r4.mo24m(r0) != null) goto L5;
        InterfaceC1137ac r02 = r4.mo23l(r0);
    L6:
        super(r3, r02);
        this.f9228e = new ThreadLocal();
        if ((r3.mo263e().mo24m(C1456gf.f5158b) instanceof AbstractC1217bc) == true) goto L10;
        Object r32 = AbstractC0295Gu.m604E(r4, null);
        AbstractC0295Gu.m601B(r4, r32);
        m5233R(r4, r32);
        return;
    L10:
        return;
    L5:
        r02 = r4;
        goto L6
    }

    @Override // p000.C2339ox
    /* JADX INFO: renamed from: O */
    public final void mo4745O() {
        m5232Q();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m5231P() {
        if (this.threadLocalIsSet == true) goto L5;
    L7:
        boolean r0 = false;
    L8:
        this.f9228e.remove();
        return !r0;
    L5:
        if (this.f9228e.get() != null) goto L7;
        r0 = true;
        goto L8
    }

    /* JADX INFO: renamed from: Q */
    public final void m5232Q() {
        if (this.threadLocalIsSet == false) goto L9;
        C0208Et r0 = (C0208Et) this.f9228e.get();
        if (r0 == null) goto L7;
        AbstractC0295Gu.m601B((InterfaceC1137ac) r0.f613a, r0.f614b);
    L7:
        this.f9228e.remove();
        return;
    }

    /* JADX INFO: renamed from: R */
    public final void m5233R(InterfaceC1137ac r3, Object r4) {
        this.threadLocalIsSet = true;
        this.f9228e.set(new C0208Et(r3, r4));
    }

    @Override // p000.C2339ox, p000.C2152km
    /* JADX INFO: renamed from: g */
    public final void mo2729g(Object r6) {
        m5232Q();
        Object r62 = AbstractC0714Qj.m1472C(r6);
        InterfaceC0190Eb r0 = this.f8210d;
        InterfaceC1137ac r1 = r0.mo263e();
        C2664wC r2 = null;
        Object r3 = AbstractC0295Gu.m604E(r1, null);
        if (r3 == AbstractC0295Gu.f1005j) goto L19;
        r2 = AbstractC0148Dc.m289w(r0, r1, r3);
    L19:
        r0.mo264f(r62);     // Catch: Throwable -> L13
        if (r2 != null) goto L8;
    L11:
        AbstractC0295Gu.m601B(r1, r3);
        return;
    L8:
        if (r2.m5231P() == true) goto L11;
        return;
    L13:
        th = move-exception;
        if (r2 != null) goto L16;
    L17:
        AbstractC0295Gu.m601B(r1, r3);
    L18:
        throw th;
    L16:
        if (r2.m5231P() == false) goto L18;
        goto L17
    }
}
