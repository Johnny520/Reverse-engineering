package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k13 {

    /* JADX INFO: renamed from: a */
    public final String f5319a;

    /* JADX INFO: renamed from: b */
    public String f5320b;

    /* JADX INFO: renamed from: c */
    public boolean f5321c = false;

    /* JADX INFO: renamed from: d */
    public uw1 f5322d = null;

    public k13(String str, String str2) {
        this.f5319a = str;
        this.f5320b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k13)) {
            return false;
        }
        k13 k13Var = (k13) obj;
        return t11.m5086l(this.f5319a, k13Var.f5319a) && t11.m5086l(this.f5320b, k13Var.f5320b) && this.f5321c == k13Var.f5321c && t11.m5086l(this.f5322d, k13Var.f5322d);
    }

    public final int hashCode() {
        int iM2205d = hk1.m2205d(hk1.m2207f(this.f5320b, this.f5319a.hashCode() * 31, 31), 31, this.f5321c);
        uw1 uw1Var = this.f5322d;
        return iM2205d + (uw1Var == null ? 0 : uw1Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f5322d + ", isShowingSubstitution=" + this.f5321c + ')';
    }
}
