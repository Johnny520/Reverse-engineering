package p049d9;

import android.graphics.Bitmap;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: d9.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0753n {

    /* JADX INFO: renamed from: a */
    public final long f2250a;

    /* JADX INFO: renamed from: b */
    public final long f2251b;

    /* JADX INFO: renamed from: c */
    public final Bitmap f2252c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0753n(long j3, long j4, Bitmap bitmap) {
        this.f2250a = j3;
        this.f2251b = j4;
        this.f2252c = bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0753n)) {
            return false;
        }
        C0753n c0753n = (C0753n) obj;
        return this.f2250a == c0753n.f2250a && this.f2251b == c0753n.f2251b && this.f2252c.equals(c0753n.f2252c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2252c.hashCode() + AbstractC0921a.m2243f(Long.hashCode(this.f2250a) * 31, 31, this.f2251b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM6842o = AbstractC3199a.m6842o(this.f2250a, "CacheEntry(modified=", ", size=");
        sbM6842o.append(this.f2251b);
        sbM6842o.append(", bitmap=");
        sbM6842o.append(this.f2252c);
        sbM6842o.append(")");
        return sbM6842o.toString();
    }
}
