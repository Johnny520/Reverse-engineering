package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o62 {

    /* JADX INFO: renamed from: e */
    public static final o62 f7535e = new o62(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f7536a;

    /* JADX INFO: renamed from: b */
    public final float f7537b;

    /* JADX INFO: renamed from: c */
    public final float f7538c;

    /* JADX INFO: renamed from: d */
    public final float f7539d;

    public o62(float f, float f2, float f3, float f4) {
        this.f7536a = f;
        this.f7537b = f2;
        this.f7538c = f3;
        this.f7539d = f4;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3513a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f7536a) & (fIntBitsToFloat < this.f7538c) & (fIntBitsToFloat2 >= this.f7537b) & (fIntBitsToFloat2 < this.f7539d);
    }

    /* JADX INFO: renamed from: b */
    public final long m3514b() {
        float f = this.f7538c;
        float f2 = this.f7536a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.f7539d;
        float f5 = this.f7537b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX INFO: renamed from: c */
    public final long m3515c() {
        float f = this.f7538c - this.f7536a;
        return (((long) Float.floatToRawIntBits(this.f7539d - this.f7537b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: d */
    public final long m3516d() {
        return (((long) Float.floatToRawIntBits(this.f7536a)) << 32) | (((long) Float.floatToRawIntBits(this.f7537b)) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public final o62 m3517e(o62 o62Var) {
        return new o62(Math.max(this.f7536a, o62Var.f7536a), Math.max(this.f7537b, o62Var.f7537b), Math.min(this.f7538c, o62Var.f7538c), Math.min(this.f7539d, o62Var.f7539d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o62)) {
            return false;
        }
        o62 o62Var = (o62) obj;
        return Float.compare(this.f7536a, o62Var.f7536a) == 0 && Float.compare(this.f7537b, o62Var.f7537b) == 0 && Float.compare(this.f7538c, o62Var.f7538c) == 0 && Float.compare(this.f7539d, o62Var.f7539d) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3518f() {
        return (this.f7536a >= this.f7538c) | (this.f7537b >= this.f7539d);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3519g(o62 o62Var) {
        return (this.f7536a < o62Var.f7538c) & (o62Var.f7536a < this.f7538c) & (this.f7537b < o62Var.f7539d) & (o62Var.f7537b < this.f7539d);
    }

    /* JADX INFO: renamed from: h */
    public final o62 m3520h(float f, float f2) {
        return new o62(this.f7536a + f, this.f7537b + f2, this.f7538c + f, this.f7539d + f2);
    }

    public final int hashCode() {
        return Float.hashCode(this.f7539d) + vi0.m5684c(this.f7538c, vi0.m5684c(this.f7537b, Float.hashCode(this.f7536a) * 31, 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final o62 m3521i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new o62(Float.intBitsToFloat(i) + this.f7536a, Float.intBitsToFloat(i2) + this.f7537b, Float.intBitsToFloat(i) + this.f7538c, Float.intBitsToFloat(i2) + this.f7539d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + t11.m5072X(this.f7536a) + ", " + t11.m5072X(this.f7537b) + ", " + t11.m5072X(this.f7538c) + ", " + t11.m5072X(this.f7539d) + ')';
    }
}
