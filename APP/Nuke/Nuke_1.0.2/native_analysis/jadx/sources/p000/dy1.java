package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dy1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f2259c;

    /* JADX INFO: renamed from: d */
    public final float f2260d;

    /* JADX INFO: renamed from: e */
    public final float f2261e;

    /* JADX INFO: renamed from: f */
    public final float f2262f;

    public dy1(float f, float f2, float f3, float f4) {
        super(1);
        this.f2259c = f;
        this.f2260d = f2;
        this.f2261e = f3;
        this.f2262f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy1)) {
            return false;
        }
        dy1 dy1Var = (dy1) obj;
        return Float.compare(this.f2259c, dy1Var.f2259c) == 0 && Float.compare(this.f2260d, dy1Var.f2260d) == 0 && Float.compare(this.f2261e, dy1Var.f2261e) == 0 && Float.compare(this.f2262f, dy1Var.f2262f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2262f) + vi0.m5684c(this.f2261e, vi0.m5684c(this.f2260d, Float.hashCode(this.f2259c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f2259c);
        sb.append(", y1=");
        sb.append(this.f2260d);
        sb.append(", x2=");
        sb.append(this.f2261e);
        sb.append(", y2=");
        return vi0.m5693l(sb, this.f2262f, ')');
    }
}
