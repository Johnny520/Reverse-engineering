package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class la0 {

    /* JADX INFO: renamed from: d */
    public static final la0 f3399d = new la0(ia0.f2499c, 17, 0);

    /* JADX INFO: renamed from: a */
    public final float f3400a;

    /* JADX INFO: renamed from: b */
    public final int f3401b;

    /* JADX INFO: renamed from: c */
    public final int f3402c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public la0(float f, int i, int i2) {
        this.f3400a = f;
        this.f3401b = i;
        this.f3402c = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la0)) {
            return false;
        }
        la0 la0Var = (la0) obj;
        float f = la0Var.f3400a;
        float f2 = ia0.f2498b;
        return Float.compare(this.f3400a, f) == 0 && this.f3401b == la0Var.f3401b && this.f3402c == la0Var.f3402c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        float f = ia0.f2498b;
        return Integer.hashCode(this.f3402c) + AbstractC0748t1.m4144b(this.f3401b, Float.hashCode(this.f3400a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) ia0.m1571b(this.f3400a));
        sb.append(", trim=");
        String str = "Invalid";
        int i = this.f3401b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i2 = this.f3402c;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
