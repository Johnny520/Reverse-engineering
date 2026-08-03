package p295u4;

import okhttp3.HttpUrl;
import p311v4.AbstractC4446a;
import p311v4.C4451c0;

/* JADX INFO: renamed from: u4.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4261k implements Comparable {

    /* JADX INFO: renamed from: g */
    public final C4451c0 f13958g;

    /* JADX INFO: renamed from: h */
    public final C4451c0 f13959h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4261k(C4451c0 c4451c0, C4451c0 c4451c02) {
        this.f13958g = c4451c0;
        this.f13959h = c4451c02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4261k c4261k) {
        AbstractC4446a abstractC4446a = c4261k.f13958g;
        C4451c0 c4451c0 = this.f13958g;
        int iCompareTo = c4451c0 == abstractC4446a ? 0 : c4451c0 == null ? -1 : abstractC4446a == null ? 1 : c4451c0.compareTo(abstractC4446a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        AbstractC4446a abstractC4446a2 = c4261k.f13959h;
        C4451c0 c4451c02 = this.f13959h;
        if (c4451c02 == abstractC4446a2) {
            return 0;
        }
        if (c4451c02 == null) {
            return -1;
        }
        if (abstractC4446a2 == null) {
            return 1;
        }
        return c4451c02.compareTo(abstractC4446a2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C4261k) && compareTo((C4261k) obj) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C4451c0 c4451c0 = this.f13958g;
        int iHashCode = (c4451c0 == null ? 0 : c4451c0.f14760g.hashCode()) * 31;
        C4451c0 c4451c02 = this.f13959h;
        return iHashCode + (c4451c02 != null ? c4451c02.f14760g.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C4451c0 c4451c0 = this.f13959h;
        C4451c0 c4451c02 = this.f13958g;
        if (c4451c02 != null && c4451c0 == null) {
            return c4451c02.m8901l();
        }
        String strM8901l = HttpUrl.FRAGMENT_ENCODE_SET;
        if (c4451c02 == null && c4451c0 == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(c4451c02 == null ? HttpUrl.FRAGMENT_ENCODE_SET : c4451c02.m8901l());
        sb2.append("|");
        if (c4451c0 != null) {
            strM8901l = c4451c0.m8901l();
        }
        sb2.append(strM8901l);
        return sb2.toString();
    }
}
