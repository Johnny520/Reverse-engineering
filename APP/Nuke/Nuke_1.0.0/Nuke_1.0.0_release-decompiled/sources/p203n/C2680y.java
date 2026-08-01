package p203n;

/* JADX INFO: renamed from: n.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2680y implements InterfaceC2678w {

    /* JADX INFO: renamed from: a */
    public final int f8546a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2675t f8547b;

    /* JADX INFO: renamed from: c */
    public final long f8548c;

    /* JADX INFO: renamed from: d */
    public final long f8549d;

    public C2680y(int i5, int i6, InterfaceC2675t interfaceC2675t) {
        this.f8546a = i5;
        this.f8547b = interfaceC2675t;
        this.f8548c = ((long) i5) * 1000000;
        this.f8549d = ((long) i6) * 1000000;
    }

    @Override // p203n.InterfaceC2678w
    /* JADX INFO: renamed from: b */
    public final float mo4635b(long j5, float f2, float f5, float f6) {
        long j6 = j5 - this.f8549d;
        if (j6 < 0) {
            j6 = 0;
        }
        long j7 = this.f8548c;
        if (j6 > j7) {
            j6 = j7;
        }
        float fMo600a = this.f8547b.mo600a(this.f8546a == 0 ? 1.0f : j6 / j7);
        return (f5 * fMo600a) + ((1 - fMo600a) * f2);
    }

    @Override // p203n.InterfaceC2678w
    /* JADX INFO: renamed from: c */
    public final float mo4636c(long j5, float f2, float f5, float f6) {
        long j6 = j5 - this.f8549d;
        if (j6 < 0) {
            j6 = 0;
        }
        long j7 = this.f8548c;
        long j8 = j6 > j7 ? j7 : j6;
        if (j8 == 0) {
            return f6;
        }
        return (mo4635b(j8, f2, f5, f6) - mo4635b(j8 - 1000000, f2, f5, f6)) * 1000.0f;
    }

    @Override // p203n.InterfaceC2678w
    /* JADX INFO: renamed from: d */
    public final long mo4637d(float f2, float f5, float f6) {
        return this.f8549d + this.f8548c;
    }
}
