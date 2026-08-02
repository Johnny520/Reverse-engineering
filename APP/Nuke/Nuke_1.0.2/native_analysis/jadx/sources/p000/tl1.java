package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tl1 {

    /* JADX INFO: renamed from: a */
    public final long f10828a;

    /* JADX INFO: renamed from: b */
    public final String f10829b;

    /* JADX INFO: renamed from: c */
    public final String f10830c;

    /* JADX INFO: renamed from: d */
    public final String f10831d;

    /* JADX INFO: renamed from: e */
    public final long f10832e;

    /* JADX INFO: renamed from: f */
    public final String f10833f;

    /* JADX INFO: renamed from: g */
    public final long f10834g;

    /* JADX INFO: renamed from: h */
    public final long f10835h;

    /* JADX INFO: renamed from: i */
    public final String f10836i;

    /* JADX INFO: renamed from: j */
    public final int f10837j;

    /* JADX INFO: renamed from: k */
    public final int f10838k;

    /* JADX INFO: renamed from: l */
    public final int f10839l;

    public tl1(long j, String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, int i, int i2, int i3) {
        this.f10828a = j;
        this.f10829b = str;
        this.f10830c = str2;
        this.f10831d = str3;
        this.f10832e = j2;
        this.f10833f = str4;
        this.f10834g = j3;
        this.f10835h = j4;
        this.f10836i = str5;
        this.f10837j = i;
        this.f10838k = i2;
        this.f10839l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl1)) {
            return false;
        }
        tl1 tl1Var = (tl1) obj;
        return this.f10828a == tl1Var.f10828a && this.f10829b.equals(tl1Var.f10829b) && this.f10830c.equals(tl1Var.f10830c) && this.f10831d.equals(tl1Var.f10831d) && this.f10832e == tl1Var.f10832e && this.f10833f.equals(tl1Var.f10833f) && this.f10834g == tl1Var.f10834g && this.f10835h == tl1Var.f10835h && this.f10836i.equals(tl1Var.f10836i) && this.f10837j == tl1Var.f10837j && this.f10838k == tl1Var.f10838k && this.f10839l == tl1Var.f10839l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10839l) + vi0.m5685d(this.f10838k, vi0.m5685d(this.f10837j, hk1.m2207f(this.f10836i, hk1.m2204c(hk1.m2204c(hk1.m2207f(this.f10833f, hk1.m2204c(hk1.m2207f(this.f10831d, hk1.m2207f(this.f10830c, hk1.m2207f(this.f10829b, Long.hashCode(this.f10828a) * 31, 31), 31), 31), 31, this.f10832e), 31), 31, this.f10834g), 31, this.f10835h), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivationManifest(sequence=");
        sb.append(this.f10828a);
        sb.append(", releaseId=");
        sb.append(this.f10829b);
        hk1.m2216o(sb, ", packageUrl=", this.f10830c, ", packageSha256=", this.f10831d);
        sb.append(", packageLength=");
        sb.append(this.f10832e);
        sb.append(", engineSha256=");
        sb.append(this.f10833f);
        sb.append(", engineLength=");
        sb.append(this.f10834g);
        sb.append(", generation=");
        sb.append(this.f10835h);
        sb.append(", kid=");
        sb.append(this.f10836i);
        sb.append(", engineAbi=");
        sb.append(this.f10837j);
        sb.append(", minBridgeAbi=");
        sb.append(this.f10838k);
        sb.append(", minAppVersionCode=");
        sb.append(this.f10839l);
        sb.append(")");
        return sb.toString();
    }
}
