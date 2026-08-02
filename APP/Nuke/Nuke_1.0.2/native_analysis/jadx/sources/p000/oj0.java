package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oj0 {

    /* JADX INFO: renamed from: a */
    public final float f7692a;

    /* JADX INFO: renamed from: b */
    public final float f7693b;

    public oj0(float f, e70 e70Var) {
        this.f7692a = f;
        float fMo693b = e70Var.mo693b();
        float f2 = pj0.f8372a;
        this.f7693b = fMo693b * 386.0878f * 160.0f * 0.84f;
    }

    /* JADX INFO: renamed from: a */
    public final nj0 m3569a(float f) {
        double dM3570b = m3570b(f);
        double d = pj0.f8372a;
        double d2 = d - 1.0d;
        return new nj0(f, (float) (Math.exp((d / d2) * dM3570b) * ((double) (this.f7692a * this.f7693b))), (long) (Math.exp(dM3570b / d2) * 1000.0d));
    }

    /* JADX INFO: renamed from: b */
    public final double m3570b(float f) {
        float[] fArr = AbstractC0875x8.f12871a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f7692a * this.f7693b)));
    }
}
