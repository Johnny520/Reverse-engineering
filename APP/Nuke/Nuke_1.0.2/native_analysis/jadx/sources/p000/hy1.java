package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hy1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f4179c;

    /* JADX INFO: renamed from: d */
    public final float f4180d;

    /* JADX INFO: renamed from: e */
    public final float f4181e;

    /* JADX INFO: renamed from: f */
    public final float f4182f;

    /* JADX INFO: renamed from: g */
    public final float f4183g;

    /* JADX INFO: renamed from: h */
    public final float f4184h;

    public hy1(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f4179c = f;
        this.f4180d = f2;
        this.f4181e = f3;
        this.f4182f = f4;
        this.f4183g = f5;
        this.f4184h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy1)) {
            return false;
        }
        hy1 hy1Var = (hy1) obj;
        return Float.compare(this.f4179c, hy1Var.f4179c) == 0 && Float.compare(this.f4180d, hy1Var.f4180d) == 0 && Float.compare(this.f4181e, hy1Var.f4181e) == 0 && Float.compare(this.f4182f, hy1Var.f4182f) == 0 && Float.compare(this.f4183g, hy1Var.f4183g) == 0 && Float.compare(this.f4184h, hy1Var.f4184h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4184h) + vi0.m5684c(this.f4183g, vi0.m5684c(this.f4182f, vi0.m5684c(this.f4181e, vi0.m5684c(this.f4180d, Float.hashCode(this.f4179c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f4179c);
        sb.append(", dy1=");
        sb.append(this.f4180d);
        sb.append(", dx2=");
        sb.append(this.f4181e);
        sb.append(", dy2=");
        sb.append(this.f4182f);
        sb.append(", dx3=");
        sb.append(this.f4183g);
        sb.append(", dy3=");
        return vi0.m5693l(sb, this.f4184h, ')');
    }
}
