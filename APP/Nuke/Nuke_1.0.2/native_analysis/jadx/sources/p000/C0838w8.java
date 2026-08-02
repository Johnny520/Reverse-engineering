package p000;

/* JADX INFO: renamed from: w8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0838w8 {

    /* JADX INFO: renamed from: a */
    public final float f12391a;

    /* JADX INFO: renamed from: b */
    public final float f12392b;

    public C0838w8(float f, float f2) {
        this.f12391a = f;
        this.f12392b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0838w8)) {
            return false;
        }
        C0838w8 c0838w8 = (C0838w8) obj;
        return Float.compare(this.f12391a, c0838w8.f12391a) == 0 && Float.compare(this.f12392b, c0838w8.f12392b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12392b) + (Float.hashCode(this.f12391a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f12391a);
        sb.append(", velocityCoefficient=");
        return vi0.m5693l(sb, this.f12392b, ')');
    }
}
