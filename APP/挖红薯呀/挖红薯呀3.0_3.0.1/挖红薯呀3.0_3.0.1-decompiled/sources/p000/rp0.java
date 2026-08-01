package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class rp0 extends wp0 {

    /* JADX INFO: renamed from: b */
    public final float f5525b;

    /* JADX INFO: renamed from: c */
    public final float f5526c;

    /* JADX INFO: renamed from: d */
    public final float f5527d;

    /* JADX INFO: renamed from: e */
    public final float f5528e;

    /* JADX INFO: renamed from: f */
    public final float f5529f;

    /* JADX INFO: renamed from: g */
    public final float f5530g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rp0(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f5525b = f;
        this.f5526c = f2;
        this.f5527d = f3;
        this.f5528e = f4;
        this.f5529f = f5;
        this.f5530g = f6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp0)) {
            return false;
        }
        rp0 rp0Var = (rp0) obj;
        return Float.compare(this.f5525b, rp0Var.f5525b) == 0 && Float.compare(this.f5526c, rp0Var.f5526c) == 0 && Float.compare(this.f5527d, rp0Var.f5527d) == 0 && Float.compare(this.f5528e, rp0Var.f5528e) == 0 && Float.compare(this.f5529f, rp0Var.f5529f) == 0 && Float.compare(this.f5530g, rp0Var.f5530g) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f5530g) + AbstractC0748t1.m4143a(this.f5529f, AbstractC0748t1.m4143a(this.f5528e, AbstractC0748t1.m4143a(this.f5527d, AbstractC0748t1.m4143a(this.f5526c, Float.hashCode(this.f5525b) * 31, 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f5525b);
        sb.append(", dy1=");
        sb.append(this.f5526c);
        sb.append(", dx2=");
        sb.append(this.f5527d);
        sb.append(", dy2=");
        sb.append(this.f5528e);
        sb.append(", dx3=");
        sb.append(this.f5529f);
        sb.append(", dy3=");
        return AbstractC0748t1.m4155m(sb, this.f5530g, ')');
    }
}
