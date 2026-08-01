package androidx.lifecycle;

import androidx.lifecycle.AbstractC0668k;
import okhttp3.C5753h;

/* JADX INFO: renamed from: androidx.lifecycle.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0653c0 implements InterfaceC0672m {

    /* JADX INFO: renamed from: q */
    public final C0661g0 f1938q;

    public C0653c0(C0661g0 c0661g0) {
        c0661g0.getClass();
        this.f1938q = c0661g0;
    }

    @Override // androidx.lifecycle.InterfaceC0672m
    /* JADX INFO: renamed from: j */
    public void mo2593j(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
        interfaceC0676o.getClass();
        aVar.getClass();
        if (aVar != AbstractC0668k.a.ON_CREATE) {
            C5753h.m23254a("Next event must be ON_CREATE, it was ", aVar);
        } else {
            interfaceC0676o.getLifecycle().mo2630c(this);
            this.f1938q.m2612e();
        }
    }
}
