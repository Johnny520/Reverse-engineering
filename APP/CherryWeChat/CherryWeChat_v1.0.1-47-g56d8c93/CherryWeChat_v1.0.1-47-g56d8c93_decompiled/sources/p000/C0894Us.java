package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Us */
/* JADX INFO: loaded from: classes.dex */
public final class C0894Us extends AbstractC2608v implements InterfaceC1332dm {

    /* JADX INFO: renamed from: b */
    public static final C0894Us f2788b = new C0894Us(C1456gf.f5162f);

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: d */
    public final boolean mo1745d() {
        return true;
    }

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: i */
    public final InterfaceC1487h9 mo1746i(C2152km c2152km) {
        return C0937Vs.f2926a;
    }

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: o */
    public final InterfaceC2100je mo1747o(boolean z, boolean z2, C1463gm c1463gm) {
        return C0937Vs.f2926a;
    }

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: p */
    public final CancellationException mo1748p() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: r */
    public final void mo1749r(CancellationException cancellationException) {
    }

    @Override // p000.InterfaceC1332dm
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }
}
