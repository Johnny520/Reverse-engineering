package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ex2 {
    public final float a;
    public final float b;
    public final int c;
    public final Boolean d;
    public boolean e = false;
    public boolean f = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ex2(float f, float f2, int i, Boolean bool) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex2)) {
            return false;
        }
        ex2 ex2Var = (ex2) obj;
        return Float.compare(this.a, ex2Var.a) == 0 && Float.compare(this.b, ex2Var.b) == 0 && this.c == ex2Var.c && t11.l(this.d, ex2Var.d) && this.e == ex2Var.e && this.f == ex2Var.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iD = vi0.d(this.c, vi0.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
        Boolean bool = this.d;
        return Boolean.hashCode(this.f) + hk1.d((iD + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SwipeState(initialRawX=" + this.a + ", initialRawY=" + this.b + ", touchSlop=" + this.c + ", originalInterceptFlag=" + this.d + ", isSwiping=" + this.e + ", hasTriggered=" + this.f + ")";
    }
}
