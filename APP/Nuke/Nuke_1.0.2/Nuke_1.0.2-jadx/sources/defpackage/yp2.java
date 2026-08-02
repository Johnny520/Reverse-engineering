package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yp2 {
    public final int a;
    public final sx0 b;
    public final String c;
    public final String d;
    public final boolean e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yp2(int i, sx0 sx0Var, String str, String str2, boolean z) {
        this.a = i;
        this.b = sx0Var;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp2)) {
            return false;
        }
        yp2 yp2Var = (yp2) obj;
        return this.a == yp2Var.a && t11.l(this.b, yp2Var.b) && t11.l(this.c, yp2Var.c) && t11.l(this.d, yp2Var.d) && this.e == yp2Var.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsPreference(titleRes=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", route=");
        hk1.o(sb, this.c, ", badge=", this.d, ", badgeWarning=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
