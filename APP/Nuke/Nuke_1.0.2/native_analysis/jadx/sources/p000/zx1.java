package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zx1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f14137c;

    /* JADX INFO: renamed from: d */
    public final float f14138d;

    /* JADX INFO: renamed from: e */
    public final float f14139e;

    /* JADX INFO: renamed from: f */
    public final float f14140f;

    /* JADX INFO: renamed from: g */
    public final float f14141g;

    /* JADX INFO: renamed from: h */
    public final float f14142h;

    public zx1(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f14137c = f;
        this.f14138d = f2;
        this.f14139e = f3;
        this.f14140f = f4;
        this.f14141g = f5;
        this.f14142h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx1)) {
            return false;
        }
        zx1 zx1Var = (zx1) obj;
        return Float.compare(this.f14137c, zx1Var.f14137c) == 0 && Float.compare(this.f14138d, zx1Var.f14138d) == 0 && Float.compare(this.f14139e, zx1Var.f14139e) == 0 && Float.compare(this.f14140f, zx1Var.f14140f) == 0 && Float.compare(this.f14141g, zx1Var.f14141g) == 0 && Float.compare(this.f14142h, zx1Var.f14142h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14142h) + vi0.m5684c(this.f14141g, vi0.m5684c(this.f14140f, vi0.m5684c(this.f14139e, vi0.m5684c(this.f14138d, Float.hashCode(this.f14137c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f14137c);
        sb.append(", y1=");
        sb.append(this.f14138d);
        sb.append(", x2=");
        sb.append(this.f14139e);
        sb.append(", y2=");
        sb.append(this.f14140f);
        sb.append(", x3=");
        sb.append(this.f14141g);
        sb.append(", y3=");
        return vi0.m5693l(sb, this.f14142h, ')');
    }
}
