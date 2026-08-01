package p204n0;

import p011B4.AbstractC0231b;
import p128a.AbstractC1785a;

/* JADX INFO: renamed from: n0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2684c {

    /* JADX INFO: renamed from: e */
    public static final C2684c f8557e = new C2684c(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f8558a;

    /* JADX INFO: renamed from: b */
    public final float f8559b;

    /* JADX INFO: renamed from: c */
    public final float f8560c;

    /* JADX INFO: renamed from: d */
    public final float f8561d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2684c(float f2, float f5, float f6, float f7) {
        this.f8558a = f2;
        this.f8559b = f5;
        this.f8560c = f6;
        this.f8561d = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m4650a(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        return (fIntBitsToFloat >= this.f8558a) & (fIntBitsToFloat < this.f8560c) & (fIntBitsToFloat2 >= this.f8559b) & (fIntBitsToFloat2 < this.f8561d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m4651b() {
        float f2 = this.f8560c;
        float f5 = this.f8558a;
        float f6 = ((f2 - f5) / 2.0f) + f5;
        float f7 = this.f8561d;
        float f8 = this.f8559b;
        return (((long) Float.floatToRawIntBits(((f7 - f8) / 2.0f) + f8)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final long m4652c() {
        float f2 = this.f8560c - this.f8558a;
        return (((long) Float.floatToRawIntBits(this.f8561d - this.f8559b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final long m4653d() {
        return (((long) Float.floatToRawIntBits(this.f8558a)) << 32) | (((long) Float.floatToRawIntBits(this.f8559b)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C2684c m4654e(C2684c c2684c) {
        return new C2684c(Math.max(this.f8558a, c2684c.f8558a), Math.max(this.f8559b, c2684c.f8559b), Math.min(this.f8560c, c2684c.f8560c), Math.min(this.f8561d, c2684c.f8561d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2684c)) {
            return false;
        }
        C2684c c2684c = (C2684c) obj;
        return Float.compare(this.f8558a, c2684c.f8558a) == 0 && Float.compare(this.f8559b, c2684c.f8559b) == 0 && Float.compare(this.f8560c, c2684c.f8560c) == 0 && Float.compare(this.f8561d, c2684c.f8561d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m4655f() {
        return (this.f8558a >= this.f8560c) | (this.f8559b >= this.f8561d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m4656g(C2684c c2684c) {
        return (this.f8558a < c2684c.f8560c) & (c2684c.f8558a < this.f8560c) & (this.f8559b < c2684c.f8561d) & (c2684c.f8559b < this.f8561d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final C2684c m4657h(float f2, float f5) {
        return new C2684c(this.f8558a + f2, this.f8559b + f5, this.f8560c + f2, this.f8561d + f5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8561d) + AbstractC0231b.m390a(this.f8560c, AbstractC0231b.m390a(this.f8559b, Float.hashCode(this.f8558a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final C2684c m4658i(long j5) {
        int i5 = (int) (j5 >> 32);
        int i6 = (int) (j5 & 4294967295L);
        return new C2684c(Float.intBitsToFloat(i5) + this.f8558a, Float.intBitsToFloat(i6) + this.f8559b, Float.intBitsToFloat(i5) + this.f8560c, Float.intBitsToFloat(i6) + this.f8561d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC1785a.m3258t(this.f8558a) + ", " + AbstractC1785a.m3258t(this.f8559b) + ", " + AbstractC1785a.m3258t(this.f8560c) + ", " + AbstractC1785a.m3258t(this.f8561d) + ')';
    }
}
