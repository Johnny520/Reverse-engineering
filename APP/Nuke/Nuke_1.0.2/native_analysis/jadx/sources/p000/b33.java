package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b33 {

    /* JADX INFO: renamed from: a */
    public final long f548a;

    /* JADX INFO: renamed from: b */
    public final long f549b;

    /* JADX INFO: renamed from: c */
    public final boolean f550c;

    public b33(long j, long j2, boolean z) {
        this.f548a = j;
        this.f549b = j2;
        this.f550c = z;
    }

    /* JADX INFO: renamed from: a */
    public final b33 m364a(b33 b33Var) {
        return new b33(rs1.m4612e(this.f548a, b33Var.f548a), Math.max(this.f549b, b33Var.f549b), this.f550c || b33Var.f550c);
    }
}
