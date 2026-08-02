package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class my1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f6918c;

    /* JADX INFO: renamed from: d */
    public final float f6919d;

    /* JADX INFO: renamed from: e */
    public final float f6920e;

    /* JADX INFO: renamed from: f */
    public final float f6921f;

    public my1(float f, float f2, float f3, float f4) {
        super(2);
        this.f6918c = f;
        this.f6919d = f2;
        this.f6920e = f3;
        this.f6921f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my1)) {
            return false;
        }
        my1 my1Var = (my1) obj;
        return Float.compare(this.f6918c, my1Var.f6918c) == 0 && Float.compare(this.f6919d, my1Var.f6919d) == 0 && Float.compare(this.f6920e, my1Var.f6920e) == 0 && Float.compare(this.f6921f, my1Var.f6921f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6921f) + vi0.m5684c(this.f6920e, vi0.m5684c(this.f6919d, Float.hashCode(this.f6918c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f6918c);
        sb.append(", dy1=");
        sb.append(this.f6919d);
        sb.append(", dx2=");
        sb.append(this.f6920e);
        sb.append(", dy2=");
        return vi0.m5693l(sb, this.f6921f, ')');
    }
}
