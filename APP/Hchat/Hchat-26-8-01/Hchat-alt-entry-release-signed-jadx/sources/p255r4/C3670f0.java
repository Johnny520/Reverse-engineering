package p255r4;

import p311v4.C4476y;
import p376z4.InterfaceC6097k;

/* JADX INFO: renamed from: r4.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3670f0 implements InterfaceC6097k, Comparable {

    /* JADX INFO: renamed from: g */
    public final C4476y f11923g;

    /* JADX INFO: renamed from: h */
    public C3661b f11924h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3670f0(C4476y c4476y, C3661b c3661b) {
        this.f11923g = c4476y;
        this.f11924h = c3661b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return this.f11923g.mo4901a() + ": " + this.f11924h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11923g.compareTo(((C3670f0) obj).f11923g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3670f0)) {
            return false;
        }
        return this.f11923g.equals(((C3670f0) obj).f11923g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11923g.hashCode();
    }
}
