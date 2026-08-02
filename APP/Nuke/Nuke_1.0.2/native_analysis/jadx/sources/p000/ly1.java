package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ly1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f6400c;

    /* JADX INFO: renamed from: d */
    public final float f6401d;

    /* JADX INFO: renamed from: e */
    public final float f6402e;

    /* JADX INFO: renamed from: f */
    public final float f6403f;

    public ly1(float f, float f2, float f3, float f4) {
        super(1);
        this.f6400c = f;
        this.f6401d = f2;
        this.f6402e = f3;
        this.f6403f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly1)) {
            return false;
        }
        ly1 ly1Var = (ly1) obj;
        return Float.compare(this.f6400c, ly1Var.f6400c) == 0 && Float.compare(this.f6401d, ly1Var.f6401d) == 0 && Float.compare(this.f6402e, ly1Var.f6402e) == 0 && Float.compare(this.f6403f, ly1Var.f6403f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6403f) + vi0.m5684c(this.f6402e, vi0.m5684c(this.f6401d, Float.hashCode(this.f6400c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f6400c);
        sb.append(", dy1=");
        sb.append(this.f6401d);
        sb.append(", dx2=");
        sb.append(this.f6402e);
        sb.append(", dy2=");
        return vi0.m5693l(sb, this.f6403f, ')');
    }
}
