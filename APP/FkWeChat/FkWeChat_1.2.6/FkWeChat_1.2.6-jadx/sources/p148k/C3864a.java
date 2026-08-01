package p148k;

import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: k.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3864a {

    /* JADX INFO: renamed from: a */
    public static final C3864a f11055a = new C3864a();

    /* JADX INFO: renamed from: b */
    public static final float[] f11056b;

    /* JADX INFO: renamed from: c */
    public static final float[] f11057c;

    /* JADX INFO: renamed from: d */
    public static final int f11058d;

    /* JADX INFO: renamed from: k.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final float f11059a;

        /* JADX INFO: renamed from: b */
        public final float f11060b;

        public a(float f10, float f11) {
            this.f11059a = f10;
            this.f11060b = f11;
        }

        /* JADX INFO: renamed from: a */
        public final float m15312a() {
            return this.f11059a;
        }

        /* JADX INFO: renamed from: b */
        public final float m15313b() {
            return this.f11060b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f11059a, aVar.f11059a) == 0 && Float.compare(this.f11060b, aVar.f11060b) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f11059a) * 31) + Float.hashCode(this.f11060b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f11059a + ", velocityCoefficient=" + this.f11060b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        f11056b = fArr;
        float[] fArr2 = new float[101];
        f11057c = fArr2;
        AbstractC3889m0.m15438b(fArr, fArr2, 100);
        f11058d = 8;
    }

    /* JADX INFO: renamed from: a */
    public final double m15310a(float f10, float f11) {
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) f11));
    }

    /* JADX INFO: renamed from: b */
    public final a m15311b(float f10) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        float fM8585l = AbstractC2368o.m8585l(f10, 0.0f, 1.0f);
        float f13 = 100;
        int i10 = (int) (f13 * fM8585l);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f11056b;
            float f16 = fArr[i10];
            float f17 = (fArr[i11] - f16) / (f15 - f14);
            float f18 = ((fM8585l - f14) * f17) + f16;
            f11 = f17;
            f12 = f18;
        }
        return new a(f12, f11);
    }
}
