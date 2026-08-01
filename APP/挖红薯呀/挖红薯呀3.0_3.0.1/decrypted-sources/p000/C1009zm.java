package p000;

/* JADX INFO: renamed from: zm */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1009zm implements InterfaceC0968ym {

    /* JADX INFO: renamed from: d */
    public final float f7924d;

    /* JADX INFO: renamed from: e */
    public final float f7925e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1009zm(float f, float f2) {
        this.f7924d = f;
        this.f7925e = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return this.f7924d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1009zm)) {
            return false;
        }
        C1009zm c1009zm = (C1009zm) obj;
        return Float.compare(this.f7924d, c1009zm.f7924d) == 0 && Float.compare(this.f7925e, c1009zm.f7925e) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return this.f7925e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f7925e) + (Float.hashCode(this.f7924d) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f7924d);
        sb.append(", fontScale=");
        return AbstractC0748t1.m4155m(sb, this.f7925e, ')');
    }
}
