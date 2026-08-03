package p080fb;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: fb.w0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1187w0 {

    /* JADX INFO: renamed from: a */
    public final boolean f3992a;

    /* JADX INFO: renamed from: b */
    public final String f3993b;

    /* JADX INFO: renamed from: c */
    public final String f3994c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1187w0(String str, String str2, boolean z9) {
        this.f3992a = z9;
        this.f3993b = str;
        this.f3994c = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1187w0)) {
            return false;
        }
        C1187w0 c1187w0 = (C1187w0) obj;
        return this.f3992a == c1187w0.f3992a && this.f3993b.equals(c1187w0.f3993b) && this.f3994c.equals(c1187w0.f3994c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3994c.hashCode() + AbstractC0921a.m2244g(Boolean.hashCode(this.f3992a) * 31, 31, this.f3993b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageData(base64=");
        sb2.append(this.f3992a);
        sb2.append(", mimeType=");
        sb2.append(this.f3993b);
        sb2.append(", value=");
        return AbstractC0921a.m2255r(sb2, this.f3994c, ")");
    }
}
