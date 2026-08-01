package androidx.lifecycle;

import androidx.lifecycle.AbstractC0668k;
import p181m4.C4970g;
import p376zd.C10010p0;

/* JADX INFO: renamed from: androidx.lifecycle.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0655d0 implements InterfaceC0672m, AutoCloseable {

    /* JADX INFO: renamed from: q */
    public final String f1940q;

    /* JADX INFO: renamed from: r */
    public final C0651b0 f1941r;

    /* JADX INFO: renamed from: s */
    public boolean f1942s;

    public C0655d0(String str, C0651b0 c0651b0) {
        str.getClass();
        c0651b0.getClass();
        this.f1940q = str;
        this.f1941r = c0651b0;
    }

    /* JADX INFO: renamed from: c */
    public final void m2594c(C4970g c4970g, AbstractC0668k abstractC0668k) {
        c4970g.getClass();
        abstractC0668k.getClass();
        if (this.f1942s) {
            C10010p0.m38820a("Already attached to lifecycleOwner");
            return;
        }
        this.f1942s = true;
        abstractC0668k.mo2628a(this);
        c4970g.m20069c(this.f1940q, this.f1941r.m2583a());
    }

    /* JADX INFO: renamed from: d */
    public final C0651b0 m2595d() {
        return this.f1941r;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2596e() {
        return this.f1942s;
    }

    @Override // androidx.lifecycle.InterfaceC0672m
    /* JADX INFO: renamed from: j */
    public void mo2593j(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
        interfaceC0676o.getClass();
        aVar.getClass();
        if (aVar == AbstractC0668k.a.ON_DESTROY) {
            this.f1942s = false;
            interfaceC0676o.getLifecycle().mo2630c(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }
}
