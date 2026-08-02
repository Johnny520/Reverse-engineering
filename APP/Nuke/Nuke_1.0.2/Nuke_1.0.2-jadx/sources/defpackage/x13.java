package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x13 {
    public final float a;
    public final float b;
    public final float c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x13(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static x13 a(x13 x13Var, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = x13Var.a;
        }
        if ((i & 2) != 0) {
            f2 = x13Var.b;
        }
        if ((i & 4) != 0) {
            f3 = x13Var.c;
        }
        x13Var.getClass();
        return new x13(f, f2, f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x13)) {
            return false;
        }
        x13 x13Var = (x13) obj;
        return Float.compare(this.a, x13Var.a) == 0 && Float.compare(this.b, x13Var.b) == 0 && Float.compare(this.c, x13Var.c) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.c) + vi0.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ThemeHsvColor(hue=" + this.a + ", saturation=" + this.b + ", value=" + this.c + ")";
    }
}
