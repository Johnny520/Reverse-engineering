package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: jm */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0360jm implements aj0 {

    /* JADX INFO: renamed from: d */
    public final C0399km f2912d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0360jm(C0399km c0399km) {
        this.f2912d = c0399km;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.aj0
    /* JADX INFO: renamed from: A */
    public final long mo176A(int i, long j, long j2) {
        if (i != 2 || Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.aj0
    /* JADX INFO: renamed from: R */
    public final Object mo178R(long j, long j2, InterfaceC0322ik interfaceC0322ik) {
        return new rb1(rb1.m3435a(j2, 0.0f, 0.0f, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.aj0
    /* JADX INFO: renamed from: b0 */
    public final long mo179b0(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        C0399km c0399km = this.f2912d;
        if (Math.abs(c0399km.m2037l()) <= 1.0E-6d) {
            return 0L;
        }
        int i2 = (int) (j >> 32);
        if (Math.abs(Float.intBitsToFloat(i2)) <= 0.0f) {
            return 0L;
        }
        float fM2037l = c0399km.m2037l() * c0399km.m2039o();
        float f = ((c0399km.m2038m().f7938b + c0399km.m2038m().f7939c) * (-Math.signum(c0399km.m2037l()))) + fM2037l;
        if (c0399km.m2037l() > 0.0f) {
            f = fM2037l;
            fM2037l = f;
        }
        return (((long) Float.floatToRawIntBits(-c0399km.f3550k.mo504e(-w60.m4906m(Float.intBitsToFloat(i2), fM2037l, f)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
    }
}
