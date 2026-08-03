package p345x8;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: x8.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5732y {

    /* JADX INFO: renamed from: a */
    public final boolean f23349a;

    /* JADX INFO: renamed from: b */
    public final String f23350b;

    /* JADX INFO: renamed from: c */
    public final String f23351c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5732y(String str, String str2, boolean z9) {
        this.f23349a = z9;
        this.f23350b = str;
        this.f23351c = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5732y)) {
            return false;
        }
        C5732y c5732y = (C5732y) obj;
        return this.f23349a == c5732y.f23349a && this.f23350b.equals(c5732y.f23350b) && this.f23351c.equals(c5732y.f23351c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f23351c.hashCode() + AbstractC0921a.m2244g(Boolean.hashCode(this.f23349a) * 31, 31, this.f23350b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("XiaozhiMcpStatus(connected=");
        sb2.append(this.f23349a);
        sb2.append(", label=");
        sb2.append(this.f23350b);
        sb2.append(", detail=");
        return AbstractC0921a.m2255r(sb2, this.f23351c, ")");
    }
}
