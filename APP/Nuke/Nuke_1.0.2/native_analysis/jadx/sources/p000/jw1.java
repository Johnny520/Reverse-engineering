package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jw1 {

    /* JADX INFO: renamed from: a */
    public final float f5244a;

    /* JADX INFO: renamed from: b */
    public final float f5245b;

    /* JADX INFO: renamed from: c */
    public final float f5246c;

    /* JADX INFO: renamed from: d */
    public final float f5247d;

    public jw1(float f, float f2, float f3, float f4) {
        this.f5244a = f;
        this.f5245b = f2;
        this.f5246c = f3;
        this.f5247d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            iz0.m2423a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jw1)) {
            return false;
        }
        jw1 jw1Var = (jw1) obj;
        return za0.m6404b(this.f5244a, jw1Var.f5244a) && za0.m6404b(this.f5245b, jw1Var.f5245b) && za0.m6404b(this.f5246c, jw1Var.f5246c) && za0.m6404b(this.f5247d, jw1Var.f5247d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f5247d) + vi0.m5684c(this.f5246c, vi0.m5684c(this.f5245b, Float.hashCode(this.f5244a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) za0.m6405c(this.f5244a)) + ", top=" + ((Object) za0.m6405c(this.f5245b)) + ", end=" + ((Object) za0.m6405c(this.f5246c)) + ", bottom=" + ((Object) za0.m6405c(this.f5247d)) + ')';
    }
}
