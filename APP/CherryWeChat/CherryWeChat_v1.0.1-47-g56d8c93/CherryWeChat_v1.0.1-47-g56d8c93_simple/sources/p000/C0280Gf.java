package p000;

/* JADX INFO: renamed from: Gf */
/* JADX INFO: loaded from: classes.dex */
public final class C0280Gf implements InterfaceC1418fl {

    /* JADX INFO: renamed from: a */
    public final boolean f907a;

    public C0280Gf(boolean r1) {
        this.f907a = r1;
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
        StringBuilder r0 = new StringBuilder("Empty{");
        if (this.f907a == false) goto L5;
        String r1 = "Active";
    L7:
        return AbstractC2374ph.m4815l(r0, r1, '}');
    L5:
        r1 = "New";
        goto L7
    }
}
