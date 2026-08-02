package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n80 {

    /* JADX INFO: renamed from: a */
    public final boolean f7042a = true;

    /* JADX INFO: renamed from: b */
    public final boolean f7043b = true;

    /* JADX INFO: renamed from: c */
    public final km2 f7044c = km2.f5651h;

    /* JADX INFO: renamed from: d */
    public final boolean f7045d = true;

    /* JADX INFO: renamed from: e */
    public final boolean f7046e = true;

    /* JADX INFO: renamed from: f */
    public final String f7047f = "";

    /* JADX INFO: renamed from: g */
    public final int f7048g = 2;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n80)) {
            return false;
        }
        n80 n80Var = (n80) obj;
        return this.f7042a == n80Var.f7042a && this.f7043b == n80Var.f7043b && this.f7044c == n80Var.f7044c && this.f7045d == n80Var.f7045d && this.f7046e == n80Var.f7046e && this.f7048g == n80Var.f7048g;
    }

    public final int hashCode() {
        return (hk1.m2205d(hk1.m2205d((this.f7044c.hashCode() + hk1.m2205d(Boolean.hashCode(this.f7042a) * 31, 31, this.f7043b)) * 31, 31, this.f7045d), 31, this.f7046e) + this.f7048g) * 31;
    }
}
