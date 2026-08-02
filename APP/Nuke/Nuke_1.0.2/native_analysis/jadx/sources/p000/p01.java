package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p01 implements q01 {

    /* JADX INFO: renamed from: h */
    public final long f7905h;

    /* JADX INFO: renamed from: i */
    public final int f7906i;

    public p01(long j, int i) {
        this.f7905h = j;
        this.f7906i = i;
    }

    @Override // p000.q01
    public final n01 toInstant() {
        n01 n01Var = n01.f6949j;
        n01 n01Var2 = n01.f6949j;
        long j = n01Var2.f6951h;
        long j2 = this.f7905h;
        if (j2 >= j) {
            n01 n01Var3 = n01.f6950k;
            if (j2 <= n01Var3.f6951h) {
                long j3 = this.f7906i;
                long j4 = j3 / 1000000000;
                if ((j3 ^ 1000000000) < 0 && j4 * 1000000000 != j3) {
                    j4--;
                }
                long j5 = j2 + j4;
                if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
                    return j2 > 0 ? n01Var3 : n01Var2;
                }
                if (j5 >= -31557014167219200L) {
                    if (j5 <= 31556889864403199L) {
                        long j6 = j3 % 1000000000;
                        return new n01(j5, (int) (j6 + ((((j6 ^ 1000000000) & ((-j6) | j6)) >> 63) & 1000000000)));
                    }
                }
            }
        }
        throw new o01("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
