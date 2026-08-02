package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xj0 implements sj0 {

    /* JADX INFO: renamed from: a */
    public final int f13049a;

    /* JADX INFO: renamed from: b */
    public final gd0 f13050b;

    /* JADX INFO: renamed from: c */
    public final long f13051c;

    /* JADX INFO: renamed from: d */
    public final long f13052d = 0;

    public xj0(int i, gd0 gd0Var) {
        this.f13049a = i;
        this.f13050b = gd0Var;
        this.f13051c = ((long) i) * 1000000;
    }

    @Override // p000.sj0
    /* JADX INFO: renamed from: b */
    public final float mo4877b(long j, float f, float f2, float f3) {
        long j2 = j - this.f13052d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f13051c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fMo684b = this.f13050b.mo684b(this.f13049a == 0 ? 1.0f : j2 / j3);
        return (f2 * fMo684b) + ((1.0f - fMo684b) * f);
    }

    @Override // p000.sj0
    /* JADX INFO: renamed from: c */
    public final float mo4878c(long j, float f, float f2, float f3) {
        long j2 = j - this.f13052d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f13051c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (mo4877b(j4, f, f2, f3) - mo4877b(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // p000.sj0
    /* JADX INFO: renamed from: d */
    public final long mo4879d(float f, float f2, float f3) {
        return this.f13052d + this.f13051c;
    }
}
