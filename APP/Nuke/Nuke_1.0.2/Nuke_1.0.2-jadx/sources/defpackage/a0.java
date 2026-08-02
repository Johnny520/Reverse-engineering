package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a0(int i, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return t11.l(this.a, a0Var.a) && t11.l(this.b, a0Var.b) && t11.l(this.c, a0Var.c) && t11.l(this.d, a0Var.d) && this.e == a0Var.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.e) + hk1.f(this.d, hk1.f(this.c, hk1.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("ConversationSignature(baseUrl=", this.a, ", apiKey=", this.b, ", model=");
        hk1.o(sbO, this.c, ", systemPrompt=", this.d, ", contextRounds=");
        sbO.append(this.e);
        sbO.append(")");
        return sbO.toString();
    }
}
