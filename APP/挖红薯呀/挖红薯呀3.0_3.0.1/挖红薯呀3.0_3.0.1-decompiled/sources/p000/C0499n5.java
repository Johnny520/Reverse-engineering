package p000;

/* JADX INFO: renamed from: n5 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0499n5 {

    /* JADX INFO: renamed from: a */
    public final float f4179a;

    /* JADX INFO: renamed from: b */
    public final float f4180b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0499n5(float f, float f2) {
        this.f4179a = f;
        this.f4180b = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0499n5)) {
            return false;
        }
        C0499n5 c0499n5 = (C0499n5) obj;
        return Float.compare(this.f4179a, c0499n5.f4179a) == 0 && Float.compare(this.f4180b, c0499n5.f4180b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f4180b) + (Float.hashCode(this.f4179a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f4179a);
        sb.append(", velocityCoefficient=");
        return AbstractC0748t1.m4155m(sb, this.f4180b, ')');
    }
}
