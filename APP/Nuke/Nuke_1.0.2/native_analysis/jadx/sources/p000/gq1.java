package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gq1 {

    /* JADX INFO: renamed from: a */
    public final String f3658a;

    /* JADX INFO: renamed from: b */
    public final String f3659b;

    /* JADX INFO: renamed from: c */
    public final String f3660c;

    public gq1(String str, String str2, String str3) {
        this.f3658a = str;
        this.f3659b = str2;
        this.f3660c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq1)) {
            return false;
        }
        gq1 gq1Var = (gq1) obj;
        return this.f3658a.equals(gq1Var.f3658a) && this.f3659b.equals(gq1Var.f3659b) && t11.m5086l(this.f3660c, gq1Var.f3660c);
    }

    public final int hashCode() {
        int iM2207f = hk1.m2207f(this.f3659b, this.f3658a.hashCode() * 31, 31);
        String str = this.f3660c;
        return iM2207f + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hk1.m2211j(vi0.m5696o("NukeScriptPermissionRequest(key=", this.f3658a, ", label=", this.f3659b, ", reason="), this.f3660c, ")");
    }
}
