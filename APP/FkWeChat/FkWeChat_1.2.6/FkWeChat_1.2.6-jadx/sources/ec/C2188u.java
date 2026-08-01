package ec;

/* JADX INFO: renamed from: ec.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2188u extends AbstractC2113b2 implements InterfaceC2184t {

    /* JADX INFO: renamed from: u */
    public final InterfaceC2192v f6014u;

    public C2188u(InterfaceC2192v interfaceC2192v) {
        this.f6014u = interfaceC2192v;
    }

    @Override // ec.InterfaceC2184t
    public InterfaceC2198w1 getParent() {
        return m7631v();
    }

    @Override // ec.InterfaceC2184t
    /* JADX INFO: renamed from: h */
    public boolean mo7813h(Throwable th) {
        return m7631v().mo7671U(th);
    }

    @Override // ec.AbstractC2113b2
    /* JADX INFO: renamed from: w */
    public boolean mo7632w() {
        return true;
    }

    @Override // ec.AbstractC2113b2
    /* JADX INFO: renamed from: x */
    public void mo7633x(Throwable th) {
        this.f6014u.mo7664P(m7631v());
    }
}
