package p250r1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: r1.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6457g {

    /* JADX INFO: renamed from: e */
    public static final a f20319e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final C6457g f20320f = new C6457g(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f20321a;

    /* JADX INFO: renamed from: b */
    public final float f20322b;

    /* JADX INFO: renamed from: c */
    public final float f20323c;

    /* JADX INFO: renamed from: d */
    public final float f20324d;

    public C6457g(float f10, float f11, float f12, float f13) {
        this.f20321a = f10;
        this.f20322b = f11;
        this.f20323c = f12;
        this.f20324d = f13;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C6457g m25573h(C6457g c6457g, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = c6457g.f20321a;
        }
        if ((i10 & 2) != 0) {
            f11 = c6457g.f20322b;
        }
        if ((i10 & 4) != 0) {
            f12 = c6457g.f20323c;
        }
        if ((i10 & 8) != 0) {
            f13 = c6457g.f20324d;
        }
        return c6457g.m25579g(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: b */
    public final float m25574b() {
        return this.f20321a;
    }

    /* JADX INFO: renamed from: c */
    public final float m25575c() {
        return this.f20322b;
    }

    /* JADX INFO: renamed from: d */
    public final float m25576d() {
        return this.f20323c;
    }

    /* JADX INFO: renamed from: e */
    public final float m25577e() {
        return this.f20324d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6457g)) {
            return false;
        }
        C6457g c6457g = (C6457g) obj;
        return Float.compare(this.f20321a, c6457g.f20321a) == 0 && Float.compare(this.f20322b, c6457g.f20322b) == 0 && Float.compare(this.f20323c, c6457g.f20323c) == 0 && Float.compare(this.f20324d, c6457g.f20324d) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m25578f(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (fIntBitsToFloat >= this.f20321a) & (fIntBitsToFloat < this.f20323c) & (fIntBitsToFloat2 >= this.f20322b) & (fIntBitsToFloat2 < this.f20324d);
    }

    /* JADX INFO: renamed from: g */
    public final C6457g m25579g(float f10, float f11, float f12, float f13) {
        return new C6457g(f10, f11, f12, f13);
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f20321a) * 31) + Float.hashCode(this.f20322b)) * 31) + Float.hashCode(this.f20323c)) * 31) + Float.hashCode(this.f20324d);
    }

    /* JADX INFO: renamed from: i */
    public final float m25580i() {
        return this.f20324d;
    }

    /* JADX INFO: renamed from: j */
    public final long m25581j() {
        float f10 = this.f20323c;
        return C6455e.m25551e((((long) Float.floatToRawIntBits(this.f20324d)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* JADX INFO: renamed from: k */
    public final long m25582k() {
        float fM25584m = this.f20321a + ((m25584m() - m25583l()) / 2.0f);
        return C6455e.m25551e((((long) Float.floatToRawIntBits(this.f20322b + ((m25580i() - m25586o()) / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fM25584m) << 32));
    }

    /* JADX INFO: renamed from: l */
    public final float m25583l() {
        return this.f20321a;
    }

    /* JADX INFO: renamed from: m */
    public final float m25584m() {
        return this.f20323c;
    }

    /* JADX INFO: renamed from: n */
    public final long m25585n() {
        float fM25584m = m25584m() - m25583l();
        return C6461k.m25616d((((long) Float.floatToRawIntBits(m25580i() - m25586o())) & 4294967295L) | (Float.floatToRawIntBits(fM25584m) << 32));
    }

    /* JADX INFO: renamed from: o */
    public final float m25586o() {
        return this.f20322b;
    }

    /* JADX INFO: renamed from: p */
    public final long m25587p() {
        float f10 = this.f20321a;
        return C6455e.m25551e((((long) Float.floatToRawIntBits(this.f20322b)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* JADX INFO: renamed from: q */
    public final C6457g m25588q(float f10, float f11, float f12, float f13) {
        return new C6457g(Math.max(this.f20321a, f10), Math.max(this.f20322b, f11), Math.min(this.f20323c, f12), Math.min(this.f20324d, f13));
    }

    /* JADX INFO: renamed from: r */
    public final C6457g m25589r(C6457g c6457g) {
        return new C6457g(Math.max(this.f20321a, c6457g.f20321a), Math.max(this.f20322b, c6457g.f20322b), Math.min(this.f20323c, c6457g.f20323c), Math.min(this.f20324d, c6457g.f20324d));
    }

    /* JADX INFO: renamed from: s */
    public final boolean m25590s() {
        return (this.f20321a >= this.f20323c) | (this.f20322b >= this.f20324d);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m25591t(C6457g c6457g) {
        return (this.f20321a < c6457g.f20323c) & (c6457g.f20321a < this.f20323c) & (this.f20322b < c6457g.f20324d) & (c6457g.f20322b < this.f20324d);
    }

    public String toString() {
        return "Rect.fromLTRB(" + AbstractC6452b.m25532a(this.f20321a, 1) + ", " + AbstractC6452b.m25532a(this.f20322b, 1) + ", " + AbstractC6452b.m25532a(this.f20323c, 1) + ", " + AbstractC6452b.m25532a(this.f20324d, 1) + ')';
    }

    /* JADX INFO: renamed from: u */
    public final C6457g m25592u(float f10, float f11) {
        return new C6457g(this.f20321a + f10, this.f20322b + f11, this.f20323c + f10, this.f20324d + f11);
    }

    /* JADX INFO: renamed from: v */
    public final C6457g m25593v(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return new C6457g(this.f20321a + Float.intBitsToFloat(i10), this.f20322b + Float.intBitsToFloat(i11), this.f20323c + Float.intBitsToFloat(i10), this.f20324d + Float.intBitsToFloat(i11));
    }

    /* JADX INFO: renamed from: r1.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6457g m25594a() {
            return C6457g.f20320f;
        }

        public a() {
        }
    }
}
