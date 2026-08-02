package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jo2 {
    public final po2 a;
    public final io2 b;
    public final String c;
    public final String d;
    public final String e;
    public final Throwable f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jo2(po2 po2Var, io2 io2Var, String str, String str2, String str3, Throwable th) {
        this.a = po2Var;
        this.b = io2Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo2)) {
            return false;
        }
        jo2 jo2Var = (jo2) obj;
        return this.a == jo2Var.a && this.b == jo2Var.b && this.c.equals(jo2Var.c) && t11.l(this.d, jo2Var.d) && t11.l(this.e, jo2Var.e) && t11.l(this.f, jo2Var.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = hk1.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Throwable th = this.f;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SendMsgError(kind=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", message=");
        hk1.o(sb, this.c, ", talker=", this.d, ", path=");
        sb.append(this.e);
        sb.append(", cause=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
