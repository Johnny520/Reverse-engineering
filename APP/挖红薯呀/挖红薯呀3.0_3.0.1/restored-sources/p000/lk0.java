package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class lk0 {

    /* JADX INFO: renamed from: a */
    public final int f3511a;

    /* JADX INFO: renamed from: b */
    public final Integer f3512b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lk0(int i, Integer num) {
        this.f3511a = i;
        this.f3512b = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk0)) {
            return false;
        }
        lk0 lk0Var = (lk0) obj;
        return this.f3511a == lk0Var.f3511a && p30.m3002l(this.f3512b, lk0Var.f3512b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f3511a) * 31;
        Integer num = this.f3512b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ObjectLocation(group=" + this.f3511a + ", dataOffset=" + this.f3512b + ')';
    }
}
