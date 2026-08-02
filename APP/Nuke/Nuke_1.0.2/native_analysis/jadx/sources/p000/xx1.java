package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xx1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f13220c;

    /* JADX INFO: renamed from: d */
    public final float f13221d;

    /* JADX INFO: renamed from: e */
    public final float f13222e;

    /* JADX INFO: renamed from: f */
    public final boolean f13223f;

    /* JADX INFO: renamed from: g */
    public final boolean f13224g;

    /* JADX INFO: renamed from: h */
    public final float f13225h;

    /* JADX INFO: renamed from: i */
    public final float f13226i;

    public xx1(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.f13220c = f;
        this.f13221d = f2;
        this.f13222e = f3;
        this.f13223f = z;
        this.f13224g = z2;
        this.f13225h = f4;
        this.f13226i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx1)) {
            return false;
        }
        xx1 xx1Var = (xx1) obj;
        return Float.compare(this.f13220c, xx1Var.f13220c) == 0 && Float.compare(this.f13221d, xx1Var.f13221d) == 0 && Float.compare(this.f13222e, xx1Var.f13222e) == 0 && this.f13223f == xx1Var.f13223f && this.f13224g == xx1Var.f13224g && Float.compare(this.f13225h, xx1Var.f13225h) == 0 && Float.compare(this.f13226i, xx1Var.f13226i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13226i) + vi0.m5684c(this.f13225h, hk1.m2205d(hk1.m2205d(vi0.m5684c(this.f13222e, vi0.m5684c(this.f13221d, Float.hashCode(this.f13220c) * 31, 31), 31), 31, this.f13223f), 31, this.f13224g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f13220c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f13221d);
        sb.append(", theta=");
        sb.append(this.f13222e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f13223f);
        sb.append(", isPositiveArc=");
        sb.append(this.f13224g);
        sb.append(", arcStartX=");
        sb.append(this.f13225h);
        sb.append(", arcStartY=");
        return vi0.m5693l(sb, this.f13226i, ')');
    }
}
