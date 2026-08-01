package p264s0;

import p010a9.InterfaceC0173a;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3578w;
import p180m3.InterfaceC4960u;

/* JADX INFO: renamed from: s0.ee */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6718ee implements InterfaceC6702de {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0173a f21237a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4960u f21238b;

    public C6718ee(InterfaceC0173a interfaceC0173a, InterfaceC4960u interfaceC4960u) {
        this.f21237a = interfaceC0173a;
        this.f21238b = interfaceC4960u;
    }

    @Override // p264s0.InterfaceC6702de
    /* JADX INFO: renamed from: a */
    public InterfaceC4960u mo26637a() {
        return this.f21238b;
    }

    @Override // p264s0.InterfaceC6702de
    /* JADX INFO: renamed from: b */
    public InterfaceC3578w mo26638b(InterfaceC3561q0 interfaceC3561q0) {
        return (InterfaceC3578w) this.f21237a.invoke();
    }
}
