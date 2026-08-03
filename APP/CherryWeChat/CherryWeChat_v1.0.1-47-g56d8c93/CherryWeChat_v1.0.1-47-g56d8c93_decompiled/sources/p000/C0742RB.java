package p000;

/* JADX INFO: renamed from: RB */
/* JADX INFO: loaded from: classes.dex */
public final class C0742RB {

    /* JADX INFO: renamed from: d */
    public static C0742RB f2370d;

    /* JADX INFO: renamed from: a */
    public long f2371a;

    /* JADX INFO: renamed from: b */
    public long f2372b;

    /* JADX INFO: renamed from: c */
    public int f2373c;

    /* JADX INFO: renamed from: a */
    public final void m1536a(double d, double d2, long j) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-d2) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d4 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d4))) / (Math.cos(dAsin) * Math.cos(d4));
        if (dSin3 >= 1.0d) {
            this.f2373c = 1;
            this.f2371a = -1L;
            this.f2372b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f2373c = 0;
                this.f2371a = -1L;
                this.f2372b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f2371a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f2372b = jRound;
            if (jRound >= j || this.f2371a <= j) {
                this.f2373c = 1;
            } else {
                this.f2373c = 0;
            }
        }
    }
}
