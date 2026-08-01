package p358y9;

import ca.AbstractC1414d;
import p024b9.AbstractC1061t;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6055y0;
import sa.InterfaceC7260j;

/* JADX INFO: renamed from: y9.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9645s implements InterfaceC7260j {
    @Override // sa.InterfaceC7260j
    /* JADX INFO: renamed from: a */
    public InterfaceC7260j.a mo28774a() {
        return InterfaceC7260j.a.BOTH;
    }

    @Override // sa.InterfaceC7260j
    /* JADX INFO: renamed from: b */
    public InterfaceC7260j.b mo28775b(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2, InterfaceC5995e interfaceC5995e) {
        interfaceC5983a.getClass();
        interfaceC5983a2.getClass();
        if (!(interfaceC5983a2 instanceof InterfaceC6055y0) || !(interfaceC5983a instanceof InterfaceC6055y0)) {
            return InterfaceC7260j.b.UNKNOWN;
        }
        InterfaceC6055y0 interfaceC6055y0 = (InterfaceC6055y0) interfaceC5983a2;
        InterfaceC6055y0 interfaceC6055y02 = (InterfaceC6055y0) interfaceC5983a;
        return !AbstractC1061t.m3842c(interfaceC6055y0.getName(), interfaceC6055y02.getName()) ? InterfaceC7260j.b.UNKNOWN : (AbstractC1414d.m5499a(interfaceC6055y0) && AbstractC1414d.m5499a(interfaceC6055y02)) ? InterfaceC7260j.b.OVERRIDABLE : (AbstractC1414d.m5499a(interfaceC6055y0) || AbstractC1414d.m5499a(interfaceC6055y02)) ? InterfaceC7260j.b.INCOMPATIBLE : InterfaceC7260j.b.UNKNOWN;
    }
}
