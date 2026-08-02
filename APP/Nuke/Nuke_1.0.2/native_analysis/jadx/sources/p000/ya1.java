package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ya1 {

    /* JADX INFO: renamed from: d */
    public static final ya1 f13380d = new ya1(va1.f11865c, 17, 0);

    /* JADX INFO: renamed from: a */
    public final float f13381a;

    /* JADX INFO: renamed from: b */
    public final int f13382b;

    /* JADX INFO: renamed from: c */
    public final int f13383c;

    public ya1(float f, int i, int i2) {
        this.f13381a = f;
        this.f13382b = i;
        this.f13383c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya1)) {
            return false;
        }
        ya1 ya1Var = (ya1) obj;
        float f = ya1Var.f13381a;
        float f2 = va1.f11864b;
        return Float.compare(this.f13381a, f) == 0 && this.f13382b == ya1Var.f13382b && this.f13383c == ya1Var.f13383c;
    }

    public final int hashCode() {
        float f = va1.f11864b;
        return Integer.hashCode(this.f13383c) + vi0.m5685d(this.f13382b, Float.hashCode(this.f13381a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) va1.m5661b(this.f13381a));
        sb.append(", trim=");
        String str = "Invalid";
        int i = this.f13382b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i2 = this.f13383c;
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
