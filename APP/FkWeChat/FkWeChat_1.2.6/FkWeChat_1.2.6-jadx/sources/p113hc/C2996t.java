package p113hc;

import ec.InterfaceC2198w1;
import p099gc.EnumC2732a;
import p130ic.InterfaceC3395m;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: hc.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2996t implements InterfaceC2979f0, InterfaceC2972c, InterfaceC3395m {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC2979f0 f7942q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC2198w1 f7943r;

    public C2996t(InterfaceC2979f0 interfaceC2979f0, InterfaceC2198w1 interfaceC2198w1) {
        this.f7942q = interfaceC2979f0;
        this.f7943r = interfaceC2198w1;
    }

    @Override // p113hc.InterfaceC2998v, p113hc.InterfaceC2972c
    /* JADX INFO: renamed from: b */
    public Object mo399b(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
        return this.f7942q.mo399b(interfaceC2974d, interfaceC5976f);
    }

    @Override // p130ic.InterfaceC3395m
    /* JADX INFO: renamed from: e */
    public InterfaceC2972c mo11005e(InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a) {
        return AbstractC2983h0.m11017d(this, interfaceC5980j, i10, enumC2732a);
    }

    @Override // p113hc.InterfaceC2979f0
    public Object getValue() {
        return this.f7942q.getValue();
    }
}
