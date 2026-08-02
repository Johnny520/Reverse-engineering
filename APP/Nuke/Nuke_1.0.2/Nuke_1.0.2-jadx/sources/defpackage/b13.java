package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b13 {
    public final lt2 a;
    public final lt2 b;
    public final lt2 c;
    public final lt2 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b13(lt2 lt2Var, lt2 lt2Var2, lt2 lt2Var3, lt2 lt2Var4) {
        this.a = lt2Var;
        this.b = lt2Var2;
        this.c = lt2Var3;
        this.d = lt2Var4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b13)) {
            return false;
        }
        b13 b13Var = (b13) obj;
        return t11.l(this.a, b13Var.a) && t11.l(this.b, b13Var.b) && t11.l(this.c, b13Var.c) && t11.l(this.d, b13Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        lt2 lt2Var = this.a;
        int iHashCode = (lt2Var != null ? lt2Var.hashCode() : 0) * 31;
        lt2 lt2Var2 = this.b;
        int iHashCode2 = (iHashCode + (lt2Var2 != null ? lt2Var2.hashCode() : 0)) * 31;
        lt2 lt2Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (lt2Var3 != null ? lt2Var3.hashCode() : 0)) * 31;
        lt2 lt2Var4 = this.d;
        return iHashCode3 + (lt2Var4 != null ? lt2Var4.hashCode() : 0);
    }
}
