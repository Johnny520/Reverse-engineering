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

    public C1550im(C2152km r1, C2108jm r2, C1531i9 r3, Object r4) {
        this.f5504e = r1;
        this.f5505f = r2;
        this.f5506g = r3;
        this.f5507h = r4;
    }

    @Override // p000.AbstractC1507hm
    /* JADX INFO: renamed from: j */
    public final boolean mo1505j() {
        return false;
    }

    @Override // p000.AbstractC1507hm
    /* JADX INFO: renamed from: k */
    public final void mo1506k(Throwable r7) {
        C1531i9 r72 = this.f5506g;
        C1531i9 r0 = C2152km.m4341F(r72);
        C2152km r1 = this.f5504e;
        C2108jm r2 = this.f5505f;
        Object r3 = this.f5507h;
        if (r0 != null) goto L5;
    L7:
        r2.f7411a.m2526c(new C2510so(2), 2);
        C1531i9 r73 = C2152km.m4341F(r72);
        if (r73 != null) goto L10;
    L12:
        r1.mo2728b(r1.m4360v(r2, r3));
        return;
    L10:
        if (r1.m4354N(r2, r73, r3) == false) goto L12;
        return;
    L5:
        if (r1.m4354N(r2, r0, r3) == false) goto L7;
    }
}
