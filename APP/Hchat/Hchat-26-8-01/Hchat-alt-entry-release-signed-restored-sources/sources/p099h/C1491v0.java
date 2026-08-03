package p099h;

import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: h.v0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1491v0 {

    /* JADX INFO: renamed from: a */
    public final float f4946a;

    /* JADX INFO: renamed from: b */
    public final float f4947b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1491v0(float f3, InterfaceC4233c interfaceC4233c) {
        this.f4946a = f3;
        float fMo1333d = interfaceC4233c.mo1333d();
        float f10 = AbstractC1493w0.f4952a;
        this.f4947b = fMo1333d * 386.0878f * 160.0f * 0.84f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1489u0 m4004a(float f3) {
        double dM4005b = m4005b(f3);
        double d10 = AbstractC1493w0.f4952a;
        double d11 = d10 - 1.0d;
        return new C1489u0(f3, (float) (Math.exp((d10 / d11) * dM4005b) * ((double) (this.f4946a * this.f4947b))), (long) (Math.exp(dM4005b / d11) * 1000.0d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final double m4005b(float f3) {
        float[] fArr = AbstractC1443b.f4788a;
        return Math.log(((double) (Math.abs(f3) * 0.35f)) / ((double) (this.f4946a * this.f4947b)));
    }
}
