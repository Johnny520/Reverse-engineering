package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mb2 {

    /* JADX INFO: renamed from: a */
    public float f6551a = 0.0f;

    /* JADX INFO: renamed from: b */
    public boolean f6552b = true;

    /* JADX INFO: renamed from: c */
    public t20 f6553c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb2)) {
            return false;
        }
        mb2 mb2Var = (mb2) obj;
        return Float.compare(this.f6551a, mb2Var.f6551a) == 0 && this.f6552b == mb2Var.f6552b && t11.m5086l(this.f6553c, mb2Var.f6553c);
    }

    public final int hashCode() {
        int iM2205d = hk1.m2205d(Float.hashCode(this.f6551a) * 31, 31, this.f6552b);
        t20 t20Var = this.f6553c;
        return (iM2205d + (t20Var == null ? 0 : t20Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f6551a + ", fill=" + this.f6552b + ", crossAxisAlignment=" + this.f6553c + ", flowLayoutData=null)";
    }
}
