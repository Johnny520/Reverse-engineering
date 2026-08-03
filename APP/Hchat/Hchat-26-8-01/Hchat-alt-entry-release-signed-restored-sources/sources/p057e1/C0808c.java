package p057e1;

import p007a7.AbstractC0018a;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: e1.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0808c {

    /* JADX INFO: renamed from: e */
    public static final C0808c f2415e = new C0808c(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f2416a;

    /* JADX INFO: renamed from: b */
    public final float f2417b;

    /* JADX INFO: renamed from: c */
    public final float f2418c;

    /* JADX INFO: renamed from: d */
    public final float f2419d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0808c(float f3, float f10, float f11, float f12) {
        this.f2416a = f3;
        this.f2417b = f10;
        this.f2418c = f11;
        this.f2419d = f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m2045a(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (fIntBitsToFloat >= this.f2416a) & (fIntBitsToFloat < this.f2418c) & (fIntBitsToFloat2 >= this.f2417b) & (fIntBitsToFloat2 < this.f2419d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m2046b() {
        float f3 = this.f2418c;
        float f10 = this.f2416a;
        float f11 = ((f3 - f10) / 2.0f) + f10;
        float f12 = this.f2419d;
        float f13 = this.f2417b;
        return (((long) Float.floatToRawIntBits(((f12 - f13) / 2.0f) + f13)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final long m2047c() {
        float f3 = this.f2418c - this.f2416a;
        return (((long) Float.floatToRawIntBits(this.f2419d - this.f2417b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final long m2048d() {
        return (((long) Float.floatToRawIntBits(this.f2416a)) << 32) | (((long) Float.floatToRawIntBits(this.f2417b)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C0808c m2049e(C0808c c0808c) {
        return new C0808c(Math.max(this.f2416a, c0808c.f2416a), Math.max(this.f2417b, c0808c.f2417b), Math.min(this.f2418c, c0808c.f2418c), Math.min(this.f2419d, c0808c.f2419d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0808c)) {
            return false;
        }
        C0808c c0808c = (C0808c) obj;
        return Float.compare(this.f2416a, c0808c.f2416a) == 0 && Float.compare(this.f2417b, c0808c.f2417b) == 0 && Float.compare(this.f2418c, c0808c.f2418c) == 0 && Float.compare(this.f2419d, c0808c.f2419d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m2050f() {
        return (this.f2416a >= this.f2418c) | (this.f2417b >= this.f2419d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m2051g(C0808c c0808c) {
        return (this.f2416a < c0808c.f2418c) & (c0808c.f2416a < this.f2418c) & (this.f2417b < c0808c.f2419d) & (c0808c.f2417b < this.f2419d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final C0808c m2052h(float f3, float f10) {
        return new C0808c(this.f2416a + f3, this.f2417b + f10, this.f2418c + f3, this.f2419d + f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f2419d) + AbstractC0921a.m2241d(this.f2418c, AbstractC0921a.m2241d(this.f2417b, Float.hashCode(this.f2416a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final C0808c m2053i(long j3) {
        int i9 = (int) (j3 >> 32);
        int i10 = (int) (j3 & 4294967295L);
        return new C0808c(Float.intBitsToFloat(i9) + this.f2416a, Float.intBitsToFloat(i10) + this.f2417b, Float.intBitsToFloat(i9) + this.f2418c, Float.intBitsToFloat(i10) + this.f2419d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC0018a.m234V(this.f2416a) + ", " + AbstractC0018a.m234V(this.f2417b) + ", " + AbstractC0018a.m234V(this.f2418c) + ", " + AbstractC0018a.m234V(this.f2419d) + ')';
    }
}
