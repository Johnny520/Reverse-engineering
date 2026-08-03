package p136j8;

import gg.AbstractC1416l;
import java.util.List;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: j8.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2096g {

    /* JADX INFO: renamed from: a */
    public final List f7004a;

    /* JADX INFO: renamed from: b */
    public final boolean f7005b;

    /* JADX INFO: renamed from: c */
    public final boolean f7006c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2096g(List list, boolean z9, boolean z10) {
        list.getClass();
        this.f7004a = list;
        this.f7005b = z9;
        this.f7006c = z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2096g)) {
            return false;
        }
        C2096g c2096g = (C2096g) obj;
        return AbstractC1416l.m3825a(this.f7004a, c2096g.f7004a) && this.f7005b == c2096g.f7005b && this.f7006c == c2096g.f7006c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f7006c) + AbstractC0921a.m2245h(this.f7004a.hashCode() * 31, 31, this.f7005b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FavoritePage(items=");
        sb2.append(this.f7004a);
        sb2.append(", hasMore=");
        sb2.append(this.f7005b);
        sb2.append(", changed=");
        return AbstractC3199a.m6840m(")", sb2, this.f7006c);
    }
}
