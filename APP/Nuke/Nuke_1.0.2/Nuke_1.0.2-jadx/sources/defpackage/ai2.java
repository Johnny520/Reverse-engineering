package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ai2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final d41 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ai2(String str, String str2, String str3, String str4, Long l, d41 d41Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
        this.f = d41Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai2)) {
            return false;
        }
        ai2 ai2Var = (ai2) obj;
        return this.a.equals(ai2Var.a) && this.b.equals(ai2Var.b) && this.c.equals(ai2Var.c) && this.d.equals(ai2Var.d) && t11.l(this.e, ai2Var.e) && this.f.equals(ai2Var.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = hk1.f(this.d, hk1.f(this.c, hk1.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
        Long l = this.e;
        return this.f.h.hashCode() + ((iF + (l == null ? 0 : l.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("ScriptMediaRef(platform=", this.a, ", accountId=", this.b, ", id=");
        hk1.o(sbO, this.c, ", kind=", this.d, ", expiresAt=");
        sbO.append(this.e);
        sbO.append(", metadata=");
        sbO.append(this.f);
        sbO.append(")");
        return sbO.toString();
    }
}
