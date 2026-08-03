package p000;

/* JADX INFO: renamed from: Gf */
/* JADX INFO: loaded from: classes.dex */
public final class C0280Gf implements InterfaceC1418fl {

    /* JADX INFO: renamed from: a */
    public final boolean f907a;

    public C0280Gf(boolean z) {
        this.f907a = z;
    }

    @Override // p000.InterfaceC1418fl
    /* JADX INFO: renamed from: d */
    public final boolean mo564d() {
        return this.f907a;
    }

    @Override // p000.InterfaceC1418fl
    /* JADX INFO: renamed from: e */
    public final C0851Ts mo565e() {
        return null;
    }

    public final String toString() {
        return AbstractC2374ph.m4815l(new StringBuilder("Empty{"), this.f907a ? "Active" : "New", '}');
    }
}
