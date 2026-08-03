package p255r4;

import p311v4.C4464m;
import p376z4.InterfaceC6097k;

/* JADX INFO: renamed from: r4.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3699u implements InterfaceC6097k, Comparable {

    /* JADX INFO: renamed from: g */
    public final C4464m f12033g;

    /* JADX INFO: renamed from: h */
    public C3661b f12034h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3699u(C4464m c4464m, C3661b c3661b) {
        this.f12033g = c4464m;
        this.f12034h = c3661b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return this.f12033g.mo4901a() + ": " + this.f12034h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12033g.compareTo(((C3699u) obj).f12033g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3699u)) {
            return false;
        }
        return this.f12033g.equals(((C3699u) obj).f12033g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12033g.hashCode();
    }
}
