package p036c9;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: c9.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0502y {

    /* JADX INFO: renamed from: a */
    public final int f1533a;

    /* JADX INFO: renamed from: b */
    public final int f1534b;

    /* JADX INFO: renamed from: c */
    public final String f1535c;

    /* JADX INFO: renamed from: d */
    public final boolean f1536d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0502y(String str, int i9, int i10, boolean z9) {
        this.f1533a = i9;
        this.f1534b = i10;
        this.f1535c = str;
        this.f1536d = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0502y)) {
            return false;
        }
        C0502y c0502y = (C0502y) obj;
        return this.f1533a == c0502y.f1533a && this.f1534b == c0502y.f1534b && AbstractC1416l.m3825a(this.f1535c, c0502y.f1535c) && this.f1536d == c0502y.f1536d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f1536d) + AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f1534b, Integer.hashCode(this.f1533a) * 31, 31), 31, this.f1535c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2256s = AbstractC0921a.m2256s(this.f1533a, this.f1534b, "BatchResult(success=", ", total=", ", action=");
        sbM2256s.append(this.f1535c);
        sbM2256s.append(", failed=");
        sbM2256s.append(this.f1536d);
        sbM2256s.append(")");
        return sbM2256s.toString();
    }
}
