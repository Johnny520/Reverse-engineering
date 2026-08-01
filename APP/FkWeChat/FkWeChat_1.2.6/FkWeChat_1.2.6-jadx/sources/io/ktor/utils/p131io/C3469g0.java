package io.ktor.utils.p131io;

import ec.InterfaceC2165o0;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: io.ktor.utils.io.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3469g0 implements InterfaceC2165o0 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC3473k f9599q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC5980j f9600r;

    public C3469g0(InterfaceC3473k interfaceC3473k, InterfaceC5980j interfaceC5980j) {
        interfaceC3473k.getClass();
        interfaceC5980j.getClass();
        this.f9599q = interfaceC3473k;
        this.f9600r = interfaceC5980j;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3473k m12942a() {
        return this.f9599q;
    }

    @Override // ec.InterfaceC2165o0
    public InterfaceC5980j getCoroutineContext() {
        return this.f9600r;
    }
}
