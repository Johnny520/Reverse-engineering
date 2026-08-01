package ec;

import p215oc.C5725t;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: ec.x2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2203x2 extends AbstractC2149k0 {

    /* JADX INFO: renamed from: s */
    public static final C2203x2 f6030s = new C2203x2();

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: V */
    public boolean mo7821V(InterfaceC5980j interfaceC5980j) {
        return false;
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: b0 */
    public AbstractC2149k0 mo7753b0(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // ec.AbstractC2149k0
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: x */
    public void mo7807x(InterfaceC5980j interfaceC5980j, Runnable runnable) {
        C2114b3 c2114b3 = (C2114b3) interfaceC5980j.mo1654h(C2114b3.f5916s);
        if (c2114b3 != null) {
            c2114b3.f5917r = true;
        } else {
            C5725t.m23179a("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }
}
