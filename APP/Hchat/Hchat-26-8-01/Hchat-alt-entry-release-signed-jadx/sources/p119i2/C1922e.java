package p119i2;

import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p204o2.AbstractC3042a;

/* JADX INFO: renamed from: i2.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1922e {

    /* JADX INFO: renamed from: a */
    public final Object f6503a;

    /* JADX INFO: renamed from: b */
    public final int f6504b;

    /* JADX INFO: renamed from: c */
    public final int f6505c;

    /* JADX INFO: renamed from: d */
    public final String f6506d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1922e(String str, int i9, int i10, Object obj) {
        this.f6503a = obj;
        this.f6504b = i9;
        this.f6505c = i10;
        this.f6506d = str;
        if (i9 <= i10) {
            return;
        }
        AbstractC3042a.m6486a("Reversed range is not supported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1922e m4782a(C1922e c1922e, C1950u c1950u, int i9, int i10) {
        Object obj = c1950u;
        if ((i10 & 1) != 0) {
            obj = c1922e.f6503a;
        }
        int i11 = c1922e.f6504b;
        if ((i10 & 4) != 0) {
            i9 = c1922e.f6505c;
        }
        return new C1922e(c1922e.f6506d, i11, i9, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1922e)) {
            return false;
        }
        C1922e c1922e = (C1922e) obj;
        return AbstractC1416l.m3825a(this.f6503a, c1922e.f6503a) && this.f6504b == c1922e.f6504b && this.f6505c == c1922e.f6505c && AbstractC1416l.m3825a(this.f6506d, c1922e.f6506d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f6503a;
        return this.f6506d.hashCode() + AbstractC0921a.m2242e(this.f6505c, AbstractC0921a.m2242e(this.f6504b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f6503a);
        sb2.append(", start=");
        sb2.append(this.f6504b);
        sb2.append(", end=");
        sb2.append(this.f6505c);
        sb2.append(", tag=");
        return AbstractC0921a.m2254q(sb2, this.f6506d, ')');
    }

    public C1922e(int i9, int i10, Object obj) {
        this(HttpUrl.FRAGMENT_ENCODE_SET, i9, i10, obj);
    }
}
