package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ey1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f2681c;

    /* JADX INFO: renamed from: d */
    public final float f2682d;

    /* JADX INFO: renamed from: e */
    public final float f2683e;

    /* JADX INFO: renamed from: f */
    public final float f2684f;

    public ey1(float f, float f2, float f3, float f4) {
        super(2);
        this.f2681c = f;
        this.f2682d = f2;
        this.f2683e = f3;
        this.f2684f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey1)) {
            return false;
        }
        ey1 ey1Var = (ey1) obj;
        return Float.compare(this.f2681c, ey1Var.f2681c) == 0 && Float.compare(this.f2682d, ey1Var.f2682d) == 0 && Float.compare(this.f2683e, ey1Var.f2683e) == 0 && Float.compare(this.f2684f, ey1Var.f2684f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2684f) + vi0.m5684c(this.f2683e, vi0.m5684c(this.f2682d, Float.hashCode(this.f2681c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f2681c);
        sb.append(", y1=");
        sb.append(this.f2682d);
        sb.append(", x2=");
        sb.append(this.f2683e);
        sb.append(", y2=");
        return vi0.m5693l(sb, this.f2684f, ')');
    }
}
