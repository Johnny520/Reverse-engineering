package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x13 {

    /* JADX INFO: renamed from: a */
    public final float f12767a;

    /* JADX INFO: renamed from: b */
    public final float f12768b;

    /* JADX INFO: renamed from: c */
    public final float f12769c;

    public x13(float f, float f2, float f3) {
        this.f12767a = f;
        this.f12768b = f2;
        this.f12769c = f3;
    }

    /* JADX INFO: renamed from: a */
    public static x13 m6023a(x13 x13Var, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = x13Var.f12767a;
        }
        if ((i & 2) != 0) {
            f2 = x13Var.f12768b;
        }
        if ((i & 4) != 0) {
            f3 = x13Var.f12769c;
        }
        x13Var.getClass();
        return new x13(f, f2, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x13)) {
            return false;
        }
        x13 x13Var = (x13) obj;
        return Float.compare(this.f12767a, x13Var.f12767a) == 0 && Float.compare(this.f12768b, x13Var.f12768b) == 0 && Float.compare(this.f12769c, x13Var.f12769c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12769c) + vi0.m5684c(this.f12768b, Float.hashCode(this.f12767a) * 31, 31);
    }

    public final String toString() {
        return "ThemeHsvColor(hue=" + this.f12767a + ", saturation=" + this.f12768b + ", value=" + this.f12769c + ")";
    }
}
