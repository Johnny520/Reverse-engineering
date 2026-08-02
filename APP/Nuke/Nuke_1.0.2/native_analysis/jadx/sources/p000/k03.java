package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k03 {

    /* JADX INFO: renamed from: a */
    public final C0690sd f5296a;

    /* JADX INFO: renamed from: b */
    public final long f5297b;

    /* JADX INFO: renamed from: c */
    public final f13 f5298c;

    public k03(C0690sd c0690sd, long j, f13 f13Var) {
        this.f5296a = c0690sd;
        this.f5297b = fg1.m1643r(j, c0690sd.f10051i.length());
        this.f5298c = f13Var != null ? new f13(fg1.m1643r(f13Var.f2739a, c0690sd.f10051i.length())) : null;
    }

    /* JADX INFO: renamed from: a */
    public static k03 m2598a(k03 k03Var, C0690sd c0690sd, long j, int i) {
        if ((i & 1) != 0) {
            c0690sd = k03Var.f5296a;
        }
        if ((i & 2) != 0) {
            j = k03Var.f5297b;
        }
        f13 f13Var = (i & 4) != 0 ? k03Var.f5298c : null;
        k03Var.getClass();
        return new k03(c0690sd, j, f13Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k03)) {
            return false;
        }
        k03 k03Var = (k03) obj;
        return f13.m1493b(this.f5297b, k03Var.f5297b) && t11.m5086l(this.f5298c, k03Var.f5298c) && t11.m5086l(this.f5296a, k03Var.f5296a);
    }

    public final int hashCode() {
        int iHashCode = this.f5296a.hashCode() * 31;
        int i = f13.f2738c;
        int iM2204c = hk1.m2204c(iHashCode, 31, this.f5297b);
        f13 f13Var = this.f5298c;
        return iM2204c + (f13Var != null ? Long.hashCode(f13Var.f2739a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f5296a) + "', selection=" + ((Object) f13.m1499h(this.f5297b)) + ", composition=" + this.f5298c + ')';
    }

    public k03(String str, long j, int i) {
        this(new C0690sd((i & 1) != 0 ? "" : str), (i & 2) != 0 ? f13.f2737b : j, (f13) null);
    }
}
