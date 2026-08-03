package p282t4;

import bsh.C0353j;
import p311v4.AbstractC4446a;
import p311v4.C4451c0;

/* JADX INFO: renamed from: t4.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4117d implements Comparable {

    /* JADX INFO: renamed from: g */
    public final C4451c0 f13619g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4446a f13620h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4117d(C4451c0 c4451c0, AbstractC4446a abstractC4446a) {
        if (c4451c0 == null) {
            C0353j.m1305c("name == null");
            throw null;
        }
        if (abstractC4446a == null) {
            C0353j.m1305c("value == null");
            throw null;
        }
        this.f13619g = c4451c0;
        this.f13620h = abstractC4446a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4117d c4117d = (C4117d) obj;
        int iCompareTo = this.f13619g.compareTo(c4117d.f13619g);
        return iCompareTo != 0 ? iCompareTo : this.f13620h.compareTo(c4117d.f13620h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C4117d)) {
            return false;
        }
        C4117d c4117d = (C4117d) obj;
        return this.f13619g.equals(c4117d.f13619g) && this.f13620h.equals(c4117d.f13620h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f13620h.hashCode() + (this.f13619g.f14760g.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f13619g.mo4901a() + ":" + this.f13620h;
    }
}
