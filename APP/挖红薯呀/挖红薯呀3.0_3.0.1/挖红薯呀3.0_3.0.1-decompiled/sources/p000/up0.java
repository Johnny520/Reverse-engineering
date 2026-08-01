package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class up0 extends wp0 {

    /* JADX INFO: renamed from: b */
    public final float f6280b;

    /* JADX INFO: renamed from: c */
    public final float f6281c;

    /* JADX INFO: renamed from: d */
    public final float f6282d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public up0(float f, float f2, float f3) {
        super(2);
        this.f6280b = f;
        this.f6281c = f2;
        this.f6282d = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up0)) {
            return false;
        }
        up0 up0Var = (up0) obj;
        return Float.compare(this.f6280b, up0Var.f6280b) == 0 && Float.compare(this.f6281c, up0Var.f6281c) == 0 && Float.compare(10.0f, 10.0f) == 0 && Float.compare(this.f6282d, up0Var.f6282d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f6282d) + AbstractC0748t1.m4143a(10.0f, AbstractC0748t1.m4143a(this.f6281c, Float.hashCode(this.f6280b) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f6280b);
        sb.append(", dy1=");
        sb.append(this.f6281c);
        sb.append(", dx2=10.0, dy2=");
        return AbstractC0748t1.m4155m(sb, this.f6282d, ')');
    }
}
