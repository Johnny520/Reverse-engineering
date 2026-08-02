package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yf1 {

    /* JADX INFO: renamed from: a */
    public final Class f13434a;

    /* JADX INFO: renamed from: b */
    public final Object f13435b;

    /* JADX INFO: renamed from: c */
    public boolean f13436c = false;

    /* JADX INFO: renamed from: d */
    public final xf1 f13437d;

    public yf1(Class cls, Object obj, xf1 xf1Var) {
        this.f13434a = cls;
        this.f13435b = obj;
        this.f13437d = xf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf1)) {
            return false;
        }
        yf1 yf1Var = (yf1) obj;
        return t11.m5086l(this.f13434a, yf1Var.f13434a) && t11.m5086l(this.f13435b, yf1Var.f13435b) && this.f13436c == yf1Var.f13436c && this.f13437d == yf1Var.f13437d;
    }

    public final int hashCode() {
        int iHashCode = this.f13434a.hashCode() * 31;
        Object obj = this.f13435b;
        return this.f13437d.hashCode() + hk1.m2205d((iHashCode + (obj == null ? 0 : obj.hashCode())) * 961, 31, this.f13436c);
    }

    public final String toString() {
        return "Configuration(declaringClass=" + this.f13434a + ", memberInstance=" + this.f13435b + ", processorResolver=null, superclass=" + this.f13436c + ", optional=" + this.f13437d + ")";
    }
}
