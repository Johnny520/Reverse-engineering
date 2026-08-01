package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class tp0 extends wp0 {

    /* JADX INFO: renamed from: b */
    public final float f6033b;

    /* JADX INFO: renamed from: c */
    public final float f6034c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tp0(float f, float f2) {
        super(3);
        this.f6033b = f;
        this.f6034c = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp0)) {
            return false;
        }
        tp0 tp0Var = (tp0) obj;
        return Float.compare(this.f6033b, tp0Var.f6033b) == 0 && Float.compare(this.f6034c, tp0Var.f6034c) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f6034c) + (Float.hashCode(this.f6033b) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f6033b);
        sb.append(", dy=");
        return AbstractC0748t1.m4155m(sb, this.f6034c, ')');
    }
}
