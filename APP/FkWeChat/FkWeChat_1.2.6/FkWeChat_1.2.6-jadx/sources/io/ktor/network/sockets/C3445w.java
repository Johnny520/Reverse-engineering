package io.ktor.network.sockets;

import p339x6.InterfaceC9457j;

/* JADX INFO: renamed from: io.ktor.network.sockets.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3445w {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9457j f9499a;

    /* JADX INFO: renamed from: b */
    public AbstractC3447y f9500b;

    public C3445w(InterfaceC9457j interfaceC9457j, AbstractC3447y abstractC3447y) {
        interfaceC9457j.getClass();
        abstractC3447y.getClass();
        this.f9499a = interfaceC9457j;
        this.f9500b = abstractC3447y;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC3447y m12844a() {
        return this.f9500b;
    }

    /* JADX INFO: renamed from: b */
    public final C3422b0 m12845b() {
        return new C3422b0(this.f9499a, m12844a().m12851e());
    }
}
