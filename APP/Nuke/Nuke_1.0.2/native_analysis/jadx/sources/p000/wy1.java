package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wy1 implements x10 {

    /* JADX INFO: renamed from: a */
    public final float f12736a;

    public wy1(float f) {
        this.f12736a = f;
        if (f < 0.0f || f > 100.0f) {
            nz0.m3456a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // p000.x10
    /* JADX INFO: renamed from: a */
    public final float mo122a(long j, e70 e70Var) {
        return (this.f12736a / 100.0f) * gr2.m2020b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy1) && Float.compare(this.f12736a, ((wy1) obj).f12736a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12736a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f12736a + "%)";
    }
}
