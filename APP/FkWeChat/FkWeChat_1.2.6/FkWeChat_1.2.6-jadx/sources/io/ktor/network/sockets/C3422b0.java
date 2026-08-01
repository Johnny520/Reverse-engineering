package io.ktor.network.sockets;

import io.ktor.network.sockets.AbstractC3447y;
import p010a9.InterfaceC0184l;
import p228p8.InterfaceC5976f;
import p339x6.InterfaceC9457j;

/* JADX INFO: renamed from: io.ktor.network.sockets.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3422b0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9457j f9424a;

    /* JADX INFO: renamed from: b */
    public AbstractC3447y.d f9425b;

    public C3422b0(InterfaceC9457j interfaceC9457j, AbstractC3447y.d dVar) {
        interfaceC9457j.getClass();
        dVar.getClass();
        this.f9424a = interfaceC9457j;
        this.f9425b = dVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m12794a(AbstractC3442t abstractC3442t, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        InterfaceC9457j interfaceC9457j = this.f9424a;
        AbstractC3447y.a aVarM12853g = m12796c().m12853g();
        interfaceC0184l.mo27m(aVarM12853g);
        return AbstractC3434l.m12821b(interfaceC9457j, abstractC3442t, aVarM12853g, interfaceC5976f);
    }

    /* JADX INFO: renamed from: b */
    public final Object m12795b(String str, int i10, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        return m12794a(new C3435m(str, i10), interfaceC0184l, interfaceC5976f);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC3447y.d m12796c() {
        return this.f9425b;
    }
}
