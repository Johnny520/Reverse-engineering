package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vv1 {

    /* JADX INFO: renamed from: a */
    public final long f12188a;

    /* JADX INFO: renamed from: b */
    public final jw1 f12189b;

    public vv1() {
        long jM4932c = sp0.m4932c(4284900966L);
        jw1 jw1VarM1634g = fg1.m1634g(3);
        this.f12188a = jM4932c;
        this.f12189b = jw1VarM1634g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vv1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        vv1 vv1Var = (vv1) obj;
        return C0363ju.m2566c(this.f12188a, vv1Var.f12188a) && t11.m5086l(this.f12189b, vv1Var.f12189b);
    }

    public final int hashCode() {
        int i = C0363ju.f5218h;
        return this.f12189b.hashCode() + (Long.hashCode(this.f12188a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        hk1.m2213l(this.f12188a, sb, ", drawPadding=");
        sb.append(this.f12189b);
        sb.append(')');
        return sb.toString();
    }
}
