package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class bw0 {

    /* JADX INFO: renamed from: a */
    public final float f596a;

    /* JADX INFO: renamed from: b */
    public final float f597b;

    /* JADX INFO: renamed from: c */
    public final float f598c;

    /* JADX INFO: renamed from: d */
    public final float f599d;

    /* JADX INFO: renamed from: e */
    public final long f600e;

    /* JADX INFO: renamed from: f */
    public final long f601f;

    /* JADX INFO: renamed from: g */
    public final long f602g;

    /* JADX INFO: renamed from: h */
    public final long f603h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        j50.m1652b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bw0(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f596a = f;
        this.f597b = f2;
        this.f598c = f3;
        this.f599d = f4;
        this.f600e = j;
        this.f601f = j2;
        this.f602g = j3;
        this.f603h = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw0)) {
            return false;
        }
        bw0 bw0Var = (bw0) obj;
        return Float.compare(this.f596a, bw0Var.f596a) == 0 && Float.compare(this.f597b, bw0Var.f597b) == 0 && Float.compare(this.f598c, bw0Var.f598c) == 0 && Float.compare(this.f599d, bw0Var.f599d) == 0 && s91.m4060y(this.f600e, bw0Var.f600e) && s91.m4060y(this.f601f, bw0Var.f601f) && s91.m4060y(this.f602g, bw0Var.f602g) && s91.m4060y(this.f603h, bw0Var.f603h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f603h) + AbstractC0748t1.m4146d(this.f602g, AbstractC0748t1.m4146d(this.f601f, AbstractC0748t1.m4146d(this.f600e, AbstractC0748t1.m4143a(this.f599d, AbstractC0748t1.m4143a(this.f598c, AbstractC0748t1.m4143a(this.f597b, Float.hashCode(this.f596a) * 31, 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = rd0.m3462U(this.f596a) + ", " + rd0.m3462U(this.f597b) + ", " + rd0.m3462U(this.f598c) + ", " + rd0.m3462U(this.f599d);
        long j = this.f600e;
        long j2 = this.f601f;
        boolean zM4060y = s91.m4060y(j, j2);
        long j3 = this.f602g;
        long j4 = this.f603h;
        if (!zM4060y || !s91.m4060y(j2, j3) || !s91.m4060y(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) s91.m4033T(j)) + ", topRight=" + ((Object) s91.m4033T(j2)) + ", bottomRight=" + ((Object) s91.m4033T(j3)) + ", bottomLeft=" + ((Object) s91.m4033T(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + rd0.m3462U(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + rd0.m3462U(Float.intBitsToFloat(i)) + ", y=" + rd0.m3462U(Float.intBitsToFloat(i2)) + ')';
    }
}
