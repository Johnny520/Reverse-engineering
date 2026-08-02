package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ab0 implements x10 {

    /* JADX INFO: renamed from: a */
    public final float f131a;

    public ab0(float f) {
        this.f131a = f;
    }

    @Override // p000.x10
    /* JADX INFO: renamed from: a */
    public final float mo122a(long j, e70 e70Var) {
        return e70Var.mo689A(this.f131a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab0) && za0.m6404b(this.f131a, ((ab0) obj).f131a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f131a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f131a + ".dp)";
    }
}
