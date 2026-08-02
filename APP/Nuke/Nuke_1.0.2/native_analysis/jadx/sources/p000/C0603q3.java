package p000;

/* JADX INFO: renamed from: q3 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0603q3 {

    /* JADX INFO: renamed from: a */
    public final String f8712a;

    /* JADX INFO: renamed from: b */
    public final un0 f8713b;

    public C0603q3(String str, un0 un0Var) {
        this.f8712a = str;
        this.f8713b = un0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0603q3)) {
            return false;
        }
        C0603q3 c0603q3 = (C0603q3) obj;
        return t11.m5086l(this.f8712a, c0603q3.f8712a) && t11.m5086l(this.f8713b, c0603q3.f8713b);
    }

    public final int hashCode() {
        String str = this.f8712a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        un0 un0Var = this.f8713b;
        return iHashCode + (un0Var != null ? un0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f8712a + ", action=" + this.f8713b + ')';
    }
}
