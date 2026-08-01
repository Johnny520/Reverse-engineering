package p000;

/* JADX INFO: renamed from: il */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0323il {

    /* JADX INFO: renamed from: a */
    public long f2582a;

    /* JADX INFO: renamed from: b */
    public float f2583b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0323il)) {
            return false;
        }
        C0323il c0323il = (C0323il) obj;
        return this.f2582a == c0323il.f2582a && Float.compare(this.f2583b, c0323il.f2583b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f2583b) + (Long.hashCode(this.f2582a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f2582a);
        sb.append(", dataPoint=");
        return AbstractC0748t1.m4155m(sb, this.f2583b, ')');
    }
}
