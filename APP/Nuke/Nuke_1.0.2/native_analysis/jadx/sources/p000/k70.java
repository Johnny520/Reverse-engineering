package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k70 {

    /* JADX INFO: renamed from: a */
    public final long f5363a;

    /* JADX INFO: renamed from: b */
    public final long f5364b;

    public k70(long j, long j2) {
        this.f5363a = j;
        this.f5364b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k70) {
            k70 k70Var = (k70) obj;
            return h11.m2041a(this.f5363a, k70Var.f5363a) && this.f5364b == k70Var.f5364b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5364b) + (Long.hashCode(this.f5363a) * 31);
    }
}
