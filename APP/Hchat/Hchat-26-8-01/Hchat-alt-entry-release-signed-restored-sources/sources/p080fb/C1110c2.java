package p080fb;

import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.c2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1110c2 {

    /* JADX INFO: renamed from: a */
    public final int f3610a;

    /* JADX INFO: renamed from: b */
    public final String f3611b;

    /* JADX INFO: renamed from: c */
    public final String f3612c;

    /* JADX INFO: renamed from: d */
    public final String f3613d;

    /* JADX INFO: renamed from: e */
    public final boolean f3614e;

    /* JADX INFO: renamed from: f */
    public final String f3615f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1110c2(int i9, String str, String str2, String str3, boolean z9, String str4, int i10) {
        i9 = (i10 & 1) != 0 ? 0 : i9;
        str = (i10 & 2) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        str2 = (i10 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        str3 = (i10 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        z9 = (i10 & 16) != 0 ? false : z9;
        str4 = (i10 & 32) != 0 ? null : str4;
        str.getClass();
        this.f3610a = i9;
        this.f3611b = str;
        this.f3612c = str2;
        this.f3613d = str3;
        this.f3614e = z9;
        this.f3615f = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1110c2)) {
            return false;
        }
        C1110c2 c1110c2 = (C1110c2) obj;
        return this.f3610a == c1110c2.f3610a && this.f3611b.equals(c1110c2.f3611b) && this.f3612c.equals(c1110c2.f3612c) && this.f3613d.equals(c1110c2.f3613d) && this.f3614e == c1110c2.f3614e && AbstractC1416l.m3825a(this.f3615f, c1110c2.f3615f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2245h = AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(Integer.hashCode(this.f3610a) * 31, 31, this.f3611b), 31, this.f3612c), 31, this.f3613d), 31, this.f3614e);
        String str = this.f3615f;
        return iM2245h + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FetchResult(status=");
        sb2.append(this.f3610a);
        sb2.append(", url=");
        sb2.append(this.f3611b);
        sb2.append(", contentType=");
        AbstractC2091b.m5173t(sb2, this.f3612c, ", body=", this.f3613d, ", truncated=");
        sb2.append(this.f3614e);
        sb2.append(", error=");
        sb2.append(this.f3615f);
        sb2.append(")");
        return sb2.toString();
    }
}
