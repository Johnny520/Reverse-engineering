package p000;

/* JADX INFO: renamed from: rb */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0683rb implements x61 {

    /* JADX INFO: renamed from: d */
    public final float f5346d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0683rb(AbstractC0646qb abstractC0646qb, float f) {
        this.f5346d = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x61
    /* JADX INFO: renamed from: a */
    public final long mo2626a() {
        int i = C0207ff.f1708h;
        return C0207ff.f1707g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x61
    /* JADX INFO: renamed from: e */
    public final pf1 mo2627e() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0683rb) {
            return p30.m3002l(null, null) && Float.compare(this.f5346d, ((C0683rb) obj).f5346d) == 0;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x61
    /* JADX INFO: renamed from: f */
    public final float mo2628f() {
        return this.f5346d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append((Object) null);
        sb.append(", alpha=");
        return AbstractC0748t1.m4155m(sb, this.f5346d, ')');
    }
}
