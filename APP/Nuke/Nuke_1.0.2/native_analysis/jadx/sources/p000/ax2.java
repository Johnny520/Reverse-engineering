package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ax2 {

    /* JADX INFO: renamed from: a */
    public final float f438a;

    /* JADX INFO: renamed from: b */
    public final float f439b;

    /* JADX INFO: renamed from: c */
    public final int f440c;

    /* JADX INFO: renamed from: d */
    public boolean f441d = false;

    public ax2(float f, float f2, int i) {
        this.f438a = f;
        this.f439b = f2;
        this.f440c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax2)) {
            return false;
        }
        ax2 ax2Var = (ax2) obj;
        return Float.compare(this.f438a, ax2Var.f438a) == 0 && Float.compare(this.f439b, ax2Var.f439b) == 0 && this.f440c == ax2Var.f440c && this.f441d == ax2Var.f441d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f441d) + vi0.m5685d(this.f440c, vi0.m5684c(this.f439b, Float.hashCode(this.f438a) * 31, 31), 31);
    }

    public final String toString() {
        return "SwipeState(initialRawX=" + this.f438a + ", initialRawY=" + this.f439b + ", touchSlop=" + this.f440c + ", isDragging=" + this.f441d + ")";
    }
}
