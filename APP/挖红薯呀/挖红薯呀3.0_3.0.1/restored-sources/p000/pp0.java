package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class pp0 extends wp0 {

    /* JADX INFO: renamed from: b */
    public final float f4939b;

    /* JADX INFO: renamed from: c */
    public final float f4940c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pp0(float f, float f2) {
        super(3);
        this.f4939b = f;
        this.f4940c = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp0)) {
            return false;
        }
        pp0 pp0Var = (pp0) obj;
        return Float.compare(this.f4939b, pp0Var.f4939b) == 0 && Float.compare(this.f4940c, pp0Var.f4940c) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f4940c) + (Float.hashCode(this.f4939b) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f4939b);
        sb.append(", y=");
        return AbstractC0748t1.m4155m(sb, this.f4940c, ')');
    }
}
