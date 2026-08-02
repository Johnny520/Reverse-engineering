package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ex2 {

    /* JADX INFO: renamed from: a */
    public final float f2668a;

    /* JADX INFO: renamed from: b */
    public final float f2669b;

    /* JADX INFO: renamed from: c */
    public final int f2670c;

    /* JADX INFO: renamed from: d */
    public final Boolean f2671d;

    /* JADX INFO: renamed from: e */
    public boolean f2672e = false;

    /* JADX INFO: renamed from: f */
    public boolean f2673f = false;

    public ex2(float f, float f2, int i, Boolean bool) {
        this.f2668a = f;
        this.f2669b = f2;
        this.f2670c = i;
        this.f2671d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex2)) {
            return false;
        }
        ex2 ex2Var = (ex2) obj;
        return Float.compare(this.f2668a, ex2Var.f2668a) == 0 && Float.compare(this.f2669b, ex2Var.f2669b) == 0 && this.f2670c == ex2Var.f2670c && t11.m5086l(this.f2671d, ex2Var.f2671d) && this.f2672e == ex2Var.f2672e && this.f2673f == ex2Var.f2673f;
    }

    public final int hashCode() {
        int iM5685d = vi0.m5685d(this.f2670c, vi0.m5684c(this.f2669b, Float.hashCode(this.f2668a) * 31, 31), 31);
        Boolean bool = this.f2671d;
        return Boolean.hashCode(this.f2673f) + hk1.m2205d((iM5685d + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f2672e);
    }

    public final String toString() {
        return "SwipeState(initialRawX=" + this.f2668a + ", initialRawY=" + this.f2669b + ", touchSlop=" + this.f2670c + ", originalInterceptFlag=" + this.f2671d + ", isSwiping=" + this.f2672e + ", hasTriggered=" + this.f2673f + ")";
    }
}
