package p037cb;

import p213oa.C5691b;
import p229p9.AbstractC6038s0;
import p229p9.InterfaceC6023n0;
import p229p9.InterfaceC6026o0;

/* JADX INFO: renamed from: cb.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1492q implements InterfaceC1478j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6026o0 f4431a;

    public C1492q(InterfaceC6026o0 interfaceC6026o0) {
        interfaceC6026o0.getClass();
        this.f4431a = interfaceC6026o0;
    }

    @Override // p037cb.InterfaceC1478j
    /* JADX INFO: renamed from: a */
    public C1476i mo5779a(C5691b c5691b) {
        C1476i c1476iMo5779a;
        c5691b.getClass();
        for (InterfaceC6023n0 interfaceC6023n0 : AbstractC6038s0.m24066c(this.f4431a, c5691b.m22986f())) {
            if ((interfaceC6023n0 instanceof AbstractC1494r) && (c1476iMo5779a = ((AbstractC1494r) interfaceC6023n0).mo5878L0().mo5779a(c5691b)) != null) {
                return c1476iMo5779a;
            }
        }
        return null;
    }
}
