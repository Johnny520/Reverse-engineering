package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class by0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public by0(String str, String str2, String str3, String str4, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by0)) {
            return false;
        }
        by0 by0Var = (by0) obj;
        return this.a.equals(by0Var.a) && this.b.equals(by0Var.b) && t11.l(this.c, by0Var.c) && this.d.equals(by0Var.d) && this.e == by0Var.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = hk1.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return Long.hashCode(this.e) + hk1.f(this.d, (iF + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("IncomingTextMessage(talker=", this.a, ", content=", this.b, ", groupSender=");
        hk1.o(sbO, this.c, ", messageKey=", this.d, ", createTime=");
        sbO.append(this.e);
        sbO.append(")");
        return sbO.toString();
    }
}
