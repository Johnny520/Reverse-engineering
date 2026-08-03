package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5685<E> extends C3140<E> implements InterfaceC7288<E, InterfaceC7317<? super E>> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public InterfaceC4199<? super C8107> f14006;

    public C5685(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC3713<E> interfaceC3713, @InterfaceC6399 InterfaceC5138<? super InterfaceC3142<E>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        super(interfaceC4225, interfaceC3713, false);
        this.f14006 = C5501.m17133(interfaceC5138, this, this);
    }

    @Override // Yue.C3715, Yue.InterfaceC7317
    public boolean offer(E e) {
        start();
        return super.offer(e);
    }

    @Override // Yue.C3715, Yue.InterfaceC7317
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public Object mo5844(E e, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        start();
        Object objMo5844 = super.mo5844(e, interfaceC4199);
        return objMo5844 == C5508.m17142() ? objMo5844 : C8107.f3222;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Yue.ۥۡۨۡ۠<? super E>, ? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC7288
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public <R> void mo5880(@InterfaceC6399 InterfaceC7289<? super R> interfaceC7289, E e, @InterfaceC6399 InterfaceC5138<? super InterfaceC7317<? super E>, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
        start();
        super.mo5856().mo5880(interfaceC7289, e, interfaceC5138);
    }

    @Override // Yue.C3715, Yue.InterfaceC7317
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public InterfaceC7288<E, InterfaceC7317<E>> mo5856() {
        return this;
    }

    @Override // Yue.C3715, Yue.InterfaceC7317
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo6938(@InterfaceC6489 Throwable th) {
        boolean zMo6938 = super.mo6938(th);
        start();
        return zMo6938;
    }

    @Override // Yue.C3715, Yue.InterfaceC7317
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public Object mo5863(E e) {
        start();
        return super.mo5863(e);
    }

    @Override // Yue.C5557
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ */
    public void mo17288() throws Throwable {
        C3672.m10060(this.f14006, this);
    }
}
