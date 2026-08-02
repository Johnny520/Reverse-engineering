package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ba3 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0494nd f752a;

    /* JADX INFO: renamed from: b */
    public final gd0 f753b;

    public ba3(AbstractC0494nd abstractC0494nd, gd0 gd0Var) {
        this.f752a = abstractC0494nd;
        this.f753b = gd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba3)) {
            return false;
        }
        ba3 ba3Var = (ba3) obj;
        return t11.m5086l(this.f752a, ba3Var.f752a) && t11.m5086l(this.f753b, ba3Var.f753b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f753b.hashCode() + (this.f752a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f752a + ", easing=" + this.f753b + ", arcMode=ArcMode(value=0))";
    }
}
