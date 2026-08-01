package p000;

/* JADX INFO: renamed from: gu */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0259gu implements InterfaceC0185eu {

    /* JADX INFO: renamed from: a */
    public final int f2049a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0065br f2050b;

    /* JADX INFO: renamed from: c */
    public final long f2051c;

    /* JADX INFO: renamed from: d */
    public final long f2052d = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0259gu(int i, InterfaceC0065br interfaceC0065br) {
        this.f2049a = i;
        this.f2050b = interfaceC0065br;
        this.f2051c = ((long) i) * 1000000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0185eu
    /* JADX INFO: renamed from: b */
    public final float mo970b(long j, float f, float f2, float f3) {
        long j2 = j - this.f2052d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f2051c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fMo361b = this.f2050b.mo361b(this.f2049a == 0 ? 1.0f : j2 / j3);
        return (f2 * fMo361b) + ((1.0f - fMo361b) * f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0185eu
    /* JADX INFO: renamed from: c */
    public final float mo971c(long j, float f, float f2, float f3) {
        long j2 = j - this.f2052d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f2051c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (mo970b(j4, f, f2, f3) - mo970b(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0185eu
    /* JADX INFO: renamed from: d */
    public final long mo972d(float f, float f2, float f3) {
        return this.f2052d + this.f2051c;
    }
}
