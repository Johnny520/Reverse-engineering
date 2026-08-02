package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cy1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f1775c;

    /* JADX INFO: renamed from: d */
    public final float f1776d;

    public cy1(float f, float f2) {
        super(3);
        this.f1775c = f;
        this.f1776d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy1)) {
            return false;
        }
        cy1 cy1Var = (cy1) obj;
        return Float.compare(this.f1775c, cy1Var.f1775c) == 0 && Float.compare(this.f1776d, cy1Var.f1776d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1776d) + (Float.hashCode(this.f1775c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f1775c);
        sb.append(", y=");
        return vi0.m5693l(sb, this.f1776d, ')');
    }
}
