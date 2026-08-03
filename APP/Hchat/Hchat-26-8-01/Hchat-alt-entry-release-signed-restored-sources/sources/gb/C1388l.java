package gb;

/* JADX INFO: renamed from: gb.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1388l {

    /* JADX INFO: renamed from: a */
    public final boolean f4609a;

    /* JADX INFO: renamed from: b */
    public final long f4610b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1388l(long j3, boolean z9) {
        this.f4609a = z9;
        this.f4610b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1388l)) {
            return false;
        }
        C1388l c1388l = (C1388l) obj;
        return this.f4609a == c1388l.f4609a && this.f4610b == c1388l.f4610b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f4610b) + (Boolean.hashCode(this.f4609a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PluginMarketLikeResult(liked=" + this.f4609a + ", likeCount=" + this.f4610b + ")";
    }
}
