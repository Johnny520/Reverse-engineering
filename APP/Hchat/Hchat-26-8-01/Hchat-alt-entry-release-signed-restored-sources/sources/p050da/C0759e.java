package p050da;

import p222p.AbstractC3199a;

/* JADX INFO: renamed from: da.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0759e {

    /* JADX INFO: renamed from: a */
    public final C0760f f2267a;

    /* JADX INFO: renamed from: b */
    public final C0758d f2268b;

    /* JADX INFO: renamed from: c */
    public final boolean f2269c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0759e(C0760f c0760f, C0758d c0758d, boolean z9) {
        this.f2267a = c0760f;
        this.f2268b = c0758d;
        this.f2269c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0759e)) {
            return false;
        }
        C0759e c0759e = (C0759e) obj;
        return this.f2267a.equals(c0759e.f2267a) && this.f2268b.equals(c0759e.f2268b) && this.f2269c == c0759e.f2269c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f2269c) + ((this.f2268b.hashCode() + (this.f2267a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextMatch(target=");
        sb2.append(this.f2267a);
        sb2.append(", candidate=");
        sb2.append(this.f2268b);
        sb2.append(", exact=");
        return AbstractC3199a.m6840m(")", sb2, this.f2269c);
    }
}
