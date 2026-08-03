package p119i2;

import p057e1.C0808c;
import p068eh.AbstractC0921a;
import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: i2.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1947r {

    /* JADX INFO: renamed from: a */
    public final C1914a f6596a;

    /* JADX INFO: renamed from: b */
    public final int f6597b;

    /* JADX INFO: renamed from: c */
    public final int f6598c;

    /* JADX INFO: renamed from: d */
    public final int f6599d;

    /* JADX INFO: renamed from: e */
    public final int f6600e;

    /* JADX INFO: renamed from: f */
    public final float f6601f;

    /* JADX INFO: renamed from: g */
    public final float f6602g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1947r(C1914a c1914a, int i9, int i10, int i11, int i12, float f3, float f10) {
        this.f6596a = c1914a;
        this.f6597b = i9;
        this.f6598c = i10;
        this.f6599d = i11;
        this.f6600e = i12;
        this.f6601f = f3;
        this.f6602g = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0808c m4835a(C0808c c0808c) {
        return c0808c.m2053i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f6601f)) & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m4836b(long j3, boolean z9) {
        if (z9) {
            long j4 = C1939m0.f6573b;
            if (C1939m0.m4812b(j3, j4)) {
                return j4;
            }
        }
        int i9 = C1939m0.f6574c;
        int i10 = (int) (j3 >> 32);
        int i11 = this.f6597b;
        return AbstractC1923e0.m4784b(i10 + i11, ((int) (j3 & 4294967295L)) + i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0808c m4837c(C0808c c0808c) {
        float f3 = -this.f6601f;
        return c0808c.m2053i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m4838d(int i9) {
        int i10 = this.f6598c;
        int i11 = this.f6597b;
        return AbstractC3754e0.m7909r(i9, i11, i10) - i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1947r)) {
            return false;
        }
        C1947r c1947r = (C1947r) obj;
        return this.f6596a.equals(c1947r.f6596a) && this.f6597b == c1947r.f6597b && this.f6598c == c1947r.f6598c && this.f6599d == c1947r.f6599d && this.f6600e == c1947r.f6600e && Float.compare(this.f6601f, c1947r.f6601f) == 0 && Float.compare(this.f6602g, c1947r.f6602g) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f6602g) + AbstractC0921a.m2241d(this.f6601f, AbstractC0921a.m2242e(this.f6600e, AbstractC0921a.m2242e(this.f6599d, AbstractC0921a.m2242e(this.f6598c, AbstractC0921a.m2242e(this.f6597b, this.f6596a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f6596a);
        sb2.append(", startIndex=");
        sb2.append(this.f6597b);
        sb2.append(", endIndex=");
        sb2.append(this.f6598c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f6599d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f6600e);
        sb2.append(", top=");
        sb2.append(this.f6601f);
        sb2.append(", bottom=");
        return AbstractC0921a.m2252o(sb2, this.f6602g, ')');
    }
}
