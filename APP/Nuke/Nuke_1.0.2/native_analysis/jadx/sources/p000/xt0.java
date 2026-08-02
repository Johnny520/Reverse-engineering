package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xt0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0812vj f13167a;

    /* JADX INFO: renamed from: b */
    public final String f13168b;

    /* JADX INFO: renamed from: c */
    public final String f13169c;

    /* JADX INFO: renamed from: d */
    public final zt0 f13170d;

    /* JADX INFO: renamed from: e */
    public final String f13171e;

    /* JADX INFO: renamed from: f */
    public final yt0 f13172f;

    /* JADX INFO: renamed from: g */
    public final Throwable f13173g;

    public xt0(AbstractC0812vj abstractC0812vj, String str, String str2, zt0 zt0Var, String str3, yt0 yt0Var, Throwable th) {
        str.getClass();
        str3.getClass();
        this.f13167a = abstractC0812vj;
        this.f13168b = str;
        this.f13169c = str2;
        this.f13170d = zt0Var;
        this.f13171e = str3;
        this.f13172f = yt0Var;
        this.f13173g = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt0)) {
            return false;
        }
        xt0 xt0Var = (xt0) obj;
        return this.f13167a.equals(xt0Var.f13167a) && t11.m5086l(this.f13168b, xt0Var.f13168b) && t11.m5086l(this.f13169c, xt0Var.f13169c) && this.f13170d == xt0Var.f13170d && t11.m5086l(this.f13171e, xt0Var.f13171e) && t11.m5086l(this.f13172f, xt0Var.f13172f) && t11.m5086l(this.f13173g, xt0Var.f13173g);
    }

    public final int hashCode() {
        int iM2207f = hk1.m2207f(this.f13168b, this.f13167a.hashCode() * 31, 31);
        String str = this.f13169c;
        int iM2207f2 = hk1.m2207f(this.f13171e, (this.f13170d.hashCode() + ((iM2207f + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
        yt0 yt0Var = this.f13172f;
        int iHashCode = (iM2207f2 + (yt0Var == null ? 0 : yt0Var.hashCode())) * 31;
        Throwable th = this.f13173g;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "HookerDebugItem(hooker=" + this.f13167a + ", displayName=" + this.f13168b + ", description=" + this.f13169c + ", status=" + this.f13170d + ", reason=" + this.f13171e + ", record=" + this.f13172f + ", inMemoryThrowable=" + this.f13173g + ")";
    }
}
