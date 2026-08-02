package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oi1 {

    /* JADX INFO: renamed from: a */
    public final long f7686a;

    /* JADX INFO: renamed from: b */
    public final long f7687b;

    /* JADX INFO: renamed from: c */
    public final boolean f7688c;

    public oi1(long j, long j2, boolean z) {
        this.f7686a = j;
        this.f7687b = j2;
        this.f7688c = z;
    }

    /* JADX INFO: renamed from: a */
    public final oi1 m3563a(oi1 oi1Var) {
        return new oi1(rs1.m4612e(this.f7686a, oi1Var.f7686a), Math.max(this.f7687b, oi1Var.f7687b), this.f7688c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi1)) {
            return false;
        }
        oi1 oi1Var = (oi1) obj;
        return rs1.m4609b(this.f7686a, oi1Var.f7686a) && this.f7687b == oi1Var.f7687b && this.f7688c == oi1Var.f7688c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7688c) + hk1.m2204c(Long.hashCode(this.f7686a) * 31, 31, this.f7687b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) rs1.m4614g(this.f7686a)) + ", timeMillis=" + this.f7687b + ", shouldApplyImmediately=" + this.f7688c + ')';
    }
}
