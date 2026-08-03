package Yue;

import Yue.InterfaceC4225;

/* JADX INFO: renamed from: Yue.ۥ۠۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4513 implements InterfaceC4225 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final Throwable f9605;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4225 f9606;

    public C4513(@InterfaceC6399 Throwable th, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        this.f9605 = th;
        this.f9606 = interfaceC4225;
    }

    @Override // Yue.InterfaceC4225
    public <R> R fold(R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4225.InterfaceC0357, ? extends R> interfaceC5138) {
        return (R) this.f9606.fold(r, interfaceC5138);
    }

    @Override // Yue.InterfaceC4225
    @InterfaceC6489
    public <E extends InterfaceC4225.InterfaceC0357> E get(@InterfaceC6399 InterfaceC4225.InterfaceC4228<E> interfaceC4228) {
        return (E) this.f9606.get(interfaceC4228);
    }

    @Override // Yue.InterfaceC4225
    @InterfaceC6399
    public InterfaceC4225 minusKey(@InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
        return this.f9606.minusKey(interfaceC4228);
    }

    @Override // Yue.InterfaceC4225
    @InterfaceC6399
    public InterfaceC4225 plus(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        return this.f9606.plus(interfaceC4225);
    }
}
