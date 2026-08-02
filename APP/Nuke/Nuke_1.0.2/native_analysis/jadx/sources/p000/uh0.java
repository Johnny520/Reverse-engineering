package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uh0 {

    /* JADX INFO: renamed from: a */
    public final fj0 f11314a;

    public uh0(fj0 fj0Var) {
        this.f11314a = fj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uh0) {
            return Float.compare(0.0f, 0.0f) == 0 && t11.m5086l(this.f11314a, ((uh0) obj).f11314a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11314a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f11314a + ')';
    }
}
