package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jo2 {

    /* JADX INFO: renamed from: a */
    public final po2 f5130a;

    /* JADX INFO: renamed from: b */
    public final io2 f5131b;

    /* JADX INFO: renamed from: c */
    public final String f5132c;

    /* JADX INFO: renamed from: d */
    public final String f5133d;

    /* JADX INFO: renamed from: e */
    public final String f5134e;

    /* JADX INFO: renamed from: f */
    public final Throwable f5135f;

    public jo2(po2 po2Var, io2 io2Var, String str, String str2, String str3, Throwable th) {
        this.f5130a = po2Var;
        this.f5131b = io2Var;
        this.f5132c = str;
        this.f5133d = str2;
        this.f5134e = str3;
        this.f5135f = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo2)) {
            return false;
        }
        jo2 jo2Var = (jo2) obj;
        return this.f5130a == jo2Var.f5130a && this.f5131b == jo2Var.f5131b && this.f5132c.equals(jo2Var.f5132c) && t11.m5086l(this.f5133d, jo2Var.f5133d) && t11.m5086l(this.f5134e, jo2Var.f5134e) && t11.m5086l(this.f5135f, jo2Var.f5135f);
    }

    public final int hashCode() {
        int iM2207f = hk1.m2207f(this.f5132c, (this.f5131b.hashCode() + (this.f5130a.hashCode() * 31)) * 31, 31);
        String str = this.f5133d;
        int iHashCode = (iM2207f + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5134e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Throwable th = this.f5135f;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendMsgError(kind=");
        sb.append(this.f5130a);
        sb.append(", code=");
        sb.append(this.f5131b);
        sb.append(", message=");
        hk1.m2216o(sb, this.f5132c, ", talker=", this.f5133d, ", path=");
        sb.append(this.f5134e);
        sb.append(", cause=");
        sb.append(this.f5135f);
        sb.append(")");
        return sb.toString();
    }
}
