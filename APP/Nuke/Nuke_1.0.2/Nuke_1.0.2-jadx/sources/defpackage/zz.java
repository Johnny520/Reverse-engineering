package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zz {
    public final int a;
    public final long b;
    public final a00 c;
    public final mb3 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zz(int i, long j, a00 a00Var, mb3 mb3Var) {
        this.a = i;
        this.b = j;
        this.c = a00Var;
        this.d = mb3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz)) {
            return false;
        }
        zz zzVar = (zz) obj;
        return this.a == zzVar.a && this.b == zzVar.b && this.c == zzVar.c && t11.l(this.d, zzVar.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + hk1.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        mb3 mb3Var = this.d;
        return iHashCode + (mb3Var == null ? 0 : mb3Var.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
