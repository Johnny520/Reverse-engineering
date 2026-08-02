package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tl1 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final long g;
    public final long h;
    public final String i;
    public final int j;
    public final int k;
    public final int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tl1(long j, String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, int i, int i2, int i3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = str4;
        this.g = j3;
        this.h = j4;
        this.i = str5;
        this.j = i;
        this.k = i2;
        this.l = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl1)) {
            return false;
        }
        tl1 tl1Var = (tl1) obj;
        return this.a == tl1Var.a && this.b.equals(tl1Var.b) && this.c.equals(tl1Var.c) && this.d.equals(tl1Var.d) && this.e == tl1Var.e && this.f.equals(tl1Var.f) && this.g == tl1Var.g && this.h == tl1Var.h && this.i.equals(tl1Var.i) && this.j == tl1Var.j && this.k == tl1Var.k && this.l == tl1Var.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.l) + vi0.d(this.k, vi0.d(this.j, hk1.f(this.i, hk1.c(hk1.c(hk1.f(this.f, hk1.c(hk1.f(this.d, hk1.f(this.c, hk1.f(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31), 31, this.g), 31, this.h), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivationManifest(sequence=");
        sb.append(this.a);
        sb.append(", releaseId=");
        sb.append(this.b);
        hk1.o(sb, ", packageUrl=", this.c, ", packageSha256=", this.d);
        sb.append(", packageLength=");
        sb.append(this.e);
        sb.append(", engineSha256=");
        sb.append(this.f);
        sb.append(", engineLength=");
        sb.append(this.g);
        sb.append(", generation=");
        sb.append(this.h);
        sb.append(", kid=");
        sb.append(this.i);
        sb.append(", engineAbi=");
        sb.append(this.j);
        sb.append(", minBridgeAbi=");
        sb.append(this.k);
        sb.append(", minAppVersionCode=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
