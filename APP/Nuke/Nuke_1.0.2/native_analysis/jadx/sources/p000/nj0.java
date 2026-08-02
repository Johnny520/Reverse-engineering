package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nj0 {

    /* JADX INFO: renamed from: a */
    public final float f7179a;

    /* JADX INFO: renamed from: b */
    public final float f7180b;

    /* JADX INFO: renamed from: c */
    public final long f7181c;

    public nj0(float f, float f2, long j) {
        this.f7179a = f;
        this.f7180b = f2;
        this.f7181c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj0)) {
            return false;
        }
        nj0 nj0Var = (nj0) obj;
        return Float.compare(this.f7179a, nj0Var.f7179a) == 0 && Float.compare(this.f7180b, nj0Var.f7180b) == 0 && this.f7181c == nj0Var.f7181c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7181c) + vi0.m5684c(this.f7180b, Float.hashCode(this.f7179a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f7179a + ", distance=" + this.f7180b + ", duration=" + this.f7181c + ')';
    }
}
