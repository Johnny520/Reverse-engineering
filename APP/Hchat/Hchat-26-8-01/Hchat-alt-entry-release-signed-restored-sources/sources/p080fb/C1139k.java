package p080fb;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1139k {

    /* JADX INFO: renamed from: a */
    public final int f3755a;

    /* JADX INFO: renamed from: b */
    public final String f3756b;

    /* JADX INFO: renamed from: c */
    public final String f3757c;

    /* JADX INFO: renamed from: d */
    public final String f3758d;

    /* JADX INFO: renamed from: e */
    public final String f3759e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1139k(int i9, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f3755a = i9;
        this.f3756b = str;
        this.f3757c = str2;
        this.f3758d = str3;
        this.f3759e = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1139k)) {
            return false;
        }
        C1139k c1139k = (C1139k) obj;
        return this.f3755a == c1139k.f3755a && AbstractC1416l.m3825a(this.f3756b, c1139k.f3756b) && AbstractC1416l.m3825a(this.f3757c, c1139k.f3757c) && AbstractC1416l.m3825a(this.f3758d, c1139k.f3758d) && AbstractC1416l.m3825a(this.f3759e, c1139k.f3759e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3759e.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(Integer.hashCode(this.f3755a) * 31, 31, this.f3756b), 31, this.f3757c), 31, this.f3758d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NativeToolDelta(index=");
        sb2.append(this.f3755a);
        sb2.append(", id=");
        sb2.append(this.f3756b);
        sb2.append(", name=");
        AbstractC2091b.m5173t(sb2, this.f3757c, ", arguments=", this.f3758d, ", providerMetadata=");
        return AbstractC0921a.m2255r(sb2, this.f3759e, ")");
    }
}
