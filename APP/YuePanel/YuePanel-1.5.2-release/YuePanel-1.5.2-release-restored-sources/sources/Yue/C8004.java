package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8004 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C8004 f23796 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f23797 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f23798 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final float f23799 = 0.017453292f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final float f23800 = 9.0E-4f;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final float f23801 = -0.10471976f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final float f23802 = 0.0334196f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final float f23803 = 3.49066E-4f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final float f23804 = 5.236E-6f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final float f23805 = 0.4092797f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final long f23806 = 946728000000L;

    /* JADX INFO: renamed from: ۥ */
    public long f3185;

    /* JADX INFO: renamed from: ۥ۟ */
    public long f3186;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f23807;

    /* JADX INFO: renamed from: ۥ۟ */
    public static C8004 m4016() {
        if (f23796 == null) {
            f23796 = new C8004();
        }
        return f23796;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4017(long j, double d, double d2) {
        double d3 = (0.01720197f * ((j - f23806) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d3) * 0.03341960161924362d) + d3 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = ((double) (Math.round(((double) (r3 - 9.0E-4f)) - r7) + 9.0E-4f)) + ((-d2) / 360.0d) + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d4 = 0.01745329238474369d * d;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d4) * Math.sin(dAsin))) / (Math.cos(d4) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f23807 = 1;
            this.f3185 = -1L;
            this.f3186 = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f23807 = 0;
                this.f3185 = -1L;
                this.f3186 = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f3185 = Math.round((dRound + dAcos) * 8.64E7d) + f23806;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + f23806;
            this.f3186 = jRound;
            if (jRound >= j || this.f3185 <= j) {
                this.f23807 = 1;
            } else {
                this.f23807 = 0;
            }
        }
    }
}
