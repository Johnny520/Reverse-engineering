package p113hc;

import p010a9.InterfaceC0188p;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;

/* JADX INFO: renamed from: hc.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2997u extends AbstractC2968a {

    /* JADX INFO: renamed from: q */
    public final InterfaceC0188p f7944q;

    public C2997u(InterfaceC0188p interfaceC0188p) {
        this.f7944q = interfaceC0188p;
    }

    @Override // p113hc.AbstractC2968a
    /* JADX INFO: renamed from: g */
    public Object mo10965g(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
        Object objInvoke = this.f7944q.invoke(interfaceC2974d, interfaceC5976f);
        return objInvoke == AbstractC6325c.m24992g() ? objInvoke : C4700i0.f13910a;
    }
}
