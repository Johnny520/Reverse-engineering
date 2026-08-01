package androidx.compose.runtime;

import p364z0.InterfaceC9828f;

/* JADX INFO: renamed from: androidx.compose.runtime.a3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0457a3 extends InterfaceC9828f, InterfaceC0559p0, InterfaceC0531l0 {

    /* JADX INFO: renamed from: androidx.compose.runtime.a3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a extends InterfaceC9828f.a {
        @Override // p364z0.InterfaceC9828f.a
        InterfaceC0457a3 build();
    }

    @Override // p364z0.InterfaceC9828f
    a builder();

    @Override // androidx.compose.runtime.InterfaceC0531l0
    /* JADX INFO: renamed from: d */
    default Object mo1516d(AbstractC0524k0 abstractC0524k0) {
        return AbstractC0566q0.m2137b(this, abstractC0524k0);
    }

    /* JADX INFO: renamed from: h */
    InterfaceC0457a3 mo1517h(AbstractC0524k0 abstractC0524k0, InterfaceC0610v5 interfaceC0610v5);
}
