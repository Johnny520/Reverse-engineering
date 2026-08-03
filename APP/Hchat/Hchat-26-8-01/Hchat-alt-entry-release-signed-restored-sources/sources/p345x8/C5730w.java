package p345x8;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: x8.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5730w {

    /* JADX INFO: renamed from: a */
    public final int f23345a;

    /* JADX INFO: renamed from: b */
    public final boolean f23346b;

    /* JADX INFO: renamed from: c */
    public final String f23347c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5730w(String str, int i9, boolean z9) {
        this.f23345a = i9;
        this.f23346b = z9;
        this.f23347c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5730w)) {
            return false;
        }
        C5730w c5730w = (C5730w) obj;
        return this.f23345a == c5730w.f23345a && this.f23346b == c5730w.f23346b && this.f23347c.equals(c5730w.f23347c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f23347c.hashCode() + AbstractC0921a.m2245h(Integer.hashCode(this.f23345a) * 31, 31, this.f23346b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpTextResult(code=");
        sb2.append(this.f23345a);
        sb2.append(", successful=");
        sb2.append(this.f23346b);
        sb2.append(", text=");
        return AbstractC0921a.m2255r(sb2, this.f23347c, ")");
    }
}
