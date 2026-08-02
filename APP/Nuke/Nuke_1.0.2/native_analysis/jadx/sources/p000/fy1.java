package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fy1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f3195c;

    /* JADX INFO: renamed from: d */
    public final float f3196d;

    public fy1(float f, float f2) {
        super(1);
        this.f3195c = f;
        this.f3196d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy1)) {
            return false;
        }
        fy1 fy1Var = (fy1) obj;
        return Float.compare(this.f3195c, fy1Var.f3195c) == 0 && Float.compare(this.f3196d, fy1Var.f3196d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3196d) + (Float.hashCode(this.f3195c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f3195c);
        sb.append(", y=");
        return vi0.m5693l(sb, this.f3196d, ')');
    }
}
