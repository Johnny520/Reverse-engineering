package p119i2;

import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;
import p237q2.C3430d;

/* JADX INFO: renamed from: i2.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1948s {

    /* JADX INFO: renamed from: a */
    public final C3430d f6603a;

    /* JADX INFO: renamed from: b */
    public final int f6604b;

    /* JADX INFO: renamed from: c */
    public final int f6605c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1948s(C3430d c3430d, int i9, int i10) {
        this.f6603a = c3430d;
        this.f6604b = i9;
        this.f6605c = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1948s)) {
            return false;
        }
        C1948s c1948s = (C1948s) obj;
        return this.f6603a.equals(c1948s.f6603a) && this.f6604b == c1948s.f6604b && this.f6605c == c1948s.f6605c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f6605c) + AbstractC0921a.m2242e(this.f6604b, this.f6603a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f6603a);
        sb2.append(", startIndex=");
        sb2.append(this.f6604b);
        sb2.append(", endIndex=");
        return AbstractC3199a.m6841n(sb2, this.f6605c, ')');
    }
}
