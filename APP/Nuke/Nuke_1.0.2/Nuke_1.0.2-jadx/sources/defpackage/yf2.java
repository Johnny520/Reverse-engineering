package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yf2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yf2(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf2)) {
            return false;
        }
        yf2 yf2Var = (yf2) obj;
        return this.a.equals(yf2Var.a) && this.b.equals(yf2Var.b) && this.c.equals(yf2Var.c) && this.d.equals(yf2Var.d) && t11.l(this.e, yf2Var.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = hk1.f(this.d, hk1.f(this.c, hk1.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
        String str = this.e;
        return iF + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("ScriptConversationRef(platform=", this.a, ", accountId=", this.b, ", id=");
        hk1.o(sbO, this.c, ", type=", this.d, ", name=");
        return hk1.j(sbO, this.e, ")");
    }
}
