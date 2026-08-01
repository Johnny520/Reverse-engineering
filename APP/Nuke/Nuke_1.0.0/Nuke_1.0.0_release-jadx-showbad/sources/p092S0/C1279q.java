package p092S0;

import com.bumptech.glide.AbstractC1926h;
import p011B4.AbstractC0231b;
import p204n0.C2684c;

/* JADX INFO: renamed from: S0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1279q {

    /* JADX INFO: renamed from: a */
    public final C1263a f4595a;

    /* JADX INFO: renamed from: b */
    public final int f4596b;

    /* JADX INFO: renamed from: c */
    public final int f4597c;

    /* JADX INFO: renamed from: d */
    public final int f4598d;

    /* JADX INFO: renamed from: e */
    public final int f4599e;

    /* JADX INFO: renamed from: f */
    public final float f4600f;

    /* JADX INFO: renamed from: g */
    public final float f4601g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1279q(C1263a c1263a, int i5, int i6, int i7, int i8, float f2, float f5) {
        this.f4595a = c1263a;
        this.f4596b = i5;
        this.f4597c = i6;
        this.f4598d = i7;
        this.f4599e = i8;
        this.f4600f = f2;
        this.f4601g = f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2684c m2371a(C2684c c2684c) {
        return c2684c.m4658i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f4600f)) & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m2372b(long j5, boolean z5) {
        if (z5) {
            long j6 = C1259L.f4536b;
            if (C1259L.m2334b(j5, j6)) {
                return j6;
            }
        }
        int i5 = C1259L.f4537c;
        int i6 = (int) (j5 >> 32);
        int i7 = this.f4596b;
        return AbstractC1251D.m2313b(i6 + i7, ((int) (j5 & 4294967295L)) + i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C2684c m2373c(C2684c c2684c) {
        float f2 = -this.f4600f;
        return c2684c.m4658i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m2374d(int i5) {
        int i6 = this.f4597c;
        int i7 = this.f4596b;
        return AbstractC1926h.m3568k(i5, i7, i6) - i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1279q)) {
            return false;
        }
        C1279q c1279q = (C1279q) obj;
        return this.f4595a.equals(c1279q.f4595a) && this.f4596b == c1279q.f4596b && this.f4597c == c1279q.f4597c && this.f4598d == c1279q.f4598d && this.f4599e == c1279q.f4599e && Float.compare(this.f4600f, c1279q.f4600f) == 0 && Float.compare(this.f4601g, c1279q.f4601g) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f4601g) + AbstractC0231b.m390a(this.f4600f, AbstractC0231b.m391b(this.f4599e, AbstractC0231b.m391b(this.f4598d, AbstractC0231b.m391b(this.f4597c, AbstractC0231b.m391b(this.f4596b, this.f4595a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f4595a);
        sb.append(", startIndex=");
        sb.append(this.f4596b);
        sb.append(", endIndex=");
        sb.append(this.f4597c);
        sb.append(", startLineIndex=");
        sb.append(this.f4598d);
        sb.append(", endLineIndex=");
        sb.append(this.f4599e);
        sb.append(", top=");
        sb.append(this.f4600f);
        sb.append(", bottom=");
        return AbstractC0231b.m401l(sb, this.f4601g, ')');
    }
}
