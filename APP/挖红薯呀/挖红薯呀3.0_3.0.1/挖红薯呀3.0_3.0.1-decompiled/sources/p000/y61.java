package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class y61 {

    /* JADX INFO: renamed from: c */
    public static final y61 f7554c = new y61(1.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f7555a;

    /* JADX INFO: renamed from: b */
    public final float f7556b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y61(float f, float f2) {
        this.f7555a = f;
        this.f7556b = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y61)) {
            return false;
        }
        y61 y61Var = (y61) obj;
        return this.f7555a == y61Var.f7555a && this.f7556b == y61Var.f7556b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f7556b) + (Float.hashCode(this.f7555a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f7555a);
        sb.append(", skewX=");
        return AbstractC0748t1.m4155m(sb, this.f7556b, ')');
    }
}
