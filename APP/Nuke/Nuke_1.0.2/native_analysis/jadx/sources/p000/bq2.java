package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bq2 {

    /* JADX INFO: renamed from: d */
    public static final bq2 f985d = new bq2(sp0.m4932c(4278190080L), 0, 0.0f);

    /* JADX INFO: renamed from: a */
    public final long f986a;

    /* JADX INFO: renamed from: b */
    public final long f987b;

    /* JADX INFO: renamed from: c */
    public final float f988c;

    public bq2(long j, long j2, float f) {
        this.f986a = j;
        this.f987b = j2;
        this.f988c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq2)) {
            return false;
        }
        bq2 bq2Var = (bq2) obj;
        return C0363ju.m2566c(this.f986a, bq2Var.f986a) && rs1.m4609b(this.f987b, bq2Var.f987b) && this.f988c == bq2Var.f988c;
    }

    public final int hashCode() {
        int i = C0363ju.f5218h;
        return Float.hashCode(this.f988c) + hk1.m2204c(Long.hashCode(this.f986a) * 31, 31, this.f987b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        hk1.m2213l(this.f986a, sb, ", offset=");
        sb.append((Object) rs1.m4614g(this.f987b));
        sb.append(", blurRadius=");
        return vi0.m5693l(sb, this.f988c, ')');
    }
}
