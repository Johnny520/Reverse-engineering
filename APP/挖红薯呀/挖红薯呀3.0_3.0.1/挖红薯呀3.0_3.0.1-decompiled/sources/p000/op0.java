package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class op0 extends wp0 {

    /* JADX INFO: renamed from: b */
    public final float f4602b;

    /* JADX INFO: renamed from: c */
    public final float f4603c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public op0(float f, float f2) {
        super(3);
        this.f4602b = f;
        this.f4603c = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op0)) {
            return false;
        }
        op0 op0Var = (op0) obj;
        return Float.compare(this.f4602b, op0Var.f4602b) == 0 && Float.compare(this.f4603c, op0Var.f4603c) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f4603c) + (Float.hashCode(this.f4602b) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f4602b);
        sb.append(", y=");
        return AbstractC0748t1.m4155m(sb, this.f4603c, ')');
    }
}
