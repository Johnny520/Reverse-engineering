package p088g0;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: g0.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1269m {

    /* JADX INFO: renamed from: a */
    public final String f4207a;

    /* JADX INFO: renamed from: b */
    public String f4208b;

    /* JADX INFO: renamed from: c */
    public boolean f4209c = false;

    /* JADX INFO: renamed from: d */
    public C1261e f4210d = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1269m(String str, String str2) {
        this.f4207a = str;
        this.f4208b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1269m)) {
            return false;
        }
        C1269m c1269m = (C1269m) obj;
        return AbstractC1416l.m3825a(this.f4207a, c1269m.f4207a) && AbstractC1416l.m3825a(this.f4208b, c1269m.f4208b) && this.f4209c == c1269m.f4209c && AbstractC1416l.m3825a(this.f4210d, c1269m.f4210d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2245h = AbstractC0921a.m2245h(AbstractC0921a.m2244g(this.f4207a.hashCode() * 31, 31, this.f4208b), 31, this.f4209c);
        C1261e c1261e = this.f4210d;
        return iM2245h + (c1261e == null ? 0 : c1261e.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f4210d + ", isShowingSubstitution=" + this.f4209c + ')';
    }
}
