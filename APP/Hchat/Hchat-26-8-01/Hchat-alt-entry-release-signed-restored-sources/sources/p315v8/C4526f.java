package p315v8;

import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: v8.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4526f {

    /* JADX INFO: renamed from: a */
    public final int f14928a;

    /* JADX INFO: renamed from: b */
    public final String f14929b;

    /* JADX INFO: renamed from: c */
    public final String f14930c;

    /* JADX INFO: renamed from: d */
    public final int f14931d;

    /* JADX INFO: renamed from: e */
    public final String f14932e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4526f(int i9, String str, String str2, int i10, String str3, int i11) {
        str = (i11 & 2) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        str2 = (i11 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        i10 = (i11 & 8) != 0 ? 0 : i10;
        str3 = (i11 & 16) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        this.f14928a = i9;
        this.f14929b = str;
        this.f14930c = str2;
        this.f14931d = i10;
        this.f14932e = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4526f)) {
            return false;
        }
        C4526f c4526f = (C4526f) obj;
        return this.f14928a == c4526f.f14928a && this.f14929b.equals(c4526f.f14929b) && this.f14930c.equals(c4526f.f14930c) && this.f14931d == c4526f.f14931d && this.f14932e.equals(c4526f.f14932e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14932e.hashCode() + AbstractC0921a.m2242e(this.f14931d, AbstractC0921a.m2244g(AbstractC0921a.m2244g(Integer.hashCode(this.f14928a) * 31, 31, this.f14929b), 31, this.f14930c), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ForwardPlan(type=");
        sb2.append(this.f14928a);
        sb2.append(", content=");
        sb2.append(this.f14929b);
        sb2.append(", path=");
        sb2.append(this.f14930c);
        sb2.append(", durationMillis=");
        sb2.append(this.f14931d);
        sb2.append(", title=");
        return AbstractC0921a.m2255r(sb2, this.f14932e, ")");
    }
}
