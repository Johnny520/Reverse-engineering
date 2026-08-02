package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class by1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f1079c;

    /* JADX INFO: renamed from: d */
    public final float f1080d;

    public by1(float f, float f2) {
        super(3);
        this.f1079c = f;
        this.f1080d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by1)) {
            return false;
        }
        by1 by1Var = (by1) obj;
        return Float.compare(this.f1079c, by1Var.f1079c) == 0 && Float.compare(this.f1080d, by1Var.f1080d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1080d) + (Float.hashCode(this.f1079c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f1079c);
        sb.append(", y=");
        return vi0.m5693l(sb, this.f1080d, ')');
    }
}
