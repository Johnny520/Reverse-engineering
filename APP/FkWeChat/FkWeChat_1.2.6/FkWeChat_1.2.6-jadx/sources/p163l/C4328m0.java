package p163l;

/* JADX INFO: renamed from: l.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4328m0 implements InterfaceC4308i0 {

    /* JADX INFO: renamed from: a */
    public final int f12661a;

    /* JADX INFO: renamed from: b */
    public final int f12662b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4288e0 f12663c;

    /* JADX INFO: renamed from: d */
    public final long f12664d;

    /* JADX INFO: renamed from: e */
    public final long f12665e;

    public C4328m0(int i10, int i11, InterfaceC4288e0 interfaceC4288e0) {
        this.f12661a = i10;
        this.f12662b = i11;
        this.f12663c = interfaceC4288e0;
        this.f12664d = ((long) i10) * 1000000;
        this.f12665e = ((long) i11) * 1000000;
    }

    @Override // p163l.InterfaceC4308i0
    /* JADX INFO: renamed from: b */
    public float mo16935b(long j10, float f10, float f11, float f12) {
        long j11 = j10 - this.f12665e;
        long j12 = this.f12664d;
        if (j11 < 0) {
            j11 = 0;
        }
        long j13 = j11 > j12 ? j12 : j11;
        if (j13 == 0) {
            return f12;
        }
        return (mo16938e(j13, f10, f11, f12) - mo16938e(j13 - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // p163l.InterfaceC4308i0
    /* JADX INFO: renamed from: c */
    public long mo16936c(float f10, float f11, float f12) {
        return this.f12665e + this.f12664d;
    }

    @Override // p163l.InterfaceC4308i0
    /* JADX INFO: renamed from: e */
    public float mo16938e(long j10, float f10, float f11, float f12) {
        long j11 = j10 - this.f12665e;
        long j12 = this.f12664d;
        if (j11 < 0) {
            j11 = 0;
        }
        if (j11 > j12) {
            j11 = j12;
        }
        float fMo16839a = this.f12663c.mo16839a(this.f12661a == 0 ? 1.0f : j11 / j12);
        return (f10 * (1 - fMo16839a)) + (f11 * fMo16839a);
    }
}
