package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class cd1 {

    /* JADX INFO: renamed from: a */
    public final float f792a;

    /* JADX INFO: renamed from: b */
    public final float f793b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cd1(float f, float f2) {
        this.f792a = f;
        this.f793b = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final float[] m509a() {
        float f = this.f792a;
        float f2 = this.f793b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd1)) {
            return false;
        }
        cd1 cd1Var = (cd1) obj;
        return Float.compare(this.f792a, cd1Var.f792a) == 0 && Float.compare(this.f793b, cd1Var.f793b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f793b) + (Float.hashCode(this.f792a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f792a);
        sb.append(", y=");
        return AbstractC0748t1.m4155m(sb, this.f793b, ')');
    }
}
