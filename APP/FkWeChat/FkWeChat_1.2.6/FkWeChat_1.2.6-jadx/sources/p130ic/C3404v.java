package p130ic;

import p099gc.InterfaceC2754w;
import p113hc.InterfaceC2974d;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;

/* JADX INFO: renamed from: ic.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3404v implements InterfaceC2974d {

    /* JADX INFO: renamed from: q */
    public final InterfaceC2754w f9390q;

    public C3404v(InterfaceC2754w interfaceC2754w) {
        this.f9390q = interfaceC2754w;
    }

    @Override // p113hc.InterfaceC2974d
    /* JADX INFO: renamed from: a */
    public Object mo400a(Object obj, InterfaceC5976f interfaceC5976f) {
        Object objMo9768i = this.f9390q.mo9768i(obj, interfaceC5976f);
        return objMo9768i == AbstractC6325c.m24992g() ? objMo9768i : C4700i0.f13910a;
    }
}
