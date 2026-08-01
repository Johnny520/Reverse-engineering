package io.ktor.utils.p131io;

import ec.InterfaceC2165o0;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: io.ktor.utils.io.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3463d0 implements InterfaceC2165o0 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC3468g f9589q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC5980j f9590r;

    public C3463d0(InterfaceC3468g interfaceC3468g, InterfaceC5980j interfaceC5980j) {
        interfaceC3468g.getClass();
        interfaceC5980j.getClass();
        this.f9589q = interfaceC3468g;
        this.f9590r = interfaceC5980j;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3468g m12934a() {
        return this.f9589q;
    }

    @Override // ec.InterfaceC2165o0
    public InterfaceC5980j getCoroutineContext() {
        return this.f9590r;
    }
}
