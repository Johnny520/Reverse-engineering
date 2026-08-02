package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w80 {

    /* JADX INFO: renamed from: a */
    public final boolean f12393a;

    /* JADX INFO: renamed from: b */
    public final boolean f12394b;

    /* JADX INFO: renamed from: c */
    public final String f12395c;

    /* JADX INFO: renamed from: d */
    public final String f12396d;

    public w80(boolean z, boolean z2, String str, String str2) {
        this.f12393a = z;
        this.f12394b = z2;
        this.f12395c = str;
        this.f12396d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w80)) {
            return false;
        }
        w80 w80Var = (w80) obj;
        return this.f12393a == w80Var.f12393a && this.f12394b == w80Var.f12394b && t11.m5086l(this.f12395c, w80Var.f12395c) && t11.m5086l(this.f12396d, w80Var.f12396d);
    }

    public final int hashCode() {
        int iM2207f = hk1.m2207f(this.f12395c, hk1.m2205d(Boolean.hashCode(this.f12393a) * 31, 31, this.f12394b), 31);
        String str = this.f12396d;
        return iM2207f + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ProbeResult(hit=" + this.f12393a + ", available=" + this.f12394b + ", method=" + this.f12395c + ", error=" + this.f12396d + ")";
    }
}
