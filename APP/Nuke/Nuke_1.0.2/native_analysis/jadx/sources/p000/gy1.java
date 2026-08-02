package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gy1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f3736c;

    /* JADX INFO: renamed from: d */
    public final float f3737d;

    /* JADX INFO: renamed from: e */
    public final float f3738e;

    /* JADX INFO: renamed from: f */
    public final boolean f3739f;

    /* JADX INFO: renamed from: g */
    public final boolean f3740g;

    /* JADX INFO: renamed from: h */
    public final float f3741h;

    /* JADX INFO: renamed from: i */
    public final float f3742i;

    public gy1(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.f3736c = f;
        this.f3737d = f2;
        this.f3738e = f3;
        this.f3739f = z;
        this.f3740g = z2;
        this.f3741h = f4;
        this.f3742i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy1)) {
            return false;
        }
        gy1 gy1Var = (gy1) obj;
        return Float.compare(this.f3736c, gy1Var.f3736c) == 0 && Float.compare(this.f3737d, gy1Var.f3737d) == 0 && Float.compare(this.f3738e, gy1Var.f3738e) == 0 && this.f3739f == gy1Var.f3739f && this.f3740g == gy1Var.f3740g && Float.compare(this.f3741h, gy1Var.f3741h) == 0 && Float.compare(this.f3742i, gy1Var.f3742i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3742i) + vi0.m5684c(this.f3741h, hk1.m2205d(hk1.m2205d(vi0.m5684c(this.f3738e, vi0.m5684c(this.f3737d, Float.hashCode(this.f3736c) * 31, 31), 31), 31, this.f3739f), 31, this.f3740g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f3736c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f3737d);
        sb.append(", theta=");
        sb.append(this.f3738e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f3739f);
        sb.append(", isPositiveArc=");
        sb.append(this.f3740g);
        sb.append(", arcStartDx=");
        sb.append(this.f3741h);
        sb.append(", arcStartDy=");
        return vi0.m5693l(sb, this.f3742i, ')');
    }
}
