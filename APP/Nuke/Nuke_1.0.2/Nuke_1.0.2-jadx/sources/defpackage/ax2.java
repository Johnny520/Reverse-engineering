package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ax2 {
    public final float a;
    public final float b;
    public final int c;
    public boolean d = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ax2(float f, float f2, int i) {
        this.a = f;
        this.b = f2;
        this.c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax2)) {
            return false;
        }
        ax2 ax2Var = (ax2) obj;
        return Float.compare(this.a, ax2Var.a) == 0 && Float.compare(this.b, ax2Var.b) == 0 && this.c == ax2Var.c && this.d == ax2Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.d) + vi0.d(this.c, vi0.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SwipeState(initialRawX=" + this.a + ", initialRawY=" + this.b + ", touchSlop=" + this.c + ", isDragging=" + this.d + ")";
    }
}
