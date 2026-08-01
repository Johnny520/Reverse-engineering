package p037cb;

import p067eb.AbstractC2101w;
import p082fb.InterfaceC2412n;
import p213oa.C5692c;
import p213oa.C5695f;
import p229p9.InterfaceC6005h0;
import p273s9.AbstractC7216h0;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: cb.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1494r extends AbstractC7216h0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC2412n f4434w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1494r(C5692c c5692c, InterfaceC2412n interfaceC2412n, InterfaceC6005h0 interfaceC6005h0) {
        super(interfaceC6005h0, c5692c);
        c5692c.getClass();
        interfaceC2412n.getClass();
        interfaceC6005h0.getClass();
        this.f4434w = interfaceC2412n;
    }

    /* JADX INFO: renamed from: L0 */
    public abstract InterfaceC1478j mo5878L0();

    /* JADX INFO: renamed from: Q0 */
    public boolean m5879Q0(C5695f c5695f) {
        c5695f.getClass();
        InterfaceC9913k interfaceC9913kMo5510v = mo5510v();
        return (interfaceC9913kMo5510v instanceof AbstractC2101w) && ((AbstractC2101w) interfaceC9913kMo5510v).m7523t().contains(c5695f);
    }

    /* JADX INFO: renamed from: R0 */
    public abstract void mo5880R0(C1486n c1486n);
}
