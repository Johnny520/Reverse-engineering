package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xt0 {
    public final vj a;
    public final String b;
    public final String c;
    public final zt0 d;
    public final String e;
    public final yt0 f;
    public final Throwable g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xt0(vj vjVar, String str, String str2, zt0 zt0Var, String str3, yt0 yt0Var, Throwable th) {
        str.getClass();
        str3.getClass();
        this.a = vjVar;
        this.b = str;
        this.c = str2;
        this.d = zt0Var;
        this.e = str3;
        this.f = yt0Var;
        this.g = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt0)) {
            return false;
        }
        xt0 xt0Var = (xt0) obj;
        return this.a.equals(xt0Var.a) && t11.l(this.b, xt0Var.b) && t11.l(this.c, xt0Var.c) && this.d == xt0Var.d && t11.l(this.e, xt0Var.e) && t11.l(this.f, xt0Var.f) && t11.l(this.g, xt0Var.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = hk1.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iF2 = hk1.f(this.e, (this.d.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
        yt0 yt0Var = this.f;
        int iHashCode = (iF2 + (yt0Var == null ? 0 : yt0Var.hashCode())) * 31;
        Throwable th = this.g;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HookerDebugItem(hooker=" + this.a + ", displayName=" + this.b + ", description=" + this.c + ", status=" + this.d + ", reason=" + this.e + ", record=" + this.f + ", inMemoryThrowable=" + this.g + ")";
    }
}
