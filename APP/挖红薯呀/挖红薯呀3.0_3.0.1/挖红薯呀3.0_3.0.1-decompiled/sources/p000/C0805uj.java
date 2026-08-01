package p000;

/* JADX INFO: renamed from: uj */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0805uj {

    /* JADX INFO: renamed from: a */
    public final int f6242a;

    /* JADX INFO: renamed from: b */
    public final long f6243b;

    /* JADX INFO: renamed from: c */
    public final EnumC0854vj f6244c;

    /* JADX INFO: renamed from: d */
    public final qb1 f6245d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0805uj(int i, long j, EnumC0854vj enumC0854vj, qb1 qb1Var) {
        this.f6242a = i;
        this.f6243b = j;
        this.f6244c = enumC0854vj;
        this.f6245d = qb1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0805uj)) {
            return false;
        }
        C0805uj c0805uj = (C0805uj) obj;
        return this.f6242a == c0805uj.f6242a && this.f6243b == c0805uj.f6243b && this.f6244c == c0805uj.f6244c && p30.m3002l(this.f6245d, c0805uj.f6245d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f6244c.hashCode() + AbstractC0748t1.m4146d(this.f6243b, Integer.hashCode(this.f6242a) * 31, 31)) * 31;
        qb1 qb1Var = this.f6245d;
        return iHashCode + (qb1Var == null ? 0 : qb1Var.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f6242a + ", timestamp=" + this.f6243b + ", type=" + this.f6244c + ", structureCompat=" + this.f6245d + ')';
    }
}
