package p000;

/* JADX INFO: renamed from: i9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1531i9 extends AbstractC1507hm implements InterfaceC1487h9 {

    /* JADX INFO: renamed from: e */
    public final C2152km f5413e;

    public C1531i9(C2152km r1) {
        this.f5413e = r1;
    }

    @Override // p000.InterfaceC1487h9
    /* JADX INFO: renamed from: b */
    public final boolean mo1796b(Throwable r2) {
        C2152km r0 = this.f5343d;
        if (r0 != null) goto L7;
        r0 = null;
    L7:
        return r0.mo729n(r2);
    }

    @Override // p000.AbstractC1507hm
    /* JADX INFO: renamed from: j */
    public final boolean mo1505j() {
        return true;
    }

    @Override // p000.AbstractC1507hm
    /* JADX INFO: renamed from: k */
    public final void mo1506k(Throwable r2) {
        C2152km r22 = this.f5343d;
        if (r22 != null) goto L6;
        r22 = null;
    L6:
        this.f5413e.m4355h(r22);
    }
}
