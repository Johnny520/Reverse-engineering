package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pa2 {

    /* JADX INFO: renamed from: a */
    public final long f8230a = C0363ju.f5217g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pa2) {
            return C0363ju.m2566c(this.f8230a, ((pa2) obj).f8230a);
        }
        return false;
    }

    public final int hashCode() {
        int i = C0363ju.f5218h;
        return Long.hashCode(this.f8230a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C0363ju.m2572i(this.f8230a)) + ", rippleAlpha=null)";
    }
}
