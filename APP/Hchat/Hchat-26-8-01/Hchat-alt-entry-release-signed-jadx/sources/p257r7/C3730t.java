package p257r7;

import p152k7.AbstractC2331a;

/* JADX INFO: renamed from: r7.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3730t implements InterfaceC3723m {

    /* JADX INFO: renamed from: g */
    public final C3731u f12107g;

    /* JADX INFO: renamed from: h */
    public int f12108h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3730t(C3731u c3731u) {
        this.f12107g = c3731u;
        this.f12108h = c3731u.f7657g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3723m
    /* JADX INFO: renamed from: d */
    public final AbstractC2331a mo7733d(Class cls) {
        C3731u c3731u = this.f12107g;
        if (cls.isInstance(c3731u)) {
            return c3731u;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    public final int get() {
        return this.f12108h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    /* JADX INFO: renamed from: k */
    public final void mo633k(int i9) {
        this.f12108h = i9;
    }
}
