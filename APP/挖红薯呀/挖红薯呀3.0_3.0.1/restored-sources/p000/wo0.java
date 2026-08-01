package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class wo0 {

    /* JADX INFO: renamed from: a */
    public final C0951y5 f7159a;

    /* JADX INFO: renamed from: b */
    public final int f7160b;

    /* JADX INFO: renamed from: c */
    public final int f7161c;

    /* JADX INFO: renamed from: d */
    public final int f7162d;

    /* JADX INFO: renamed from: e */
    public final int f7163e;

    /* JADX INFO: renamed from: f */
    public final float f7164f;

    /* JADX INFO: renamed from: g */
    public final float f7165g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wo0(C0951y5 c0951y5, int i, int i2, int i3, int i4, float f, float f2) {
        this.f7159a = c0951y5;
        this.f7160b = i;
        this.f7161c = i2;
        this.f7162d = i3;
        this.f7163e = i4;
        this.f7164f = f;
        this.f7165g = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m5013a(int i) {
        int i2 = this.f7161c;
        int i3 = this.f7160b;
        return w60.m4907n(i, i3, i2) - i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wo0) {
            wo0 wo0Var = (wo0) obj;
            if (this.f7159a == wo0Var.f7159a && this.f7160b == wo0Var.f7160b && this.f7161c == wo0Var.f7161c && this.f7162d == wo0Var.f7162d && this.f7163e == wo0Var.f7163e && Float.compare(this.f7164f, wo0Var.f7164f) == 0 && Float.compare(this.f7165g, wo0Var.f7165g) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f7165g) + AbstractC0748t1.m4143a(this.f7164f, AbstractC0748t1.m4144b(this.f7163e, AbstractC0748t1.m4144b(this.f7162d, AbstractC0748t1.m4144b(this.f7161c, AbstractC0748t1.m4144b(this.f7160b, this.f7159a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f7159a);
        sb.append(", startIndex=");
        sb.append(this.f7160b);
        sb.append(", endIndex=");
        sb.append(this.f7161c);
        sb.append(", startLineIndex=");
        sb.append(this.f7162d);
        sb.append(", endLineIndex=");
        sb.append(this.f7163e);
        sb.append(", top=");
        sb.append(this.f7164f);
        sb.append(", bottom=");
        return AbstractC0748t1.m4155m(sb, this.f7165g, ')');
    }
}
