package ec;

import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: ec.z0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2209z0 extends Exception {

    /* JADX INFO: renamed from: q */
    public final Throwable f6035q;

    public C2209z0(Throwable th, AbstractC2149k0 abstractC2149k0, InterfaceC5980j interfaceC5980j) {
        super("Coroutine dispatcher " + abstractC2149k0 + " threw an exception, context = " + interfaceC5980j, th);
        this.f6035q = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f6035q;
    }
}
