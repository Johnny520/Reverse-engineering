package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class mp0 extends wp0 {

    /* JADX INFO: renamed from: b */
    public final float f4016b;

    /* JADX INFO: renamed from: c */
    public final float f4017c;

    /* JADX INFO: renamed from: d */
    public final float f4018d;

    /* JADX INFO: renamed from: e */
    public final float f4019e;

    /* JADX INFO: renamed from: f */
    public final float f4020f;

    /* JADX INFO: renamed from: g */
    public final float f4021g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mp0(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f4016b = f;
        this.f4017c = f2;
        this.f4018d = f3;
        this.f4019e = f4;
        this.f4020f = f5;
        this.f4021g = f6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp0)) {
            return false;
        }
        mp0 mp0Var = (mp0) obj;
        return Float.compare(this.f4016b, mp0Var.f4016b) == 0 && Float.compare(this.f4017c, mp0Var.f4017c) == 0 && Float.compare(this.f4018d, mp0Var.f4018d) == 0 && Float.compare(this.f4019e, mp0Var.f4019e) == 0 && Float.compare(this.f4020f, mp0Var.f4020f) == 0 && Float.compare(this.f4021g, mp0Var.f4021g) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f4021g) + AbstractC0748t1.m4143a(this.f4020f, AbstractC0748t1.m4143a(this.f4019e, AbstractC0748t1.m4143a(this.f4018d, AbstractC0748t1.m4143a(this.f4017c, Float.hashCode(this.f4016b) * 31, 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f4016b);
        sb.append(", y1=");
        sb.append(this.f4017c);
        sb.append(", x2=");
        sb.append(this.f4018d);
        sb.append(", y2=");
        sb.append(this.f4019e);
        sb.append(", x3=");
        sb.append(this.f4020f);
        sb.append(", y3=");
        return AbstractC0748t1.m4155m(sb, this.f4021g, ')');
    }
}
