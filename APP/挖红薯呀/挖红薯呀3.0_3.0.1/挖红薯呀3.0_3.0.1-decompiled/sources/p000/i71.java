package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class i71 {

    /* JADX INFO: renamed from: a */
    public final j31 f2472a;

    /* JADX INFO: renamed from: b */
    public final j31 f2473b;

    /* JADX INFO: renamed from: c */
    public final j31 f2474c;

    /* JADX INFO: renamed from: d */
    public final j31 f2475d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i71(j31 j31Var, j31 j31Var2, j31 j31Var3, j31 j31Var4) {
        this.f2472a = j31Var;
        this.f2473b = j31Var2;
        this.f2474c = j31Var3;
        this.f2475d = j31Var4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i71)) {
            return false;
        }
        i71 i71Var = (i71) obj;
        return p30.m3002l(this.f2472a, i71Var.f2472a) && p30.m3002l(this.f2473b, i71Var.f2473b) && p30.m3002l(this.f2474c, i71Var.f2474c) && p30.m3002l(this.f2475d, i71Var.f2475d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        j31 j31Var = this.f2472a;
        int iHashCode = (j31Var != null ? j31Var.hashCode() : 0) * 31;
        j31 j31Var2 = this.f2473b;
        int iHashCode2 = (iHashCode + (j31Var2 != null ? j31Var2.hashCode() : 0)) * 31;
        j31 j31Var3 = this.f2474c;
        int iHashCode3 = (iHashCode2 + (j31Var3 != null ? j31Var3.hashCode() : 0)) * 31;
        j31 j31Var4 = this.f2475d;
        return iHashCode3 + (j31Var4 != null ? j31Var4.hashCode() : 0);
    }
}
