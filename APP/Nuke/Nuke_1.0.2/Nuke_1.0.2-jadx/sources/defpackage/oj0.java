package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oj0 {
    public final float a;
    public final float b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public oj0(float f, e70 e70Var) {
        this.a = f;
        float fB = e70Var.b();
        float f2 = pj0.a;
        this.b = fB * 386.0878f * 160.0f * 0.84f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final nj0 a(float f) {
        double dB = b(f);
        double d = pj0.a;
        double d2 = d - 1.0d;
        return new nj0(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.b))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final double b(float f) {
        float[] fArr = x8.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.b)));
    }
}
