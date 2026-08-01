package p000;

/* JADX INFO: renamed from: ha */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0276ha {

    /* JADX INFO: renamed from: a */
    public final float f2182a;

    /* JADX INFO: renamed from: b */
    public final float f2183b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0276ha(float f, float f2) {
        this.f2182a = f;
        this.f2183b = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m1284a(long j, long j2, k50 k50Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        k50 k50Var2 = k50.f3015d;
        float f3 = this.f2182a;
        if (k50Var != k50Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.f2183b) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0276ha)) {
            return false;
        }
        C0276ha c0276ha = (C0276ha) obj;
        return Float.compare(this.f2182a, c0276ha.f2182a) == 0 && Float.compare(this.f2183b, c0276ha.f2183b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f2183b) + (Float.hashCode(this.f2182a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f2182a);
        sb.append(", verticalBias=");
        return AbstractC0748t1.m4155m(sb, this.f2183b, ')');
    }
}
