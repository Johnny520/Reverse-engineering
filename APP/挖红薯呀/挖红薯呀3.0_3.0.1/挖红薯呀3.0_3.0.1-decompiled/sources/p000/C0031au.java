package p000;

/* JADX INFO: renamed from: au */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0031au {

    /* JADX INFO: renamed from: a */
    public final float f265a;

    /* JADX INFO: renamed from: b */
    public final float f266b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0031au(float f, InterfaceC0968ym interfaceC0968ym) {
        this.f265a = f;
        float fMo48b = interfaceC0968ym.mo48b();
        float f2 = AbstractC0068bu.f588a;
        this.f266b = fMo48b * 386.0878f * 160.0f * 0.84f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1016zt m209a(float f) {
        double dM210b = m210b(f);
        double d = AbstractC0068bu.f588a;
        double d2 = d - 1.0d;
        return new C1016zt(f, (float) (Math.exp((d / d2) * dM210b) * ((double) (this.f265a * this.f266b))), (long) (Math.exp(dM210b / d2) * 1000.0d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final double m210b(float f) {
        float[] fArr = AbstractC0538o5.f4463a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f265a * this.f266b)));
    }
}
