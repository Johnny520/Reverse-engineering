package p205;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7903 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21876;

    public final boolean equals(Object obj) {
        if (obj instanceof C7903) {
            return this.f21876 == ((C7903) obj).f21876;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21876);
    }

    public final String toString() {
        long j = this.f21876;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) C7892.m13289(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) C7892.m13289(Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
