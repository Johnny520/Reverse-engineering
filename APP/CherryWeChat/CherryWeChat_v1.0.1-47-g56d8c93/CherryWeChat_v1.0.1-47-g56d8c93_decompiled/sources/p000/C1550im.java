package p000;

/* JADX INFO: renamed from: im */
/* JADX INFO: loaded from: classes.dex */
public final class C1550im extends AbstractC1507hm {

    /* JADX INFO: renamed from: e */
    public final C2152km f5504e;

    /* JADX INFO: renamed from: f */
    public final C2108jm f5505f;

    /* JADX INFO: renamed from: g */
    public final C1531i9 f5506g;

    /* JADX INFO: renamed from: h */
    public final Object f5507h;

    public C1550im(C2152km c2152km, C2108jm c2108jm, C1531i9 c1531i9, Object obj) {
        this.f5504e = c2152km;
        this.f5505f = c2108jm;
        this.f5506g = c1531i9;
        this.f5507h = obj;
    }

    @Override // p000.AbstractC1507hm
    /* JADX INFO: renamed from: j */
    public final boolean mo1505j() {
        return false;
    }

    @Override // p000.AbstractC1507hm
    /* JADX INFO: renamed from: k */
    public final void mo1506k(Throwable th) {
        C1531i9 c1531i9 = this.f5506g;
        C1531i9 c1531i9M4341F = C2152km.m4341F(c1531i9);
        C2152km c2152km = this.f5504e;
        C2108jm c2108jm = this.f5505f;
        Object obj = this.f5507h;
        if (c1531i9M4341F == null || !c2152km.m4354N(c2108jm, c1531i9M4341F, obj)) {
            c2108jm.f7411a.m2526c(new C2510so(2), 2);
            C1531i9 c1531i9M4341F2 = C2152km.m4341F(c1531i9);
            if (c1531i9M4341F2 == null || !c2152km.m4354N(c2108jm, c1531i9M4341F2, obj)) {
                c2152km.mo2728b(c2152km.m4360v(c2108jm, obj));
            }
        }
    }
}
