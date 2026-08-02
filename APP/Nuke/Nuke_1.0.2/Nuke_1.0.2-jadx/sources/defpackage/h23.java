package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h23 {
    public final zj1 a;
    public g23 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h23() {
        zj1 zj1Var = y01.a;
        this.a = new zj1();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(g23 g23Var, long j, long j2, float[] fArr, long j3) {
        long j4 = g23Var.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            g23Var.g = j3;
            g23Var.a(g23Var.e, g23Var.f, j, j2, fArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (z01.a(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!z01.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
