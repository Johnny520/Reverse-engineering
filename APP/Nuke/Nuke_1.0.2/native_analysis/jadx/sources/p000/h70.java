package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h70 implements e70 {

    /* JADX INFO: renamed from: h */
    public final float f3880h;

    /* JADX INFO: renamed from: i */
    public final float f3881i;

    public h70(float f, float f2) {
        this.f3880h = f;
        this.f3881i = f2;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        return this.f3880h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h70)) {
            return false;
        }
        h70 h70Var = (h70) obj;
        return Float.compare(this.f3880h, h70Var.f3880h) == 0 && Float.compare(this.f3881i, h70Var.f3881i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3881i) + (Float.hashCode(this.f3880h) * 31);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        return this.f3881i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f3880h);
        sb.append(", fontScale=");
        return vi0.m5693l(sb, this.f3881i, ')');
    }
}
