package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jc3 {
    public final String a;
    public final String b;
    public final String c;
    public final sc3 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jc3(String str, String str2, String str3, sc3 sc3Var) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = sc3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc3)) {
            return false;
        }
        jc3 jc3Var = (jc3) obj;
        return this.a.equals(jc3Var.a) && t11.l(this.b, jc3Var.b) && this.c.equals(jc3Var.c) && this.d == jc3Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.d.hashCode() + hk1.f(this.c, hk1.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("WeChatContact(wxId=", this.a, ", displayName=", this.b, ", avatarUrl=");
        sbO.append(this.c);
        sbO.append(", type=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
