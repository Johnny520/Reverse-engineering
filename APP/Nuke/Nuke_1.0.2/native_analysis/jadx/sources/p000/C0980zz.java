package p000;

/* JADX INFO: renamed from: zz */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0980zz {

    /* JADX INFO: renamed from: a */
    public final int f14152a;

    /* JADX INFO: renamed from: b */
    public final long f14153b;

    /* JADX INFO: renamed from: c */
    public final a00 f14154c;

    /* JADX INFO: renamed from: d */
    public final mb3 f14155d;

    public C0980zz(int i, long j, a00 a00Var, mb3 mb3Var) {
        this.f14152a = i;
        this.f14153b = j;
        this.f14154c = a00Var;
        this.f14155d = mb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0980zz)) {
            return false;
        }
        C0980zz c0980zz = (C0980zz) obj;
        return this.f14152a == c0980zz.f14152a && this.f14153b == c0980zz.f14153b && this.f14154c == c0980zz.f14154c && t11.m5086l(this.f14155d, c0980zz.f14155d);
    }

    public final int hashCode() {
        int iHashCode = (this.f14154c.hashCode() + hk1.m2204c(Integer.hashCode(this.f14152a) * 31, 31, this.f14153b)) * 31;
        mb3 mb3Var = this.f14155d;
        return iHashCode + (mb3Var == null ? 0 : mb3Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f14152a + ", timestamp=" + this.f14153b + ", type=" + this.f14154c + ", structureCompat=" + this.f14155d + ')';
    }
}
