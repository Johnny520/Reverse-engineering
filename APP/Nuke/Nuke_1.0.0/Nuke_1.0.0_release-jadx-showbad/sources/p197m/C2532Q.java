package p197m;

import p153e1.InterfaceC2007c;

/* JADX INFO: renamed from: m.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C2532Q {

    /* JADX INFO: renamed from: a */
    public final float f8097a;

    /* JADX INFO: renamed from: b */
    public final float f8098b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2532Q(float f2, InterfaceC2007c interfaceC2007c) {
        this.f8097a = f2;
        float fMo272b = interfaceC2007c.mo272b();
        float f5 = AbstractC2533S.f8099a;
        this.f8098b = fMo272b * 386.0878f * 160.0f * 0.84f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2531P m4470a(float f2) {
        double dM4471b = m4471b(f2);
        double d5 = AbstractC2533S.f8099a;
        double d6 = d5 - 1.0d;
        return new C2531P(f2, (float) (Math.exp((d5 / d6) * dM4471b) * ((double) (this.f8097a * this.f8098b))), (long) (Math.exp(dM4471b / d6) * 1000.0d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final double m4471b(float f2) {
        float[] fArr = AbstractC2542b.f8114a;
        return Math.log(((double) (Math.abs(f2) * 0.35f)) / ((double) (this.f8097a * this.f8098b)));
    }
}
