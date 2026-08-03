package p000;

/* JADX INFO: renamed from: i9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1531i9 extends AbstractC1507hm implements InterfaceC1487h9 {

    /* JADX INFO: renamed from: e */
    public final C2152km f5413e;

    public C1531i9(C2152km c2152km) {
        this.f5413e = c2152km;
    }

    @Override // p000.InterfaceC1487h9
    /* JADX INFO: renamed from: b */
    public final boolean mo1796b(Throwable th) {
        C2152km c2152km = this.f5343d;
        if (c2152km == null) {
            c2152km = null;
        }
        return c2152km.mo729n(th);
    }

    @Override // p000.AbstractC1507hm
    /* JADX INFO: renamed from: j */
    public final boolean mo1505j() {
        return true;
    }

    @Override // p000.AbstractC1507hm
    /* JADX INFO: renamed from: k */
    public final void mo1506k(Throwable th) {
        C2152km c2152km = this.f5343d;
        if (c2152km == null) {
            c2152km = null;
        }
        this.f5413e.m4355h(c2152km);
    }
}
