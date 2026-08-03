package p080fb;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.z0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1196z0 {

    /* JADX INFO: renamed from: a */
    public final int f4019a;

    /* JADX INFO: renamed from: b */
    public final String f4020b;

    /* JADX INFO: renamed from: c */
    public final String f4021c;

    /* JADX INFO: renamed from: d */
    public final String f4022d;

    /* JADX INFO: renamed from: e */
    public final String f4023e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1196z0(int i9, String str, String str2, String str3, String str4) {
        this.f4019a = i9;
        this.f4020b = str;
        this.f4021c = str2;
        this.f4022d = str3;
        this.f4023e = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1196z0)) {
            return false;
        }
        C1196z0 c1196z0 = (C1196z0) obj;
        return this.f4019a == c1196z0.f4019a && AbstractC1416l.m3825a(this.f4020b, c1196z0.f4020b) && AbstractC1416l.m3825a(this.f4021c, c1196z0.f4021c) && AbstractC1416l.m3825a(this.f4022d, c1196z0.f4022d) && AbstractC1416l.m3825a(this.f4023e, c1196z0.f4023e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4023e.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(Integer.hashCode(this.f4019a) * 31, 31, this.f4020b), 31, this.f4021c), 31, this.f4022d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToolCall(index=");
        sb2.append(this.f4019a);
        sb2.append(", id=");
        sb2.append(this.f4020b);
        sb2.append(", name=");
        AbstractC2091b.m5173t(sb2, this.f4021c, ", arguments=", this.f4022d, ", providerMetadata=");
        return AbstractC0921a.m2255r(sb2, this.f4023e, ")");
    }
}
