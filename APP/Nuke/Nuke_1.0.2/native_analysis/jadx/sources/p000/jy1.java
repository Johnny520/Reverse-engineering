package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jy1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f5275c;

    /* JADX INFO: renamed from: d */
    public final float f5276d;

    public jy1(float f, float f2) {
        super(3);
        this.f5275c = f;
        this.f5276d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy1)) {
            return false;
        }
        jy1 jy1Var = (jy1) obj;
        return Float.compare(this.f5275c, jy1Var.f5275c) == 0 && Float.compare(this.f5276d, jy1Var.f5276d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5276d) + (Float.hashCode(this.f5275c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f5275c);
        sb.append(", dy=");
        return vi0.m5693l(sb, this.f5276d, ')');
    }
}
