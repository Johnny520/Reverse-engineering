package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f61 {

    /* JADX INFO: renamed from: a */
    public final int f2813a;

    /* JADX INFO: renamed from: b */
    public final int f2814b;

    /* JADX INFO: renamed from: c */
    public final boolean f2815c;

    public f61(int i, int i2, boolean z) {
        this.f2813a = i;
        this.f2814b = i2;
        this.f2815c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f61)) {
            return false;
        }
        f61 f61Var = (f61) obj;
        return this.f2813a == f61Var.f2813a && this.f2814b == f61Var.f2814b && this.f2815c == f61Var.f2815c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2815c) + vi0.m5685d(this.f2814b, Integer.hashCode(this.f2813a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f2813a + ", end=" + this.f2814b + ", isRtl=" + this.f2815c + ')';
    }
}
