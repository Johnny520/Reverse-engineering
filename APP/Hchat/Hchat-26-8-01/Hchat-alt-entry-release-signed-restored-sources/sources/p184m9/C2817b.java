package p184m9;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m9.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2817b {

    /* JADX INFO: renamed from: a */
    public final int f9087a;

    /* JADX INFO: renamed from: b */
    public final String f9088b;

    /* JADX INFO: renamed from: c */
    public final String f9089c;

    /* JADX INFO: renamed from: d */
    public final int f9090d;

    /* JADX INFO: renamed from: e */
    public final String f9091e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2817b(int i9, int i10, String str, String str2, String str3) {
        this.f9087a = i9;
        this.f9088b = str;
        this.f9089c = str2;
        this.f9090d = i10;
        this.f9091e = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2817b)) {
            return false;
        }
        C2817b c2817b = (C2817b) obj;
        return this.f9087a == c2817b.f9087a && this.f9088b.equals(c2817b.f9088b) && this.f9089c.equals(c2817b.f9089c) && this.f9090d == c2817b.f9090d && this.f9091e.equals(c2817b.f9091e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9091e.hashCode() + AbstractC0921a.m2242e(this.f9090d, AbstractC0921a.m2244g(AbstractC0921a.m2244g(Integer.hashCode(this.f9087a) * 31, 31, this.f9088b), 31, this.f9089c), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GameResult(value=");
        sb2.append(this.f9087a);
        sb2.append(", label=");
        sb2.append(this.f9088b);
        sb2.append(", md5=");
        sb2.append(this.f9089c);
        sb2.append(", size=");
        sb2.append(this.f9090d);
        sb2.append(", fileName=");
        return AbstractC0921a.m2255r(sb2, this.f9091e, ")");
    }
}
