package p273s9;

import p213oa.C5692c;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6023n0;
import p229p9.InterfaceC6025o;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: s9.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7216h0 extends AbstractC7227n implements InterfaceC6023n0 {

    /* JADX INFO: renamed from: u */
    public final C5692c f23936u;

    /* JADX INFO: renamed from: v */
    public final String f23937v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7216h0(InterfaceC6005h0 interfaceC6005h0, C5692c c5692c) {
        super(interfaceC6005h0, InterfaceC6333h.f19873o.m25003b(), c5692c.m23000g(), InterfaceC6003g1.f18958a);
        interfaceC6005h0.getClass();
        c5692c.getClass();
        this.f23936u = c5692c;
        this.f23937v = "package " + c5692c + " of " + interfaceC6005h0;
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: M0 */
    public Object mo12663M0(InterfaceC6025o interfaceC6025o, Object obj) {
        interfaceC6025o.getClass();
        return interfaceC6025o.mo24036g(this, obj);
    }

    @Override // p273s9.AbstractC7227n, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: b */
    public InterfaceC6005h0 mo7443b() {
        InterfaceC6019m interfaceC6019mMo7443b = super.mo7443b();
        interfaceC6019mMo7443b.getClass();
        return (InterfaceC6005h0) interfaceC6019mMo7443b;
    }

    @Override // p229p9.InterfaceC6023n0
    /* JADX INFO: renamed from: d */
    public final C5692c mo24031d() {
        return this.f23936u;
    }

    @Override // p273s9.AbstractC7227n, p229p9.InterfaceC6028p
    public InterfaceC6003g1 getSource() {
        InterfaceC6003g1 interfaceC6003g1 = InterfaceC6003g1.f18958a;
        interfaceC6003g1.getClass();
        return interfaceC6003g1;
    }

    @Override // p273s9.AbstractC7225m
    public String toString() {
        return this.f23937v;
    }
}
