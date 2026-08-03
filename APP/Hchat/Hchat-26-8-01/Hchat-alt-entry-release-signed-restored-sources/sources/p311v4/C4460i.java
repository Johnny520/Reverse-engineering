package p311v4;

import bsh.C0353j;

/* JADX INFO: renamed from: v4.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4460i extends AbstractC4446a {

    /* JADX INFO: renamed from: g */
    public final C4468q f14792g;

    /* JADX INFO: renamed from: h */
    public final int f14793h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4460i(C4468q c4468q, int i9) {
        if (c4468q == null) {
            C0353j.m1305c("invokeDynamic == null");
            throw null;
        }
        this.f14792g = c4468q;
        this.f14793h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return this.f14792g.f14814k.mo4901a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: e */
    public final int mo8896e(AbstractC4446a abstractC4446a) {
        C4460i c4460i = (C4460i) abstractC4446a;
        int iCompareTo = this.f14792g.compareTo(c4460i.f14792g);
        return iCompareTo != 0 ? iCompareTo : Integer.compare(this.f14793h, c4460i.f14793h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: i */
    public final boolean mo8897i() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: j */
    public final String mo8898j() {
        return "CallSiteRef";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f14792g.f14814k.toString();
    }
}
