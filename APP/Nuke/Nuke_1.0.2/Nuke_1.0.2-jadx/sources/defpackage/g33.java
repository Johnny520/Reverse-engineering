package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g33 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g33(String str, String str2, String str3, boolean z) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g33)) {
            return false;
        }
        g33 g33Var = (g33) obj;
        return this.a.equals(g33Var.a) && t11.l(this.b, g33Var.b) && this.c.equals(g33Var.c) && this.d == g33Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.d) + hk1.f(this.c, hk1.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("TransferContact(wxId=", this.a, ", displayName=", this.b, ", avatarUrl=");
        sbO.append(this.c);
        sbO.append(", isGroup=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
