package p116i;

/* JADX INFO: renamed from: i.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1737b0 implements InterfaceC1805z {

    /* JADX INFO: renamed from: a */
    public final int f5776a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1796v f5777b;

    /* JADX INFO: renamed from: c */
    public final long f5778c;

    /* JADX INFO: renamed from: d */
    public final long f5779d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1737b0(int i9, int i10, InterfaceC1796v interfaceC1796v) {
        this.f5776a = i9;
        this.f5777b = interfaceC1796v;
        this.f5778c = ((long) i9) * 1000000;
        this.f5779d = ((long) i10) * 1000000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1805z
    /* JADX INFO: renamed from: b */
    public final long mo4353b(float f3, float f10, float f11) {
        return this.f5779d + this.f5778c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1805z
    /* JADX INFO: renamed from: c */
    public final float mo4354c(float f3, float f10, float f11, long j3) {
        long j4 = j3 - this.f5779d;
        if (j4 < 0) {
            j4 = 0;
        }
        long j5 = this.f5778c;
        long j10 = j4 > j5 ? j5 : j4;
        if (j10 == 0) {
            return f11;
        }
        return (mo4356e(f3, f10, f11, j10) - mo4356e(f3, f10, f11, j10 - 1000000)) * 1000.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1805z
    /* JADX INFO: renamed from: e */
    public final float mo4356e(float f3, float f10, float f11, long j3) {
        long j4 = j3 - this.f5779d;
        if (j4 < 0) {
            j4 = 0;
        }
        long j5 = this.f5778c;
        if (j4 > j5) {
            j4 = j5;
        }
        float fMo3416b = this.f5777b.mo3416b(this.f5776a == 0 ? 1.0f : j4 / j5);
        return (f10 * fMo3416b) + ((1 - fMo3416b) * f3);
    }
}
