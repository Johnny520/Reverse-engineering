package p145jc;

import ec.InterfaceC2165o0;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: jc.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3800d implements InterfaceC2165o0 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC5980j f10975q;

    public C3800d(InterfaceC5980j interfaceC5980j) {
        this.f10975q = interfaceC5980j;
    }

    @Override // ec.InterfaceC2165o0
    public InterfaceC5980j getCoroutineContext() {
        return this.f10975q;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
